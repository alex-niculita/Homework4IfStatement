public class Main {
    public static void main(String[] args) {
        System.out.println("\tTask #1. Bank App:");
        task1();
        System.out.println("\tTask #2. Phone's OS and year:");
        task2();
        System.out.println("\tTask #3. Leap Year:");
        task3();
        System.out.println("\tTask #4. Bank card delivery:");
        task4();
        System.out.println("\tTask #5. Season:");
        task5();
    }

    // Bank App task
    public static void task1(){
        int clientOS = 0;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    // Phone's OS and year task
    public static void task2(){
        int clientOS = 1;
        int clientDeviceYear = 2013;

        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }


            if (clientOS == 1) {
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }

            }
    }

    // Leap Year task
    public static void task3(){
        int year = 2100;
        if ((year%4==0)&&(year%100!=0)||(year%400==0)){
            System.out.printf("%d год является високосным\n",year);
        } else{
            System.out.printf("%d год не является високосным\n",year);
        }
    }

    // Bank card delivery task
    public static void task4(){
        int deliveryDistance = 99;
        int deliveryTime = 1; // До 20 км доставка 1 день

        if (deliveryDistance>20){
            deliveryTime++;
        }
        if((deliveryDistance>60) && (deliveryDistance<100)){
            deliveryTime++;
        }

        System.out.printf("Потребуется дней: %d\n",deliveryTime);
    }

    // Season of the year task
    public static void task5(){
        int monthNumber = 4;
        switch (monthNumber){
            case 12: case 1: case 2:
                System.out.println("Winter");
                break;
            case 3: case 4: case 5:
                System.out.println("Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
    }
}