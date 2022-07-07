fun main(args: Array<String>) {

    runsimulation("김선달") { playerName, numBuildings ->
        val currentYear = 2022
        println("$numBuildings 채의 건물이 추가됨")
        "SimVillage 방문을 환영합니다. $playerName! (copyright $currentYear)"
    }

    //runsimulation("김선달", greetingFunction)
}

inline fun runsimulation(playerName: String, greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..100).shuffled().last()
    println(greetingFunction(playerName, numBuildings))
}