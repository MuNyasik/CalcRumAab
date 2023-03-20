import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.println("введите выражение");
        String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
        if (input.matches( "^\\d{1,2}[ ][\\+\\-\\*\\/][ ]\\d{1,2}$")){
            ArabicCalcul.calc(input);
        }else if (input.matches("^[IVX]{1,4}[ ][\\+\\-\\*\\/][ ][IVX]{1,4}$")){
            RomanCalcul.calc(input);
        }else {
            System.out.println("Некорректный пример");
        }

    }
}


