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
        DELETE_ALL: 'deleteAll';
        FIND_ALL: 'findAll';

    // CATACTERES ESPECIAIS
        A_PARENTESES: '(';
        F_PARENTESES: ')';

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
    script: create_table create_table* commands* ;
    
    commands: create_table | insert | find | delete | deleteAll | findAll;
    
    //FUNÇÕES
    create_table: CREATE_TABLE A_PARENTESES IDENT F_PARENTESES
                          '.' COLUMNS A_PARENTESES
                              decl_column (',' decl_column)* F_PARENTESES ;

    insert: IDENT '.' INSERT A_PARENTESES value ( ',' value )* F_PARENTESES;

    deleteAll: IDENT '.' DELETE_ALL A_PARENTESES F_PARENTESES;
    
    findAll: tableName=IDENT '.' FIND_ALL A_PARENTESES F_PARENTESES 
                        ( '.' COLUMNS A_PARENTESES IDENT (',' IDENT)* F_PARENTESES )?;

    find: tableName=IDENT '.' FIND A_PARENTESES itemWhere (',' itemWhere)* F_PARENTESES
                          ( '.' COLUMNS A_PARENTESES IDENT (',' IDENT)* F_PARENTESES )?;

    delete: IDENT '.' DELETE A_PARENTESES itemWhere ( ',' itemWhere )* F_PARENTESES;

    // REGRAS AUXILIARES
    decl_column: IDENT ':' TYPE sized?;
    sized: A_PARENTESES INT F_PARENTESES;
    value: INT | REAL | BOOLEAN | VARCHAR | DATE;
    itemWhere: IDENT ':' value;
