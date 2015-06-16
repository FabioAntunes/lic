package bll;

public class User {
	private int id;
	private String nome;
	private int password;
	private int acumulado;
	private int minutes;
	
	public User(int id, String nome, int password, int acumulado, int minutes){
		this.id = id;
		this.nome = nome;
		this.password= password;
		this.acumulado = acumulado;
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
	public int getAcumulado() {
		return acumulado;
	}

	/**
	 * @param Define as horas acumuladas pelo utilizador
	 */
	public void setAcumulado(int acumulado) {
		this.acumulado = acumulado;
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
