public class Main {
    public static void main(String[] args) {
        int price = 225; // стоимость билета
        int value = 4; // количество билетов
        int costMiles = 20; // рублей за 1 бонусную милю
        int miles = price / costMiles * value; // бонусные мили

        System.out.println("Бонусные мили: " + miles);
    }
}