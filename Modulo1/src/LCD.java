
public class LCD {
	public static final int LINES = 2;
	public static final int COLS = 16;
	private static final boolean COMMAND = false;
	private static final boolean WRITE = true;
	
	/**
	 * Envia o bit ‘rs’ e os 8 bits de ‘data’.
	 * O bit ‘rs’ indica se é comando ou escrita.
	 * @param rs
	 * @param data
	 */
	 private static void sendByte(boolean rs, int data){
		 Emitter.send(true, data<<1 | (rs ? 1 : 0), 9);
	 }
	 
	 /**
	  * Envia a sequência de iniciação do LCD.
	  */
	 public static void init(){
		 int initCommand = 0X30;
		 int fontLineCommand = 0X38;
		 int displayOff = 0X08;
		 int displayClear = 0X01;
		 int entryModeSet = 0X07;
		 int displayOn = 0X0F;
		 sendByte(COMMAND, initCommand);
		 
		 //wait more than 4.1ms
		 Kit.sleep(5);
		 sendByte(COMMAND, initCommand);
		 Kit.sleep(1);
		 sendByte(COMMAND, initCommand);
		 
		 sendByte(COMMAND, fontLineCommand);
		 
		 sendByte(COMMAND, displayOff);
		 sendByte(COMMAND, displayClear);
		 sendByte(COMMAND, entryModeSet);
		 sendByte(COMMAND, displayOn);
		 System.out.println("coiso");
	 }
	 
	 /**
	  * Escreve um carácter na posição corrente.
	  * @param c caracter que vai ser escrito
	  */
	 public static void write(char c){
		 sendByte(WRITE, (int)c);
	 }
	 
	 /**
	  * Escreve uma string na posição corrente.
	  * @param txt texto que vai ser escrito
	  */
	 public static void write(String txt){
		 for (int i = 0; i < txt.length(); i++){
		    write(txt.charAt(i));
		}
	 }
	 
	 /**
	  * Envia comando para posicionar cursor (‘lin’:0..LINES-1 , ‘col’:0..COLS-1)
	  * @param lin
	  * @param col
	  */
	 public static void cursor(int lin, int col){
		 int DB7 = 0X80;
		 int LINHA = 0X40;
		 
		 sendByte(COMMAND, DB7|(lin * LINHA + col));
	 }
}
