package OrderStatistics;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KthAmallst ob = new KthAmallst(); 
        int arr[] = {12, 3, 5, 7, 4, 19, 26}; 
        int n = arr.length,k = 4; 
        System.out.println("K'th smallest element is "+ ob.kthSmallest(arr, 0, n-1, k)); 
    }


	}