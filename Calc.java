import java.util.Scanner;
interface Calculator {
    int add(int a, int b);
    int subtract(int a, int b);
}
class SimpleCalculator implements Calculator {
    public int add(int a, int b)
    {
        return a + b;
    }
    public int subtract(int a, int b) 
    {
        return a - b;
    }
}
public class Calc {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    SimpleCalculator calc = new SimpleCalculator();
System.out.println("Enter a number:");
int num1 = scanner.nextInt();
System.out.print("Enter another number: ");
int num2 = scanner.nextInt();
System.out.println("Addition: " + calc.add(num1, num2));
System.out.println("Subtraction:"+calc.subtract(num1, num2));
    }
}
