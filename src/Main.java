public class Main {
    public static void main(String[] args) {


        int firstData = 100;
        int replenishment = 1100;

        int bonus;
        if (replenishment > 1000) {
            bonus = (replenishment / 100) * 1;

        } else {
            bonus = 0;
        }
        int totalBalance = firstData + replenishment + bonus;

        System.out.println("Итоговая сумма на счету:" + totalBalance);
        System.out.println("Из них бонусные:" + bonus);


    }
}
