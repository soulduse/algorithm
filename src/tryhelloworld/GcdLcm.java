package tryhelloworld;

import java.util.Arrays;

/**
 * Created by sould on 2016-05-23.
 */
public class GcdLcm {

    public int[] gcdlcm(int a, int b) {
        int gcd = getGcd(a,b);
        int lcm = a*b/gcd;
        int[] answer = new int[2];
        answer[0] = gcd;
        answer[1] = lcm;

        return answer;
    }

    public int getGcd(int a, int b){
        return a%b==0 ? b:getGcd(b,a%b);
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        GcdLcm c = new GcdLcm();
        System.out.println(Arrays.toString(c.gcdlcm(3, 15)));
    }
}
