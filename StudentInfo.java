package homework3;

public abstract class StudentInfo implements Begin {

	private int iD;
	private String name;
	private String address;
	
	public StudentInfo(int iD, String name, String address){
		this.iD = iD;
		this.name = name;
		this.address = address;
	}
	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
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

	public abstract void startingYear(int g);
	public abstract void expectedGrad(int i);
}
