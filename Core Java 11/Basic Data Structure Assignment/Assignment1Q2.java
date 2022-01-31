class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
    	int j=0;
    	int[] arr = new int[4];
    	for (int i = min; i<max; i++)
    	{
            int check, rem, sum = 0;
            check = i;
            while(check != 0) {
               rem = check % 10;
               sum = sum + (rem * rem * rem);
               check = check / 10;
            }
            if(sum == i){
               arr[j]=i;
               j++;
               
            }
         }
    	return arr;
    	
    }
}

public class Assignment1Q2 {
    public static void main (String [] args) {
       int min = 100;int max = 999;
       ArmstrongNumBetweenRange find=new ArmstrongNumBetweenRange();
       System.out.print("Armstrong numbers from "+min+" to "+max+" are: ");
       int arr1[]=find.armstrongNumbersInRange(min, max);
       for(int i=0;i<arr1.length;i++)
       {
    	   System.out.print(arr1[i]+" ");
       }

    }
}