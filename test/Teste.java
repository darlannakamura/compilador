
import AnalisadorLexicoCalculadora.ui.LexicalAnalyzer;
import AnalisadorLexicoCalculadora.ui.Sym;
import java.io.IOException;
import java.io.StringReader;
import java_cup.runtime.Symbol;
import jflex.LexScan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author darla
 */
public class Teste {
    
    public static void main(String[] args) throws IOException {
            
    String expressao = "program correto;\n" +
            "int a, b, c;\n" +
            "boolean d, e, f;\n" +
            "\n" +
            "procedure proc(var a1 : int);\n" +
            "int a, b, c;\n" +
            "boolean d, e, f;\n" +
            "begin\n" +
            "	a:=1;\n" +
            "	if (a<1)\n" +
            "		a:=12\n" +
            "end;\n" +
            "\n" +
            "begin\n" +
            "	a:=2;\n" +
            "	b:=10;\n" +
            "	c:=11;\n" +
            "	a:=b+c;\n" +
            "	d:=true;\n" +
            "	e:=false;\n" +
            "	f:=true;\n" +
            "	read(a);\n" +
            "	write(b);\n" +
            "	if (d)\n" +
            "	begin\n" +
            "		a:=20;\n" +
            "		b:=10*c;\n" +
            "		c:=a div b\n" +
            "	end;\n" +
            "	while (a>1)\n" +
            "	begin\n" +
            "		if (b>10)\n" +
            "			b:=2;\n" +
            "		a:=a-1\n" +
            "	end\n" +
            "end.";
    LexicalAnalyzer lexical = new LexicalAnalyzer(new StringReader(expressao));

    Symbol s = lexical.next_token();
    String terminal = "";
    while(s.sym != 0){
        terminal = getTerminal(s.sym);
        System.out.println(terminal+" "+lexical.yytext()+" "+lexical.get_yyline()+" "+lexical.get_yycolumn());
        
        s = lexical.next_token();
                
                
    }
    }
    
    public static String getTerminal(int sym){
        for(int i = 0 ; i < Sym.terminalNames.length; i++){
            if(sym == i) return Sym.terminalNames[i];
        }
        return "UNKNOWN";
    }

}
