package algo.tryhelloworld;


/**
 * Created by sould on 2016-05-14.
 */
public class GetMinMaxString02 {

    public static void main(String[] args) {
        String str = "1 2 3 4";
        GetMinMaxString02 minMax = new GetMinMaxString02();
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }

    public String getMinMaxString(String str){
        String [] strArr = str.split(" ");
        int min = Integer.parseInt(strArr[0]);
        int max = Integer.parseInt(strArr[0]);

        for(int i=0; i<strArr.length; i++){
            int compareNum = Integer.parseInt(strArr[i]);
            if(min > compareNum){
                min = compareNum;
            }else if(max < compareNum){
                max = compareNum;
            }
        }

        return min+" "+max;
    }
}
