
public class KBD {
	public static final int KEY_MASK = 0x0F; // M�scara para obter os 4 bits, menor peso, do Kit
	public static final int K_VAL_MASK = 0x10; // M�scara para obter o bit maior peso do valor de entrada do Kit
	public static final int K_ACK_MASK = 0x01; // M�scara para emitir o bit de menor peso para o Kit
	public static final char NONE = 0; // Valor retornado quando n�o h� tecla.
	private static final boolean SCAN_SOFTWARE = true; // Mudar na implementa��o 2.
	private static char[] keys;
	
	
	
	/**
	 * Retorna de imediato a tecla premida ou NONE se n�o h� tecla premida.
	 * @return Tecla lida de forma nao bloqueante
	 */
	public static char getKey(){
		int in_val = 0;
		in_val = Kit.in();
		if ((in_val&K_VAL_MASK) == K_VAL_MASK){
			
			//aplicar mascara e obter a tecla
			System.out.println("Valor da tecla " + (in_val&KEY_MASK));
			
			//Emite K_ACK
			Kit.out(K_ACK_MASK);
			
			while(true){
				if(( Kit.in()&K_VAL_MASK) != K_VAL_MASK){
					Kit.clear();
					break;
				}
				Kit.sleep(100);
			}
			System.out.println("Caracter pressionado: " + KBD.keys[in_val&KEY_MASK]);
			
			return KBD.keys[in_val&KEY_MASK];
		}
		
		return NONE;
		
	}
	
	/**
	 * Retorna quando a tecla for premida ou NONE ap�s decorrido �timeout� milisegundos.
	 * @param timeout Em milisegundos
	 * @return Devolve o caracter pressionado
	 */
	public static char waitKey(long timeout){
		long startTime = Kit.getTimeInMillis();
		long currentTime = Kit.getTimeInMillis();
		char returnedChar;
		while (currentTime - startTime <= timeout) {
			returnedChar = getKey();
			if(returnedChar != NONE){
				
				return returnedChar;
				
			}
			//esperar um decimo do timeout
			Kit.sleep(timeout/10);
			currentTime = Kit.getTimeInMillis();
		}
		
		return NONE;
		
	} 
	
	/**
	 * Estabelece os valores iniciais no porto de sa�da. Chamado no in�cio do programa.
	 */
	public static void init(){
		Kit.clear();
		initChars();
	}
	
	/**
	 * M�todo privado que inicializa o mapeamento dos caracteres com os valores inteiros recebidos pelo Kit
	 */
	private static void initChars(){
		KBD.keys = new char[]{'0', '4', '8', 'C', '1', '5', '9', 'D','2', '6', 'A', 'E', '3', '7', 'B', 'F'};
	}

}