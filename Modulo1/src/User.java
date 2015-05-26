
public class User {
	private int id;
	private int password;
	private int acumulado;
	private int minutes;
	
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
}
