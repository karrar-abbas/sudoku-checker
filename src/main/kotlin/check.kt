fun main(){

    // region Valid Sudoku
    testSudokuCheckFunction(
        test = "Test 1 : when sudoku is valid ",
        result = sudokuCheck(listOf(
            listOf("1", "5", "-", "7", "9", "-", "4", "-", "8"),
            listOf("6", "-", "8", "1", "-", "3", "-", "2", "4"),
            listOf("7", "2", "-", "6", "8", "9", "5", "-", "1"),
            listOf("4", "-", "9", "3", "7", "-", "2", "8", "5"),
            listOf("8", "1", "-", "4", "-", "6", "3", "-", "9"),
            listOf("3", "-", "2", "-", "1", "8", "9", "-", "6"),
            listOf("-", "4", "1", "2", "-", "5", "-", "7", "3"),
            listOf("2", "3", "7", "-", "4", "1", "-", "8", "5"),
            listOf("5", "8", "6", "-", "3", "7", "1", "9", "-")
        )),
        correctResult = true
    )
    // endregion

    // region not Valid sudoku

    // repeated numbers in row,col
    testSudokuCheckFunction(
        test = "Test 2 : when sudoku is not valid",
        result = sudokuCheck(listOf(
            listOf("1", "5", "-", "7", "9", "-", "4", "-", "1"), // number one
            listOf("6", "-", "8", "1", "-", "3", "-", "2", "4"),
            listOf("7", "2", "-", "6", "8", "9", "5", "-", "1"), // number one
            listOf("4", "-", "9", "3", "7", "-", "2", "8", "5"),
            listOf("8", "1", "-", "4", "-", "6", "3", "-", "9"),
            listOf("3", "-", "2", "-", "1", "8", "9", "-", "6"),
            listOf("-", "4", "1", "2", "-", "5", "-", "7", "3"),
            listOf("2", "3", "7", "-", "4", "1", "-", "8", "5"),
            listOf("5", "8", "6", "-", "3", "7", "1", "9", "-")
        )),
        correctResult = false
    )
    // check number in 3x3 subgrid
    testSudokuCheckFunction(
    test = "Test 3 : when sudoku is not valid",
    result = sudokuCheck(listOf(
        listOf("1", "5", "-", "7", "9", "-", "4", "-", "8"),
        listOf("6", "-", "8", "1", "-", "3", "-", "2", "4"),
        listOf("7", "2", "-", "6", "8", "9", "5", "-", "1"),
        listOf("4", "-", "9", "3", "4", "-", "2", "8", "5"), // number 4
        listOf("8", "1", "-", "4", "-", "6",  "3", "-", "9"), // number 4
        listOf("3", "-", "2", "-", "1", "8", "9", "-", "6"),
        listOf("-", "4", "1", "2", "-", "5", "-", "7", "3"),
        listOf("2", "3", "7", "-", "4", "1", "-", "8", "5"),
        listOf("5", "8", "6", "-", "3", "7", "1", "9", "-")
    )),
    correctResult = false
)
    // empty cell have blank string not "-"
    testSudokuCheckFunction(
    test = "Test 4 : when sudoku is not valid",
    result = sudokuCheck(listOf(
        listOf("1", "5", "-", "7", "9", "-", "4", "-", "8"),
        listOf("6", " ", "8", "1", " ", "3", " ", "2", "4"), // blank strings
        listOf("7", "2", "-", "6", "8", "9", "5", "-", "1"),
        listOf("4", "-", "9", "3", "7", "-", "2", "8", "5"),
        listOf("8", "1", "-", "4", "-", "6", "3", "-", "9"),
        listOf("3", "-", "2", "-", "1", "8", "9", "-", "6"),
        listOf("-", "4", "1", "2", "-", "5", "-", "7", "3"),
        listOf("2", "3", "7", "-", "4", "1", "-", "8", "5"),
        listOf("5", "8", "6", "-", "3", "7", "1", "9", "-")
    )),
    correctResult = false
)

    // size not NxN
        testSudokuCheckFunction(
        test = "Test 5 : when sudoku is not valid",
        result = sudokuCheck(listOf(
            listOf("1", "5", "-", "7", "9", "-", "4", "-"), // 8 Columns
            listOf("6", "-", "8", "1", "-", "3", "-", "2", "4"), // 9 Columns
            listOf("7", "2", "-", "6", "8", "9", "5", "-", "1"),
            listOf("4", "-", "9", "3", "7", "-", "2", "8", "5"),
            listOf("-", "4", "1", "2", "-", "5", "-", "7", "3"),
            listOf("2", "3", "7", "-", "4", "1", "-", "8", "5"),
            listOf("5", "8", "6", "-", "3", "7", "1", "9", "-") // 7 Rows
        )),
        correctResult = false
    )
    // endregion
}


fun testSudokuCheckFunction(test:String, result:Boolean, correctResult:Boolean){
    // variables red,green are have cmd colors values for text formating
    val red = "\u001B[31m"
    val green = "\u001B[32m"
    // to rest cmd color to default color
    val reset = "\u001B[0m"

    if (result == correctResult)
        println("$green Success - $test  result :$result $reset")
    else
        println("$red Failed  - $test     result :$result $reset")

}