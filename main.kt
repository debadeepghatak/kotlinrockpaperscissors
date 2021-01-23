fun main(arg: Array<String>) {
    val options = arrayOf("ROCK", "PAPER", "SCISSORS", "LIZARD", "SPOCK")
    val computerChoice = getComputerChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, computerChoice)

}

fun getComputerChoice(optionsParam: Array<String>) =
    optionsParam[(Math.random()* optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""

    while (!isValidChoice) {
        print("Please select any of the following")
        for (item in optionsParam) print( " $item")
        println(".")
        var userInput = readLine()

        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
    }
    return userChoice
}

fun printResult(userChoice: String, computerChoice: String) {
    val result: String

    if (userChoice == computerChoice) result = "Tie!"

    else if ((userChoice == "SCISSORS" && computerChoice == "PAPER") ||
        (userChoice == "PAPER" && computerChoice == "ROCK") ||
        (userChoice == "ROCK" && computerChoice == "LIZARD") ||
        (userChoice == "LIZARD" && computerChoice == "SPOCK") ||
        (userChoice == "SPOCK" && computerChoice == "SCISSORS") ||
        (userChoice == "SCISSORS" && computerChoice == "LIZARD") ||
        (userChoice == "LIZARD" && computerChoice == "PAPER") ||
        (userChoice == "PAPER" && computerChoice == "SPOCK") ||
        (userChoice == "SPOCK" && computerChoice == "ROCK") ||
        (userChoice == "ROCK" && computerChoice == "SCISSORS")) result = "You Win!"

    else result = "You Lose!"

    println("You choose $userChoice , I chose $computerChoice . $result")
}


