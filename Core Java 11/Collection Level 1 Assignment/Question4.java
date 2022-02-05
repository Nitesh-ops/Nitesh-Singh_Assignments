import java.util.LinkedList;
import java.util.ListIterator;

//4)	Given a LinkedList of Objects representing date of birth’s (use any inbuild java class to represent date), print the date’s along with the message: Your date of Birth is DD-MM-YYYY, and it (was or was not) a leap year.
//E.g.
//a)     For the date 23-12-2000 
//Your date of birth is 23-12-2000 and it was a leap year
//c)	For the date 23-12-2001
//
//Your date of birth is 23-12-2000 and it was not a leap year
//	
//	Note: You need to access the Dates in the reverse order. I.e. start from the last object and move towards the first object
public class Question4 {
	static boolean Checkleap(String str)
	{
		String[] arr = str.split("-");
		int year = Integer.parseInt(arr[2]);
		 if (year % 4 == 0) 
		 {
		      if (year % 100 == 0)
		      {
		        if (year % 400 == 0)
		          return true;
		        else
		          return false;
		      }
		      else
		      {
		        return true;
		      }
		  } 
		    else
		      return false;
	}
	public static void main(String[] args){
		 LinkedList<String> dt=new LinkedList<String>();  
		 dt.add("23-12-2000");
		 dt.add("23-12-2001");
		 dt.add("13-10-1999");
		 ListIterator<String> itr = dt.listIterator(dt.size());
		  while(itr.hasPrevious()){  
		   String str=itr.previous();
		   if(Checkleap(str))
		   {
			   System.out.println("Your date of birth is "+str+" and it was a leap year");
		   }
		   else 
		   {
			   System.out.println("Your date of birth is "+str+" and it was not a leap year");
		   }		  
		  }  
	}
}
