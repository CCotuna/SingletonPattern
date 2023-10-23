
public class MainSingleton {
	public static void main(String[] args) {
//		Singleton inst1 = new Singleton();
		Singleton inst1 = Singleton.getInstance();
		Singleton inst2 = Singleton.getInstance();
		
		if(inst1 == inst2) {
			System.out.println("It's the same instance.");
		}
	}
}
