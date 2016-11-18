package String;
import java.io.IOException;
import java.util.Scanner; 
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */
public class Ex1024 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner in = new Scanner(System.in);
		int N = Integer.valueOf(in.nextLine());
		for(int i=0; i<N; i++){
			String M = in.nextLine();
			byte[] bytes = M.getBytes();
			byte[] nletra = new byte[bytes.length];
			int t = bytes.length/2;
			for(int j=bytes.length-1; j>=0; j--){
				byte b = bytes[j];
				int p = bytes.length-1-j;
				if((b>=65 && b<=90) || (b>=97 && b<=122)){
					if(p>=t)
						nletra[p] = b+=2;
					else
						nletra[p] = b+=3;
				}else{
					if(p>=t)
						nletra[p] = --b;
					else
						nletra[p] = b;
				}
			}
			System.out.println(new String(nletra));
		} 
    }
 
}