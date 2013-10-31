package algorithms;

public class BottomupMergesort implements SortInterface{

		public static int[] toSort;
		private static int[] aux;
		
		public void setSort(int[] unsortedInt) {
			// TODO Auto-generated method stub
			int n =unsortedInt.length;
			toSort = new int[n];
			for(int i = 0;i<n;i++)toSort[i]=unsortedInt[i];
		}
		


		private static void merge(int[] unsortedInt, int lo, int mid, int hi) {
			// TODO Auto-generated method stub
			for(int k=lo;k<=hi;k++)
				aux[k]=unsortedInt[k];
			int i= lo, j=mid+1;
			for (int k=lo;k<=hi;k++)
			{
				if      (i>mid)               unsortedInt[k] = aux[j++];
				else if (j>hi)                unsortedInt[k] = aux[i++];
				else if (less(aux[j],aux[i])) unsortedInt[k] = aux[j++];
				else                          unsortedInt[k] = aux[i++];
			}
			for(int m=0;m<unsortedInt.length;m++)toSort[m]=unsortedInt[m];
			
		}

		
		public void sort(int[] unsortedInt){
			int n = unsortedInt.length;
			aux = new int[n];
			for (int size=1;size<n;size=size+size){
				for(int lo=0;lo<n-size;lo+=size+size){
				merge(unsortedInt, lo, lo+size-1,Math.min(lo+size+size-1,n-1));
				}
			}
		}
		private static boolean less(Integer Integer, Integer Integer2) {

			return (Integer.compareTo(Integer2)<0);
		}



		public int[] getInt() {
			// TODO Auto-generated method stub
			return toSort;
		}
}

