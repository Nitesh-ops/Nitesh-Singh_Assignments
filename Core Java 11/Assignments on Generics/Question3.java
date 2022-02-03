
//3) Write a generic method to exchange the positions of two different elements in an array.

public class Question3 {
	public static <T> void swapping(T[] arr,int m,int n)
	{
		T temp=arr[m];
		arr[m]=arr[n];
		arr[n]=temp;
	}
	 public static void main (String args[]) {
		 Integer arr[]= {10,20,30,40,50};
		 swapping(arr, 0, 4);
		 for (Integer i : arr) {
			 System.out.println(i);
		}
		
		 
	 }

}
