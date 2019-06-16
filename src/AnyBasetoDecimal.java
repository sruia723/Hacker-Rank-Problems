import java.util.Scanner;

public class AnyBasetoDecimal {

    public static long convertToDecimal(int base, long number)
    {
        long l = 0; long decimal = 0;
        long b = number; long j =10; double i = 0; double base1 = base;

        switch (base)
        {
            case 2:
                while (number != 0)
                {
                    long  a = b%j;
                    b = (b-a)/j;
                    //printf("\na = %i",a);
                    decimal =  decimal +(number % 10)* (long) (Math.pow(base1,i)); // main logic
                    number = number / 10;
                    i++;
                    if((a >= base1 && a <= 9))
                    {
                        System.out.println("Please enter correct binary number: ");
                        number = 0; decimal = 0;
                        break;
                    }

                }

                if(decimal != 0)
                {
                    System.out.println("\nEquivalent decimal value: " + decimal);
                }
                break;

            case 3:
                while (number != 0)
                {
                    long  a = b%j;
                    b = (b-a)/j;
                    //printf("\na = %i",a);
                    decimal =  decimal +(number % 10)* (long) (Math.pow(base1,i)); // main logic
                    number = number / 10;
                    i++;
                    if((a >= base1 && a <= 9))
                    {
                        System.out.println("Please enter correct ternary number: ");
                        number = 0; decimal = 0;
                        break;
                    }

                }

                if(decimal != 0)
                {
                    System.out.println("\nEquivalent decimal value: " + decimal);
                }
                break;


            case 4:
                while (number != 0)
                {
                    long  a = b%j;
                    b = (b-a)/j;
                    //printf("\na = %i",a);
                    decimal =  decimal +(number % 10)* (long) (Math.pow(base1,i)); // main logic
                    number = number / 10;
                    i++;
                    if((a >= base1 && a <= 9))
                    {
                        System.out.println("Please enter correct quaternary number: ");
                        number = 0; decimal = 0;
                        break;
                    }

                }

                if(decimal != 0)
                {
                    System.out.println("\nEquivalent decimal value: " + decimal);
                }
                break;

            case 5:
                while (number != 0)
                {
                    long  a = b%j;
                    b = (b-a)/j;
                    //printf("\na = %i",a);
                    decimal =  decimal +(number % 10)* (long) (Math.pow(base1,i)); // main logic
                    number = number / 10;
                    i++;
                    if((a >= base1 && a <= 9))
                    {
                        System.out.println("Please enter correct quinary number: ");
                        number = 0; decimal = 0;
                        break;
                    }

                }

                if(decimal != 0)
                {
                    System.out.println("\nEquivalent decimal value: " + decimal);
                }
                break;

            case 6:
                while (number != 0)
                {
                    long  a = b%j;
                    b = (b-a)/j;
                    //printf("\na = %i",a);
                    decimal =  decimal +(number % 10)* (long) (Math.pow(base1,i)); // main logic
                    number = number / 10;
                    i++;
                    if((a >= base1 && a <= 9))
                    {
                        System.out.println("Please enter correct heximal number: ");
                        number = 0; decimal = 0;
                        break;
                    }

                }

                if(decimal != 0)
                {
                    System.out.println("\nEquivalent decimal value: " + decimal);
                }
                break;

            case 7:
                while (number != 0)
                {
                    long  a = b%j;
                    b = (b-a)/j;
                    //printf("\na = %i",a);
                    decimal =  decimal +(number % 10)* (long) (Math.pow(base1,i)); // main logic
                    number = number / 10;
                    i++;
                    if((a >= base1 && a <= 9))
                    {
                        System.out.println("Please enter correct septenal number: ");
                        number = 0; decimal = 0;
                        break;
                    }

                }

                if(decimal != 0)
                {
                    System.out.println("\nEquivalent decimal value: " + decimal);
                }
                break;


            case 8:
                while (number != 0)
                {
                    long  a = b%j;
                    b = (b-a)/j;
                    //printf("\na = %i",a);
                    decimal =  decimal +(number % 10)* (long) (Math.pow(base1,i)); // main logic
                    number = number / 10;
                    i++;
                    if((a >= base1 && a <= 9))
                    {
                        System.out.println("Please enter correct octal number: ");
                        number = 0; decimal = 0;
                        break;
                    }

                }

                if(decimal != 0)
                {
                    System.out.println("\nEquivalent decimal value: " + decimal);
                }
                break;


            case 9:
                while (number != 0)
                {
                    long  a = b%j;
                    b = (b-a)/j;
                    //printf("\na = %i",a);
                    decimal =  decimal +(number % 10)* (long) (Math.pow(base1,i)); // main logic
                    number = number / 10;
                    i++;
                    if((a >= base1 && a <= 9))
                    {
                        System.out.println("Please enter correct nonary number: ");
                        number = 0; decimal = 0;
                        break;
                    }

                }

                if(decimal != 0)
                {
                    System.out.println("\nEquivalent decimal value: " + decimal);
                }
                break;

            case 1:
                while (number != 0)
                {
                    long  a = b%j;
                    b = (b-a)/j;
                    //printf("\na = %i",a);
                    decimal =  decimal +(number % 10)* (long) (Math.pow(base1,i)); // main logic
                    number = number / 10;
                    i++;
                    if((a > base1 && a <= 9))
                    {
                        System.out.println("Please enter correct binary number: ");
                        number = 0; decimal = 0;
                        break;
                    }

                }

                if(decimal != 0)
                {
                    System.out.println("\nEquivalent decimal value: " + decimal);
                }
                break;

            default:
                    System.out.println("Please enter the correct base of the number.");
        }

        return l;
    }

    public static void convertToDecimal1(int base, String number)
    {
        int len = number.length();
        int power = 1; // Initialize
        // power of base
        int num = 0; // Initialize result
        int i;

        // Decimal equivalent is
        // str[len-1]*1 + str[len-1] *
        // base + str[len-1]*(base^2) + ...
        for (i = len - 1; i >= 0; i--)
        {
            // A digit in input number
            // must be less than
            // number's base
            if (val(number.charAt(i)) >= base)
            {
                System.out.println("Invalid Number");
                num = 0;
                break;
            }

            num += val(number.charAt(i)) * power; // call to val() function
            power = power * base;
        }

        if (num != 0)
            System.out.println("\nEquivalent decimal value: " + num);
    }

    public static int val(char c)
    {
        if (c >= '0' && c <= '9')
            return (int)(c - '0');
        else
            return (int)(c - 'A' + 10);
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        String des = "y";
        do {

            System.out.println("Enter the base of the number between 1-9: ");
            int base = sc.nextInt();

            if (base < 10) {
                System.out.println("Enter the number: ");
                long number = sc.nextLong();

                long res = convertToDecimal(base, number);
            }
            else
            {
                System.out.println("Enter the number: ");
                String number = sc.next();
                convertToDecimal1(base,number);
            }

            System.out.println("Do you want to use the app again? Y for yes and N for no");
            des = sc.next();

        }while (des.equals("y") || des.equals("Y"));

    }
}
