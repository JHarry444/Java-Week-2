package exceptions;

public class PetNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3237524460970341751L;

	public PetNotFoundException() {
		super();
	}

	public PetNotFoundException(String message) {
		super(message);
	}

}
