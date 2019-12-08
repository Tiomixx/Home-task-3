package No3;

public class Massive {
    public static void main(String[] args) {
        int[][] Array = new int[8][5];
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                Array[i][j] = (int) (Math.random() * 90) + 10;
                System.out.print(Array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}