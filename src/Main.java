import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("gib eine reihe von zahlen an, separiert mit einem leerzeichen");
        String input = scanner.next();
        String[] strArr = input.split("\\s+");
        System.out.println(strArr.length);

        int[] intArr = new int[strArr.length];
        int index = 0;

        for (String str : strArr){
            if(!str.equals(" ")){
                intArr[index] = Integer.parseInt(str);
                index++;
            }
        }
        for(int num : intArr){
            System.out.println(num);
        }


    }
}