package todaysPro;
import java.util.*;

public class SubarrayProductNormal {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 10};
        int target = 30;

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            List<Integer> subList = new ArrayList<>();

            for (int j = i; j < arr.length; j++) {
                product *= arr[j];
                if (product < target) {
                    subList.add(arr[j]);
                    result.add(new ArrayList<>(subList));  // store a copy
                } else {
                    break;  // stop if product >= target
                }
            }
        }

        System.out.println(result);
    }
}
