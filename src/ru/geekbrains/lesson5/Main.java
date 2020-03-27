package ru.geekbrains.lesson5;


public class Main {

    static final int AGE_LIMIT = 40;
    static final int WORKER_ARRAY_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("Работники: ");
        // * Создать массив из 5 сотрудников
       Workers[] workers = new Workers[WORKER_ARRAY_SIZE];
        workers[0] = new Workers("Работник один", "Должность 1", "1@mail.com",
                "8903333332", 70000, 24);
        workers[1] = new Workers("Работник два", "Должность 2",
                "1@mail.com", "8903353333", 90000, 41);
        workers[2] = new Workers("Работник три", "Должность 3",
                "1@mail.com", "8903338333", 40000, 24);
        workers[3] = new Workers("Работник четыре", "Должность 4",
                "1@mail.com", "8903339333", 60000, 30);
        workers[4] = new Workers("Работник пять", "Должность 5",
                "1@mail.com", "8903333033", 120000, 40);
        System.out.println();
        //* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        for (Workers worker : workers) {
            if (worker.getAge() > AGE_LIMIT) {
                System.out.println("Сотрудник старше " + AGE_LIMIT + " лет: " + worker.workersInfo());
            } else if (worker.getAge() == AGE_LIMIT){
                System.out.println("Сотруднику " + AGE_LIMIT + " лет: " + worker.workersInfo());
            }
        }
    }
}
