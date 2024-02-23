import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int digNum = 0, digPos = 0, digSum = 0, sumPowDigit = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int number = input.nextInt();
        int tempNumber = number;

        while (tempNumber != 0) {
            tempNumber /= 10;
            digNum++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            digPos = tempNumber % 10;
            digSum += digPos;
            int powDigit = 1;
            for (int i = 1; i <= digNum; i++) {
                powDigit *= digPos;
            }

            tempNumber = tempNumber / 10;
            sumPowDigit += powDigit;
        }
        System.out.println("Sum of digits of the given number is: " + digSum);

        if (sumPowDigit==number){
            System.out.println("This is an Armstrong number.");
        }else{
            System.out.println("This is not an Armstrong number.");
        }
    }
}