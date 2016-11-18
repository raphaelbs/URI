package String;
import java.io.BufferedInputStream;
import java.io.IOException;

public class Ex1168 {
	
	static final byte M0 = 6;
	static final byte M1 = 2;
	static final byte M2 = 5;
	static final byte M3 = 5;
	static final byte M4 = 4;
	static final byte M5 = 5;
	static final byte M6 = 6;
	static final byte M7 = 3;
	static final byte M8 = 7;
	static final byte M9 = 6;

	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(System.in);
		int N = readInt(bis, 4);
		for(int i=0; i<N; i++){
			short sum = 0;
			while(true){
				int Vi = bis.read();
				if(Vi==10 || Vi==13) break;
				switch (Vi-48) {
				case 0:
					sum+=M0;
					break;
				case 1:
					sum+=M1;
					break;
				case 2:
					sum+=M2;
					break;
				case 3:
					sum+=M3;
					break;
				case 4:
					sum+=M4;
					break;
				case 5:
					sum+=M5;
					break;
				case 6:
					sum+=M6;
					break;
				case 7:
					sum+=M7;
					break;
				case 8:
					sum+=M8;
					break;
				case 9:
					sum+=M9;
					break;
				default:
					break;
				}
			}
			if(sum > 0)
				System.out.println(sum + " leds");
			else
				i--;
		}
	}
	
	static int readInt(BufferedInputStream bis, final int size) throws IOException {
		final byte[] Ns = new byte[size];
		for(int i=0; i<size; i++){
			byte b = (byte)bis.read();
			if(b==10 || b==13) break;
			Ns[i] = b;
		}
		return Integer.valueOf(new String(Ns).trim());
	}

}
