import java.lang.Math;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	double SI=(principalAmount*interestRate*time)/100;
    	return SI;
    	
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	double CI=principalAmount*(Math.pow((1+interestRate),time))-principalAmount;
    	return CI;
    }
}
public class Assignment1Q3 {
    public static void main (String args[]) {
    	SiCi Interest=new SiCi();
    	double SI=Interest.simpleInterest(10000,2,7);
    	System.out.println("Simple Interest is: "+SI);
    	
    	double CI=Interest.compoundInterest(10000,2,7);
    	System.out.println("Compound Interest is: "+CI);
    	
    }
}