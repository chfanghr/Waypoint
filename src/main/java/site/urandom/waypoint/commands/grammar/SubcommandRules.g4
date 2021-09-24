grammar SubcommandRules;

import CommonLexerRules;

set : 'set' name=ID #setNameOnly
    | 'set' name=ID x=DOUBLE y=DOUBLE z=DOUBLE #setWithCoord
    | 'set' name=ID x=DOUBLE y=DOUBLE z=DOUBLE world=ID #setWithCoordWorld;

tp : 'tp' name=ID;

remove : 'remove' name=ID;

subcommand : set
           | tp
           | remove;