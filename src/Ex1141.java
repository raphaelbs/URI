import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex1141 {

	static class Node {
		int size;
		String line;
		Node father;
		List<Node> uncles;
		List<Node> sons;
		
		public Node(){
			this.sons = new ArrayList<>();
			this.uncles = new ArrayList<>();
		}
		public void addAttrs(String line){
			this.line = line;
			this.size = line.length();
		}
		
		public void insert(String line){
			if(this.line==null){
				addAttrs(line);
				return;
			}
			int size = line.length();
			if(this.size > size){
				
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (String line; (line = br.readLine()) != "0";) {
			int N = Integer.valueOf(line);
			Node root = new Node();
			for (int i = 0; i < N; i++) {
				line = br.readLine();
				root.insert(line);
			}
		}
	}

}
