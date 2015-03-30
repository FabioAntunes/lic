import isel.leic.usbio.UsbPort;
import isel.leic.utils.Time;


public class KBD {
	public static final int KEY_MASK = 0x0F;
	public static final int K_VAL_MASK = 0x80;
	public static final int K_ACK_MASK = 0xFE;
	public static final char NONE = 0; // Valor retornado quando n�o h� tecla.
	private static final boolean SCAN_SOFTWARE = true; // Mudar na implementa��o 2.
	private static char[] keys;
	
	
	
	/**
	 * Retorna de imediato a tecla premida ou NONE se n�o h� tecla premida.
	 * @return Tecla lida de forma nao bloqueante
	 */
	public static char getKey(){
		int in_val = 0;
		in_val = ~UsbPort.in();
		if ((in_val&K_VAL_MASK) == K_VAL_MASK){
			//aplicar mascara e obter a tecla
			System.out.println("teste " + (in_val&KEY_MASK));
			//K_ACK
			UsbPort.out(K_ACK_MASK);
			while(true){
				if(( ~UsbPort.in()&K_VAL_MASK) != K_VAL_MASK){
					UsbPort.out(0xFF);
					break;
				}
				Time.sleep(100);
			}
			System.out.println("Caracter pressionado: " + KBD.keys[in_val&KEY_MASK]);
			return KBD.keys[in_val&KEY_MASK];
		}
		//System.out.println("No char! Bye");
		return NONE;
		
	}
	// Retorna quando a tecla for premida ou NONE ap�s decorrido �timeout� milisegundos.
	public static char waitKey(long timeout){
		long startTime = Time.getTimeInMillis();
		long currentTime = Time.getTimeInMillis();
		char returnedChar;
		while (currentTime - startTime <= timeout) {
			returnedChar = getKey();
			if(returnedChar != NONE){
				return returnedChar; 
			}
			//esperar um decimo do timeout
			Time.sleep(timeout/10);
			currentTime = Time.getTimeInMillis();
		}
		return NONE;
		
	}
	// Estabelece os valores iniciais no porto de sa�da. Chamado no in�cio do programa.
	public static void init(){
		UsbPort.out(127);
		KBD.initChars();
	}
	
	private static void initChars(){
		KBD.keys = new char[]{'0', '4', '8', 'C', '1', '5', '9', 'D','2', '6', 'A', 'E', '3', '7', 'B', 'F'};
	}

}
