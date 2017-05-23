package algo.backjune;

import java.util.Scanner;

/**
 * Created by developerkhy@gmail.com on 2017. 5. 22.
 * see       : https://www.acmicpc.net/problem/11720
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 */
public class Back11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String num = sc.next();
        int result = 0;

        for(int i=0; i<cnt; i++){
            System.out.println(num.charAt(i));
            result += num.charAt(i)-'0';
        }
        System.out.println(result);
        sc.close();
    }
}
