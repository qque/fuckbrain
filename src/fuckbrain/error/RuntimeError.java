package fuckbrain.error;

@SuppressWarnings("WeakerAccess")
public class RuntimeError extends RuntimeException {
	public RuntimeError() {
		super("Runtime error has been found when compiling");
	}

	public RuntimeError(String message) {
		super(message);
	}
}
