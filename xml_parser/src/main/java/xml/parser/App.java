package xml.parser;

import xml.parser.XML.*;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import xml.parser.DTD.*;

/**
 * Hello world!
 */
public final class App {
    /**
     * Reads the parameter given when 
     * @param args The file path of the XML file to be parsed.
     */
    public static void main(String[] args) throws IOException {
        if (args.length != 0) {
            runFile(args[0]); 
        } else {
            System.out.println("Usage: java -jar project.jar [xml_file_path]");
            System.exit(64);
        }
    }

    private static void run(String source) {
        //! the XML parser should have 3 steps of object
        // 1. Lexical Analyzer
        // 2. Syntax Analyzer
        // 3. Element Tree
        
    }

    private static void runFile(String path) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(path));
        try {
            run(new String(bytes, Charset.defaultCharset()));
        } catch (Error e) {
            System.err.println(e.getMessage());
        } 
        catch (Exception e) {
            System.err.println("Something goes wrong.");
        }

    }
}       
