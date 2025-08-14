public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int money = 2147483647;
        short populationOfVillage = 30000;
        byte students = 31;
        long populationOfEarth = 8237660388L;
        float litersOfMilk = 1.9f;
        double nubmerPi = 3.1415926535;
        System.out.println("Значение переменной money с типом int равно " + money);
        System.out.println("Значение переменной populationOfVillage с типом short равно " + populationOfVillage);
        System.out.println("Значение переменной students с типом byte равно " + students);
        System.out.println("Значение переменной populationOfEarth с типом long равно " + populationOfEarth);
        System.out.println("Значение переменной litersOfMilk с типом float равно " + litersOfMilk);
        System.out.println("Значение переменной nubmerPi с типом double равно " + nubmerPi);
        //Задача 2
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        //Задача 3
        System.out.println("Задача 3");
        byte pupils1 = 23;
        byte pupils2 = 27;
        byte pupils3 = 30;
        short paper = 480;
        short paperPerPupil = (short) (paper/(pupils1+pupils2+pupils3));
        System.out.println("На каждого ученика расчитано " + paperPerPupil + " листов бумаги");
        //Задача 4
        System.out.println("Задача 4");
        byte bottlesPerTwoMinutes = 16;
        short bottlesPerTwentyMinutes = (short) (bottlesPerTwoMinutes * 10);
        short dayInMinutes = 1440;
        byte bottlesPerMinute = (byte) (bottlesPerTwoMinutes/2);
        short bottlesPerDay = (short) (bottlesPerMinute * dayInMinutes);
        int bottlesPerThreeDays = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerDay * 31;
        System.out.println("За 20 минут машина произвела " + bottlesPerTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPerThreeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesPerMonth + " штук бутылок");
        //Задача 5
        System.out.println("Задача 5");
        byte paintForSchool = 120;
        byte whitePerClass = 2;
        byte brownPerClass = 4;
        byte paintPerClass = (byte) (whitePerClass+brownPerClass);
        byte classes = (byte) (paintForSchool/paintPerClass);
        byte whitePaint = (byte) (classes*whitePerClass);
        byte brownPaint = (byte) (classes*brownPerClass);
        System.out.println("В школе, где " + classes + " клссов, нужно " + whitePaint  + " банок белой краски и " + brownPaint + " банок коричневой краски.");
        //Задача 6
        System.out.println("Задача 6");
        byte bananas = 5;
        byte bananaWeight = 80;
        short milk = 200;
        byte milkWeight = 105;
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        byte rawEggs = 4;
        byte rawEggWeight = 70;
        short breakfastWeight = (short) ((bananaWeight*bananas)+(milkWeight*(milk/100))+(iceCreamWeight*iceCream)+(rawEggWeight*rawEggs));
        short breakfastWightKilogram = (short) (breakfastWeight / 1000);
        System.out.println("Общий вес спортзавтрака в граммах будет " + breakfastWeight + " и в килограммах " + breakfastWightKilogram);
        //Задача 7
        System.out.println("Задача 7");
        byte weight = 7;
        short kilogram = 1000;
        short minLoss = 250;
        short maxLoss = 500;
        short daysMin = (short) ((weight*kilogram)/minLoss);
        short daysMax = (short) ((weight*kilogram)/maxLoss);
        short averageDays = (short) ((daysMax + daysMin)/2);
        System.out.println("В среднем для похудения понадобиться " + averageDays + " дней.");
        //Задача 8
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float tenPercent = 0.10f;
        float tenPercentMasha = salaryMasha*tenPercent;
        float tenPercentDenis = salaryDenis*tenPercent;
        float tenPercentKristina =  salaryKristina*tenPercent;
        float increasedSalaryMasha = salaryMasha + tenPercentMasha;
        float increasedSalaryDenis = salaryDenis + tenPercentDenis;
        float increasedSalaryKristina = salaryKristina + tenPercentKristina;
        System.out.println("Маша теперь получает " + increasedSalaryMasha + " рублей. Годовой доход вырос на " + tenPercentMasha + " рублей.");
        System.out.println("Денис теперь получает " + increasedSalaryDenis + " рублей. Годовой доход вырос на " + tenPercentDenis + " рублей.");
        System.out.println("Кристина теперь получает " + increasedSalaryKristina + " рублей. Годовой доход вырос на " + tenPercentKristina + " рублей.");
    }
}