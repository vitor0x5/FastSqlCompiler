package br.ufscar.dc.compiladores.fastsqlcompiler.ErrorHandlers;

public class ErrorMessages {
    public static String errorsOutput = "";     // STORES ALL ERROR MESSAGES 
    
    public static void undefinedSymbol (String ident, int line) {
        String message = "Linha " + line + ": " + ident + " - Simbolo não identificado";
        errorsOutput += message;
    }
    
    public static void WrongNumberOfCollumns(int table_collumns, int given_collums, int line){
        String message = "Line " + line + ": Insert recebeu " + given_collums +
        " colunas quando deveria receber " + table_collumns + "\n";
        errorsOutput += message;
    }
    
    public static void AlreadyACollumn(String ident, String table_name, int line){
        String message = "Line " + line + ": " + table_name + " já possui coluna " + 
        ident + "\n";
        errorsOutput += message;
    }
    
    public static void unclosedString (int line) {
        String message = "Linha " + line + ": cadeia literal nao fechada\n";
        errorsOutput += message;
    }

    public static void SyntacticError(String ident, int line) {
        String message = "Linha " + line + ": "+ "Erro sintatico proximo a " + ident +"\n";
        errorsOutput += message;
    }
    
    public static void NoTableWithThisName(String ident, int line) {
        String message = "Linha " + line + ": "+ "Tabela " + ident +" não existe\n";
        errorsOutput += message;
    }
    
    public static void WrongType(int index, String type, int line){
        String message = "Linha " + line + ": "+ "Parametro " + index +" deveria ser um '" + type + "'\n";
        errorsOutput += message;
    }
    
    public static void FieldWrongType(String field_name, String field_type, String type, int line){
        String message = "Linha " + line + ": "+ "Campo " + field_name +" é um '" + field_type +
        "' mas está recebendo um '" + type + "'\n";
        errorsOutput += message;
    }
    
    public static void TableHasNoField(String table_name, String field_name, int line){
        String message = "Linha " + line + ": " + "Tabela " + table_name + " não possui campo " + field_name + "\n";
        errorsOutput += message;
    }
    
    public static void unclosedParenthesis (int line) {
        String message = "Linha " + line + ": parenteses nao fechado\n";
        errorsOutput += message;
        System.out.println(message);
    }
    
    public static void emptySizeDeclaration (int line) {
        String message = "Linha " + line + ": declaracao de tamanho vazia\n";
        errorsOutput += message;
    }

    public static void ToBigVarchar(String field_name, int len, int line) {
        String message = "Linha " + line + ": Campo " +  field_name + " comporta " + 
        "somente " + len + " caracteres\n";
        errorsOutput += message;
    }

    public static void TableExists(String table_name, int line) {
        String message = "Linha " + line + ": Tabela " +  table_name + " já existe";
        errorsOutput += message;
    }
    
}
