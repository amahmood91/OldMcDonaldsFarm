import java.util.ArrayList;

public class Farm {
	

	public static void main(String[] args) {
		//let's have a data structure to hold the animals on the farm.
		ArrayList<Animal> barnyard = new ArrayList<Animal>();
		//this second list stores things on the farm that I want to feed
		ArrayList<Consumer> feedList = new ArrayList<Consumer>();
		//let's instantiate some animals!
		Animal temp;
		System.out.println("adding animals ot barnyard...");
		for(int i = 0; i < 10; i++){
			if(i % 2 == 0){
				temp = new Dog();
			}else{
				temp = new Cow();
			}
			barnyard.add(temp);
			//let's also add this animal to the things we need to feed
			feedList.add(temp);
		}
		//add a tractor to the list of things we need to feed
		feedList.add((new Tractor()));
		
		System.out.println("printing animal ages:");
		for(Animal animal: barnyard){ // for each animal in barnyard
			System.out.println("This animal's age is: " + animal.getAge() + " this animal says: " );
			animal.speak();
		}
		
		System.out.println("let's try to feed all things grass");
		for(Consumer consumer: feedList)
		{
			consumer.consume("grass");
		}
		System.out.println("let's try to feed all the things dog food");
		for(Consumer consumer: feedList)
		{
			consumer.consume("dog food");
		}
		System.out.println("let's try to feed all the things gasoline");
		for(Consumer consumer: feedList)
		{
			consumer.consume("gasoline");
		}
	}

}
