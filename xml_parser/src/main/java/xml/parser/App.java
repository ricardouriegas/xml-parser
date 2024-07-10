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
     * @param args The arguments of the program.
     */
    public static void main(String[] args) throws IOException {
        if (args.length != 0) {
            runFile(args[0]); 
        } else {
            System.out.println("Usage: java -jar project.jar [script]");
            System.exit(64);
        }
    }

    private static void run(String source) {
        
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
