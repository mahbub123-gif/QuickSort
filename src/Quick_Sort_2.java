
public class Quick_Sort_2 {
	static void swap(int[] a, int i, int j)
	{
	    int temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	}
	public static  int Partition(int a[], int p,int r) {
		
		int x=a[r];
		
		int i=(p-1);
		
		for(int j=p;j<=r-1;j++) {
			
			if(a[j]<x) {
				
				i++;
				swap(a,i,j);
				
			}
			
		}
		swap(a,i+1,r);
		return i+1;
		
	}
	
	public static void QuickSort(int a[], int p,int r) {
		
		if(p<r) {
			
			int x=Partition(a,p,r);
			
			QuickSort(a,p,x-1);
			
			QuickSort(a,x+1,r);
			
			
		}
		
	}

	
	public static void main(String[] args) {
		int i;
		int a[]= {1,5,4,6,4};
		
		
		QuickSort(a,0,a.length-1);
		
		System.out.println("The Sorted array is :");
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
			
		
			
			
        
		

	}

}

