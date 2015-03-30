import isel.leic.usbio.UsbPort;
import isel.leic.utils.Time;


public class Contador {

	public static final int EV_CLR = 2;
	public static final int EV_CE = 1;
	public static final int EV_NONE = 0;
	public static final int CE_MASK = 0x80;
	public static final int CLR_MASK = 0x01;

	/**
	 * Espera um evento milis milisegundos.
	 *
	 * @param milis
	 * @return : EV_CLR, EV_CE ou EV_NONE
	 */
	private static int waitEvent (long milis) {
		char in_val = 0x00;
		long timeout = 0;
		while (timeout < milis) {
			Time.sleep(100);
			in_val = (char)~UsbPort.in();
			if ((in_val&CLR_MASK) == CLR_MASK) return EV_CLR;
			timeout+=100;
		}
		if (( in_val & CE_MASK)== CE_MASK ) return EV_CE;
		return EV_NONE;
	}
	/**
	 * Implementa um contador UP de 4 bits sobre o porto de output
	 * do Kit usbport , com os sinais de count enable (CE) no bit I7
	 * e clear (CLR) no bit I0.
	 */
	public static void count() {
		int out_val = 0x00;
		int ev = 0;
		int mask = 0x000f;
		UsbPort.out(~(out_val&mask));
		while (true) {
			ev = waitEvent(1000);
			if ( EV_CLR == ev ) {
				out_val = 0x00;
				UsbPort.out(~(out_val&mask));
			} else if ( EV_CE == ev ) {
				UsbPort.out(~(out_val&mask));
				out_val += 1;
			}
		}
	}

}
