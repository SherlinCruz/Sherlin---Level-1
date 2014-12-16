

import javax.swing.text.Caret;

// Copyright Wintriss Technical Schools 2013
public class Cat {

	private String name;
	private int lives = 9;

	void meow() {
		System.out.println("meeeeeooooooooooooooowwwwwwwwwwww!!");
	}

	void setName(String name) {
		this.name = name;
	}

	public void printName() {
		if (name == null)
			System.out.println("i don't know my own name!");
		else
			System.out.println("my name is " + name);
	}

	void kill() {
		lives--;
		if (lives > 0)
			System.out.println("nice try, but I still have " + lives
					+ " lives left");
		else if (lives < 0)
			System.out.println("that's overkill yo!");
		else
			System.out.println("DEAD CAT :(");
	}

	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */

		// 1. make the Cat meow
		Cat cutie = new Cat();
		cutie.meow();
		// 2. get the Cat to print it's name
		cutie.name = "cutie";
		cutie.printName();
		// 3. kill the Cat!
		for (int i = 0; i < 9; i++) {

			cutie.kill();
		}
	}
}