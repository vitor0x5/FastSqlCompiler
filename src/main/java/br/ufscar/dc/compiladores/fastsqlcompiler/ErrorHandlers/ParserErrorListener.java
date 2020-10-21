package br.ufscar.dc.compiladores.fastsqlcompiler.ErrorHandlers;

import br.ufscar.dc.compiladores.fastsqlcompiler.FastSqlLexer;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class ParserErrorListener extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
    int line, int charPositionInLine, String msg, RecognitionException e) {
        // GET THE TOKEN NAME AND TYPE
        Token token = (Token) offendingSymbol;
        String ident = token.getText(); 
        int type = token.getType(); 
        
        // SYNTACTIC ERRORS
        ErrorMessages.SyntacticError(ident, line);
    }
    
}
