package ch2_basic

import java.util.* // 자바 표준 라이브러리도 사용 가능!

class Rectangle(
    val width: Int,
    val height: Int
) {
    val isSquare: Boolean           // 커스텀 접근자 문법 어색하다... 함수형이라 생각하면 되는건가?? isSquare 프로퍼티에 get 함수를 저장했다고 보는..
        get() = width == height
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}

fun main() {
    val rectangle = Rectangle(2, 2)
    println(rectangle.isSquare)

    val rectangleRandom = createRandomRectangle()
    println(rectangleRandom)
}