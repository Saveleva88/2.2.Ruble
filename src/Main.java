public class Main {

    public static void main(String[] args) {
        int initialAccount = 100;
        int replenishment = 1100;
        int bonusReplenishment = replenishment / 100;
        if (replenishment >= 1000) {
            bonusReplenishment = replenishment / 100;
        } else {
            bonusReplenishment = 0;

        }

        int bonusTotal = replenishment + bonusReplenishment;
        int initialAccountTotal = initialAccount + bonusTotal;

        System.out.println("Ваш баланс пополнен на " + bonusTotal + "руб. Общий баланс вашего счета составляет " + initialAccountTotal + "руб.");
        }

    }
