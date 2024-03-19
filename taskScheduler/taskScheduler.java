package taskScheduler;
import java.util.*;

class Solution {
    // You are given an array of CPU tasks, each represented by letters A to Z, and a cooling time, n. 
    // Each cycle or interval allows the completion of one task. Tasks can be completed in any order, but there's a constraint: 
    // -> identical tasks must be separated by at least n intervals due to cooling time.

    // ​Return the minimum number of intervals required to complete all tasks.

     public static void leastInterval(char[] tasks) {
        Map<Character, Integer> m = new HashMap<Character, Integer>();

        for(int i = 0; i< tasks.length; i++){

            if(m.containsKey(tasks[i])){
    
                m.put(tasks[i], m.get(tasks[i]) + 1);
            }
            else {
                m.put(tasks[i], 1);
            }
        }
        System.out.println(m);
    }
    public static void main(String[] args) {
        
    }
}