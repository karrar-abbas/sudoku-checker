fun main(){

    // region Valid Sudoku
    testSudokuCheckFunction(
        test = "Test 1 : should pass when 25 empty cells ",
        result = sudokuCheck(listOf(
            listOf("5", "3", "-", "6", "7", "-", "9", "1", "2"),
            listOf("6", "-", "2", "1", "-", "5", "3", "-", "8"),
            listOf("-", "9", "8", "-", "4", "2", "-", "6", "7"),
            listOf("8", "5", "9", "7", "-", "1", "-", "-", "3"),
            listOf("4", "-", "6", "8", "5", "3", "-", "9", "1"),
            listOf("7", "1", "-", "-", "2", "-", "8", "5", "6"),
            listOf("-", "-", "1", "5", "-", "7", "2", "8", "-"),
            listOf("2", "8", "-", "4", "1", "9", "6", "-", "5"),
            listOf("3", "-", "5", "-", "8", "6", "-", "-", "9")
        )),
        correctResult = true
    )
    testSudokuCheckFunction(
        test = "Test 2 : should pass when 19 empty cells ",
        result = sudokuCheck(listOf(
            listOf("5", "3", "-", "6", "7", "-", "9", "1", "2"),
            listOf("6", "-", "2", "1", "-", "5", "3", "4", "8"),
            listOf("-", "9", "8", "-", "4", "2", "5", "6", "7"),
            listOf("8", "5", "9", "7", "-", "1", "-", "2", "3"),
            listOf("4", "-", "6", "8", "5", "3", "-", "9", "1"),
            listOf("7", "1", "-", "9", "2", "-", "8", "5", "6"),
            listOf("-", "6", "1", "5", "-", "7", "2", "8", "-"),
            listOf("2", "8", "-", "4", "1", "9", "6", "-", "5"),
            listOf("3", "-", "5", "-", "8", "6", "-", "7", "9")
        )),
        correctResult = true
    )
    testSudokuCheckFunction(
        test = "Test 3 : should pass when 50 empty cells ",
        result = sudokuCheck(listOf(
            listOf("-", "3", "-", "-", "7", "-", "9", "-", "2"),
            listOf("-", "-", "2", "1", "-", "5", "-", "4", "-"),
            listOf("-", "9", "-", "-", "4", "-", "-", "6", "7"),
            listOf("8", "-", "-", "-", "-", "1", "-", "-", "3"),
            listOf("-", "-", "6", "-", "5", "-", "7", "-", "-"),
            listOf("7", "-", "-", "9", "-", "-", "-", "-", "6"),
            listOf("9", "-", "-", "-", "3", "-", "-", "8", "-"),
            listOf("-", "8", "-", "4", "-", "9", "-", "-", "-"),
            listOf("3", "-", "5", "-", "8", "-", "-", "7", "-")
        )),
        correctResult = true
    )
    testSudokuCheckFunction(
        test = "Test 4 : should pass when 31 empty cells",
        result = sudokuCheck(listOf(
            listOf("5", "-", "4", "6", "-", "-", "9", "-", "2"),
            listOf("6", "-", "-", "1", "9", "5", "-", "4", "-"),
            listOf("-", "9", "8", "3", "-", "-", "-", "6", "7"),
            listOf("8", "-", "9", "7", "6", "1", "-", "2", "3"),
            listOf("4", "-", "6", "8", "5", "3", "-", "9", "1"),
            listOf("7", "1", "-", "9", "2", "-", "-", "-", "6"),
            listOf("-", "6", "1", "5", "-", "-", "-", "8", "-"),
            listOf("2", "-", "-", "4", "1", "9", "6", "-", "5"),
            listOf("3", "-", "5", "-", "8", "6", "-", "7", "9")
        )),
        correctResult = true
    )

    testSudokuCheckFunction(
        test = "Test 5 : should pass when all cells are empty ",
        result = sudokuCheck(listOf(
            listOf("-", "-", "-", "-", "-", "-", "-", "-", "-"),
            listOf("-", "-", "-", "-", "-", "-", "-", "-", "-"),
            listOf("-", "-", "-", "-", "-", "-", "-", "-", "-"),
            listOf("-", "-", "-", "-", "-", "-", "-", "-", "-"),
            listOf("-", "-", "-", "-", "-", "-", "-", "-", "-"),
            listOf("-", "-", "-", "-", "-", "-", "-", "-", "-"),
            listOf("-", "-", "-", "-", "-", "-", "-", "-", "-"),
            listOf("-", "-", "-", "-", "-", "-", "-", "-", "-"),
            listOf("-", "-", "-", "-", "-", "-", "-", "-", "-")
        )),
        correctResult = true
    )

    // endregion

    // region Invalid Sudoku

    testSudokuCheckFunction(
        test = "Test 6 : should fail when cells have symbols ",
        result = sudokuCheck(listOf(
            listOf("5", "3", "-", "6", "7", "-", "9", "1", "@"),
            listOf("6", "-", "2", "1", "-", "5", "3", "-", "8"),
            listOf("-", "9", "8", "-", "4", "2", "-", "6", "7"),
            listOf("8", "5", "9", "7", "-", "1", "-", "-", "3"),
            listOf("4", "-", "6", "8", "5", "3", "-", "9", "1"),
            listOf("7", "1", "-", "-", "2", "-", "8", "5", "6"),
            listOf("-", "-", "1", "5", "-", "7", "2", "8", "-"),
            listOf("2", "8", "-", "4", "1", "9", "6", "-", "5"),
            listOf("3", "-", "5", "-", "8", "6", "-", "-", "9")
        )),
        correctResult = false
    )

    testSudokuCheckFunction(
        test = "Test 7 : should fail when cells have characters ",
        result = sudokuCheck(listOf(
            listOf("a", "b", "-", "6", "7", "-", "9", "1", "2"), // first two cells have a,b letters
            listOf("6", "-", "2", "1", "-", "5", "3", "-", "8"),
            listOf("-", "9", "8", "-", "4", "2", "-", "6", "7"),
            listOf("8", "5", "9", "7", "-", "1", "-", "-", "3"),
            listOf("4", "-", "6", "8", "5", "3", "-", "9", "1"),
            listOf("7", "1", "-", "-", "2", "-", "8", "5", "6"),
            listOf("-", "-", "1", "5", "-", "7", "2", "8", "-"),
            listOf("2", "8", "-", "4", "1", "9", "6", "-", "5"),
            listOf("3", "-", "5", "-", "8", "6", "-", "-", "9")
        )),
        correctResult = false
    )


    testSudokuCheckFunction(
        test = "Test 8 : should fail when repeated numbers in rows",
        result = sudokuCheck(listOf(
            listOf("5", "3", "-", "6", "7", "-", "9", "2", "2"), // number 2
            listOf("6", "-", "2", "1", "-", "5", "3", "-", "8"),
            listOf("-", "9", "8", "-", "4", "2", "-", "6", "7"),
            listOf("8", "5", "9", "7", "-", "1", "-", "-", "3"),
            listOf("4", "-", "6", "8", "5", "3", "-", "9", "1"),
            listOf("7", "1", "-", "-", "2", "-", "8", "5", "6"),
            listOf("-", "-", "1", "5", "-", "7", "2", "8", "-"),
            listOf("2", "8", "-", "4", "1", "9", "6", "-", "5"),
            listOf("3", "-", "5", "-", "8", "6", "-", "-", "9")
        )),
        correctResult = false
    )

    testSudokuCheckFunction(
        test = "Test 9 : should fail when repeated numbers in columns ",
        result = sudokuCheck(listOf(
            listOf("5", "3", "-", "6", "7", "-", "-", "1", "9"), // number 9
            listOf("6", "-", "2", "1", "-", "5", "3", "-", "8"),
            listOf("-", "9", "8", "-", "4", "2", "-", "6", "7"),
            listOf("8", "5", "9", "7", "-", "1", "-", "-", "3"),
            listOf("4", "-", "6", "8", "5", "3", "-", "9", "1"),
            listOf("7", "1", "-", "-", "2", "-", "8", "5", "6"),
            listOf("-", "-", "1", "5", "-", "7", "2", "8", "-"),
            listOf("2", "8", "-", "4", "1", "9", "6", "-", "5"),
            listOf("3", "-", "5", "-", "8", "6", "-", "-", "9") // number 9
        )),
        correctResult = false
    )

    testSudokuCheckFunction(
        test = "Test 10 : should fail when repeated number in 3x3 subgrid",
        result = sudokuCheck(listOf(
            listOf("5", "3", "-", "6", "7", "-", "9", "1", "2"), // number 2
            listOf("6", "-", "-", "1", "-", "5", "3", "2", "8"), // number 2
            listOf("-", "9", "8", "-", "4", "2", "-", "6", "7"),
            listOf("8", "5", "9", "7", "-", "1", "-", "-", "3"),
            listOf("4", "-", "6", "8", "5", "3", "-", "9", "1"),
            listOf("7", "1", "-", "-", "2", "-", "8", "5", "6"),
            listOf("-", "-", "1", "5", "-", "7", "2", "8", "-"),
            listOf("2", "8", "-", "4", "1", "9", "6", "-", "5"),
            listOf("3", "-", "5", "-", "8", "6", "-", "-", "9")
        )),
        correctResult = false
    )

    testSudokuCheckFunction(
        test = "Test 11 : should fail when empty cell have blank strings",
        result = sudokuCheck(listOf(
            listOf("5", "3", "-", "6", "7", "-", "9", "1", "2"),
            listOf("6", "-", "2", "1", "-", "5", "3", " ", "8"), // blank string
            listOf("-", "9", "8", "-", "4", "2", "-", "6", "7"),
            listOf("8", "5", "9", "7", "-", "1", "-", "-", "3"),
            listOf("4", "-", "6", "8", "5", "3", "-", "9", "1"),
            listOf("7", "1", "-", "-", "2", "-", "8", "5", "6"),
            listOf("-", "-", "1", "5", "-", "7", "2", "8", "-"),
            listOf("2", "8", "-", "4", "1", "9", "6", "-", "5"),
            listOf("3", "-", "5", "-", "8", "6", "-", "-", "9")
        )),
        correctResult = false
    )

    testSudokuCheckFunction(
        test = "Test 12 : should fail when size not NxN",
        result = sudokuCheck(listOf(
            listOf("6", "-", "2", "1", "-", "5", "3", "-", "8"),
            listOf("-", "9", "8", "-", "4", "2", "-", "6", "7"),
            listOf("8", "5", "9", "7", "-", "1", "-", "-", "3"),
            listOf("4", "-", "6", "8", "5", "3", "-", "9", "1"),
            listOf("7", "1", "-", "-", "2", "-", "8", "5", "6"),
            listOf("-", "-", "1", "5", "-", "7", "2", "8", "-"),
            listOf("2", "8", "-", "4", "1", "9", "6", "-", "5"),
            listOf("3", "-", "5", "-", "8", "6", "-", "-", "9")
        )),
        correctResult = false
     )

    // endregion
}


fun testSudokuCheckFunction(test:String, result:Boolean, correctResult:Boolean){

    if (result == correctResult)
        println("Success - $test")
    else
        println("Failed  - $test")
}