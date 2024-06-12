val question = "삶, 우주, 그리고 모든 것에 대한 궁극적인 질문"

val answer = 42
// 위에는 타입 명시를 생략하였지만, 원한다면 타입 명시도 가능. 
/* val answer: Int = 42 */

val yearsToCompute = 7.5e6 // 7.5 * 10^6 = 75000000.0

// 초기화 식을 사용하지 않고 변수를 선언하려면 타입을 무조건 선언해줘야한다.
val a: Int
a = 1

/*
변경 가능한 변수
var(variable)
Java에서 일반 변수에 해당한다.

변경 불가능한 변수
val(value)
변경 불가능한 참조를 저장하는 변수
초기화하고 나면 재대입이 불가능하다.
Java에서 final 변수와 같은 개념이다.
정확히 한번만 초기화해야한다.
*/

val message: String

// 해당 형식처럼 조건에 따라 val 값을 여러가지 경우의 수로 초기화할수도 있다
if(canPerformOperation()) {
    message = "Success"
}
else {
    message = "Failed"
}

/*
val 변수는 참조 자체가 불변이라도 그 참조가 가리키는 객체의 내부 값은 변경될 수 있다.
밑 코드도 정상작동되는 코드이다.
*/
val language = arrayListOf("Java")
language.add("TypeScript")

/*
var가 변경 가능한 변수라 그래도 타입이 mismatch면 변경이 안된다.
타입을 변경하고 싶으면 강제형변환을 이용하여 변경하면 된다.
*/
var answer = 42;
answer = "이런식으로 하면 에러 발생" // Error: type mismatch