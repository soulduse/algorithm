package algo;

import java.util.Scanner;

/**
 * Created by soul on 2016. 12. 24..
 */
public class Algo001 {
    public static void main(String[] args) {

//        String data = "abcdefg";
//        int count = 4;

        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        int count = sc.nextInt();
        Algo001 algo001 = new Algo001();
        algo001.printResult(data, count);

    }

    static void printResult(String word, int count){
        int wordLength = word.length();
        String pieceCharact[]   = word.split("");
        String firstStr         = "";
        String secondStr        = "";

        for(int i=0; i<wordLength; i++){
            if(i<count){
                firstStr += pieceCharact[i]+" ";
            }else{
                secondStr += pieceCharact[i]+" ";
            }
        }

        System.out.println(firstStr);
        System.out.println(secondStr);
    }
}
