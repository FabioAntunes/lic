
public class Emitter {
	// Envia tramas para o módulo Serial Receiver.
	// Envia uma trama com o bit ‘lnd’ e os bits de ‘data’ (do menor peso ao maior peso)
	// O parâmetro ‘size’ indica o número de bits de informação (4 ou 5).
	public static void send(boolean lnp, int data, int size){
		
	}
	// Indica se o MIS está ocupado a processar uma trama.
	public static boolean busy(){
		return false;
	}
	// Estabelece os valores iniciais no porto de saída.
	public static void init(){
		
	}
}
