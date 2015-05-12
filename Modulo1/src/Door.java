
public class Door {
	public enum velocity {slow, medium, fast};
	
	/**
	 *  D� ordem de abertura da porta com respectiva velocidade.
	 * @param veloc
	 */
	public static void abrirPorta(int veloc){
		Emitter.send(false, (veloc<<1)|1, 3);
	}
	
	/**
	 * D� ordem de fecho com respectiva velocidade.
	 * @param veloc
	 */
	public static void fecharPorta(int veloc){
		Emitter.send(false, (veloc<<1) & 0XFE, 3);
	}
	
	/**
	 * Indica se foi conclu�da a opera��o de abertura ou fecho.
	 * @return
	 */
	public static boolean limite(){
		 return Emitter.busy();
	}

	/**
	 * Estabelece os valores iniciais. 
	 */
	public static void init(){
		return;
	}

}
