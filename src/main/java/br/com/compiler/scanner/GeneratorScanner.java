package br.com.compiler.scanner;

import java.io.File;
import java.nio.file.Paths;


public class GeneratorScanner {
    public static void main(String[] args) {
        String rootPath = Paths.get("").toAbsolutePath().toString();
        String subPath = "/src/main/java/br/com/compiler/scanner/";
        String file = rootPath + subPath + "example.lex";
        File sourceCode = new File(file);
        jflex.Main.generate(sourceCode);
    }
}
