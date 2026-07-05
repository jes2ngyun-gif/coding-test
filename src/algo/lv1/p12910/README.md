### 문제
정수 배열 `arr`와 자연수 `divisor`가 주어진다.

arr 안의 숫자들 중 divisor로 나누어 떨어지는 숫자만 골라서, 
오름차순으로 정렬한 배열을 반환해야 한다.

단, 나누어 떨어지는 숫자가 하나도 없으면 [-1]를 반환한다.

예시:
```
arr = [5, 9, 7, 10]
divisor = 5
```
5로 나누어 떨어지는 값은 5, 10이므로 결과는:
```
[5, 10]
```
---
문제를 보자마자 떠올랐던 문법
```
arr[i] % divisor == 0
```
---
### 코드 작성하는 순서
```
1. 조건에 맞는 숫자가 몇 개인지 count 한다.
2. count가 0이면 [-1] 배열을 반환한다.
3. count 크기만큼 answer 배열을 만든다.
4. arr를 다시 돌면서 나누어떨어지는 값을 answer에 넣는다.
5. answer를 오름차순 정렬한다.
6. answer를 return 한다.
```
**배열은 처음 만들 때 크기를 정해야 한다.**

그래서 먼저 `count` 를 세는 과정이 필요하다.

### 왜 이렇게 푸는가?
이 문제는 "전체 데이터 중에서 조건에 맞는 데이터만 걸러내는 문제"다.

실생활로 비유하면:
> 반 전체 학생 명단에서 키가 170 이상인 학생만 골라서 키 순서대로 정렬하는 것과 비슷

전체를 한 명씩 확인해야 하고, 조건에 맞는 학생만 따로 모은 뒤, 정렬해야 한다.

---
### 실무적으로는
백엔드에서는 이런 로직이 자주 나온다.

예를 들면:
```
전체 회원 목록 중에서
- 활성화된 회원만 조회
- 특정 등급 회원만 필터링
- 가격이 특정 조건에 맞는 상품만 정렬
- 작성자가 특정 사용자인 게시글만 조회
```
 이런 작업을 Spring과 DB를 배워서 SQL이나 JPA로 하게 된다!!!!!
원리는 지금 문제와 같다.
```
전체 데이터 → 조건 필터링 → 정렬 → 결과 반환
```
---
### 전체 흐름도
```
solution(arr, divisor) 호출
        │
        ▼
arr 전체를 돌면서
divisor로 나누어떨어지는 값 개수 세기
        │
        ▼
count == 0 ?
   │
   ├─ yes → [-1] 반환
   │
   └─ no
        │
        ▼
count 크기의 answer 배열 생성
        │
        ▼
arr 전체를 다시 돌면서
조건에 맞는 값만 answer에 저장
        │
        ▼
answer 오름차순 정렬
        │
        ▼
answer 반환
```
### 다른 풀이
### 1. ArrayList 사용
배열 크기를 먼저 셀 필요가 없다.
```java
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i ++) {
            
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        
        if (list.size() == 0) {
            return new int[]{-1};
        }
        
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
```
#### 코드 작성하기 전 
#### 조건에 맞는 값을 어디에 담을건가?
첫번째로 작성한 소스에서는 배열 크기를 먼저 세야 했다.

하지만 ArrayList 를 사용해서 다른 풀이를 구현해보았다.
```java
ArrayList<Integer> list = new ArrayList<>();
```
ArrayList 는 값을 추가할 때마다 크기가 `자동으로` 늘어난다.
그래서 처음부터 정답 배열의 크기를 몰라도 된다.

---
#### 코드 작성하는 순서
```
1. ArrayList<Integer> list를 만든다.
2. arr 배열을 처음부터 끝까지 반복한다.
3. arr[i]가 divisor로 나누어떨어지면 list에 추가한다.
4. list가 비어 있으면 [-1]을 반환한다.
5. list를 오름차순으로 정렬한다.
6. list와 같은 크기의 int[] answer를 만든다.
7. list의 값을 answer 배열로 옮긴다.
8. answer를 반환한다.
```
#### 어레이리스트를 활용한 풀이 코드 핵심
```
배열에서 조건에 맞는 값만 ArrayList에 임시 저장한다.
그 후 정렬하고, 문제에서 요구하는 int[] 배열로 변환한다.
```
첫번째 방법과 가장 큰 차이는 **count를 먼저 세지 않아도 된다**는 점이다.

첫번째 방법에서는 배열만 쓰기 때문에 이런 흐름이었다.
```
개수 세기 → 배열 만들기 → 값 넣기
```
ArrayList를 활용한 방법에서는 ArrayList가 크기를 자동으로 늘려주기 때문에 이렇게 간다.
```
값 넣기 → 정렬하기 → 배열로 바꾸기
```
즉, 이 방법은 사람이 생각하는 흐름에 더 가깝다.
```
조건에 맞는 것들을 일단 바구니에 담는다.
다 담은 뒤 정렬한다.
제출 형식에 맞게 배열로 바꾼다.
```

---
#### 실무에서는??
실무에서는 처음부터 결과 개수를 정확히 모르는 경우가 많다.

예를 들어 백엔드에서 이런 상황이 자주 나온다.
```
전체 회원 중 활성 회원만 고르기
전체 게시글 중 특정 작성자의 글만 고르기
전체 주문 중 결제 완료된 주문만 고르기
전체 상품 중 품절이 아닌 상품만 고르기
```
처음부터 결과가 몇 개인지 모를 때는 배열보다 List 계열 자료구조가 더 자연스럽다.

그래서 실무에서는 보통 이런 흐름을 많이 쓴다.
```
전체 데이터 조회
→ 조건에 맞는 데이터만 List에 담기
→ 정렬
→ 필요한 형태로 반환
```
지금 문제에서는 반환 타입이 int[]로 정해져 있어서 마지막에 배열로 바꾸지만,
실무의 Java/Spring 코드에서는 List<Member>, List<Post>, List<Product> 같은 형태로 그대로 반환하거나 DTO 리스트로 변환하는 경우가 많다.

---
#### 다른풀이 1의 전체 흐름도
```
[solution(arr, divisor) 호출]
              │
              ▼
[ArrayList<Integer> list 생성]
              │
              ▼
[arr 배열 전체 반복]
              │
              ▼
[arr[i] % divisor == 0 인가?]
        │
        ├─ 아니오 → 다음 원소 확인
        │
        └─ 예 → list에 arr[i] 추가
              │
              ▼
[반복 종료]
              │
              ▼
[list가 비어 있는가?]
        │
        ├─ 예 → new int[]{-1} 반환
        │
        └─ 아니오
              │
              ▼
[list 오름차순 정렬]
              │
              ▼
[list 크기만큼 int[] answer 생성]
              │
              ▼
[list 값을 answer 배열로 복사]
              │
              ▼
[answer 반환]
```
#### 다른풀이 1의 핵심?
다른풀이1의 핵심은 **필터링 → 정렬 → 반환 형식 맞추기**다.
```
전체 배열
→ divisor로 나누어떨어지는 값만 필터링
→ 오름차순 정렬
→ int[] 배열로 반환
```
다른풀이1 에서 `ArrayList`는 **중간 저장소 역할**을 한다.

비유하면 이렇다.
```
전체 숫자 카드가 있다.
조건에 맞는 카드만 임시 바구니에 담는다.
바구니 안의 카드를 작은 숫자부터 정렬한다.
제출용 봉투인 int[] 배열에 다시 옮긴다.
```
여기서 중요한 포인트는 3개다.

첫째, `ArrayList`는 결과 개수를 미리 몰라도 값을 담을 수 있다.

둘째, 문제의 반환 타입이 `int[]`이므로 마지막에 **배열로 변환**해야 한다.

셋째, 문제에서 `오름차순`을 요구하므로 **정렬**을 빼먹으면 안 된다.

---
###  2. 반복문x , Stream를 활용한 풀이
Arrays.stream(arr)는 int[] 배열을 IntStream으로 바꿔준다. 그 뒤 filter()로 조건에 맞는 값만 남기고, sorted()로 정렬한 다음, toArray()로 다시 int[] 배열을 만든다.

```java
 import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr)
                .filter(num -> num % divisor == 0)
                .sorted()
                .toArray();

        if (answer.length == 0) {
            return new int[]{-1};
        }

        return answer;
    }
}
```
#### 코드 작성할 때 생각하는 흐름
```
arr 배열을 Stream으로 바꾼다
→ 조건에 맞는 값만 통과시킨다
→ 오름차순 정렬한다
→ int[] 배열로 만든다
```
```java
Arrays.stream(arr)
        .filter(num -> num % divisor == 0)
        .sorted()
        .toArray();
```
#### 코드 작성하는 순서
```
1. import java.util.Arrays; 를 작성한다.
2. Arrays.stream(arr)로 배열을 Stream으로 바꾼다.
3. filter()로 divisor로 나누어떨어지는 값만 남긴다.
4. sorted()로 오름차순 정렬한다.
5. toArray()로 다시 int[] 배열로 만든다.
6. answer.length가 0이면 [-1]을 반환한다.
7. 그렇지 않으면 answer를 반환한다.
```

---
#### 풀이2의 핵심 원리
**필터링 → 정렬 → 배열 변환**
```
전체 배열
→ 조건에 맞는 값만 필터링
→ 오름차순 정렬
→ int[] 배열로 변환
→ 비어 있으면 [-1]
```
비유하면:
```
숫자 카드들이 한 줄로 지나간다.
조건에 맞는 카드만 통과시킨다.
통과한 카드들을 숫자 순서대로 정렬한다.
마지막에 제출용 배열 상자에 담는다.
```
Stream은 "어떻게 반복할지"를 직접 쓰기보다, "무엇을 할지"를 연결해서 표현한다.
```java
.filter(num -> num % divisor == 0)
.sorted()
.toArray()
```
이 코드는 사람말로 바꾸면:
```
나누어 떨어지는 숫자만 골라서(필터)
정렬하고(쏠티드)
배열로 만들어라(투어레이)
```

---
#### 실무에선?
실무에서 Stream은 **컬렉션이나 배열 데이터를 가공할 때** 자주 사용한다.

예를 들어 백엔드에서는 이런 흐름이 많다.
```
회원 목록에서 활성 회원만 고르기
게시글 목록에서 특정 조건의 글만 고르기
상품 목록을 가격순으로 정렬하기
Entity 목록을 DTO 목록으로 변환하기
```
다만 중요한 점이 있다. 실무에서 데이터가 DB에 있다면, 모든 데이터를 Java로 가져온 뒤 Stream으로 거르는 것보다 `DB 쿼리 단계에서 WHERE, ORDER BY로 필터링과 정렬을 처리하는 것이 보통 더 효율적`이다.

즉, 기준은 이렇게 잡으면 된다.
```
이미 Java 메모리에 있는 작은 데이터 가공 → Stream 사용 가능
DB에 있는 많은 데이터 필터링/정렬 → SQL/JPA 쿼리에서 처리하는 것이 우선
```
또 하나, Stream 안에서는 외부 변수를 마구 수정하는 방식은 피하는 게 좋다.

---
#### 풀이2의 전체 흐름도
```
[solution(arr, divisor) 호출]
              │
              ▼
[Arrays.stream(arr)]
arr 배열을 IntStream으로 변환
              │
              ▼
[filter(num -> num % divisor == 0)]
divisor로 나누어떨어지는 값만 통과
              │
              ▼
[sorted()]
통과한 값들을 오름차순 정렬
              │
              ▼
[toArray()]
Stream 결과를 int[] 배열로 변환
              │
              ▼
[answer.length == 0 ?]
        │
        ├─ 예 → new int[]{-1} 반환
        │
        └─ 아니오 → answer 반환
```
Stream의 중간 연산들은 파이프라인을 구성하고, toArray() 같은 최종 연산이 실행되면 실제 결과를 만들기 위해 스트림 처리가 수행된다.
```
stream으로 바꾼다 
→ filter로 거른다
→ sorted로 정렬한다
→ toArray로 배열로 만든다
→ 비어 있으면 [-1]
```