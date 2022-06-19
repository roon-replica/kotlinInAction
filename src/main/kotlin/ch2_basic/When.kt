package ch2_basic

// enum을 import하면 더 간단히 쓸 수 있음!
// 근데 같은 파일에 있는데 import하니 어색하네..
import ch2_basic.Language.*;

// 코틀린에서 enum 쓰려면 "enum class" 라는 키워드를 사용
enum class Language(val value: String = "") {
    EN("영어"), KO("한국어"), JP("일본어"), UK("영국 영어")
}

// java에서처럼 이 함수를 block으로 감싸서 statement로 만들면 when 동작 안 함!
// 이런거보면 코틀린에 함수형 좀 많긴 하네 (이걸 함수형이라 불러도 되겠지?)
fun findNameByValue(value: String) = when (value) {
    EN.value, UK.value -> EN.name
    KO.value -> KO.name
    JP.value -> JP.name

    else -> {
        println("no coincide")
        EN.name     // block의 마지막 expression이 리턴된다고 함..
    }
}

fun checkLanguageSet(l1: Language, l2: Language) = when (setOf(l1, l2)) {
    setOf(EN, UK) -> "english"
    setOf(KO, JP) -> "asia"
    else -> "unknown"
}

// 인자없는 when -> 불필요한 객체 생성을 막는다고 함!
fun checkLanguageSetRefactor(l1: Language, l2: Language) = when {
    (l1 == EN && l2 == UK) -> "ENGLISH"
    (l1 == KO && l2 == JP) -> "ASIA"
    else -> "UNKNOWN"
}

fun main() {
    val languages = Language.values()
    for (lang in languages) {
        println("${lang.ordinal} ${lang.name} ${lang.value}")
    }

    println("${Language.EN.value} ===> ${findNameByValue(Language.EN.value)}")

    println(checkLanguageSet(KO, JP))
    println(checkLanguageSetRefactor(KO, JP))
}