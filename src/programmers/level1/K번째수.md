### level1 K번째 수

문제 : https://programmers.co.kr/learn/courses/30/lessons/42748

```java
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int cnt = 0;
        for (int[] command : commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2];
            List<Integer> temp = new ArrayList();
            
            for (int idx = i - 1; idx < j; ++idx) {
                temp.add(array[idx]);
            }
            
            Collections.sort(temp);
            answer[cnt] = temp.get(k - 1);
            ++cnt;
        }
        
        return answer;
    }
}
```