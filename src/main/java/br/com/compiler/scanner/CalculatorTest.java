package br.com.compiler.scanner;

import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) throws IOException {
        // String expression = "-(8+12)**1*3/-4";
        Scanner scanner = new Scanner(System.in);
        String input = "";
        System.out.println("Digite a entrada: ");
        input = scanner.nextLine();
        System.out.println(input);
        Lexer lexer = new Lexer(new StringReader(input));
        lexer.yylex();
    }
}
