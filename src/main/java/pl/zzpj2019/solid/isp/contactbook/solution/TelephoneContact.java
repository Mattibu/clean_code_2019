package pl.zzpj2019.solid.isp.contactbook.solution;

public class TelephoneContact implements Dialable{
	
	public String telephone;
	
	public TelephoneContact(String telephone){
		this.telephone = telephone;
	}
	
	@Override
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
