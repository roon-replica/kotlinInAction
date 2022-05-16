package basic

// 코틀린에서는 변수의 타입 지정을 생략하는 경우가 많다고 함
val question = "we need to make world better"
val numberInt = 1
val numberDouble = 1.123

fun test() {
    // 초기화 식이 없으면 변수 타입에 대한 정보가 없기 때문에 타입을 지정해 줘야 한다.
    val unknown: Int

    // val: 변경 불가능한 참조, var: 변경 가능한 참조
    // 왜 참조라고 부르지. primitive한 값으로 설정해도 무조건 래핑하나?
    // 기본적으로 val로 선언하고 꼭 필요한 경우에만 var로 선언하라고 가이드함.
    val immutable = 1
    var mutable = 1
    mutable = 2

    val message: String
    val flag = 1
    message = if (flag == 1) {
        "1"
    } else {
        "2"
    }

    // arrayListOf의 참조를 담고있는 languages는 불변이지만, 참조가 가리키고 있는 객체의 내부 값은 당연히 변경 가능하다
    val languages = arrayListOf("java", "kotlin")
    languages.add("can be added")

    // var로 선언한 변수의 값은 바꿀 수 있지만, 한 번 정해진 타입은 못 바꾼다
    // 컴파일러는 변수 초기화 시점의 expression으로 변수의 타입을 추론해서 결정한다.
    var number = 21
    //number = "21"





}


