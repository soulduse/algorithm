package algo.backjune;

import java.util.Scanner;

/**
 * Created by developerkhy@gmail.com on 2017. 5. 23.
 * see       : https://www.acmicpc.net/problem/11721
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 */
public class Back11721 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = str.length();
        String result = "";
        int position = 0;

        for(int i=10; i<length; i+=10){
            if(i % 10 == 0){
                result += str.substring(position, i)+"\n";
                position = i;
            }
        }

        if(position != length){
            result += str.substring(position, length);
        }

        System.out.print(result);
        sc.close();
    }
}
