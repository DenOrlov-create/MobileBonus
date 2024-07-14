public class Main {
    public static void main (String[] args) {


        int firstData = 100;
        int firstReplenishment = 300;
        int secondReplenishment = 1100;

        int firstbalance = firstData + firstReplenishment;
        System.out.println("Итоговая сумма баланса клиента после первого пополнения:" + firstbalance);

        int secondbalance = firstData + secondReplenishment;

        int sum = secondReplenishment / 100;

        int bonus = sum;
        if (secondReplenishment >= 1000) {
            bonus = sum;
        }
        int secondbonus = secondbalance + bonus;



        System.out.println("Итоговая сумма баланса клиента после второго пополнения:" + secondbonus);




    }
}
