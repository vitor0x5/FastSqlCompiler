package br.ufscar.dc.compiladores.fastsqlcompiler;

import br.ufscar.dc.compiladores.fastsqlcompiler.ErrorHandlers.ErrorMessages;
import br.ufscar.dc.compiladores.fastsqlcompiler.ErrorHandlers.ParserErrorListener;
import br.ufscar.dc.compiladores.fastsqlcompiler.ErrorHandlers.LexerErrorListener;
import br.ufscar.dc.compiladores.fastsqlcompiler.FastSqlParser.ScriptContext;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            // INPUT FILE 
            CharStream inputStream;
            inputStream = CharStreams.fromFileName(args[0]);
            // OUTPUT FILE
            FileWriter outputWriter = new FileWriter(args[1]);
            
            // LEXER
            FastSqlLexer lexer = new FastSqlLexer(inputStream);
            LexerErrorListener lexerErrorListener = new LexerErrorListener(lexer);
            boolean lexerError = lexerErrorListener.run();
            
            // IF THERE IS A LEXICAL ERROR -> FINISH EXECUTION 
            if(lexerError) {
                // SHOW ERRORS ON THE TERMINAL
                System.out.println(ErrorMessages.errorsOutput);
                // WRITE THE OUTPUT FILE
                outputWriter.write(ErrorMessages.errorsOutput);
                outputWriter.close();
                return;
            }
            
            // JUMP TO FIRST TOKEN
            lexer.reset();
            // PARSER
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            FastSqlParser parser = new FastSqlParser(tokens);
            ParserErrorListener parserErrorListener = new ParserErrorListener();
            parser.removeErrorListeners();
            parser.addErrorListener(parserErrorListener);
            parser.script();
            // IF THERE IS A SYNTATIC ERROR -> FINISH EXECUTION 
            if(ErrorMessages.errorsOutput != "") {
                // SHOW ERRORS ON THE TERMINAL
                System.out.println(ErrorMessages.errorsOutput);
                // WRITE THE OUTPUT FILE
                outputWriter.write(ErrorMessages.errorsOutput);
                outputWriter.close();
                return;
            } 
            
            parser.reset();
            // SEMANTIC ANALYSER
            ScriptContext script = parser.script();
            FastSqlSemantic fsemantic = new FastSqlSemantic();
            fsemantic.visitScript(script); 
            
            // WRITE THE OUTPUT FILE
            if(ErrorMessages.errorsOutput != "") {
                // SHOW ERRORS ON THE TERMINAL
                System.out.println(ErrorMessages.errorsOutput);
                // WRITE THE OUTPUT FILE
                outputWriter.write(ErrorMessages.errorsOutput);
                outputWriter.write("Fim da compilação!\n");
                outputWriter.close();
                return;
            }
            else{
                System.out.println(GeradorDeCodigo.output);
                outputWriter.write(GeradorDeCodigo.output);
            } 
            outputWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
