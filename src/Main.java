public class Main {
    public static void main(String[] args) {
        int priceTicket = 8000; // стоимость билета в рублях
        int milePerPrice = 20; // стоимость мили в рублях
        int miles; // объявление переменной для количества миль
        if (priceTicket <= 0) {
            System.out.println("Стоимость билета не может быть отрицательной!"); // проверка  входных данных
        } else {
            miles = priceTicket / milePerPrice; // подсчет кол-ва миль
            System.out.println("Ваше количество миль: " + miles + ". Спасибо за покупку!"); // вывод результата
        }
    }

}


