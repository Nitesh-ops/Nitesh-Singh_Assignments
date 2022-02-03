package com.pair.generic;
//4) Design a class named Pair which has two properties. The name of the first property is key
//and that of the second property is value. When designing the class take case of the following
//scenarios:
//a. Create an Object of Pair class to store String value for the property key and String
//value for the property value. Restriction Apart from String type no other types should
//be acceptable as Key or value input
//e.g.
// myObj.setKey(“1”);
// myObj.setValue(“Hello”);
//b. Create an object of the class Pair to store String value for the property key and
//java.util.Date as value for the property value
//myObj.setKey(“Today is”);
//myObj.setValue(new java.util.Date());
//Note: In scenario a. no data apart from String should be used for key and value, in scenario b.
//no data apart from String for key and java.util.Date should be allowed 

import java.util.Date;

public class Question4 {
	public static void main(String[] args) {
	Pair<String, String> Pairobj1=new Pair<String, String>("1","Hello");
	System.out.println("We are passing String and String: ");
	System.out.println(Pairobj1.getKey()+" "+Pairobj1.getValue());
	System.out.println("------------------------------------------");
	Pair<String, Date> Pairobj2=new Pair<String, Date>("Today is",new java.util.Date());
	System.out.println("We are passing String and Date: ");
	System.out.println(Pairobj2.getKey()+" "+Pairobj2.getValue());
	}

}
