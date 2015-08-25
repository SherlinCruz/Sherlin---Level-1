package sherlin;

class HauntedHouse {

	int skeletons;
	String name;

	
	public static void main(String[] args) {
		HauntedHouse h = new HauntedHouse(105, " spooky zone");
		h.doScaryStuff(1000000," BOO");
		
		h.isSpooky();
		
		
	}
	
	
	public HauntedHouse(int skeletions,String name) {
		this.name = name;
		this.skeletons = skeletions;
	}

	void doScaryStuff(int pumpkins, String scaryPhrase) {
		
		
		System.out.println(pumpkins + " pumpkins say" + scaryPhrase);
}

	boolean isSpooky() {
		//Haunted houses are spooky!
		return true;
}




}

