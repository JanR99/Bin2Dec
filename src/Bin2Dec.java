import java.util.*;

public class Bin2Dec {

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();
        System.out.println("The decimal value for binary number " + binary + " is " + bin2Dec(binary));
        input.close();
    }

    private static int bin2Dec(String binaryString) {
        int decimalValue = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            char binaryChar = binaryString.charAt(i);
            decimalValue = decimalValue * 2 + binaryChar - '0';
        }
        return decimalValue;
    }
    
}