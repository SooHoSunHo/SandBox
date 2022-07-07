fun main(args: Array<String>) {

    runSimulation()
}

fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("최석용"))
    println(greetingFunction("최석용"))
}

fun configureGreetingFunction(): (String) -> String {
    val structureType = "병원"
    var numBuildings = 5
    return {
        playName: String ->
        val currentYear = 2022
        numBuildings += 1
        println("$numBuildings 채의 $structureType 이 추가됨")
        "SimVillage 방문을 환영합니다. $playName! (copyright $currentYear)"
    }
}