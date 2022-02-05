package com.Ques1;

public class Contact implements Comparable<Contact>{
private Long PhoneNumber;
private String Name;
private String Email;
private Gender Gend;
public enum Gender{
	Male,Female
}


	public Contact(Long phoneNumber, String name, String email, Gender gend) {
	super();
	PhoneNumber = phoneNumber;
	Name = name;
	Email = email;
	Gend = gend;
}

	public Long getPhoneNumber() {
	return PhoneNumber;
}

public String getName() {
	return Name;
}

public String getEmail() {
	return Email;
}

public Gender getGender() {
	return Gend;
}

	@Override
public String toString() {
	return "Contact [PhoneNumber=" + PhoneNumber + ", Name=" + Name + ", Email=" + Email + ", Gender=" + Gend + "]";
}

	@Override
	public int compareTo(Contact o) {
		return this.getPhoneNumber().compareTo(o.getPhoneNumber());
	}

}
