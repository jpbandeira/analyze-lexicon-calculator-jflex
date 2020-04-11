package br.com.compiler.scanner;

import java.io.IOException;
import java.io.StringReader;

public class CalculatorTest {
    public static void main(String[] args) throws IOException {
        String expression = "a2-2";
        Lexer lexer = new Lexer(new StringReader(expression));
        lexer.yylex();
    }
}
