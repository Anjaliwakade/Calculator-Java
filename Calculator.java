import java.util.*;

class Arithmetic
{
    public int addition(int A, int B)
    {
        int Result = 0;
        Result = A + B ;
        return Result;

    }
  
    public int subtraction(int A, int B)
    {
        int Result = 0;
        Result = A - B ;
        return Result;

    }
    public int multiplication(int A, int B)
    {
            return A * B ;
       

    }
    public double division(int A, int B)
    {
        if(B == 0)
        {
            System.out.println("Error:Division By zero");
            return 0;
        }
        return (double) A / B;
       

    }
    public int modulus(int A, int B)
    {
       if(B == 0)
        {
            System.out.println("Error:Division By zero");
            return 0;
        }
        return  A % B;

    }
    public double power(int A, int B)
    {
        return Math.pow(A,B);

    }

}
class Calculator
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int firstNumber = 0 , secondNumber = 0, choice; 
        double answer ;

        Arithmetic aobj = new Arithmetic();

        do
        {
            System.out.println("\n=== Advanced Calculator ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            while (!sobj.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sobj.next(); // clear buffer
                System.out.print("Enter your choice: ");
            }
            choice = sobj.nextInt();

            if(choice >=1 && choice <=6)
            {
                System.out.print("Enter first number: ");
                firstNumber = sobj.nextInt();

                System.out.print("Enter second number: ");
                secondNumber = sobj.nextInt();

                switch(choice)
                {
                    case 1:
                       answer = aobj.addition(firstNumber, secondNumber);
                        System.out.println("Addition is : = " + answer);
                        break; 
                    
                    case 2:
                        answer = aobj.subtraction(firstNumber, secondNumber);
                        System.out.println("Subtraction is = " + answer);
                        break;
                    case 3:
                        answer = aobj.multiplication(firstNumber, secondNumber);
                        System.out.println("Multiplication is = " + answer);
                        break;

                    case 4:
                        answer = aobj.division(firstNumber, secondNumber);
                        System.out.println("Division is = " + answer);
                        break;

                    case 5:
                        answer = aobj.modulus(firstNumber, secondNumber);
                        System.out.println("Result = " + answer);
                        break;

                    case 6:
                        answer = aobj.power(firstNumber, secondNumber);
                        System.out.println("Result = " + answer);
                        break;
                }
            }
            else if(choice == 7)
            {
                System.out.println("Exiting Calculator... Thank you!");
            }
            else
            {
                System.out.println("Invalid choice! Please try again.");
            }

        } while(choice != 7);

        sobj.close();


        }
    }

    


