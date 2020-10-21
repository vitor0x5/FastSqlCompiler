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
//        try {
            // INPUT FILE 
            CharStream inputStream;
            inputStream = CharStreams.fromFileName(args[0]);
            // OUTPUT FILE
            FileWriter outputWriter = new FileWriter(args[1]);
            
            // LEXER
            FastSqlLexer lexer = new FastSqlLexer(inputStream);
            
            // print tokens
            Token t = null;
            while ((t = lexer.nextToken()).getType() != Token.EOF) {
                System.out.println("<" + 
                FastSqlLexer.VOCABULARY.getDisplayName(t.getType()) + 
                "," + t.getText() + ">");
            }
            
            LexerErrorListener lexerErrorListener = new LexerErrorListener(lexer);
            boolean lexerError = lexerErrorListener.run();
            
            // IF THERE I AN LEXICAL ERROR -> FINISH EXECUTION 
            if(lexerError) {
                // WRITE THE OUTPUT FILE
                outputWriter.write(ErrorMessages.errorsOutput);
                outputWriter.close();
                return;
            }
            
            // PARSER
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            FastSqlParser parser = new FastSqlParser(tokens);
            ParserErrorListener parserErrorListener = new ParserErrorListener();
            parser.addErrorListener(parserErrorListener);
            
            // IF THERE I AN SYNTATIC ERROR -> FINISH EXECUTION 
            if(ErrorMessages.errorsOutput != "") {
                // WRITE THE OUTPUT FILE
                outputWriter.write(ErrorMessages.errorsOutput);
                outputWriter.close();
                return;
            }
            
            // SEMANTIC ANALYSER
            ScriptContext script = parser.script();
            FastSqlSemantic fsemantic = new FastSqlSemantic();
            fsemantic.visitScript(script); 
            
            // WRITE THE OUTPUT FILE
            if(ErrorMessages.errorsOutput != "") {
                // WRITE THE OUTPUT FILE
                outputWriter.write(ErrorMessages.errorsOutput);
                outputWriter.write("Fim da compilação!\n");
                return;
            }
            else{
                //outputWriter.write(codigo_gerado);
            }
            outputWriter.close();
//        } catch (IOException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }
    
}
