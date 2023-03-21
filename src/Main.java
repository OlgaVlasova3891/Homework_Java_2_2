public class Main {
    public static void main(String[] args) {

        int account = 100; // сумма на счету
        int deposit = 1001; // количество рублей внесённых на счёт
        int bonus; // количество бонксов, подаренных пользователю оператором

        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Количество бонусных рублей:" + bonus);
        System.out.println("Количество денег на текущем счету:" + (account + deposit + bonus));
    }
}