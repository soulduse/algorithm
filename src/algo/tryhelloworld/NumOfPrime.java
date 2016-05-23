package algo.tryhelloworld;

/**
 * Created by sould on 2016-05-14.
 */
public class NumOfPrime {
    int numberOfPrime(int n) {
        int result = 0;
        // 함수를 완성하세요.

        for(int i=2; i<=n; i++){
           for(int j=2; j<=i; j++){
               if(i!=j && i%j==0)break;
               if(i==j){
                   result++;
               }
           }
        }
        return result;
    }

    public static void main(String[] args) {
        NumOfPrime prime = new NumOfPrime();
        System.out.println( prime.numberOfPrime(10) );
    }
}
