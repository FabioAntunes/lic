package dal;

import java.io.IOException;
import java.util.LinkedList;

import bll.User;

public class UserDAO {
	private FileUtils fileReader = new FileUtils();
	private static final String FILE =  "src/users.txt";
	private static final String SEPARATOR =  ";";
	
	public LinkedList<User> getUsers() {
		LinkedList<User> users = new LinkedList<User>();
		try {
			LinkedList<String> usersFile = fileReader.readFile(FILE);
			
			for (String userLine : usersFile){
				//obter as várias colunas
	        	String[] user = userLine.split(SEPARATOR);
				users.add(new User(Integer.parseInt(user[0]), user[1], Integer.parseInt(user[2]), Integer.parseInt(user[3]), Integer.parseInt(user[4])));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return users;
	}
}
