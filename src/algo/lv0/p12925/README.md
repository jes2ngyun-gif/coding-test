#### parseInt와 valueOf 결과는 같지만 parseInt 사용을 더 권장함.

### 알고가기
parseInt()는 지금은 처음 보는 문법이지만,

- 입력값 처리
- 파일 읽기
- 웹 개발(Spring)
- 데이터베이스 값 처리

등에서 매우 자주 등장한다.

그래서 지금 단계에서는


>"문자열을 숫자로 바꿀 때는 Integer.parseInt()를 사용한다."

| 메서드                  | 반환 타입        | 예시                                      |
| -------------------- | ------------ | --------------------------------------- |
| `Integer.parseInt()` | `int`        | `int num = Integer.parseInt("123");`    |
| `Integer.valueOf()`  | `Integer` 객체 | `Integer num = Integer.valueOf("123");` |

valueOf()보다 parseInt()를 기본으로 사용하면 된다.

둘 다 문자열을 숫자로 바꾸는 역할을 하지만, 반환 타입이 다르다.

---
### 왜 보통 parseInt()를 많이 사용할까?
우리가 대부분 원하는 것은
```
int num = 123;
```
같은 기본형(int)이다.

그래서
```
int num = Integer.parseInt("123");
```
처럼 바로 사용하는 경우가 가장 많다.

---
### 그럼 valueOf는 언제 쓸까?
컬렉션처럼 객체가 필요한 경우이다.

예를 들어
```
List<Integer> list = new ArrayList<>();

list.add(Integer.valueOf("100"));
```
처럼 Integer 객체가 필요할 때 사용한다.

하지만 사실 여기서도
```
list.add(Integer.parseInt("100"));
```
라고 해도 자바가 자동으로 Integer 객체로 바꿔준다(오토박싱).

그래서 실무에서도 문자열 → 숫자 변환은 대부분
```
Integer.parseInt()
```
를 많이 사용함.

---
- parseInt() → int 반환
- valueOf() → Integer 반환

이라는 차이만 추가로 이해하면 된다.