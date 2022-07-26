package ArrayRotation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RotateArray r = new RotateArray();
		int arr[] = { 2, 1, 4, 3, 5, 6, 7 }; 
		r.rotate(arr, 5); 
		for(int i=0;i<arr.length;i++){
    			System.out.print(arr[i]+" ");
		}
}

	}
