package com.Ques1;

public class Contact implements Comparable<Contact>{
private Long PhoneNumber;
private String Name;
private String Email;
private String Gender;


	public Contact(Long phoneNumber, String name, String email, String gender) {
	super();
	PhoneNumber = phoneNumber;
	Name = name;
	Email = email;
	Gender = gender;
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

public String getGender() {
	return Gender;
}

	@Override
public String toString() {
	return "Contact [PhoneNumber=" + PhoneNumber + ", Name=" + Name + ", Email=" + Email + ", Gender=" + Gender + "]";
}

	@Override
	public int compareTo(Contact o) {
		return this.getPhoneNumber().compareTo(o.getPhoneNumber());
	}

}
