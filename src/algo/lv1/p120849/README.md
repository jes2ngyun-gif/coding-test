## 다른 풀이

### 작성한 정답 코드보다 조금 더 업그레이드
### contains 사용
```
class Solution {
    public String solution(String my_string) {
        String answer = "";

        String vowels = "aeiou";

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if (!vowels.contains(String.valueOf(ch))) {
                answer = answer + ch;
            }
        }

        return answer;
    }
}
```
```java
if (!vowels.contains(String.valueOf(ch))) {
```
현재 문자 ch가 모음이 아닌지 확인한다.

여기서 나눠서 보면 쉽다.
```java
String.valueOf(ch)
```
문자 ch를 문자열로 바꾼다.

예를 들어:
```
'u' → "u"
```
가 된다.
```java
vowels.contains(String.valueOf(ch))
```
현재 문자가 "aeiou" 안에 포함되어 있는지 확인한다.

예를 들어:
```
"aeiou".contains("u") → true
"aeiou".contains("b") → false
```
앞에 붙은 !는 “아니다”라는 뜻이다.
```java
!vowels.contains(String.valueOf(ch))
```
즉:

현재 문자가 모음이 아니라면

이라는 의미다.

---
### replaceAll() 사용
```java
class Solution {
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}
```
#### 설명
`replaceAll()`은 특정 패턴에 맞는 문자열을 다른 문자열로 바꾸는 메서드다.
```java
replaceAll("[aeiou]", "")
```
뜻은:
```
a, e, i, o, u 중 하나를 만나면
빈 문자열 ""로 바꾼다.
```
빈 문자열로 바꾼다는 것은 결과적으로 **제거**한다는 뜻이다.

예를 들어:
```java
"bus".replaceAll("[aeiou]", "")
```
결과는:
```java
"bs"
```
이 풀이는 매우 짧고 실무에서도 자주 볼 수 있다.

---
### StringBuilder 사용
```java
class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        String vowels = "aeiou";

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if (!vowels.contains(String.valueOf(ch))) {
                answer.append(ch);
            }
        }

        return answer.toString();
    }
}
```
#### 설명
기본 풀이에서는 문자열을 이렇게 계속 붙였다.
```java
answer = answer + ch;
```
`StringBuilder` 풀이에서는 이렇게 붙인다.
```java
answer.append(ch);
```
`문자열을 반복해서 이어 붙일 때는 StringBuilder가 더 효율적`이다.

마지막에는 StringBuilder를 String으로 바꿔야 하므로:
```java
answer.toString()
```
을 사용한다.

실무에서는 반복문 안에서 문자열을 계속 이어 붙일 때 StringBuilder를 자주 사용한다.

---