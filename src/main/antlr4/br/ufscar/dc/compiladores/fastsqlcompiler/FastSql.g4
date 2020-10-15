grammar FastSql;

// GRAMÁTICA DA LINGUAGEM FASTSQL

// REGRAS LÉXICAS
    //TIPOS DEFINDOS NA LINGUAGEM
        TYPE: 'Boolean' | 'varchar' | 'date' | 'int' | 'real';

        //CONTEUDO ACEITO EM CADA TIPO
            INT: ('0'..'9')+;
            REAL: ('0'..'9')+ '.' ('0'..'9')+;
            BOOLEAN: 'true' | 'false';
            VARCHAR: '\'' ('a'..'z'|'A'..'Z'|'0'..'9')+ '\'';
            DATE: '0'..'9' '0'..'9' '0'..'9' '0'..'9' '-' // ANO
                  '0'..'9' '0'..'9' '-'  // MES
                  '0'..'9' '0'..'9'; // DIA

    ESC_SEQ: '\\\'';
    OP_ARIT1: '+' | '-';
    OP_ARIT2: '*' | '/';
    OP_REL: '>' | '>=' | '<' | '<=' | '<>' | '=';
    OP_BOOL: 'E' | 'OU';
    IDENT: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*;
    WS: ( ' ' |'\t' | '\r' | '\n') -> skip;

    // PALAVRAS RESERVADAS
        NAME: 'name';
        COLUMNS: 'columns';

    // FUNÇÕES DA LINGUAGEM
        CREATE_TABLE: 'createTable';
        FIND: 'find';
        DELETE: 'delete';
        INSERT: 'insert';


// REGRAS SINTÁTICAS
    //FUNÇÕES
        create_table: CREATE_TABLE '(' IDENT ')'
                              '.' COLUMNS '('
                                  decl_column (',' decl_column)* ')';

        insert: IDENT '.' INSERT '(' value ( ',' value )* ')';

        find: IDENT '.' FIND '(' itemWhere (',' itemWhere)* ')'
                              ( '.' COLUMNS '(' IDENT (',' IDENT)* ')' )?;

        delete: IDENT '.' DELETE '(' itemWhere ( ',' itemWhere )* ')';



    // REGRAS AUXILIARES
    decl_column: IDENT ':' TYPE ';';
    value: INT | REAL | BOOLEAN | VARCHAR | DATE;
    itemWhere: IDENT ':' value;
