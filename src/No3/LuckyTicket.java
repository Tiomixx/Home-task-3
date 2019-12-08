package No3;

public class LuckyTicket {
    public static void main(String[] args) {
        int LuckyTicket = 0;

        for (int NoBiletika = 1; NoBiletika < 1000000; NoBiletika++ ){

            if (NoBiletika/100000 + (NoBiletika / 10000)%10 + (NoBiletika/1000)%10 == (NoBiletika/100)%10 + (NoBiletika/10)%10 + NoBiletika%10){

                LuckyTicket = LuckyTicket + 1;
            }
        }
        System.out.println("Колличество счастливых билетиков = " +LuckyTicket);
    }
}

