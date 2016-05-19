package tryhelloworld;

/**
 * Created by sould on 2016-05-19.
 * 제목 : 가운데 글자 가져오기
 * 내용 : getMiddle메소드는 하나의 단어를 입력 받습니다.
 *       단어를 입력 받아서 가운데 글자를 반환하도록 getMiddle메소드를 만들어 보세요.
 *       단어의 길이가 짝수일경우 가운데 두글자를 반환하면 됩니다.
         예를들어 입력받은 단어가 power이라면 w를 반환하면 되고, 입력받은 단어가 test라면 es를 반환하면 됩니다.
 */
public class StringExercise {
    String getMiddle(String word){
        int remainder = word.length()%2;
        int       mid = word.length()/2;
        String result = "";

        if(remainder==0){
            result = word.substring(mid-1,mid+1);
        }else{
            result = word.substring(mid, mid+1);
        }

        return result;
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}
