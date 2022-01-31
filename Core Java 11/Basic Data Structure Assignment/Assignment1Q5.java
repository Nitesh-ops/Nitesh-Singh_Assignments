import java.util.Scanner;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
    	double tax=0;
    	if(ctc<=180000)
    	{
    		tax=0;
    		return tax;
    	}
    	else if(ctc>=181001 && ctc<=300000)
    	{
    		tax=0.10*ctc;
    		return tax;
    	}
    	else if(ctc>=300001 && ctc<=500000)
    	{
    		tax=0.20*ctc;
    		return tax;
    	}
    	else if(ctc>=500001 && ctc<=1000000)
    	{
    		tax=0.30*ctc;
    		return tax;
    	}
    	return tax;
    }
}
public class Assignment1Q5 {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	TaxAmount find =new TaxAmount();
    	System.out.print("Enter your CTC: ");
    	int ctc=sc.nextInt();
    	sc.close();
    	double result=find.calculateTaxAmount(ctc);
    	System.out.print("Tax is: "+result);
    }
}