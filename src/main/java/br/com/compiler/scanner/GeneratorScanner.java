package br.com.compiler.scanner;

import java.io.File;
import java.nio.file.Paths;


public class GeneratorScanner {
    public static void main(String[] args) {
        String rootPath = Paths.get("").toAbsolutePath().toString();
        String subPath = "/src/main/java/br/com/compiler/scanner/";
        String ﬁle = rootPath + subPath + "example.lex";
        File sourceCode = new File(ﬁle);
        jflex.Main.generate(sourceCode);
    }
}
