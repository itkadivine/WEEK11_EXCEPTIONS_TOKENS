package custom_excep_tutorial1;

public class AgeLessThanZeroException extends Exception {
	
	public AgeLessThanZeroException(String message) {
		super(message);
	}
}
