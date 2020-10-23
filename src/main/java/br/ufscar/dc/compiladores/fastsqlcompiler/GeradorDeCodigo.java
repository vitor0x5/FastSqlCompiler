
package br.ufscar.dc.compiladores.fastsqlcompiler;

import br.ufscar.dc.compiladores.fastsqlcompiler.FastSqlSemantic.Field;
import br.ufscar.dc.compiladores.fastsqlcompiler.FastSqlSemantic.Type;

class GeradorDeCodigo {
    public static String output = "";
    
    public static void addLine(String line){
        output += line + "\n";
    }
    
    public static void addLine(String line, int identation){
        String s = "";
        for (int i = 0; i < identation; i++) {
            s += "  ";
        }
        addLine(s+line);
    }
    
    public static String type_to_sql(Field field){
        switch(field.type){
            case BOOLEAN:{return "BOOL";}
            case DATE: {return "DATE";}
            case INT: {return "INT";}
            case VARCHAR: {return "VARCHAR("+field.len+")";}
            case REAL: {return "FLOAT";}
        }
        return "";
    }
}
