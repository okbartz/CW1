import java.util.Scanner;

//Bartlomiej Klich

class Dec2Hex
{

    public static int Arg1;

    public static String main(String[] args)
    {
        try {
            if (args[0].isEmpty() == false){
                Arg1 = Integer.parseInt(args[0]);
                char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                int rem, num;
                num = Arg1;
                String hexadecimal = "";
                System.out.println("Converting the Decimal Value " + num + " to Hex...");

                while (num != 0) {
                    rem = num % 16;
                    hexadecimal = ch[rem] + hexadecimal;
                    num = num / 16;
                }

                System.out.println("Hexadecimal representation is: " + hexadecimal);
                return hexadecimal;
            }
            else {
                System.out.println("there is no input provided");
                return "there is no input provided";
            }
        }
        catch(Exception e) {
            System.out.println("please use a positive integer input");
            return "please use a positive integer input";
        }
    }
}
