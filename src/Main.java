public class Main {
    public static void main(String[] args) {

        // ЗАДАНИЕ 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установить версию приложения IOS ");
        } else {
            System.out.println("Установите версию приложения для andoird по ссылке");
        }


        // ЗАДАНИЕ 2

        int clientOSS = 0;
        int clientDeviseYear = 2015;

        if (clientOSS == 0) {
            if (clientDeviseYear > 2015) {
                System.out.println("Установить версию приложения IOS ");
        } else {
                System.out.println("Установить облегченную версию приложения IOS ");
            }
        } else {
            if (clientDeviseYear > 2015) {
                System.out.println("Установите версию приложения  andoird");
            } else {
                System.out.println("Установите облегченную версию приложения  andoird");
            }
        }

        // ЗАДАНИЕ 3

        int year = 2021;

                if (year % 4 == 0 && year % 100 !=0 || year % 400 ==0 ) {
                    System.out.println(year + "является високосным");
                } else {
                    System.out.println(year + "не является високосным");
                }


                //ЗАДАНИЕ 4

        int deliveryDistance = 95;
        int daYS = 1;

        if (deliveryDistance > 20) {
            daYS++;
        }
        if (deliveryDistance > 60) {
            daYS++;}
        System.out.println("Потребуется дней:" + daYS);

        //ЗАДАНИЕ 5
        int monthNumber =12;

        switch (monthNumber) {
            case 12:
                case 1:
            case 2:
                System.out.println("ЗИМА");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ВЕСНА");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("ЛЕТО");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("ОСЕНЬ");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }





    }

}

