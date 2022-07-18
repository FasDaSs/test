 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            while (true){
                String input = in.nextLine();
                System.out.println(calc(input));
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static String calc(String input) throws Exception {
        INum firstOperand;
        INum secondOperand;
        Scanner in = new Scanner(System.in);
        String arabicRegex = "^[\\d]+[ ][+-/*]{1}[ ][\\d]+$";
        String romanRegex = "^[IVX]+[ ][+-/*]{1} [IVX]+$";
        String[] tmp = input.split(" ");
        if (input.matches(arabicRegex)) {
            firstOperand = new Arabic(tmp[0]);
            secondOperand = new Arabic(tmp[2]);
        } else if (input.matches(romanRegex)){
            firstOperand = new Roman(tmp[0]);
            secondOperand = new Roman(tmp[2]);
        } else {
            throw new Exception("Invalid input");
        }
        switch (tmp[1]) {
            case "+":
                return firstOperand.Add(secondOperand);
            case "-":
                return firstOperand.Sub(secondOperand);
            case "/":
                return firstOperand.Div(secondOperand);
            case "*":
                return firstOperand.Mul(secondOperand);
            default:
                throw new Exception("Invalid operation");
        }
    }
}
