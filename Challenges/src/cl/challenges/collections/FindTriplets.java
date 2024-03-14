package cl.challenges.collections;

import java.util.ArrayList;
import java.util.List;

public class FindTriplets {
    public static void main(String[] args) {
        int[] numbers = {-1, 8, 0, 8, 1, 2,-1, -1, -4};

        List<List<Integer>> triplets = findTripletsWithSumZero(numbers);
        
        System.out.println("Triplets with sum 0:");
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }

    public static List<List<Integer>> findTripletsWithSumZero(int[] numbers) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numbers.length - 2; i++) {
            for (int j = i + 1; j < numbers.length - 1; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    if (numbers[i] + numbers[j] + numbers[k] == 0) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(numbers[i]);
                        triplet.add(numbers[j]);
                        triplet.add(numbers[k]);
                        result.add(triplet);
                    }
                }
            }
        }

        return result;
    }
}
