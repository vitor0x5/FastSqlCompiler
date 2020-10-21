grammar FastSql;

// GRAMÁTICA DA LINGUAGEM FASTSQL

// REGRAS LÉXICAS
    // PALAVRAS RESERVADAS
        NAME: 'name';
        COLUMNS: 'columns';

    // FUNÇÕES DA LINGUAGEM
        CREATE_TABLE: 'createTable';
        FIND: 'find';
        DELETE: 'delete';
        INSERT: 'insert';

    fragment
    ESC_SEQ: '\\"';

    //TIPOS DEFINDOS NA LINGUAGEM
        TYPE: 'boolean' | 'varchar' | 'date' | 'int' | 'real';

        //CONTEUDO ACEITO EM CADA TIPO
            INT: ('0'..'9')+;
            REAL: ('0'..'9')+ '.' ('0'..'9')+;
            BOOLEAN: 'true' | 'false';
            VARCHAR: '"' (ESC_SEQ | ~('"' | '\n') )* '"';
            NOT_CLOSED_VARCHAR: '"' (ESC_SEQ | ~('"') )* '\n';
            DATE: '0'..'9' '0'..'9' '0'..'9' '0'..'9' '-' // ANO
                  ('0' | '1') '0'..'9' '-'  // MES
                  '0'..'3' '0'..'9'; // DIA

    IDENT: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
    
    WS: ( ' ' |'\t' | '\r' | '\n') -> skip;
        
    // SIMBOLO INDEFINIDO
    UNDEFINED_CHAR: . ;  

// REGRAS SINTÁTICAS
    // SCRIPT
    script: create_table+ commands* EOF { System.out.println("Parser found a script"); };

    commands: create_table | insert | find | delete
    { System.out.println("Parser found a command"); };
    
    //FUNÇÕES
    create_table: CREATE_TABLE '(' IDENT ')'
                          '.' COLUMNS '('
                              decl_column (',' decl_column)* ')' 
    { System.out.println("Parser found a create_table"); };

    insert: IDENT '.' INSERT '(' value ( ',' value )* ')'
    { System.out.println("Parser found a insert"); };

    find: tableName=IDENT '.' FIND '(' itemWhere (',' itemWhere)* ')'
                          ( '.' COLUMNS '(' IDENT (',' IDENT)* ')' )?
    { System.out.println("Parser found a find"); };

    delete: IDENT '.' DELETE '(' itemWhere ( ',' itemWhere )* ')'
    { System.out.println("Parser found a delete"); };



    // REGRAS AUXILIARES
    decl_column: IDENT ':' TYPE ('(' INT ')')? ;
    value: INT | REAL | BOOLEAN | VARCHAR | DATE;
    itemWhere: IDENT ':' value;
