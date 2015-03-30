import isel.leic.usbio.UsbPort;


public class Main {

	public static void main(String[] args) {
		// CONTADOR
		//Main.contador();
		
		//KBD
		Main.kbd();
	}
	
	private static void contador(){
		UsbPort.out(0xff);
		Contador.count();
	}
	
	private static void kbd(){
		KBD.init();
		//KBD.getKey();
		KBD.waitKey(10000);
	}

}
