fun main(){

    // region Valid Sudoku
    testSudokuCheckFunction(
        test = "Test 1 : 23 empty cells.sudoku is valid ",
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
    testSudokuCheckFunction(
        test = "Test 2 : 19 empty cells.sudoku is valid ",
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
        test = "Test 3 : 50 empty cells.sudoku is valid ",
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
        test = "Test 4 : 31 empty cells.sudoku is valid",
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

    // endregion

    // region Invalid Sudoku

    testSudokuCheckFunction(
        test = "Test 5 : cells have symbols,sudoku is invalid ",
        result = sudokuCheck(listOf(
            listOf("1", "5", "-", "7", "9", "-", "4", "-", "@"), // last cell have @ symbol
            listOf("6", "-", "8", "1", "-", "3", "-", "2", "4"),
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

    testSudokuCheckFunction(
        test = "Test 6 :cells have characters.sudoku is invalid ",
        result = sudokuCheck(listOf(
            listOf("a", "b", "-", "7", "9", "-", "4", "-", "8"), // first two cells have a,b letters
            listOf("6", "-", "8", "1", "-", "3", "-", "2", "4"),
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

    testSudokuCheckFunction(
        test = "Test 7 :all cells are empty.sudoku is invalid ",
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
        correctResult = false
    )

    testSudokuCheckFunction(
        test = "Test 8 :repeated numbers in rows.sudoku is invalid",
        result = sudokuCheck(listOf(
            listOf("1", "5", "-", "7", "9", "-", "4", "-", "1"), // number one
            listOf("6", "-", "8", "1", "-", "3", "-", "2", "4"),
            listOf("7", "2", "-", "6", "8", "9", "5", "-", "8"), // number 8
            listOf("4", "-", "9", "3", "7", "-", "2", "8", "5"),
            listOf("8", "1", "-", "4", "-", "6", "3", "-", "9"),
            listOf("3", "-", "2", "-", "1", "8", "9", "-", "6"),
            listOf("-", "4", "1", "2", "-", "5", "-", "7", "3"),
            listOf("2", "3", "7", "-", "4", "1", "-", "8", "5"),
            listOf("5", "8", "6", "-", "3", "7", "1", "9", "-")
        )),
        correctResult = false
    )

    testSudokuCheckFunction(
        test = "Test 9 :repeated numbers in columns.sudoku is invalid ",
        result = sudokuCheck(listOf(
            listOf("1", "5", "-", "7", "9", "-", "4", "-", "8"),
            listOf("6", "-", "8", "1", "-", "3", "-", "2", "4"),
            listOf("7", "2", "-", "6", "8", "9", "5", "-", "1"),
            listOf("4", "-", "9", "3", "7", "-", "2", "8", "5"),
            listOf("8", "1", "-", "4", "-", "6", "3", "-", "9"),
            listOf("3", "-", "2", "-", "1", "8", "9", "-", "6"),
            listOf("-", "4", "1", "2", "-", "5", "-", "7", "8"), // number 8
            listOf("2", "3", "7", "-", "4", "1", "-", "8", "5"),
            listOf("5", "8", "6", "-", "3", "7", "1", "9", "-")
        )),
        correctResult = false
    )

    testSudokuCheckFunction(
        test = "Test 10 :check number in 3x3 subgrid.sudoku is invalid",
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

    testSudokuCheckFunction(
        test = "Test 11 :empty cell have blank strings.sudoku is invalid",
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

    testSudokuCheckFunction(
        test = "Test 12 :size not NxN.sudoku is invalid",
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

    if (result == correctResult)
        println("Success - $test  result :$result")
    else
        println("Failed  - $test     result :$result")
}