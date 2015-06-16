package dal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileUtils {
	
	public void readFile() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	        	//obter as várias colunas
	        	String[] array = line.split("\\s+");
	        	
	            sb.append(line);
	            sb.append(System.lineSeparator());
	            line = br.readLine();
	        }
	        String everything = sb.toString();
	    } finally {
	        br.close();
	    }
	}
}
