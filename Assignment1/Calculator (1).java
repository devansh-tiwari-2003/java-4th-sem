import java.io.*;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int m,k=0,gcd=1;

        System.out.print("Menu:\n1)add\n2)sub\n3)mul\n4)div\n5)sqrt\n6)power\n7)mean\n8)variance\n9)GCD\n");
        System.out.print("Enter choice: ");
        int i = reader.nextInt();
        double first,second;
        double result;
        switch(i)
        {
            case 1:
                System.out.print("Enter first number: ");
                first = reader.nextDouble();
                System.out.print("Enter second number: ");
                second = reader.nextDouble();
                result = first + second;
                System.out.printf("%.1f + %.1f = %.1f",
                        first,second, result);
                break;
            case 2:
                System.out.print("Enter first number: ");
                first = reader.nextDouble();
                System.out.print("Enter second number: ");
                second = reader.nextDouble();
                result = first - second;
                System.out.printf("%.1f - %.1f = %.1f",
                        first,second, result);
                break;
            case 3:
                System.out.print("Enter first number: ");
                first = reader.nextDouble();
                System.out.print("Enter second number: ");
                second = reader.nextDouble();
                result = first * second;
                System.out.printf("%.1f * %.1f = %.1f",
                        first,second, result);
                break;
            case 4:
                System.out.print("Enter first number: ");
                first = reader.nextDouble();
                System.out.print("Enter second number: ");
                second = reader.nextDouble();
                result = first / second;
                System.out.printf("%.1f / %.1f = %.1f",
                        first,second, result);
                break;
            case 5:
                System.out.print("Enter second number: ");
                second = reader.nextDouble();
                result = Math.sqrt(second);
                System.out.printf("Square root of %.1f = %.1f",
                        second, result);
                break;
            case 6:
                System.out.print("Enter first number: ");
                first = reader.nextDouble();
                System.out.print("Enter power: ");
                int p = reader.nextInt();
                result = Math.pow(first,p);
                System.out.printf("Power %d of %.1f = %.1f",p,first,
                        result);
                break;
            case 7:
        
               
                   Scanner sc = new Scanner(System.in);
                   String s = "";
                   int count=0;
                   int total=0;
                   double avg=0;
                   int n;
                   System.out.print("Please enter end to stop taking input: ");
                   while (true)
                   {
                       String input = sc.nextLine();
                       if(input.equals("end"))
                       break;
                       else 
                       {
                          n = Integer.parseInt(input);
                          count+=1;
                          total += n;
                          avg=total/n;

            }

        }
                System.out.println("Mean is "+avg);
     
              
            case 8:
                System.out.print("Enter how many numbers you want to enter: ");
                int o = reader.nextInt();
                int ar[]=new int[o];
                for(int l=0;l<o;l++)
                {
                    ar[l] = reader.nextInt();
                    k=k+ar[l];;
                }
                int mean=k/o;
                double sqDiff = 0;
                for (int q = 0; q < o; q++)
                    sqDiff += (ar[q] - mean) * (ar[q] - mean);
                result=sqDiff/o;
                System.out.printf("Variance = %.3f", result);
                break;
            case 9:
                System.out.print("Enter first number: ");
                int n1 = reader.nextInt();
                System.out.print("Enter second number: ");
                int n2 = reader.nextInt();
                for(int h = 1; h <= n1 && h <= n2; ++h)
                {
                    if(n1 % h==0 && n2 % h==0)
                        gcd = h;
                }
                System.out.printf("G.C.D of %d and %d is %d", n1,
                        n2, gcd);
                break;
            default:
                System.out.printf("Wrong choice");
                return;
        }
    }
}