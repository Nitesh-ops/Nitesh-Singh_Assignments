import java.util.*;

class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
    	int result = 0; 
    	int original = num; 
    	while(num != 0){
    		int remainder = num%10; 
    		result = result + remainder*remainder*remainder; 
    		num = num/10; 
    		} 	
    		if(original == result)
    		{
    			return true;
    		}
    		else 
    		{
    			return false;
    		} 	    	
    	}
    }

public class Assignment1Q1 {
    public static void main(String[] args) {
    	ArmstrongOrNot check=new ArmstrongOrNot();
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the number: ");
    	int num = sc.nextInt(); 
    	sc.close();
    	if(check.armstrongCheck(num))
    	{ 
    		System.out.println(num + " is an Armstrong number");
    	}
    	else
    	{
    		System.out.println(num + " is not an Armstrong number"); 
    	}

    	
    	
    	
    }
}