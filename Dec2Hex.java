import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

//Bartlomiej Klich

class Dec2Hex
{
    public static int Arg1;

    public static String main(String[] args)
    {
        Logger logger
                = Logger.getLogger(
                Dec2Hex.class.getName());

        try {
            if (args[0].isEmpty() == false){
                Arg1 = Integer.parseInt(args[0]);
                char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                int rem;
                int num;
                num = Arg1;
                String hexadecimal = "";
                System.out.println("Converting the Decimal Value " + num + " to Hex...");

                while (num != 0) {
                    rem = num % 16;
                    hexadecimal = ch[rem] + hexadecimal;
                    num = num / 16;
                }

                logger.log(Level.INFO,"Hexadecimal representation is: " + hexadecimal);
                return hexadecimal;
            }
            else {
                logger.log(Level.INFO,"there is no input provided");
                return "there is no input provided";
            }
        }
        catch(Exception e) {
            logger.log(Level.INFO,"please use a positive integer input");
            return "please use a positive integer input";
        }
    }
}
