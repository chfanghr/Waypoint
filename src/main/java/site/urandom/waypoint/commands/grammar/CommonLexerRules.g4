lexer grammar CommonLexerRules;

ID : [_a-zA-Z]([_a-zA-Z0-9])*;
DOUBLE : '-'? INT ('.' INT)?;

fragment INT: '0'|[1-9][0-9]*;

WS: [ \t\r\n]+ -> skip;

