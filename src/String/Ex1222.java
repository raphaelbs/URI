package String;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1222 {

	public static void main(String[] args) throws IOException {
		BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder res = new StringBuilder();
		
		while(true){
			// Lê linhas
			String lineNLC = bis.readLine();
			if(lineNLC==null) break;
			String words = bis.readLine();
			// Separa NLC
			String[] nlcp = lineNLC.split(" ");
			int n, l, c;
			n = Integer.valueOf(nlcp[0]);
			l = Integer.valueOf(nlcp[1]);
			c = Integer.valueOf(nlcp[2]);
			// Caso especial
			if(c<3){
				res.append((int)Math.ceil((double)n/(double)l));
				res.append("\n");
				continue;
			}
			// Conta o tamanho das palavras
			int[] wordsSize = new int[1000];
			int count=0, previous = 0;
			for(int i=0; i<words.length(); i++){
				char now = words.charAt(i);
				if(now==' ' && i-previous>0) {
					wordsSize[count++] = i-previous;
					previous = i+1;
				}
			}
			wordsSize[count] = words.length()-previous;
			// Calcula o numero de linhas
			int numLin = wordsSize[0]>0 ? 1 : 0, numChar = 0;
			for(int i=0; i<n; i++){
				numChar += wordsSize[i]+1;
				if(numChar-1==c){
					numChar=0;
					if(i+1!=n) numLin++;
				}else if(numChar>c){
					numChar = wordsSize[i]+1;
					numLin++;
				}
			}
			if(numChar-1==c) numLin++;
			// Salva o numero de linhas
			res.append((int)Math.ceil((double)numLin/(double)l));
			res.append("\n");
		}
		System.out.print(res.toString());
	}

}
