package kyu6.FindTheParityOutlier;

public class FindOutlier {
    static int find(int[] integers) {

        //licznik liczb parzystych
        int evenCount = 0;

        //licznik liczb nieparzystych
        int oddCount = 0;

        //ostatnia liczba parzysta
        int lastEvenNumber = 0;
        //ostatnia licza nieparzysta
        int lastOddNumber = 0;

        int outliner = 0;

        //jeśli licznik liczb parzystych po sprawdzeniu trzech liczb jest większy od dwóch, to szukaj pierwszej liczby nieparzystej
        for (int number : integers) {
            long remainder;
            remainder = number % 2;

            System.out.println("number: " + number + ", remainder: " + remainder);

            if (remainder == 0) {
                evenCount++;
                lastEvenNumber = number;
            } else {
                oddCount++;
                lastOddNumber = number;
            }

            if (evenCount >= 2) {
                outliner = lastOddNumber;
            } else {
                outliner = lastEvenNumber;
            }


        }
        System.out.println("outliner: " + outliner);


        return outliner;
    }
}
