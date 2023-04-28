class NOMATCHEXCP extends Exception {
    private int lineNumber;
    private String inputString;

    public NOMATCHEXCP(int lineNumber, String inputString) {
        this.lineNumber = lineNumber;
        this.inputString = inputString;
    }

    @Override
    public String toString() {
        return "NOMATCHEXCP: Input string at line " + lineNumber + " is not equal to \"India\". Input string: \"" + inputString + "\"";
    }
}


