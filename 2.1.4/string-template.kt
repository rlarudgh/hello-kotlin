fun main(args: Array<String>) {
    val name = if(args.size > 0) args[0] else "Kotlin"

    println("Hello, $name") // 인자로 무언가를 넘기면 Hello, 넘긴 값을 출력하고, 아무 인자도 없으면 Hello, Kotlin을 출력한다.
}

fun main2(args: Array<String>) {
    if(args.size > 0) {
        println("Hello, ${args[0]}!")
    }
}