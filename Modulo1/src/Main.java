
public class Main {

	public static void main(String[] args) {
		//KBD
		//kbd();
//		KBD.init();
//		Door.init();
		Kit.clear();
		LCD.init();
		LCD.write('H');
//		door(2);
	}
	
	private static void kbd(){
		
		KBD.getKey();
		KBD.waitKey(10000);
	}
	
	private static void door(int velocidade){
		Kit.clear();
		Door.abrirPorta(velocidade);
	}

}
