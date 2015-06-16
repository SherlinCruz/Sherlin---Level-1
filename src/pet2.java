
public class pet2 {
	private  String food;
	private int age;
	
	pet2(String food, int age){
		this.food = food;
		this.age = age;
	}
	
	
	
	void setfood(String newfood){
		food =newfood; 
	}
	String getfood(){
		return food;
	}
	void setage(int newage){
		age = newage; 
	}
	int getage(){
		return age;
	}
	
}
