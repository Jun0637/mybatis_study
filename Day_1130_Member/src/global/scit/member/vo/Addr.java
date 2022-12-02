package global.scit.member.vo;

public class Addr {
	private int addrno;
	private String city;
	private String address;

	public Addr() {

	}

	public Addr(int addrno, String city, String address) {
		this.addrno = addrno;
		this.city = city;
		this.address = address;
	}

	public int getAddrno() {
		return addrno;
	}

	public void setAddrno(int addrno) {
		this.addrno = addrno;
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
		return "Addr [addrno=" + addrno + ", city=" + city + ", address=" + address + "]";
	}

}
