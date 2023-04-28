public class nomatch_exceptiondemo{
    public static void main(String[] args) {
        try {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter a string: ");
            String inputString = sc.nextLine();
            if (!inputString.equals("India")) {
                throw new NOMATCHEXCP(Thread.currentThread().getStackTrace()[1].getLineNumber(), inputString);
            }
            System.out.println("Input string is equal to \"India\".");
        } catch (NOMATCHEXCP e) {
            System.out.println(e.toString());
        }
    }
}