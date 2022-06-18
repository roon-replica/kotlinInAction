/*
* https://kotlinlang.org/docs/classes.html#
* */

package ch2_basic

// 자바에서는 데이터를 필드에 저장, 접근제어자와 필드를 묶어 property라고 부름
// 코틀린은 property를 언어 기본 기능으로 제공한다고 함
// -> TODO: 값을 저장하는 비공개 필드가 따로 제공된다는 것 같은데? 어떻게 확인함?
class PersonVO(
    val name: String,
    var age: Int,
    var hasLover: Boolean
)


fun main() {
    val personVo = PersonVO("lee", 20, false)
    println("${personVo.age} ${personVo.name} ${personVo.hasLover}")

}
