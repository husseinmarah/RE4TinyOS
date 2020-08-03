package tinyos.project.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.swing.JFileChooser;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
public class RunTinyosInterpreter 
{
	public static void main(String[] args) throws IOException {
		
		
		//read the two files of nesC program into just one file
		//makes the process of parsing easier and we don't need to 
		//read the second file and use xmi updating code
		//PrintWriter to create the file to merge the two files
        //PrintWriter pw = new PrintWriter("C:\\antlr_xmi\\Results\\Merged.nc");
		//File file1 = new File("C:\\Merged.nc");
		//file1.getParentFile().mkdirs();
		File file =File.createTempFile("Merged", ".nc");
		PrintWriter pw = new PrintWriter(file);
	    
		
        //Just change the name of the two files that wanted to be parsed
        //BufferedReader object for first file
        //BufferedReader br1 = new BufferedReader(new FileReader("C:\\antlr_xmi\\Results\\SenseC.nc"));
        //String line1 = br1.readLine();
        
        JFileChooser jfc1 = new JFileChooser();
        //Shows the Open dialogue box.
        //Shows the windows to select the Module file, which usually ends with "C.nc"
        jfc1.showDialog(jfc1, "Open the Module file");
        System.out.println("Module file path: " +  jfc1.getSelectedFile());
        
        
        FileReader fr1 = new FileReader(jfc1.getSelectedFile());
        BufferedReader br1 = new BufferedReader(fr1);
        String line1 = br1.readLine();
		
		
        // loop to copy each line of file 1 to Merged file 
        while (line1 != null) 
        { 
			pw.println(line1); 
			line1 = br1.readLine(); 
		} 
		
	    //BufferedReader object for second file
        JFileChooser jfc2 = new JFileChooser();
        //Shows the Open dialogue box.
        //Shows the windows to select the Configuration file, which usually ends with "AppC.nc"
        jfc2.showDialog(jfc2, "Open the Configuration file");
        System.out.println("Configuration file path: " +  jfc2.getSelectedFile());
        
		
        FileReader fr2 = new FileReader(jfc2.getSelectedFile());
        BufferedReader br2 = new BufferedReader(fr2);
        String line2 = br2.readLine();       
	    //BufferedReader br2 = new BufferedReader(new FileReader("C:\\antlr_xmi\\Results\\SenseAppC.nc")); 
	    //String line2 = br2.readLine(); 
		
		// loop to copy each line of file 2 to merged file 
		while(line2 != null) 
		{ 
			pw.println(line2); 
			line2 = br2.readLine(); 
		} 
		pw.flush();
		
		//closing all resources 
		br1.close();
		br2.close();
		pw.close(); 
		//System.out.println("File1 and File2 Merged Into File3");
		System.out.println("**************************************");
		System.out.println("Reading process starts"+"\n");
		//Read from the new merged file that contains the whole code
		// create a CharStream that reads from standard input
		ANTLRInputStream input = new ANTLRInputStream(new FileReader(file));
		// create a lexer that feeds off of input CharStream
		TinyosLexer lexer = new TinyosLexer(input);
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// create a parser that feeds off the tokens buffer
		TinyosParser parser = new TinyosParser(tokens);
		
		ParseTree tree = parser.compilationUnit();
		ParseTreeWalker walker = new ParseTreeWalker();
		
		
		ApplicationPrinter printer = new ApplicationPrinter(tokens); 
		walker.walk(printer, tree);
		
		//Display the GUI of AST
		TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
		viewer.open();
		
	}
}	