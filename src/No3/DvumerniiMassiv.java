package No3;

import java.util.Arrays;

public class DvumerniiMassiv {
    public static void main(String[] args) {
        int[][] massiv = new int[8][5];

        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {

                massiv[i][j] = (int) (Math.random() * 90) + 10;

            }
            System.out.println(Arrays.toString(massiv[i]));
        }

    }
}
