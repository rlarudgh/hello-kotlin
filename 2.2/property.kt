class Person (
    val name: String, // 읽기 전용 프로퍼티, (비공개)필드와 필드를 읽는 단순한 (공개) 게터를 만들어낸다.
    var isMarried: Boolean, // 쓸 수 있는 프로퍼티, (비공개) 필드, (공개) 게터, (공개) 세터를 만들어낸다.
    var age: Int
)

val person = Person("Bob", true, 20)

println(person.name)
// Bob

println(person.isMarried)
// true