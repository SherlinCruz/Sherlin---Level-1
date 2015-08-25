package sherlin;

public class Minion {
	private String name;
	private int eyes;
	private String color;
	private String master;

	public Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes=eyes;
		this.color=color;
		this.master=master;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaster() {
		return master;
	}

	public void setMaster(String master) {
		this.master = master;
	}
	

//	String getName() {
//
//		return this.name;
//
//	}
//
//	void setName(String name) {
//		this.name = name;
//	}
//
//	int getEyes() {
//
//		return this.eyes;
//
//	}
//
//	void setEyes(int eyes) {
//		this.eyes = eyes;
//	}
//
//	String getColor() {
//
//		return this.color;
//
//	} 
//
//	void setColor(String color) {
//		this.color = color;
//	}
//
//	String getMaster() {
//		return this.master;
//	}
//
//	void setMaster(String master) {
//		this.master = master;
//	}

}
