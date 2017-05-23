package algo.backjune;

import java.util.Scanner;

/**
 * Created by developerkhy@gmail.com on 2017. 5. 22.
 * see       : https://www.acmicpc.net/problem/2839
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 */
public class Back2839 {

    private static final int SUGAR_BOX_3KG = 3;
    private static final int SUGAR_BOX_5KG = 5;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n       = sc.nextInt();
        int five    = n / SUGAR_BOX_5KG;
        int three   = 0;

        n %= SUGAR_BOX_5KG;

        while (five >= 0){
            if(n % SUGAR_BOX_3KG == 0){
                three = n / SUGAR_BOX_3KG;
                n %= SUGAR_BOX_3KG;
                break;
            }
            n += SUGAR_BOX_5KG;
            five--;
        }
        System.out.println(n == 0 ? five+three : -1);
    }
}
