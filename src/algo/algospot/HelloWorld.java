package algo.algospot;

import java.util.Scanner;

/**
 * Created by soul on 2017. 2. 23..
 */
public class HelloWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i=0; i<count; i++)
            System.out.println("Hello, "+sc.next()+"!");
    }
}
