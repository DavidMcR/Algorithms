package algorithms;

public class ShellSort implements SortInterface{
	
	public static int[] toSort;


	public void sort(int[] unsortedInt) {
		int n = unsortedInt.length;
		int h = 1;
		while(h<n/3 )h=3*h+1;
		while(h>=1){
			for (int i=h;i<n;i++)
			{
				for (int j =i; j>=h && less(unsortedInt[j],unsortedInt[j-h]);j-=h)
					exchange(unsortedInt,j,j-h);
			}
			
			h=h/3;
			
		}
		
		for(int b=0;b<unsortedInt.length;b++)toSort[b]=unsortedInt[b];
	}
	
	public void setSort(int[] unsortedInt) {
		// TODO Auto-generated method stub
		int n =unsortedInt.length;
		toSort = new int[n];
		for(int i = 0;i<n;i++)toSort[i]=unsortedInt[i];
	}
	
	private static void exchange(int[] toExchange, int alpha, int beta ){
		int swap = toExchange[alpha];
		toExchange[alpha]=toExchange[beta];
		toExchange[beta]=swap;
	}
	
	private static boolean less(Integer Integer, Integer Integer2) {

		return (Integer.compareTo(Integer2)<0);
	}

	public int[] getInt() {
		// TODO Auto-generated method stub
		return toSort;
	}

}
