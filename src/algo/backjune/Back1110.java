package algo.backjune;

import java.util.Scanner;

/**
 * Created by developerkhy@gmail.com on 2017. 6. 1.
 * see       : https://www.acmicpc.net/problem/1110
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 *
 *
 * 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다.
 * 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
 * 그 다음, 주어진 수의 가장 오른쪽 자리 숫자와 앞에서 구한 합의 가장 오른쪽 자리 숫자를 이어 붙이면 새로운 수를 만들 수 있다.
 * 다음 예를 보자.
 * 26부터 시작한다. 2+6 = 8이다.
 * 새로운 숫자는 68이다. 6+8 = 14이다.
 * 새로운 숫자는 84이다. 8+4 = 12이다.
 * 새로운 숫자는 42이다. 4+2 = 6이다.
 * 새로운 숫자는 26이다.
 * 위의 예는 4번만에 원래 숫자로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
 * N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
 */
public class Back1110 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int [] arr = new int[3];
        arr[0] = input / 10;
        arr[1] = input % 10;
        int a = arr[0];
        int b = arr[1];
        int cnt = 0;

        while (true){
            arr[2] = arr[0] + arr[1];
            arr[0] = arr[1];
            arr[1] = arr[2] % 10;
            cnt++;
            if(a == arr[0] && b == arr[1]){
                break;
            }
        }

        System.out.println(cnt);


        /*
        int cnt = 0;
        int [] intArr = new int[4];
        intArr[0] = input / 10;
        intArr[1] = input % 10;

        while (intArr[3] != input){
            intArr[2] = intArr[0]+intArr[1];
            if(intArr[2] >= 10){
                intArr[2] = intArr[2] % 10;
            }
            intArr[3] = (intArr[1]*10)+intArr[2];
            intArr[0] = intArr[3] / 10;
            intArr[1] = intArr[3] % 10;
            cnt++;
        }

        System.out.println(cnt);
        //*/
    }
}
