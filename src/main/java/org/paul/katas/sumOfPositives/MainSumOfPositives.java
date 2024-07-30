package org.paul.katas.sumOfPositives;

public class MainSumOfPositives {
    static int sumOfPositives(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0){
                sum += arr[i];
            }
        }
        return sum;
    }
}
