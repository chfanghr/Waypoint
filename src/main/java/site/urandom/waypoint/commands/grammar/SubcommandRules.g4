grammar SubcommandRules;

import CommonLexerRules;

set : SET name=ID #setNameOnly
    | SET name=ID x=DOUBLE y=DOUBLE z=DOUBLE #setWithCoord
    | SET name=ID x=DOUBLE y=DOUBLE z=DOUBLE world=ID #setWithCoordWorld;

tp : TP? name=ID;

remove : REMOVE name=ID;

list : LIST;

subcommand : set
           | tp
           | remove
           | list;

REMOVE: 'remove'|'rm';
TP: 'tp';
SET: 'set';
LIST: 'list'|'ls';