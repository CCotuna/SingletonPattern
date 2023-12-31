
public class Singleton {

	private static Singleton firstInstance;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (firstInstance == null) {
			firstInstance = new Singleton();
		}
		return firstInstance;
	}
}
