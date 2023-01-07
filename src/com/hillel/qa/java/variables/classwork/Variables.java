package com.hillel.qa.java.variables.classwork;

/**
 * <img src="https://yt3.ggpht.com/sfPp150iI6VC5f4laY-osycP6qgKlT0YDXy47aTwG6HQncqecE36Lt7MG4o9h6L3S93tLcUb_6c=s900-c-k-c0x00ffffff-no-rj"
 * alt="" width="150" height="150">
 * <h1>Зміні</h1>
 */

public class Variables {
    /**
     * <p style="font-size:12px">
     *
     * <b style="color: #ffd700">Змінні</b> — це таке місце, де зберігаються дані. У Java всі дані зберігаються у змінних.
     * За своїм призначенням змінна дуже схожа на коробку, в яку можна покласти щось, та дістати.
     * Кожна змінна в Java має три обов'язкові властивості: <b style="color: #ffd700">тип</b> , <b style="color: #ffd700">ім'я</b>  та <b style="color: #ffd700">значення</b>.
     * <br>
     * <b style="color: #ffd700">Ім'я</b> - потрібно для того, щоб відрізнити одну змінну від іншої.
     * <br>
     * <b style="color: #ffd700">Тип змінної</b> - вказує на тип значень які можна зберігати. У поштовому ящику ми зберігаємо листи,
     * у цукорниця - цукор
     * <br>
     * <b style="color: #ffd700">Значення</b> - це певний об'єкт, дані чи інформація, що зберігаються у змінній.
     * <br><br>
     * <b style="color: #ffd700">Важливо!</b>
     * В одному методі не можна створити дві змінні з однаковими іменами. А в різних методах — можна.
     * </p>
     * <h2>Додаткова інформація</h2>
     *
     * @see <a href="https://www.w3schools.com/java/java_variables.asp">Стаття про зміні</a>
     * <br>
     * <a href="https://www.w3schools.com/java/java_data_types.asp">Стаття про типи данних</a>
     */
    public static void main(String[] args) {
        // Перед тим як розпочати тему зміні, трохи про коментарі!
        /*
         Коментарі у мові Java, як і більшості інших мов програмування,
         ігноруються під час виконання програми. Таким чином, до програми можна додавати стільки коментарів,
         скільки потрібно, не побоюючись збільшити її обсяг. Найчастіше використовуються дві косі риси //.
         Другий варіант це блоки коментарів роздільниками /*, як в нашому прикладі. А тепер перейдемо до змінних
         */

        //Створення або оголошення змінної
/*
        int number; // int це тип, а number - це її назва.
        String text;
        double time;*/

        //Присвоювання або ініціалізація змінної
/*
        int age = 15;
        String message = "Hello";
        double speed = 55.2;*/

        // Ще одна особливість операції присвоєння (=) - її можна здійснювати "по ланцюжку":

        int a = 5;
        int b = 10;
        int c = a = b;
        System.out.println(c);

        // А ще можно так!

        //int a = 5, b = 6, c = 7;

        /*
        TODO: Напиши програму, яка в методі main оголошує та ініціалізує такі змінні:
           1. Оголосити зміну country типу String
           2. Оголосити зміну salary типу int
           3. Оголосити зміну price типу double
        */

        /*
            Як вірно оголошувати зміну.
            1. Ім'я змінної повинне починатися з літери (маленької) і складатися з літер (Unicode)
            цифр та символу підкреслення «_». Технічно можна розпочати ім'я змінної також з «$» або «_»,
            однак це заборонено угодою щодо оформлення коду Java (Java Code Conventions).
            Відповідно до угоди ім'я змінної має починатися саме з маленької літери
            (З великої літери починаються імена класів). Прогалини при іменуванні змінних не допускаються.
            2. Ім'я змінної не повинно бути ключовим або зарезервованим словом Java.
            Наприклад return, int и так далі.
            3. Ім'я змінної чутливе до регістру. newVariable і newvariable - різні імена.
            4. При виборі імені змінних слід використовувати повні слова замість загадкових абревіатур.
            Це зробить ваш код зручнішим для читання та розуміння.
            5. camelCase - якщо зміна складається більше ніж з одного слова, наступне слово пишеться з великої букви
            String firstName;
         */

        /*
            Константа, це зміна якій не можно присвоїти нове значення.
            Якщо змінна зберігає постійне значення, то кожне слово слід писати великими літерами
            та відокремлювати за допомогою символу підкреслення.
        */

        /*
        final double PI = 3.14;
        final String PASSPORT_NUMBER = "KH177812";
        */

        /*
            Типи даних в JAVA. В JAVA існують дві великі категорії, примітивні та референснi.
            Для початку розберемо примітивні типи які також поділяются на:
            1. Цілі типи
            2. Речові типи або числа з плаваючою точкою
            3. Тип char
            4. Тип boolean
            У мові Java аж 4 цілих типи: byte, short, int і long.
            Вони відрізняються розміром та діапазоном значень, які можуть зберігати.
         */

        /*
        byte variable = 127; // 8 бит значення від 128 - 127
        short variable1 = 223; // 16 бит значення від -32768 - 32767
        int variable2 = 3435; // 32 бит значення від 2147483648 - 2147483647
        long variable3 = 23435435;// 64 бит	значення від 9223372036854775808 - 9223372036854775807
        */

        // Числа з плаваючою точкою. У Java є два примітивні типи з плаваючою точкою: double і float.

        /*
        double variable = 33.10; // 64бита	-1.7E+308	1.7E+308
        float variable1 = (float) 33.1; // 32бита -3.4E+38	3.4E+38
        */

        /*
        char використовується для збереження символів.
        Але ще цікавішим є той факт, що тип char — це і числовий тип теж! Так би мовити, тип подвійного призначення.
        char зберігає не символи, а коди символів із кодування Unicode
        */

        /*
        char a = 'A';
        char b = 65;
        System.out.println(a);
        */

       /*
        І останній примітивний тип – це boolean. Як ви вже знаєте,
        він може приймати лише два значення: true та false.
        */

        /*
        boolean isMarried = true;
        boolean isStudent = false;
        */

        /*
        Як ми вже згадували вище, також існують референснi типи даних.
        Ми не будемо детально розглядати всі типи, як само вони працюють, чим вони відрізняются,
        але тип String без нього нам не обійтись!
        */

        //String message = "Hello students!";

        /*
         На перший погляд звичайна зміна, тип якої пишеться з великої літери але все на так просто!
         Референснi типи даних мають магію, а тобто набір методів які дозволяють з ними працювати.
         На прикладі String розглянемо прості методи.
         */

//        String message = "Hello students!";
//        System.out.println(message.length()); // Віддає нам довжину строки
//        System.out.println(message.toUpperCase()); // Перетворю маленькі літери на великі
//        System.out.println(message.toLowerCase()); // Перетворює великі літери на маленькі
//        System.out.println(message.charAt(0)); // Метод приймає число, яке поверне літеру за її номером у строці. В нашому випадку H
//        System.out.println("Hello".equals("hello")); // Трохи далі ми розберемо як робити порівняння, треба запам'ятати що String треба порівнювати за допомогою equals

    }


}
