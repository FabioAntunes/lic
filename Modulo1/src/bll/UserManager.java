package bll;

import java.util.ArrayList;

import dal.UserDAO;
import exceptions.FullListException;
import exceptions.UserNotFoundException;

public class UserManager {
	private static final int NUM_USERS = 100;
	private ArrayList<User> users = new ArrayList<User>();
	private UserDAO userDAO = new UserDAO();
	
	/**
	 * Devolve um novo objecto User e adiciona o mesmo a lista de Users
	 *  
	 * @param id
	 * @param nome
	 * @param password
	 * @return
	 * @throws FullListException 
	 */
	public User createUser(int id, String nome, int password, int acumulado, int minutes) throws FullListException{
		if(users.size() == NUM_USERS){
			throw new FullListException("Users list is full");
		}else{
			
			User user = new User(id, nome, password, acumulado, minutes);
			users.add(user);
			return user;
		}
	}
	
	/**
	 * Procura um utilizador pelo id
	 * 
	 * @param id of the User
	 * @return User 
	 * @throws UserNotFoundException 
	 */
	public User findUser(int id) throws UserNotFoundException{
		try{
			
			return users.get(id);
			
		}catch(IndexOutOfBoundsException exception){
			throw new UserNotFoundException("User with id: "+ id +" not found");
		}
	}
	
	/**
	 * Carrega os utilzadores existentes na nossa Data Access Layer
	 */
	public void loadUsers(){
		User[] users = userDAO.getUsers();
		
		for (User user : users) {
			//adicionar utilizador
		}
	}
}
