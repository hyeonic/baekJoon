### level1 문자열 내 p와 y의 개수

문제 : https://programmers.co.kr/learn/courses/30/lessons/12916

```java
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        String[] split = s.split("");
        
        for (String value : split) {
            if (value.charAt(0) == 'p' || value.charAt(0) == 'P') ++pCount;
            if (value.charAt(0) == 'y' || value.charAt(0) == 'Y') ++yCount;
        }
        
        // System.out.println("p : " + pCount + "  y : " + yCount);
        
        if (pCount == yCount) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}
```