package No3;

public class BubbleSort {
    public static void main(String[] args) {
        int[] SortirovkaPuzirkom = {2, 16 , 8 , 32, -5, 1, 87};

        for (int i = 0; i < SortirovkaPuzirkom.length; i++){
            int ChisloSprava = SortirovkaPuzirkom [i];

            for (int j = i - 1; j >= 0; j--) {
                int ChisloSleva = SortirovkaPuzirkom[j]; {

                    if (ChisloSleva > ChisloSprava){
                        SortirovkaPuzirkom[j + 1] = ChisloSleva;
                        SortirovkaPuzirkom[j] = ChisloSprava;
                    }
                    else {
                        break;
                    }
                }
            }
        }
        for (int n:SortirovkaPuzirkom )
        System.out.print(n+ ", ");

    }
}
