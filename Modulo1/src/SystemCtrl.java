import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class SystemCtrl {
	private static final int NUM_USERS = 100;
	private ArrayList<User> users = new ArrayList<User>();
	
	
	public void listenInputs(){
//		if(users.size()<NUM_USERS)
		
		while(true){
			//processar tecla, display e testa busy
			
			//interruptor S - actualizar ficheiro, exit()
			
			//actualizar relogio - actualiza hora e minuto no display e 
			//actualiza de minuto a minuto
			
			//testar busy
		}
	}
	
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
