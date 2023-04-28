public class ResultPrinter {
    private Exam result;

    public ResultPrinter(Exam result) {
        this.result = result;
    }

    public void display() {
        System.out.println("Percentage: " + result.Percent_Cal());
    }
}
