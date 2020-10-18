
package br.ufscar.dc.compiladores.fastsqlcompiler.ErrorHandlers;

import br.ufscar.dc.compiladores.fastsqlcompiler.FastSqlLexer;
import org.antlr.v4.runtime.Token;

public class LexerErrorListener {
    private Token t;
    FastSqlLexer lexer;
    
    public LexerErrorListener(FastSqlLexer lexer) {
        t = null;
        this.lexer = lexer;
    }
    
    // RETURN TRUE IF FIND AN ERROR
    public boolean run() {
        while ((t = lexer.nextToken()).getType() != Token.EOF ) {
            if("NOT_CLOSED_VARCHAR".equals(FastSqlLexer.VOCABULARY.getDisplayName(t.getType()))) {
                ErrorMessages.unclosedString(t.getLine());
                return true;
            } else if ("UNDEFINED_CHAR".equals(FastSqlLexer.VOCABULARY.getDisplayName(t.getType()))) {
                ErrorMessages.undefinedSymbol(t.getText(), t.getLine());
                return true;
            } 
        }
        return false;
    }
}
