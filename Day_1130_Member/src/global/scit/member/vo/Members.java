package global.scit.member.vo;

public class Members {
	private String usrid;
	private String usrname;
	private String email;
	private int addrno;

	public Members() {

	}

	public Members(String usrid, String usrname, String email, int addrno) {
		this.usrid = usrid;
		this.usrname = usrname;
		this.email = email;
		this.addrno = addrno;
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

	public int getAddrno() {
		return addrno;
	}

	public void setAddrno(int addrno) {
		this.addrno = addrno;
	}

	@Override
	public String toString() {
		return "Members [usrid=" + usrid + ", usrname=" + usrname + ", email=" + email + ", addrno=" + addrno + "]";
	}

}
