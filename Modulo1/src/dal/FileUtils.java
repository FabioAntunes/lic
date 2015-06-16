package dal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class FileUtils {
	
	public LinkedList<String> readFile(String fileName) throws IOException {
		LinkedList<String> fileLines = new LinkedList<String>();
		BufferedReader br = new BufferedReader(new FileReader(fileName));
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	        	fileLines.add(line);
	            line = br.readLine();
	        }
//	        String everything = sb.toString();
	    } finally {
	        br.close();
	    }
	    
	    return fileLines;
	}
}
