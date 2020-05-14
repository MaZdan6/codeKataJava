package kyu7.mumbling;

public class Accumul {

    public static String accum(String s) {
        String solution="";
        // dla każdego znaku pobierz indeks
        char[] chars=s.toCharArray();
        StringBuilder stringBuilder= new StringBuilder(solution);
        int index=0;
        for(char character:chars){
            System.out.println("character: "+character);

            stringBuilder.append(Character.toUpperCase(character));

            Character lowerCaseChar= Character.toLowerCase(character);
            int i=0;
            while(i<index){
                stringBuilder.append(lowerCaseChar);
                i++;
            }

            stringBuilder.append("-");
            index++;

        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        solution=stringBuilder.toString();
        System.out.println("solution: "+solution);
        // Zamień znak na dużą literę
        //dodaj małe litery w liczbie równej indeksowi

        return solution;
    }
}
