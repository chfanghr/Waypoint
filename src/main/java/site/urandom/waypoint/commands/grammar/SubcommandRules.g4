grammar SubcommandRules;

import CommonLexerRules;

set : SET name=ID #setNameOnly
    | SET name=ID x=DOUBLE y=DOUBLE z=DOUBLE #setWithCoord
    | SET name=ID x=DOUBLE y=DOUBLE z=DOUBLE world=ID #setWithCoordWorld;

tp : TP name=ID # tpNameOnly
    | name=ID # tpShortcut;

remove : REMOVE name=ID;

subcommand : set
           | tp
           | remove;

REMOVE: 'remove'|'rm';
TP: 'tp';
SET: 'set';
