package fuckbrain.core;

public class Bracket {
    private int position;
    private int lineIndex;
    private int lineIndexInternal;
    private char bracket;

    public Bracket(int pos, char bracket, int line, int index) {
        position = pos;
        lineIndex = line;
        lineIndexInternal = index;
        this.bracket = bracket;
    }

    public String error() {
        if (bracket == '[') {
            return "Unclosed [ in line " + lineIndex + " at index " + lineIndexInternal + "\n";
        } else if (bracket == ']') {
            return "Unopened ] in line " + lineIndex + " at index " + lineIndexInternal + "\n";
        } else {
            return "Thats not a bracket wtf";
        }
    }

    public int getPosition() {
        return position;
    }
}