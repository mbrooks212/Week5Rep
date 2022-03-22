
public class App {

	public static void main(String[] args) {
		
		Logger L1 = new AsteriskLogger();
		Logger L2 = new SpacedLogger();
		L1.Log("Wassupp");
		L1.Error("Oh no bro");
		L2.Log("Spacey");
		L2.Error("Spacey oh no bro");
	}

}
