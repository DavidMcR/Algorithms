package algorithms;

public class QuickFind {
	private int[] id;
	
	public QuickFind(int size){
		
		id = new int[size];
		for (int i=0;i<size;i++){
			id[i]=i;
		}
	}
	
	public boolean connected(int alpha, int beta){
		
		return id[alpha]==id[beta];
	}
	
	public void union(int alpha, int beta){
		int alphaId = id[alpha];
		int betaId = id[beta];
		for (int i =0; i<id.length;i++){
			if (id[i]==alphaId) id[i]=betaId;
		}
	}
	public int[] getId(){
		return id;
	}

}
