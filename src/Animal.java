import java.util.Random;

public abstract class Animal implements Consumer{
	private int age;
	private String sound;
	public Animal(int max_age){
		//assign the animal a random age 
		Random rng = new Random(); // we haven't really talked about random numbers (they're not on the final)
		age = rng.nextInt(max_age); //gets us a random number between 0 and max_age
		//call a protected method to set the animal's sound
		initialize();
	}
	
	//example of a getter method
	public int getAge(){
		return age;
	}
	
	public void speak(){
		System.out.println(sound);
	}
	
	protected void initialize(){
		sound = "Moof";
	}
	
	protected void setSound(String newSound){
		sound = newSound;
	}
}