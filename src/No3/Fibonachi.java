package No3;

public class Fibonachi {
    public static void main(String[] args) {
        int[] Fibonachi = new int[11];

        for (int i = 0; i < Fibonachi.length; i++) {
            if (i < 2) {
                Fibonachi[i] = 1;
            } else {
                Fibonachi[i] = Fibonachi[i - 1] + Fibonachi[i - 2];
            }
            System.out.print(Fibonachi[i] + ", ");
        }
    }
}