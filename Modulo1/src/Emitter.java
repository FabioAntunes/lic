
public class Emitter {
	// Envia tramas para o m�dulo Serial Receiver.
	// Envia uma trama com o bit �lnd� e os bits de �data� (do menor peso ao maior peso)
	// O par�metro �size� indica o n�mero de bits de informa��o (4 ou 5).
	public static void send(boolean lnp, int data, int size){
		
	}
	// Indica se o MIS est� ocupado a processar uma trama.
	public static boolean busy(){
		return false;
	}
	// Estabelece os valores iniciais no porto de sa�da.
	public static void init(){
		
	}
}
