package algo.backjune.back4673;

/**
 * Created by developerkhy@gmail.com on 2017. 6. 1.
 * see       : https://www.acmicpc.net/problem/4673
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 */
public class Back4673 {
    public static void main(String[] args) {
        int arr[] = new int[10036];         // 9999 최대 값으로 만들어지는 데이터가 10035 이므로 10036으로 배열 크기 설정

        for(int i=1; i<=10000; i++){
            arr[d(i)] = 1;
            if(arr[i] != 1)
                System.out.println(i);
        }
    }


    private static int d(int num){
        int copy = num;
        int sum = 0;
        while (num >= 10){
            sum += num % 10;
            num = num / 10;
        }
        return sum+num+copy;
    }
}
