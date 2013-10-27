package algorithms;

public class QuickUnion {

		private int[] id;
		
		public QuickUnion(int size){
			
			id = new int[size];
			for (int i=0;i<size;i++){
				id[i]=i;
			}
		}
		
		public int root(int i){
			while (i!=id[i])i=id[i];
			return i;
		}
		
		public boolean connected(int alpha, int beta){
			
			return root(alpha)==root(beta);
		}
		
		public void union(int alpha, int beta){
			int i = root(alpha);
			int j = root(beta);
			id[i]=j;
			}
		
		public int[] getId(){
			return id;
		}
		}


	

