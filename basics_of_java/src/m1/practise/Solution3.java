package m1.practise;

import java.util.*;

public class Solution3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Deque<Integer> window = new ArrayDeque<>();
        Map<Integer, Integer> freq = new HashMap<>();

        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            window.addLast(num);
            freq.put(num, freq.getOrDefault(num, 0) + 1);

            if (window.size() > k) {
                int removed = window.removeFirst();
                freq.put(removed, freq.get(removed) - 1);

                if (freq.get(removed) == 0)
                    freq.remove(removed);
            }


            if (window.size() == k)
                maxUnique = Math.max(maxUnique, freq.size());
        }

        System.out.println(maxUnique);
    }
}
