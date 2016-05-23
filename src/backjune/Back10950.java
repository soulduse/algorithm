package backjune;

import java.util.Scanner;

/**
 * Created by sould on 2016-05-23.
 */
public class Back10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int sum = 0;
        for(int i=0; i<cnt; i++){
            sum = sc.nextInt()+sc.nextInt();
            System.out.println(sum);
        }
    }
}
