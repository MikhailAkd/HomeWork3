public class Main {
    public static void main(String[] args) {

        //Задание 1

        byte clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else
            System.out.println("Установите версию приложения для iOS по ссылке");
        System.out.println();

        //Задача 2

        byte clientOS2 = 1;
        short clientDeviceYear = 2014;
        if (clientOS2 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        if (clientOS2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS2 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        System.out.println();

        //Задача 3

        short year = 2021;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else
            System.out.println(year + " год не является високосным");
        System.out.println();

        //Задача 4

        byte deliveryDistance = 95;
        byte deliveryTime;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            deliveryTime = 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else
            System.out.println("Доставка на расстояние более 100 км не осуществляется");
        System.out.println();

        //Задача 5

        byte monthNumber = 12;
        switch (monthNumber) {
            case 1 :
            case 2 :
            case 12 :
                System.out.println("Это зимний месяц");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Это весенний месяц");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("Это летний месяц");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("Это осенний месяц");
                break;
            default :
                System.out.println("В году 12 месяцев - введите число от 1 до 12");
        }
    }
}
