### 다른 풀이 방법 : 기능을 메서드로 분리하기

```java
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int number = left; number <= right; number++) {
            if (isDivisorCountEven(number)) {
                answer = answer + number;
                
            } else {
                answer = answer = number;
            }
        }
        return answer;
    }
    
    private boolean isDivisorCountEven(int number) {
        int divisorCount = 0;
        
        for (int divisor = 1; divisor <= number; divisor++) {
            if (number % divisor == 0) {
                divisorCount++;
            }
        }
        
        return divisorCount % 2 == 0;
    }
}
```
이 풀이의 장점은 역할이 분리된다.

| 메서드                  | 역할                    |
| -------------------- | --------------------- |
| `solution`           | 전체 범위를 돌면서 더할지 뺄지 결정  |
| `isDivisorCountEven` | 특정 숫자의 약수 개수가 짝수인지 판단 |

비유하자면,
solution은 매니저
isDivisorCountEven은 검사 담당 직원
```
solution:
"13부터 17까지 검사해."

isDivisorCountEven:
"이 숫자의 약수 개수가 짝수인지 확인해줄게."
```
