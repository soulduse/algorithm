package algo.backjune;

import java.util.Scanner;

/**
 * Created by developerkhy@gmail.com on 2017. 5. 24.
 * see       : https://www.acmicpc.net/problem/1546
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 *
 * 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다.
 * 일단 세준이는 자기 점수 중에 최대값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
 * 예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
 * 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
 */
public class Back1546 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cnt         = sc.nextInt();
        int max         = 0;
        int score[]     = new int[cnt];
        double hap      = 0;

        for(int i=0; i<cnt; i++){
            score[i] = sc.nextInt();
            if(max < score[i]){
                max = score[i];
            }
        }

        for(double d : score){
            hap += d/max*100;
        }

        System.out.printf("%.2f",hap/cnt);
    }
}
