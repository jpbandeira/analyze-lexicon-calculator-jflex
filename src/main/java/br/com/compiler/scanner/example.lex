package br.com.compiler.scanner;

%%
%class Lexer
%type Token
%{
private void print_value(String lexema, String tipo, String valor) {
 System.out.println(lexema + " : " + tipo + " : " +    valor );
}
%}
%%
[-]?[\d]+ { print_value(yytext(), "NUMERO", yytext()); }
"+" 		{ print_value(yytext(), "OPERDOR", "SOMA"); }
"-" 		{ print_value(yytext(), "OPERDOR", "SUBTRACAO"); }
"*" 		{ print_value(yytext(), "OPERDOR", "MULTIPLICACAO"); }
"/" 		{ print_value(yytext(), "OPERDOR", "DIVISAO"); }
"**"        { print_value(yytext(), "OPERDOR", "EXPONENCIACAO"); }
"(" 		{ print_value(yytext(), "PONTUACAO", "PARENTESE DIREITO"); }
")" 		{ print_value(yytext(), "PONTUACAO", "PARENTESE ESQUERDO"); }
. {throw new RuntimeException("Lexemas inválidos " + yytext());}