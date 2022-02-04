package logic;

import java.util.ArrayList;
import java.util.HashMap;

public class numbersPerfect {
    static private int sumDiv(int n){
        int sum = 1;
        for (int i = 2; i <= n/2 ; i++) {
            sum += n %i == 0 ? i : 0;
        }
        return sum;
    }

    public static HashMap<Integer,Integer> finPerfects(int begin,int end){
        HashMap<Integer, Integer> out = new HashMap();
        for (int extern = begin; extern <= end; extern++) {
            for (int intern = begin; intern <=extern ; intern++) {
                if (sumDiv(extern) == intern && sumDiv(intern) == extern) {
                    out.put(extern,intern);
                }

            }
        }
        return out;
    }
}
