grammar SubcommandRules;

import CommonLexerRules;

set : SET name=ID #setNameOnly
    | SET name=ID x=DOUBLE y=DOUBLE z=DOUBLE #setWithCoord
    | SET name=ID x=DOUBLE y=DOUBLE z=DOUBLE world=ID #setWithCoordWorld;

tp : TP? name=ID;

remove : REMOVE name=ID;

list : LIST;

tpToLastDeath: LASTDEATH;

last: LAST;

subcommand : set
           | tp
           | remove
           | list
           | tpToLastDeath
           | last;

REMOVE: 'remove'|'rm';
TP: 'tp';
SET: 'set';
LIST: 'list'|'ls';
LASTDEATH: 'last_death'|'ld';
LAST: 'last' | 'l';