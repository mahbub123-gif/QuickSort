public class Quick_Sort {
	public static  int Partition(int a[], int p,int r) {
		
		int x=a[r];
		
		int i=(p-1);
		
		for(int j=p;j<=r;j++) {
			
			if(a[j]<=x) {
				
				i++;
				
				int temp =a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
			
			
		}
		int temp = a[i+1];
		a[i+1]=a[r];
		a[r]=temp;
		
		return i+1;
		
		
	}
	public static  void QuickSort(int a[], int p,int r) {
		
		if(p<r) {
			
			int q;
			q=Partition(a,p,r);
			
			QuickSort(a,p,q-1);
			
			QuickSort(a,q+1,r);
			
			
		}
		
	}
	public static void main(String[] args) {
		int a[]= {12,3,12,4,4,2};
		 
		QuickSort(a,a.length,1);
          
		for(int i=0; i<a.length;i++)
			
			System.out.println(a[i]);
        
		

	}

}
