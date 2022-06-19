package ch2_basic

import java.util.TreeMap

fun fizzBuzz(num: Int) = when {
    num % 15 == 0 -> "FizzBuzz"
    num % 3 == 0 -> "Fizz"
    num % 5 == 0 -> "Buzz"
    else -> "$num"
}

// while : java와 동일
fun iterateWhile(list: List<Int>) {
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
    println()
}

// for : 코틀린에는 for(int i=0;i<N;i++) 없다고 함.
//       대신 범위 이용
fun <T> iterateFor(list: List<T>) {
    for (num in 1..15) {
        println(fizzBuzz(num))
    }
    println()

    for (num in 15 downTo 1 step 2) {   // 거꾸로
        println(fizzBuzz(num))
    }
}

fun iterateMap(map: TreeMap<String, Set<Char>>) {
    for (ch in 'A'..'Z') {
        when {
            ch < 'M' -> {
                val frontAlphabet = "front alphabet"
                map[frontAlphabet] = map.getOrDefault("front alphabet", emptySet())

                if (map[frontAlphabet] is Set) {
                }

                val newSet = map[frontAlphabet]
                // TODO : set에 원소 추가하고 map에 put하고 싶은데.. 왜 set을 가져와도 add 메서드가 없지..
            }
        }
    }

    println()
}

fun iterateMap2(map: TreeMap<String, String>) {
    for ((key, value) in map) {
        println("${key} ${value}")
    }
    println()
}

fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    iterateWhile(list)
    iterateFor(list)

    //TODO map 초기화를 java걸로 할지 kotlin걸로 해야하는지.. 좀 어색하다..
    val map = TreeMap<String, Set<Char>>()
    iterateMap(map)

    val map2 = TreeMap<String, String>()
    map2.put("1", "a")
    iterateMap2(map2)

}