package fuckbrain.error;

@SuppressWarnings("WeakerAccess")
public class FileTypeError extends RuntimeError {
	public FileTypeError() {
		super("A Brainfuck file is required in this brainfuck interpreter");
	}
}
