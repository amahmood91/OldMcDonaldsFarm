
public class Tractor implements Consumer {

	@Override
	public void consume(String food) {
		if(food == "gasoline"){
			System.out.println("yum");
		} else {
			System.out.println("yuck");
		}
		
	}

}
