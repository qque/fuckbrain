package fuckbrain.error;

@SuppressWarnings("WeakerAccess")
public class IndexError extends RuntimeException {
	public IndexError() {
		super("Index out of bound: -1");
	}
}
