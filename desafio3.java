import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemPares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int k = scanner.nextInt();


        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        int count = countPairs(arr, k);
        System.out.println(count);
    }

    public static int countPairs(int[] arr, int k) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        for (int num : arr) {
            int complement = num + k;
            if (frequencyMap.containsKey(complement)) {
                count += frequencyMap.get(complement);
            }
        }

        return count;
    }
}
