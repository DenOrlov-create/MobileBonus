public class Main {
    public static void main (String[] args) {


        int firstData = 100;
        int Replenishment = 1100;

        int bonus;
        if (Replenishment > 1000)
        {
            bonus = (Replenishment / 100) * 1;

        }    else {
            bonus = 0;
        }
        int totalBalance = firstData + Replenishment + bonus;

        System.out.println("Итоговая сумма на счету:" + totalBalance);
        System.out.println("Из них бонусные:" + bonus);







    }
}
