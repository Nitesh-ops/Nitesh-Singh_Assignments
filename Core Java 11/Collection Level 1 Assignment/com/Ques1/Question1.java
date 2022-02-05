package com.Ques1;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Question1 {
	public static void main(String[] args) {
		Contact.Gender m= Contact.Gender.Male;
		Contact.Gender f= Contact.Gender.Female;
		Contact c1=new Contact(9878500485L,"Nitesh", "Nitesh@gmail.com", m);
		Contact c2=new Contact(7845104874L,"Vikash", "Vikash@gmail.com", m);
		Contact c3=new Contact(7524879604L,"Ashi", "Ashi@gmail.com", f);
		Contact c4=new Contact(8405174210L,"Monika", "Monika@gmail.com", f);
		Contact c5=new Contact(8745487424L,"Sorav", "Sorav@gmail.com", m);
		
		Map<Long, Contact> det=new TreeMap<>();
		det.put(c1.getPhoneNumber(),c1);
		det.put(c2.getPhoneNumber(),c2);
		det.put(c3.getPhoneNumber(),c3);
		det.put(c4.getPhoneNumber(),c4);
		det.put(c5.getPhoneNumber(),c5);
		
		Set<Entry<Long,Contact>> entrySet= det.entrySet();
		Iterator<Entry<Long,Contact>> it=entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry<Long,Contact> disp=(Map.Entry<Long, Contact>) it.next();
			Long lg=disp.getKey();
			Contact ck=disp.getValue();
			System.out.println(ck);
			System.out.println(lg);
		}
		
		
	}

}
