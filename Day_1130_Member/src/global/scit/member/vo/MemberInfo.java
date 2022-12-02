package global.scit.member.vo;

public class MemberInfo {
	private String usrid;
	private String usrname;
	private String email;
	private String city;
	private String address;

	public MemberInfo() {

	}

	public MemberInfo(String usrid, String usrname, String email, String city, String address) {
		this.usrid = usrid;
		this.usrname = usrname;
		this.email = email;
		this.city = city;
		this.address = address;
	}

	public String getUsrid() {
		return usrid;
	}

	public void setUsrid(String usrid) {
		this.usrid = usrid;
	}

	public String getUsrname() {
		return usrname;
	}

	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "MemberInfo [usrid=" + usrid + ", usrname=" + usrname + ", email=" + email + ", city=" + city
				+ ", address=" + address + "]";
	}

}
