
public class Cow extends Animal{
	public Cow(){
		super(35);
	}
	
	@Override
	protected void initialize(){
		setSound("Moo");
	}

	@Override
	public void consume(String food) {
		if(food == "grass"){
			System.out.println("yum");
		} else {
			System.out.println("yuck");
		}
		
	}
}
