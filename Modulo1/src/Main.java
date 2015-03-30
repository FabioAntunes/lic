
public class Main {

	public static void main(String[] args) {
		//KBD
		kbd();
	}
	
	private static void kbd(){
		KBD.init();
		//KBD.getKey();
		KBD.waitKey(10000);
	}

}
