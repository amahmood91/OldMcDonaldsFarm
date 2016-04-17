
public class Dog extends Animal{

	public Dog() {
		super(15);

	}
	
	@Override
	protected void initialize(){
		setSound("Woof");
	}

	@Override
	public void consume(String food) {
		if(food == "dog food"){
			System.out.println("yum");
		} else {
			System.out.println("yuck");
		}
		
	}

}
