
public class Main {

	public static void main(String[] args) {
		//KBD
		//kbd();
		
		//Emitter
		emitter();
	}
	
	private static void kbd(){
		KBD.init();
		//KBD.getKey();
		KBD.waitKey(10000);
	}
	
	private static void emitter(){
		Emitter.init();
		//KBD.getKey();
		Emitter.send(false, 6, 3);
	}

}
