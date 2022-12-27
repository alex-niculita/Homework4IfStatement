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

        // Я сначала сделал 5 заданий и запушил их гитхаб
        // но потом курс на странице заданий обновился и появились другие задания
        // сделал еще и их

        System.out.println("\tTask #6: Adult or not");
        task6();
        System.out.println("\tTask #7: Temperature outside");
        task7();
        System.out.println("\tTask #8: Speed penalty");
        task8();
        System.out.println("\tTask #9: Age gradation");
        task9();
        System.out.println("\tTask #10: Amusement park");
        task10();
        System.out.println("\tTask #11: Railway carriage");
        task11();
        System.out.println("\tTask #12: The biggest number");
        task12();

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
        System.out.println();
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
        System.out.println();
    }

    // Leap Year task
    public static void task3(){
        int year = 2100;
        if ((year%4==0)&&(year%100!=0)||(year%400==0)){
            System.out.printf("%d год является високосным\n",year);
        } else{
            System.out.printf("%d год не является високосным\n",year);
        }
        System.out.println();
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
        System.out.println();
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
        System.out.println();
    }

    // Task #6: Adult or not
    public static void task6(){
        int age = 19;
        int ageBorder = 18;
        if(age>=ageBorder){
            System.out.printf("Если возраст человека равен %d, то он совершеннолетний\n", age);
        } else {
            System.out.printf("Если возраст человека равен %d, то он не достиг совершеннолетия, нужно немного подождать\n", age);
        }
        System.out.println();
    }
    // Task #7: Temperature outside
    public static void task7(){
        int temperature = 10;
        int temperatureEdge = 5;

        if (temperature<temperatureEdge){
            System.out.printf("На улице %d градусов, нужно надеть шапку\n", temperature);
        } else {
            System.out.printf("На улице %d градусов, можно идти без шапки\n", temperature);
        }
        System.out.println();
    }
    // Task #8: Speed penalty
    public static void task8(){
        int speed = 19;
        int speedLimit = 60;
        if (speed>speedLimit){
            System.out.printf("Если скорость %d, то придется заплатить штраф\n", speed);
        } else {
            System.out.printf("Если скорость %d, то можно ездить спокойно\n", speed);
        }
        System.out.println();
    }
    // Task #9: Age gradation
    public static void task9(){
        int age = 15;
        if ((age>2)&&(age<=6)){
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в детский сад.\n", age);
        } else if ((age>=7)&&(age<=18)){
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в школу.\n", age);
        } else if ((age>18)&&(age<=24)){
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в университет.\n", age);
        } else if (age>24){
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить на работу.\n", age);
        }
        System.out.println();
    }
    // Task #10: Amusement park
    public static void task10(){
        int age = 15;
        if (age<5){
            System.out.printf("Если возраст ребенка равен %d, то ему нельзя кататься на аттракционе.\n", age);
        } else if ((age>=5)&&(age<14)){
            System.out.printf("Если возраст ребенка равен %d, то ему можно кататься на аттракционе в сопровождении взрослого.\n", age);
        } else if (age>=14){
            System.out.printf("Если возраст ребенка равен %d, то ему можно кататься на аттракционе без сопровождения взрослого.\n", age);
        }
        System.out.println();
    }
    // Task #11: Railway carriage
    public static void task11(){
        int seatsTotal = 102;
        int seatedTotal = 60;
        int standingTotal = seatsTotal - seatedTotal;
        int seatedOccupied = 30; // User defined number of seated passengers
        int standingOccupied = 15; // User defined number of standing passengers
        int seatedLeft = seatedTotal-seatedOccupied;
        if (seatedLeft>0){
            System.out.printf("There are %d seated places available\n", seatedLeft);
        } else {
            System.out.println("No seats available");
        }
        int standingLeft = standingTotal-standingOccupied;
        if (standingLeft>0){
            System.out.printf("There are %d standing places available\n", standingLeft);
        } else {
            System.out.println("No standing places available");
        }
        System.out.println();
    }
    // Task #12: The biggest number
    public static void task12(){
        int one = 2;
        int two = 1;
        int three = 1;

        if ((one>two)&&(one>three)){
            System.out.println(one + " is the biggest number");
        } else if ((two>one)&&(two>three)){
            System.out.println(two + " is the biggest number");
        } else if ((one == two) && (one>three)){
            System.out.println(one + " and " + two + " are equal and bigger than " +three);
        } else if ((three == two) && (three>one)){
            System.out.println(two + " and " + three + "are equal and bigger than " +one);
        } else {
            System.out.println(one + ", " + two + " and " + three + " are equal");
        }

    }

}