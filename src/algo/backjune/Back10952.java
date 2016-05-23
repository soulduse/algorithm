package algo.backjune;

import java.util.Scanner;

/**
 * Created by sould on 2016-05-24.
 */
public class Back10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt()+sc.nextInt();
        while(sum!=0){
            System.out.println(sum);
            sum = sc.nextInt()+sc.nextInt();
        }
    }
}
