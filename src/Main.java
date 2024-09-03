public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Значение переменной dog = " + dog);
        System.out.println("Значение переменной cat = " + cat);
        System.out.println("Значение переменной paper = " + paper);

        // Task 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Значение переменной dog после увеличения на 4 = " + dog);
        System.out.println("Значение переменной cat после увеличения на 4 = " + cat);
        System.out.println("Значение переменной paper после увеличения на 4 = " + paper);

        // Task 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Значение переменной dog после уменьшения на 3.5 = " + dog);
        System.out.println("Значение переменной cat после уменьшения на 1.6 = " + cat);
        System.out.println("Значение переменной paper после уменьшения на 7639 = " + paper);

        // Task 4
        var friend = 19;
        System.out.println("Инициализировал (присвоил значение) переменной friend равной = " + friend);

        friend = friend + 2;
        System.out.println("Увеличил значение переменной friend на 2 = " + friend);

        friend = friend / 7;
        System.out.println("Поделил значение переменной friend на 7 = " + friend);

        // Task 5
        var frog = 3.5;
        System.out.println("Инициализировал (присвоил значение) переменной frog равной = " + frog);

        frog = frog * 10;
        System.out.println("Увеличил значение переменной frog в 10 раз = " + frog);

        frog = frog / 3.5;
        System.out.println("Поделил значение переменной frog на 3.5 = " + frog);

        frog = frog + 4;
        System.out.println("Добавил к последнему значению переменной frog 4 = " + frog);

        // Task 6
        var boxerMichael = 78.2;
        var boxerJohn = 82.7;
        var totalWeigh = boxerMichael + boxerJohn;
        System.out.println("Общая масса двух бойцов = " + totalWeigh + "кг");

        var difference = boxerJohn - boxerMichael;
        System.out.println("Разница между массами бойцов = " + difference + "кг");

        // Task 7
        var remainder = boxerJohn % boxerMichael;
        System.out.println("Остаток от деления между двумя весами = " + remainder + "кг");

        // Task 8 - 1
        var totalHours = 640;
        var workingHours = 8;
        var totalWorker = totalHours / workingHours;
        System.out.println("Всего работников в компании — " + totalWorker + " человек");

        // Task 8 - 2
        var newTotalWorker = totalWorker + 94;
        var newTotalHours = newTotalWorker * 8;
        System.out.println("Если в компании работает " + newTotalWorker + " человек, то всего " + newTotalHours + " часа работы может быть поделено между сотрудниками");

    }
}