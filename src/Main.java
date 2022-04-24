public class Main {

    public static void main(String[] args) {
        int startingScore = 1000;
        int replenishmentAmount = 2000;
        int bonus = replenishmentAmount / 100;
        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;

        } else {
            bonus = 0;
        }
        System.out.println("бонус равен: " + bonus);
        int general = startingScore + replenishmentAmount + bonus;
        System.out.println("итоговая сумма на счету клиента: " + general);
    }
}