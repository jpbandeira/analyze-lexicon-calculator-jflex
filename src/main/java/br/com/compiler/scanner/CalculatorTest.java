package br.com.compiler.scanner;

import java.io.IOException;
import java.io.StringReader;

public class CalculatorTest {
    public static void main(String[] args) throws IOException {
        String expression = "-(8+12)**1*3/-4";
        Lexer lexer = new Lexer(new StringReader(expression));
        lexer.yylex();
    }
}
