package custom_excep_tutorial1;

public class CustomExceptionTutorial {

	public static void main(String[] args) throws AgeLessThanZeroException {
		validateAge(-5);
	}
	
	private static void validateAge(int age) throws AgeLessThanZeroException {
		if(age < 0) {
			throw new AgeLessThanZeroException("Нас нь сөрөг тоо байж болохгүй!");
		}
	}

}
