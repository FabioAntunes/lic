
public class Emitter {
	// Envia tramas para o m�dulo Serial Receiver.
	// Envia uma trama com o bit �lnp� e os bits de �data� (do menor peso ao maior peso)
	// O par�metro �size� indica o n�mero de bits de informa��o (4 ou 5).
	
	public static final int MIBy_MASK = 0X10;
	public static final int MIxD_MASK = 0x01;
	public static final int MIcK_MASK = 0x02;
	
	public static void send(boolean lnp, int data, int size){
		// Verificar se MIS se encontra busy
		if (busy()) {
			waitReady();
		}
		start();
	}
	// Indica se o MIS est� ocupado a processar uma trama.
	public static boolean busy(){
		int in_val = Kit.in();
		if ((in_val & MIBy_MASK) == MIBy_MASK ) {
			return false;			
		}
		else {
			return true;
		}
	}
	
	private static void waitReady() {
		while(!busy()) {
			;
		}
	}
	
	private static void start() {
		// TODO Auto-generated method stub
		
	}
	// Estabelece os valores iniciais no porto de sa�da.
	public static void init(){
		Kit.clrBit(MIcK_MASK);
		Kit.setBit(MIxD_MASK);
	}
}
