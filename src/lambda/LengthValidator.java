package lambda;

public class LengthValidator implements Validator {

	@Override
	public boolean isValid(String s) {
		return s.length() < 6;
	}
}
