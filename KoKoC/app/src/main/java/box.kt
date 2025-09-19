// Generic-класс Box
class Box<T>(private val value: T) {

    fun getValue(): T = value

    fun <R> map(transform: (T) -> R): Box<R> {
        return Box(transform(value))
    }
}

fun main() {
    // Пример 1: Int -> String
    val intBox = Box(42)
    val stringBox = intBox.map { it.toString() }
    println("Int -> String: ${stringBox.getValue()} (type: ${stringBox.getValue()::class.simpleName})")

    // Пример 2: Int -> Boolean
    val boolBox = intBox.map { it > 0 }
    println("Int -> Boolean: ${boolBox.getValue()} (type: ${boolBox.getValue()::class.simpleName})")
}
