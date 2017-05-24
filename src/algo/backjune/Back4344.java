package algo.backjune;

import java.util.Scanner;

/**
 * Created by developerkhy@gmail.com on 2017. 5. 25.
 * see       : https://www.acmicpc.net/problem/4344
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 *
 *  5
    5 50 50 70 80 100                   40.000%
    7 100 95 90 80 70 60 50             57.143%
    3 70 90 80                          33.333%
    3 70 90 81                          66.667%
    9 100 99 98 97 96 95 94 93 91       55.556%
 */
public class Back4344 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        for(int i=0; i<cnt; i++){
            int inCnt = sc.nextInt();
            int hap = 0;
            double overScore = 0;
            int score[] = new int[inCnt];
            for(int j=0; j<inCnt; j++){
                score[j] = sc.nextInt();
                hap += score[j];
            }

            double avg = hap/inCnt;

            for(int k=0; k<score.length; k++){
                if(score[k] > avg){
                    overScore++;
                }
            }

            double result = overScore/inCnt*100;
            System.out.printf("%.3f%%\n", result);
        }
    }
}
