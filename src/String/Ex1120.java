package String;
import java.io.BufferedInputStream;
import java.io.IOException;

public class Ex1120 {

	 public static void main(String[] args) throws IOException{
		 BufferedInputStream br = new BufferedInputStream(System.in);
		 while(true){
			 int N = br.read();
			 if(N==10 || N==13) N = br.read();
			 br.read();
			 boolean out = N == 48;
			 int D, prev = 0;
			 while(true){
				 D=br.read();
				 if(D==13 || D==10) break;
				 if(D==N) continue;
				 out = false;
				 if(prev==0 && D==48) continue;
				 prev = D - 48;
				 System.out.print(D - 48);
			 }
			 if(out) break;
			 if(prev == 0) System.out.print(0);
			 System.out.println();
		 }
	 }
}
