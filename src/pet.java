public class pet{
	private  String food;
	private int age;
	
	pet(String food, int age){
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