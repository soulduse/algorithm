package algo.tryhelloworld;

/**
 * Created by sould on 2016-05-14.
 */
public class GetMean01 {
    public int getMean(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }

        return sum/array.length;
    }

    public static void main(String[] args) {
        int x[] = {5, 4, 3};
        GetMean01 getMean = new GetMean01();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("평균값 : " + getMean.getMean(x));
    }
}
