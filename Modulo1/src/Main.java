
public class Main {

	public static void main(String[] args) {
		//KBD
		//kbd();
		
		//Emitter
		//emitter();
		
		//Door
		door(3);
	}
	
	private static void kbd(){
		KBD.init();
		KBD.getKey();
		KBD.waitKey(10000);
	}
	
	private static void emitter(){
		Kit.clear();
		Emitter.send(true, 341, 9);
	}
	
	private static void door(int velocidade){
		Kit.clear();
		Door.fecharPorta(velocidade);
	}

}
