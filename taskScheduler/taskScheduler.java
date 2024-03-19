package taskScheduler;
import java.util.*;

class Solution {
    // You are given an array of CPU tasks, each represented by letters A to Z, and a cooling time, n. 
    // Each cycle or interval allows the completion of one task. Tasks can be completed in any order, but there's a constraint: 
    // -> identical tasks must be separated by at least n intervals due to cooling time.

    // ​Return the minimum number of intervals required to complete all tasks.
     public int leastInterval(char[] tasks, int n) {
        //Runtime 14 ms
        //Beats 57.47% of users with Java
        Map<Character, Integer> m = new HashMap<Character, Integer>();

        for (char task : tasks) {
            m.put(task, m.getOrDefault(task, 0) + 1);
        }

        int maxFrequency = Collections.max(m.values()); // Тепер цей рядок знаходиться після заповнення мапи
        
        int maxCount = Collections.frequency(m.values(), maxFrequency);

        int ans = (maxFrequency - 1) * (n + 1) + maxCount;

        return Math.max(ans, tasks.length);
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        char[] arr = {'A', 'A', 'A', 'B', 'B', 'B'};
        System.out.println(s.leastInterval(arr, 2));
    }
}