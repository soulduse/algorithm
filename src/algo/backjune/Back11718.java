package algo.backjune;

import java.util.Scanner;

/**
 * Created by soul on 2017. 5. 22..
 * 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고,
 * 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
 * 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다.
 * 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
 */
public class Back11718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        /*
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while((line = in.readLine()) != null)
        {
          System.out.println(line);
        }
        in.close();

         */

    }
}

//        char input[] = sc.next().toCharArray();
//
//            if(input[0] == ' ' || input[input.length-1] == ' '){
//                System.out.println("처음과 마지막중 공백존재");
//            }else{
//                for(char msg : input){
//                    System.out.print(msg);
//                }
//                System.out.println();
//            }


        /*
        String temp = " abcde ";
        String temp1 = "abcde";

        System.out.println(temp.startsWith("a"));
        System.out.println(temp.startsWith(" "));
        System.out.println(temp1.startsWith("a"));
        System.out.println(temp1.startsWith(" "));
        System.out.println(temp.endsWith("a"));
        System.out.println(temp.endsWith(" "));
        System.out.println(temp1.endsWith("a"));
        System.out.println(temp1.endsWith(" "));

        */
        /*
        int cnt = 0;
        while (cnt < 5){
            String msg = sc.next();
//            if(msg.startsWith(" ") || msg.endsWith(" ")){
            if(msg.startsWith(" ")){
                System.out.println("끝이나 처음에 공백이 존재!");
            }else{
                arr[cnt++] = msg;
            }

            System.out.println("count : "+cnt);
        }

        for(String data : arr){
            System.out.println(data);
        }

        //*/
//    }
//}
