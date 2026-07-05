### 다른 풀이 방법. StringBuilder 사용

```java
class Solution {
    
    public String solution(int n) {
        
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            
            if (i % 2 == 0) {
                answer.append("수");
            
            }else {
                answer.append("박");
            }
        }
        
        return answer.toString();
    }
}

```
이 코드가 가장 권장되는 풀이 방식.

정답 코드에 내가 작성한 코드의 흐름은 그대로 유지하면서, 문자열을 더 효율적으로 만든다.

| 방식                          | 설명                     |
| --------------------------- | ---------------------- |
| `String answer += "수"`      | 새 문자열이 계속 만들어질 수 있음    |
| `StringBuilder.append("수")` | 같은 저장 공간에 뒤로 계속 붙이는 방식 |

반복문으로 문자열을 만들 때는 StringBuilder를 떠올리는 습관을 들이면 좋다.