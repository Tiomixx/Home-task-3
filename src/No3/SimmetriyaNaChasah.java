package No3;

public class SimmetriyaNaChasah {
    public static void main(String[] args) {

        int b = 0;

        for (int hours = 0; hours <= 23; hours++){
            for (int minutes = 0; minutes <= 59; minutes++){
                if (hours/10%10 == minutes%10 & hours%10 == minutes/10%10){
                    b++;
                }
            }
        }
        System.out.print("Симметричная комбинация случается " +b + " раз за сутки.");
    }
}
