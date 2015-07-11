package bll;

public class User {
	private int id;
	private String name;
	private int password;
	private int sum;
	private int minutes;


	public User(int id, String name, int password, int sum, int minutes){
		this.id = id;
		this.name = name;
		this.password= password;
		this.sum = sum;
		this.minutes = minutes;
	}
	
	/**
	 * Obter id do utilizador
	 * @return Id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Define o id do utilizador
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return Obter o nome do utilizador
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param Define o nome do utilizador
	 */
	public void setName(String nome) {
		this.name = nome;
	}
	
	/**
	 * Obter password do utilizador
	 * @return
	 */
	public int getPassword() {
		return password;
	}
	
	/**
	 * Define a password do utilizador
	 * @param password
	 */
	public void setPassword(int password) {
		this.password = password;
	}

	/**
	 * @return Obter horas acumuladas
	 */
	public int getSum() {
		return sum;
	}

	/**
	 * @param Define as horas acumuladas pelo utilizador
	 */
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	/**
	 * @return Obter os minutos do utilizador
	 */
	public int getMinutes() {
		return minutes;
	}

	/**
	 * @param Define os minutos do utilizador
	 */
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}	
	
}
