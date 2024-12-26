grammar CQL;

// -----------------------------------------------------
// Parser Rules
// -----------------------------------------------------

query
    : selectStmt
    | insertStmt
    | updateStmt
    | deleteStmt
    ;

// SELECT column1, column2 FROM table WHERE condition;
selectStmt
    : SELECT columnList FROM tableName whereClause? SEMI
    ;

// INSERT INTO table (column1, column2) VALUES (value1, value2);
insertStmt
    : INSERT INTO tableName LPAREN columnList RPAREN VALUES LPAREN valueList RPAREN SEMI
    ;

// UPDATE table SET column1 = value1, column2 = value2 WHERE condition;
updateStmt
    : UPDATE tableName SET assignmentList whereClause? SEMI
    ;

// DELETE FROM table WHERE condition;
deleteStmt
    : DELETE FROM tableName whereClause? SEMI
    ;

// column1, column2, ... or *
columnList
    : '*'                                 # AllColumns
    | IDENTIFIER (COMMA IDENTIFIER)*       # SpecificColumns
    ;

// value1, value2, ...
valueList
    : literal (COMMA literal)*
    ;

// column1 = value1, column2 = value2, ...
assignmentList
    : assignment (COMMA assignment)*
    ;

// column1 = value1
assignment
    : IDENTIFIER EQ literal
    ;

// WHERE condition
whereClause
    : WHERE conditionExpr
    ;

// conditionExpr: column1 = value1
conditionExpr
    : IDENTIFIER comparison literal
    ;

// Basic comparison operators
comparison
    : EQ
    | NE
    | LT
    | LE
    | GT
    | GE
    ;

// tableName
tableName
    : IDENTIFIER
    ;

// -----------------------------------------------------
// Lexer Rules
// -----------------------------------------------------

// Keywords (case-insensitive)
SELECT :  [sS][eE][lL][eE][cC][tT];
INSERT :  [iI][nN][sS][eE][rR][tT];
INTO   :  [iI][nN][tT][oO];
VALUES :  [vV][aA][lL][uU][eE][sS];
UPDATE :  [uU][pP][dD][aA][tT][eE];
DELETE :  [dD][eE][lL][eE][tT][eE];
FROM   :  [fF][rR][oO][mM];
WHERE  :  [wW][hH][eE][rR][eE];
SET    :  [sS][eE][tT];

// Symbols
SEMI   : ';';
COMMA  : ',';
LPAREN : '(';
RPAREN : ')';
EQ     : '=';
NE     : '!=' | '<>';
LT     : '<';
LE     : '<=';
GT     : '>';
GE     : '>=';

// A literal can be either a string in quotes or a numeric value.
literal
    : STRING
    | NUMBER
    ;

// Allow strings in single or double quotes
STRING
    :   '\'' ( ~('\'' | '\\') | '\\' . )* '\''
    |   '"'  ( ~('"'  | '\\') | '\\' . )* '"'
    ;

// Number: integer or decimal
NUMBER
    :   DIGIT+ ( '.' DIGIT+ )?
    ;

// Fragment for a single digit
fragment DIGIT : [0-9] ;

// Identifiers: letters, digits, underscores; start with letter or underscore
IDENTIFIER
    :   [a-zA-Z_] [a-zA-Z0-9_]*
    ;

// Whitespace and newlines: skip them
WS
    :   [ \t\r\n]+ -> skip
    ;
