import kotlin.math.absoluteValue

fun main() {

    var firstMatch = FootballMatch(2, 6)
    println("Создадим объект класса Football match:")
    println(firstMatch)

    println("___________________________")

    println("Изменим значения очков для команд при помощи заданной функции:")
    print("Введите кол-во очков первой команды: ")
    val firstTeamScore = readLine()?.toInt() ?: 0
    print("Введите кол-во очков второй команды: ")
    val secondTeamScore = readLine()?.toInt() ?: 0
    firstMatch.setMatchScore(firstTeamScore, secondTeamScore)
    println(firstMatch)

    println("___________________________")

    println("Создадим массив из 10ти матчей:")
    var arrayOfMatches = arrayOfNulls<FootballMatch>(10)

    for (index in arrayOfMatches.indices) {
        arrayOfMatches[index] = FootballMatch((0..5).random(), (0..5).random())
        println(arrayOfMatches[index])
    }

    println("___________________________")

    println("Удалим матчи с одинаковыми очками команд:")

    var listOfMatches = arrayOfMatches.toMutableList()
    val iter = listOfMatches.iterator()

    while (iter.hasNext()) {
        val value = iter.next()
        if (value?.firstTeamScore == value?.secondTeamScore)
            iter.remove()
    }

    listOfMatches.forEach { e ->
        println(e)
    }

    println("___________________________")

    var max = 0

    listOfMatches.forEach { e ->
        var temp = (e!!.firstTeamScore - e!!.secondTeamScore).absoluteValue
        if (temp > max)
            max = temp
    }
    println("Максимальный разрыв в очках: $max")

    var setOfMatches = HashSet<FootballMatch>()

    println("Множество Set с максимальным разрывом в очках:")

    listOfMatches.forEach { e ->
        if (((e!!.firstTeamScore - e!!.secondTeamScore).absoluteValue) == max) {
            setOfMatches.add(e)
            println(e)
        }

    }


}