package vo;

public class UsrInfo {
	private String usrid;
	private String usrname;
	private int age;
	
	public UsrInfo() {
		super();
	}
	
	@Override
	public String toString() {
		return "usrinfo [usrid=" + usrid + ", usrname=" + usrname + ", age=" + age + "]";
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
