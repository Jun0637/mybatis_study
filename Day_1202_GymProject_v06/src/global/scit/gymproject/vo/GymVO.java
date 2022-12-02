package global.scit.gymproject.vo;
public class GymVO {
	private static final long seriaVersionUID = 5163707290209729384L;
	private String usrid;  //Primary key(Unique, Not Nill)
	private String usrname;
	private double height;
	private double weight;
	private double bmi;
	private String result;
	private String joindate;
	
	public GymVO() {}
	public GymVO(String usrid, String usrname, double height, double weight,String joindate) {
		this.usrid = usrid;
		this.usrname= usrname;
		this.height = height;
		this.weight = weight;
		this.joindate = joindate;
		calcBMI();
	}
	
	public void calcBMI() {
		this.bmi = this.weight / ((height*0.01)*(height*0.01));
		calcResult();
	}
	public void calcResult() {
		if(bmi >= 35)      result = "고도비만";
		else if(bmi >= 30) result = "중도비만";
		else if(bmi >= 25) result = "경도비만";
		else if(bmi >= 23) result = "과체중";
		else if(bmi >= 18.5) result = "정상";
		else  			   result = "저체중";
	}
	// setter, getter
	public void setUsrid(String usrid) {
		this.usrid = usrid;
	}
	public void setUsrame(String usrname) {
		this.usrname = usrname;
	}	
	public void setHeight(double height) {
		this.height = height;
		calcBMI();
	}
	public void setWeight(double weight) {
		this.weight = weight;
		calcBMI();
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	// getter
	public String getUsrid() {
		return usrid;
	}
	public String getUsrname() {
		return usrname;
	}

	public double getWeight() {
		return weight;
	}
	public double getHeight() {
		return height;
	}
	public double getBMI() {
		return bmi;
	}
	public String getResult() {
		return result;
	}
	public String getJoindate() {
		return joindate;
	}
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		
		String temp = String.format("%.2f(kg)%n%.2f(cm)%n%.2f %s%n", weight, height, bmi, result);
		
		buf.append(usrid).append("\n").append(usrname).append("\n").append(temp).append("\n").append(joindate);
		return buf.toString();
	}
}