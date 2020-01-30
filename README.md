# compilador2020

-----------------------------------

La gramatica a utilizar sera:

Program    -> MainClass ClassDecl*

MainClass  -> class id { public static void main ( String [] id ) { Statement } }

ClassDecl  -> class id { VarDecl* MethodDecl* }
           -> class id extends id { VarDecl* MethodDecl* }

VarDecl    -> Type id ;

MethodDecl -> public Type id ( FormalList ) { VarDecl* Statement* return Exp ; }

FormalList -> Type id FormalRest*
           ->

FormalRest -> , Type id

Type       -> int []
           -> boolean
	   -> int
	   -> id

Statement  -> { Statement* }
           -> if ( Exp ) Statement else Statement
           -> while ( Exp ) Statement
	   -> System.out.println ( Exp ) ;
	   -> id = Exp ;
	   -> id [ Exp ] = Exp ;

Exp        -> Exp op Exp
           -> Exp [ Exp ]
	   -> Exp . length
	   -> Exp . id ( ExpList )
	   -> INTEGER_LITERAL
	   -> true
	   -> false
	   -> id
	   -> this
	   -> new int [ Exp ]
	   -> new id ( )
	   -> ! Exp
	   -> ( Exp )

ExpList    -> Exp ExpRest*
           ->

ExpRest    -> , Exp


-----------------------------------------


Otras Notas:

Identificadores:
Un identificador es una secuencia de letras, dígitos y guiones bajos, que comienza con una letra. Las letras mayúsculas se distinguen de las minúsculas. en este apéndice, la identificación del símbolo representa un identificador.

Literales enteros:
Una secuencia de dígitos decimales es una constante entera que denota el valor entero correspondiente. en este apéndice, el símbolo INTEGER_LITERAL representa una constante entera.

Operadores binarios:
Un operador binario es uno de && <+ - *

En este apéndice, el símbolo op representa un operador binario.

Comentarios:
Un comentario puede aparecer entre dos tokens. Hay dos formas de comentarios: uno comienza con / *, termina con * / y puede estar anidado; otro comienza con // y va al final de la línea.