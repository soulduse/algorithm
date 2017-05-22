package algo.backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by soul on 2017. 5. 22..
 *  * 백준 온라인 저지 11718번 (그대로 출력하기) 문제풀이
 *
 * @see https://www.acmicpc.net/problem/11718
 * @author soulduse
 */
public class Back11719 {

    private static final String NEW_LINE = "\n";

    public static void main(String args[]) throws Exception {
        // 버퍼를 통해 입력 값을 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = null;

        while ((line = br.readLine()) != null) {
            sb.append(line).append(NEW_LINE);
        }

        br.close();

        // 버퍼를 통해 결과 값 한꺼번에 출력
        System.out.println(sb.toString());
    }
}
