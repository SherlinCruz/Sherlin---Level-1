


public class SmurfsRunners {
	public static void main(String[] args) {

		Smurf Handy = new Smurf("Handy");

		System.out.println(Handy.getName());

		Handy.eat();

		System.out.println("My hat color is " + Handy.getHatColor());

		Smurf Papa = new Smurf("Papa");

		System.out.println(Papa.getName());

		System.out.println("My hat color is " + Papa.getHatColor());
		System.out.println("I am a  " + Papa.isGirlOrBoy());

		Smurf Smurfette = new Smurf("Smurfette");

		System.out.println(Smurfette.getName());

		System.out.println("My hat color is " + Smurfette.getHatColor());
		System.out.println("I am a " + Smurfette.isGirlOrBoy());

	}

}
