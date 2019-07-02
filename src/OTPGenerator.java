import java.util.Scanner;

public class OTPGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");
        System.out.println("Do you need OTP? Y for yes and N for no");
        String des = sc.next();

        while (des.equals("y") || des.equals("Y"))
        {
            System.out.println("\nHow many digits otp do you want?\nMax is 16 digits.");
            int digits = sc.nextInt();
            long multipliyer = 1;
            for (int i = 1; i <= digits ; i++) {

                multipliyer = multipliyer * 10;
            }

            long otp = 0;
            double d = Math.random();

            // This condition is used because I found sometimes Math.random() generated 0.083728
            // So if I asked for 4 digit otp it only gives 837.
            if(d >= 0.1)
            {
                otp = (long)(d * multipliyer);
            }

            System.out.println("\nYour otp is: " + otp);

            System.out.println("\nDo you want to generate otp again?\nY for yes and N for no.");
            des = sc.next();
        }

    }
}
