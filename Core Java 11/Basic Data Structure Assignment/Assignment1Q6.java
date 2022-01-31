//import java.util.Scanner;
//
//class Login{
//    public String loginUser(String user, String pass) {
//    	String userId = "Ajay",password = "password";
//    	int flag=0,i=0;
//    	while(i<3) {
//    	if(user.equals(userId) && pass.equals(password))
//    	{
//    		return "Welcome "+userId;
//    	}
//    	else
//    	{
//    		if(flag==3)
//    		{
//    			return "You have entered wrong credentials 3 times" + "\r\n"
//    					+ "Contact Admin";
//    		}
//    		flag++;
//    		return "You have entered wrong credentials ,please enter the right credentials";
//    	}
//    }
//		return null;
//    }
//}
//public class Assignment1Q6 {
//    public static void main(String[] args) {
//    	Login usr=new Login();
//    	Scanner sc = new Scanner(System.in);
//    	System.out.print("Enter userId: ");
//    	String user=sc.nextLine();
//    	System.out.print("Enter password: ");
//    	String password=sc.nextLine();
//    	//usr.loginUser(user,password);
//    	String txt=usr.loginUser(user,password);
//    	if(txt.equals("Welcome "+user))
//    	{
//    		System.out.print("Welcome "+user);
//    	}
//    	else if(txt.equals("You have entered wrong credentials ,please enter the right credentials"))
//    	{
//    		System.out.print("ok");
//    	}
//    	//System.out.print(txt);
//    }
//}





//Q6. Consider a CUI based application, where you are asking a user to enter his Login name and password, 
//after entering the valid user-id and password it will print the message “Welcome” along with user name.
//As per the validation is concerned, the program should keep a track of login attempts. After three attempts
//a message should be flashed saying “Contact Admin” and the program should terminate.   


import java.util.*;
class Login{
    String userId = "Ajay",password = "password";
    Scanner sc = new Scanner(System.in);
    int c=0;
    public String getUser()
    {
    	System.out.println("Enter UserId");
		String user=sc.next();
		return user;
    }
    public String getPassword()
    {
    	System.out.println("Enter Password");
	    String  pass=sc.next();
	     return pass;
    }
    public String loginUser(String user, String pass) {
    	
    	  user=getUser();
		  pass=getPassword();
    if(user.equals(userId) && pass.equals(password))
    {
    	return "welcome"+" "+user;
    }
	    c++;
	    if(c<3)
	    {
	       System.out.println("You have entered wrong credentials ,please enter the right credentials.");
	       loginUser(user,pass);
	       if(user.equals(userId) && pass.equals(password))
	       {
	       	return "welcome"+" "+user;
	       }
	    }
	    
	    	return "You have entered wrong credentials 3 times"+"\n"+"Contact Admin";
	    
    }

}
public class Assignment1Q6 {

	public static void main(String[] args) {
		
		Login lg=new Login();
		String user="",pass="";
		
		System.out.println(lg.loginUser(user, pass));
	}

}
