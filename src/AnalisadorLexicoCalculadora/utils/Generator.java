/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexicoCalculadora.utils;

import java.io.File;

/**
 *
 * @author darla
 */
public class Generator {
    public static void main(String[] args) {
        String subPath = "src/AnalisadorLexicoCalculadora/ui/";
        String file = subPath + "language.lex";
        File sourceCode = new File(file);
        jflex.Main.generate(sourceCode);
    }
}
