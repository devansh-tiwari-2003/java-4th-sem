class FactorialException extends Exception {
    private int number;

    public FactorialException(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "FactorialException: Invalid input number (" + number + "). Input must be between 0 and 15.";
    }
}