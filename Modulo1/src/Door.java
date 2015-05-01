
public class Door {
	public enum velocity {slow, medium, fast};
	private static boolean doorOpen;
	
	/**
	 *  Dá ordem de abertura da porta com respectiva velocidade.
	 * @param veloc
	 */
	public static void abrirPorta(int veloc){
		Emitter.send(false, (veloc<<1)|1, 3);
		doorOpen = true;
	}
	
	/**
	 * Dá ordem de fecho com respectiva velocidade.
	 * @param veloc
	 */
	public static void fecharPorta(int veloc){
		Emitter.send(false, (veloc<<1)|0, 3);
		doorOpen = false;
	}
	
	/**
	 * Indica se foi concluída a operação de abertura ou fecho.
	 * @return
	 */
	public static boolean limite(){
		 return Emitter.busy();
	}

	/**
	 * Estabelece os valores iniciais. 
	 */
	public static void init(){
		doorOpen = false;
	}

}
