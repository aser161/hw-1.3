public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");
    int box = 5;
        System.out.println("Значение переменной " + "box" + " с типом "+ "int" +" равно " + box);
    byte cat = 110;
        System.out.println("Значение переменной " + "cat" + " с типом "+ "byte" +" равно " + cat);
    short dog = 555;
        System.out.println("Значение переменной " + "dog" + " с типом "+ "short" +" равно " + dog);
    long tax = 123456789;
        System.out.println("Значение переменной " + "tax" + " с типом "+ "long" +" равно " + tax);

    float duck = 2.5f;
        System.out.println("Значение переменной " + "duck" + " с типом "+ "float" +" равно " + duck);
    double goose = 25.123456789;
        System.out.println("Значение переменной " + "goose" + " с типом "+ "double" +" равно " + goose);

        // Задача 2
        System.out.println("// Задача 2");
    float rub = 27.12f;
    long fon = 987678965549L;
    double num = 2.786;
    boolean boxMore = box > 15;
    int dol = 569;
    short euro = -159;
    int apple = 27897;
    byte boy = 67;
    char x = 35;
        System.out.println(x);

        // Задача 3
        System.out.println("// Задача 3");
    int classLP = 23;
    int classAS = 27;
    int classEA = 30;
    int totalSheet = 480;
    int totalStudent = classLP+classAS+classEA;
    int sheetPerOne = totalSheet/totalStudent;
        System.out.println("На каждого ученика рассчитано "+sheetPerOne+" листов бумаги");

        // Задача 4
        System.out.println("// Задача 4");
    int capacityPerMin = 16/2;
        System.out.println("За 1 мин машина произвела бутылок "+capacityPerMin+" штук");
    int capacityPer20Min = capacityPerMin*20;
        System.out.println("За 20 мин машина произвела бутылок "+capacityPer20Min+" штук");
    int capacityPerDay = 24*60*capacityPerMin;
        System.out.println("За 1 сутки машина произвела бутылок "+capacityPerDay+" штук");
    int capacityPer3Day = 3*24*60*capacityPerMin;
        System.out.println("За 3 дня машина произвела бутылок "+capacityPer3Day+" штук");
    int capacityPerMonths = capacityPerDay*30;
        System.out.println("За 1 месяц машина произвела бутылок "+capacityPerMonths+" штук");

        // Задача 5
        System.out.println("// Задача 5");
    int totalTin = 120;
    int tinWhite = 2;
    int tinBrown = 4;
    int tinPerClass = tinWhite+tinBrown;
    int totalClass = totalTin/tinPerClass;
    int totalTinWhite = totalClass*tinWhite;
    int TotalTinBrown = totalClass*tinBrown;
        System.out.println("В школе, где "+totalClass+" классов, нужно "+totalTinWhite+" банок белой краски и "+TotalTinBrown+" банок коричневой краски");

        // Задача 6
        System.out.println("// Задача 6");
    int banana = 80;
    int milk100ml = 105;
    int iceCreamPackage = 100;
    int egg = 70;

    double weightBreakfastInGrams = (5*banana)+(2*milk100ml)+(2*iceCreamPackage)+(4*egg);
    double weightBreakfastInKilograms = weightBreakfastInGrams / 1000;
        System.out.println("Вес завтрака "+weightBreakfastInKilograms+" килограмм.");

        //Задача 7
        System.out.println("// Задача 7");
    int totalLoseWeight = 7000;
    int loseWeightPerDay1 = 250;
    int loseWeightPerDay2 = 500;
    int days1 = totalLoseWeight/loseWeightPerDay1;
    int days2 = totalLoseWeight/loseWeightPerDay2;
        System.out.println("при потере веса по 250 грамм в день нужный вес будет через "+ days1+ " дней");
        System.out.println("при потере веса по 500 грамм в день нужный вес будет через "+ days2+ " дней");

        //Задача 8
        System.out.println("// Задача 8");
    double payPerMonthsMasha = 67760;
        double payPerYearMasha = payPerMonthsMasha*12;
                System.out.println(payPerYearMasha);
    double payPerMonthsDen = 83690;
        double payPerYearDen = payPerMonthsDen*12;
                System.out.println(payPerYearDen);
    double payPerMonthsKris = 76230;
        double payPerYearKris = payPerMonthsKris*12;
                System.out.println(payPerYearKris);

    double increasePayPerMonthsMasha = payPerMonthsMasha*1.1;
           System.out.println(increasePayPerMonthsMasha);
        double nowPayYMary = increasePayPerMonthsMasha*12;

    double increasePayPerMonthsDen = payPerMonthsDen*1.1;
        System.out.println(increasePayPerMonthsDen);
        double nowPayYDen = increasePayPerMonthsDen*12;

    double increasePayPerMonthsKris = payPerMonthsKris*1.1;
        System.out.println(increasePayPerMonthsKris);
        double nowPayYKris = increasePayPerMonthsKris*12;



    }
}