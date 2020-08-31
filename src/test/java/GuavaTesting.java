import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
Import com.google.common.math.Splitter;

import java.util.ArrayList;

public class GuavaTesting {
    public static void main(String[] args) {
        double num = Math.PI;
        double butInt = 7;

        System.out.println(num);

        System.out.println(DoubleMath.isMathematicalInteger(num));
        System.out.println(DoubleMath.isMathematicalInteger(butInt));

        int largeNum = Integer.MAX_VALUE;
        System.out.println(largeNum + 1);
        try {
            System.out.println(IntMath.checkedAdd(largeNum, 1));
        } catch (ArithmeticException e) {
            System.err.println("That number is too big, genius.");
        }


        System.out.println(IntMath.checkedAdd(largeNum, 1));

        String nameTag = "Hello, My Name is Joe!";
        ArrayList<String> cutUpTag = new ArrayList<>();
       Splitter.on(",").trimResults().omitEmptyStrings().split(nameTag).forEach(cutUpTag)

       System.out.println(cutUpTag.size());


        for (int i = 0; i < cutUpTag.size(); i ++){
            System.out.println(cutUpTag.get(i));
        }

    }
}
