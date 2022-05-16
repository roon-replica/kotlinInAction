package basic

fun main(args: Array<String>) {
    // 함수를 선언할 때 fun 키워드를 사용한다.
    // 파라미터 이름 뒤에 그 파라미터의 타입을 쓴다.
    // 꼭 클래스 안에서 함수를 선언할 필요 없음
    // System.out.println 대신 println이라고 씀. 자바 라이브러리를 한 번 wrap했다고 함
    println("hello")
    System.out.println("hello")

    println(max(1, 2))
}

// 결과를 반환하는 함수는 파라미터 목록 뒤에 반환 타입을 명시한다.
// 반환 타입은 콜론으로 구분한다.
fun max(a: Int, b: Int): Int {
//    return Math.max(a,b)
//    return a.coerceAtLeast(b)
    return maxOf(a, b)
}

// expression이 함수 body의 전부라면 중괄호는 필요없다
fun max2(a: Int, b: Int): Int = maxOf(a, b)

// 코틀린에서 if는 expression. 자바에서 if는 statement
fun max3(a: Int, b: Int): Int = if (a > b) a else b

// 함수 body가 식(expression)이면 컴파일러가 식의 결과 타입을 함수 반환 타입으로 정해줌. ( 타입 추론)
fun max4(a:Int, b:Int) = if (a>b) a else b




