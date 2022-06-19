package ch4_object.interFace

// 코틀린은 자바와 다르게 클래스가 기본적으로 final임 (단, interface, abstract class는 기본적으로 열려있음)
// open, final, abstract, override를 적절히 써서 상속, 오버라이드 설정 가능
// 프로퍼티, 메서드에도 open 명시해줘야 함..
interface Clickable {
    fun click()

    fun introduce() {
        println("like 'default' keyword in java, method implementation in interface is possible")
    }
}

open class Button : Clickable {   // 상속, 구현을 모두 클래스 이름 뒤에 ':"을 붙여서 처리
    // 메서드 재정의할 때 override 키워드를 필수로 붙여야 함
    override fun click() = println("button clicked")
}

// Button()이 super() 호출하는건데.. 좀 어색하네
class RadioButton : Button() {
    override fun click() = println("radio button clicked")
}


/* ============= 가시성 예제 ================== */
interface Speakable {
    fun introduce() = println("I am speakable")
}

open class SpeakableButton : Speakable {
    private fun whisper() = println("whisper")
    internal fun speakSmall() = println("speak small")      // TODO : internal의 가시성 범위가 모듈이라는데 모듈이 뭔지 정확히 잘 모름
    protected fun yell() = println("yelling")
    fun shout() = println("shouting")
}

internal fun SpeakableButton.makeNoise() {
    introduce()
    // whisper() // private -> 접근 불가
    speakSmall()
//    yell()  // protected도 접근 불가.. 하위 클래스에서만 볼 수 있으니(invisible). 코틀린의 'protected'는 자바의 'protected'와 다름
    shout()
}
/* ========================================== */

fun main() {
    val button = Button()
    button.introduce()
    button.click()

    val radioButton = RadioButton()
    radioButton.click()

    val speakableButton = SpeakableButton()
    speakableButton.makeNoise()
}