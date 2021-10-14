package fuckbrain.error;

@SuppressWarnings("WeakerAccess")
public class BracketError extends Throwable {
    public BracketError(String message) {
        super(message);
    }

    public BracketError(int leftOrRight, int bracketIndex) {
        this("Missed a " + (leftOrRight == 0 ? "left" : "right") + " bracket: the " + (leftOrRight == 0 ? "right" : "left") + "bracket is at " + bracketIndex);
    }
}
