
public class ExceptionDemo {
    public static void main(String[] args) {
        for (String arg : args) {
            try {
                int n = Integer.parseInt(arg);
                if (n < 0 || n > 15) {
                    throw new FactorialException(n);
                } else {
                    long fact = factorial(n);
                    System.out.println(n + "! = " + fact);
                }
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: Ill-formed argument (" + arg + ")");
            } catch (FactorialException e) {
                System.out.println(e.toString());
            }
        }
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}