val String.numVowels
    get() = count {"aeiouy".contains(it)}

fun String.addEnthusiasm(amount: Int = 1) = this + "!".repeat(amount)

fun <T>T.easyPrint(): T {
    println(this)
    return this
}

infix fun String?.printWithDefault(default: String) = print(this ?: default)

fun main(args: Array<String>) {
//    println("마드리갈이 그 건물에서 나왔습니다.".addEnthusiasm(10))
    "마드리갈이 그 건물에서 나왔습니다".easyPrint().addEnthusiasm().easyPrint()
    33.easyPrint()
    "how many vowels?".numVowels.easyPrint()

    val nullableString: String? = null
    nullableString.printWithDefault("기본 문자열")
    nullableString printWithDefault "default string"
}


