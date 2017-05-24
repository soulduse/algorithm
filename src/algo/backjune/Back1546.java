package algo.backjune;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int cnt         = in.read()-'0';
        in.read();
        double score[]   = changeDoubleArray(in.readLine());
        double max = score[0];
        int scoreLength = score.length;
        double hap = 0;
        double result = 0;

        for(int i=1; i<scoreLength; i++){
            if(max < score[i]){
                max = score[i];
            }
        }

        for(int i=0; i<scoreLength; i++){
            if(score[i] != max){
                score[i] = score[i]/max*100;
            }
            hap += score[i];
        }

        result = hap/scoreLength;

        System.out.println(result);

        /*
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;

        int cnt         = in.read()-'0';
        in.read();
        String scores[]   = in.readLine().split(" ");

        System.out.println(scores[0]+" / " +scores[1]+" / "+scores[2]);
        aLoopName : for(int i=0; i<cnt; i++){
            System.out.println("cnt : "+cnt +" / i "+i);
            int score = change(scores[i]);
            if(max < score){
                max = score;
                continue aLoopName;
            }

            if(max > change(scores[i])){
                scores[i] = (change(scores[i])/max*100)+"";
            }

            System.out.println(scores[i]);
        }

        System.out.println(max);

        in.close();
        */
    }

    private static double[] changeDoubleArray(String score){
        String scoreArr [] = score.split(" ");

        double resultArr[] = new double[scoreArr.length];

        for(int i=0; i<resultArr.length; i++){
            resultArr[i] = Double.parseDouble(scoreArr[i]);
        }

        return resultArr;
    }
}
