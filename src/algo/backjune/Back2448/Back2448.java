package algo.backjune.Back2448;

import java.util.Scanner;

/**
 * Created by developerkhy@gmail.com on 2017. 6. 2.
 * see       : https://www.acmicpc.net/problem/2448
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 */
public class Back2448 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
        int N = 3;

        for(int i=0; i<N; i++){
            if(i==0){System.out.println("  * ");}
            if(i==1){System.out.println(" * *");}
            if(i==2){System.out.println("*****");}
        }

    }
}
