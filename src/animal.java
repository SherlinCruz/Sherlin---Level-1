public class animal {
	public String name;
	public int age;

	public static void main(String[] args) {

		animal a = new animal("Leo", 1);
System.out.println("wooooofffff");
System.out.println(a.getName());
System.out.println(a.getage());
	}

	animal(String name, int age) {
		this.name = name;
		this.age = age;

	}

	void setage(int newage) {
		this.age = newage;
	
	}

	int getage() {
		return age;
	
	}

	void setname(String newname) {
		this.name = getName();
	}

	String getName() {
		
		return name;

	}

}
