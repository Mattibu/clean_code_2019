package pl.zzpj2019.solid.isp.contactbook.solution;

public class EmailContact implements Emailable{
	public String name;
	public String address;
	public String emailAddress;
	
	public EmailContact(String name, String address, String emailAddress) {
		this.name = name;
		this.address = address;
		this.emailAddress = emailAddress;
	}
	
	@Override
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
