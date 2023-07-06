public class javaStart {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("I am learning Java.");
        System.out.println("It is awesome! \n");

        System.out.print("Hello World! // ");
        System.out.print("I will print on the same line.");

        System.out.println(3);
        System.out.println(358);
        System.out.println(50000);

        System.out.println(3+5);
        System.out.println(3*5);

        String name = "osman";
        System.out.println(name);

        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

        String adi = "Umut Can ";
        String soyadi = "GÜLER";
        String birey = adi + soyadi;
        System.out.println(birey);

        float f1 = 35e3f; // float 6 ya kadar support
        double d1 = 12E4d; // double 15 e kadar support
        System.out.println(f1);
        System.out.println(d1);

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false

        char myVar1 = 65, myVar2 = 66, myVar3 = 67; //ASCII Karakter seti
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        /*
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);      << Outputs 9
        System.out.println(myDouble);   << Outputs 9.0
        */
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int
        System.out.println(myDouble);
        System.out.println(myInt);

        int sum1=100+50;  //operator
        int sum2=sum1+25;
        int sum3=sum2+5;
        System.out.println(sum3);
        int x = 10;
        x += 5;
        System.out.println(x);
        int a = 5;
        int b = 3;
        System.out.println(a > b);

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //string methods
        System.out.println("The length of the txt string is: " + txt.length());
        /*
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());    Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());    Outputs "hello world"

        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));     Outputs 7
         */
        String firstName = "John ";  //concatenate two string && ( + )
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        System.out.println(Math.max(5, 10));   //Math
        System.out.println(Math.min(5, 10));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-4.7));
        System.out.println(Math.random());
        int randumNum=(int)(Math.random()*101);
        System.out.println(randumNum);

        int time = 20;  // if
        String result = (time < 18) ? "Good day.":"Good evening.";System.out.println(result);

        int day = 4;   // switch
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:System.out.println("NotFound");
        }

        int i = 0; //while loop
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        int u = 0; // do while loop
        do {
            System.out.print(u);
            u++;
        }
        while (u < 5); System.out.println();

       // FOR LOOP
        for (int k = 1; k <= 2; k++) {   // Outer loop.
            System.out.println("Outer: " + k); // Executes 2 times
            for (int j = 1; j <= 3; j++) {  // Inner loop
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};  //for-each
        for (String car : cars) {
            System.out.println(car);
        }

        int m = 0;   //break
        while (m < 10) {
            System.out.println(m);
            m++;
            if (m == 4) {
                break;
            }
        }
        int c = 0;   // continue
        while (c < 10) {
            if (c == 4) {
                c++;
                continue;
            }
            System.out.println(c);
            c++;
        }

        String[] car = {"Volvo", "BMW", "Ford", "Mazda"}; //Through an Array
        for (String g : car) {
            System.out.println(g);
        }
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };  //Multi-Dimensional Array
        for (int l = 0; l < myNumbers.length; ++l) {
            for(int h = 0; h < myNumbers[l].length; ++h) {
                System.out.println(myNumbers[l][h]);
            }
        }
    }
}