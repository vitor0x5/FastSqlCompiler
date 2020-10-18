package br.ufscar.dc.compiladores.fastsqlcompiler.ErrorHandlers;

import org.antlr.v4.runtime.Token;

public class ErrorMessages {
    public static String errorsOutput = "";     // STORES ALL ERROR MESSAGES 
    
    public static void undefinedSymbol (String ident, int line) {
        String message = "Linha " + line + ": " + ident + " - Simbolo não identificado";
        errorsOutput += message;
    }
    
    public static void unclosedString (int line) {
        String message = "Linha " + line + ": cadeia literal nao fechada\n";
        errorsOutput += message;
    }

    static void SyntacticError(String ident, int line) {
        String message = "Linha " + line + ": "+ "Erro sintatico proximo a " + ident +"\n";
        errorsOutput += message;
    }
}
