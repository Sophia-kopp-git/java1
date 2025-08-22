import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("gib eine reihe von zahlen an, separiert mit einem leerzeichen");
        String input = scanner.nextLine();
        String[] strArr = input.split(" ");

        String[] cleanedArr = new String[strArr.length];
        int countingErrors = 0;

        for (int strIndex = 0; strIndex < strArr.length; strIndex++){
            if(!strArr[strIndex].equals(" ") && !strArr[strIndex].toLowerCase().matches("[a-z]+")){
                cleanedArr[strIndex] = strArr[strIndex];
            } else {
                countingErrors++;
            }
        }

        int[] intArr = new int[strArr.length-countingErrors];
        int index = 0;

        for (String str : strArr){
            if(!str.equals(" ") && !str.toLowerCase().matches("[a-z]+")){
                intArr[index] = Integer.parseInt(str);
                index++;
            } else {
                countingErrors++;
            }
        }
        for(int num : intArr){
            System.out.println(num);
        }


    }
}