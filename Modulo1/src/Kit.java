import isel.leic.usbio.UsbPort;
import isel.leic.utils.Time;

public class Kit {
	
	/**
	 * Obt�m valores de entrada do USBPort
	 * @return Valor inteiro, negado, correspondente aos 8 bits de entrada
	 */
	public static int in() {
		return ~UsbPort.in();
	}
	
	/**
	 * Devolve o valor inteiro, negado, para o USBPort
	 * @param outValue Valor decimal correspondente aos 8 bits que se deseja emitir
	 */
	public static void out(int outValue) {
		UsbPort.out(~outValue);
	}
	
	/**
	 * Limpar a sa�da do USBPort
	 */
	public static void clear() {
		UsbPort.out(0xFF);
	}
	
	/**
	 * Colocar a execu��o do programa em standby durante o tempo indicado em milisegundos
	 * @param milis Tempo em milisegundos
	 */
	public static void sleep(long milis) {
		Time.sleep(milis);
	}
	
	/**
	 * Obter o tempo atual em milisegundos
	 * @return Tempo em milisegundos
	 */
	public static long getTimeInMillis() {
		return Time.getTimeInMillis();
	}
	
}
