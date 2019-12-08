package No3;

import java.util.Scanner;

public class SummaChisel {
    public static void main(String[] args) {
        int Summa, Chislo;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");

        if (in.hasNextInt()){
            Chislo = in.nextInt();
            Summa = 0;

            while (Chislo != 0) {
                Summa = Summa + Chislo%10;
                Chislo = Chislo / 10;
            }
            System.out.println("Сумма цифр введённого числа = " +Summa);

        }
    }
}
