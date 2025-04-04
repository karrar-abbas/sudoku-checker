fun main(){

    // region Valid Sudoku
    testSudokuCheckFunction(
        test = "Test 1 : should pass when 16-board ",
        result = sudokuCheck(listOf(
            listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "-", "D", "E", "F", "G"),
            listOf("5", "6", "7", "8", "-", "A", "B", "C", "D", "E", "F", "G", "1", "2", "3", "4"),
            listOf("9", "A", "B", "C", "D", "E", "F", "G", "1", "-", "3", "4", "5", "6", "7", "8"),
            listOf("D", "E", "F", "G", "1", "2", "-", "4", "-", "6", "7", "8", "9", "A", "B", "C"),
            listOf("-", "3", "4", "1", "6", "-", "8", "5", "A", "B", "C", "9", "E", "F", "G", "D"),
            listOf("6", "7", "8", "-", "A", "B", "C", "9", "E", "F", "G", "D", "2", "3", "4", "1"),
            listOf("A", "B", "C", "9", "E", "F", "G", "D", "-", "3", "4", "1", "-", "7", "8", "5"),
            listOf("E", "F", "G", "D", "2", "3", "4", "1", "6", "-", "8", "5", "A", "-", "C", "9"),
            listOf("3", "4", "1", "2", "7", "8", "5", "6", "B", "C", "9", "A", "F", "G", "D", "E"),
            listOf("7", "8", "5", "6", "B", "C", "9", "-", "F", "G", "D", "E", "3", "4", "1", "2"),
            listOf("B", "C", "9", "A", "F", "G", "-", "E", "3", "4", "1", "2", "7", "8", "5", "6"),
            listOf("F", "G", "D", "E", "3", "4", "1", "2", "7", "8", "5", "6", "B", "C", "9", "A"),
            listOf("4", "1", "2", "3", "8", "5", "6", "7", "C", "9", "A", "B", "G", "D", "E", "F"),
            listOf("8", "5", "6", "7", "C", "9", "A", "B", "G", "D", "E", "F", "4", "1", "-", "3"),
            listOf("C", "9", "A", "B", "G", "D", "E", "F", "4", "1", "2", "3", "8", "5", "6", "7"),
            listOf("G", "D", "E", "-", "4", "1", "2", "3", "8", "5", "6", "7", "C", "9", "A", "B")

        )),
        correctResult = true
    )
    testSudokuCheckFunction(
        test = "Test 2 : should pass when 4-board ",
        result = sudokuCheck(listOf(
            listOf("2", "-", "-", "-"),
            listOf("-", "1", "-", "3"),
            listOf("4", "-", "-", "-"),
            listOf("-", "-", "2", "-")
        )),
        correctResult = true
    )
    testSudokuCheckFunction(
        test = "Test 3 : should pass when 9-board with 25 empty cells ",
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
        test = "Test 4 : should pass when 9-board with 19 empty cells ",
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
        test = "Test 5 : should pass when 9-board with 50 empty cells ",
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
        test = "Test 6 : should pass when 9-board with 31 empty cells",
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
        test = "Test 7 : should pass when 9-board with all cells are empty ",
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
        test = "Test 8 : should fail when 9-board with cells have symbols ",
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
        test = "Test 9 : should fail when 9-board with cells have characters ",
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
        test = "Test 10 : should fail when 9-board with repeated numbers in rows",
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
        test = "Test 11 : should fail when 9-board with repeated  numbers in columns ",
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
        test = "Test 12 : should fail when 9-board with repeated number in 3x3 subgrid",
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
        test = "Test 13 : should fail when 9-board with blank string",
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
        test = "Test 14 : should fail when 16-board with repeated in row",
        result = sudokuCheck(listOf(
            listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "-", "D", "E", "G", "G"), // G letter
            listOf("5", "6", "7", "8", "-", "A", "B", "C", "D", "E", "F", "G", "1", "2", "3", "4"),
            listOf("9", "A", "B", "C", "D", "E", "F", "G", "1", "-", "3", "4", "5", "6", "7", "8"),
            listOf("D", "E", "F", "G", "1", "2", "-", "4", "-", "6", "7", "8", "9", "A", "B", "C"),
            listOf("-", "3", "4", "1", "6", "-", "8", "5", "A", "B", "C", "9", "E", "F", "G", "D"),
            listOf("6", "7", "8", "-", "A", "B", "C", "9", "E", "F", "G", "D", "2", "3", "4", "1"),
            listOf("A", "B", "C", "9", "E", "F", "G", "D", "-", "3", "4", "1", "-", "7", "8", "5"),
            listOf("E", "F", "G", "D", "2", "3", "4", "1", "6", "-", "8", "5", "A", "-", "C", "9"),
            listOf("3", "4", "1", "2", "7", "8", "5", "6", "B", "C", "9", "A", "F", "G", "D", "E"),
            listOf("7", "8", "5", "6", "B", "C", "9", "-", "F", "G", "D", "E", "3", "4", "1", "2"),
            listOf("B", "C", "9", "A", "F", "G", "-", "E", "3", "4", "1", "2", "7", "8", "5", "6"),
            listOf("F", "G", "D", "E", "3", "4", "1", "2", "7", "8", "5", "6", "B", "C", "9", "A"),
            listOf("4", "1", "2", "3", "8", "5", "6", "7", "C", "9", "A", "B", "G", "D", "E", "F"),
            listOf("8", "5", "6", "7", "C", "9", "A", "B", "G", "D", "E", "F", "4", "1", "-", "3"),
            listOf("C", "9", "A", "B", "G", "D", "E", "F", "4", "1", "2", "3", "8", "5", "6", "7"),
            listOf("G", "D", "E", "-", "4", "1", "2", "3", "8", "5", "6", "7", "C", "9", "A", "B")

        )),
        correctResult = false
    )
    testSudokuCheckFunction(
        test = "Test 15 : should fail when 16-board with repeated in column",
        result = sudokuCheck(listOf(
            listOf("1", "2", "3", "-", "5", "6", "7", "8", "9", "A", "B", "-", "D", "E", "F", "4"), // 4 number
            listOf("5", "6", "7", "8", "-", "A", "B", "C", "D", "E", "F", "G", "1", "2", "3", "4"), // 4 number
            listOf("9", "A", "B", "C", "D", "E", "F", "G", "1", "-", "3", "4", "5", "6", "7", "8"),
            listOf("D", "E", "F", "G", "1", "2", "-", "4", "-", "6", "7", "8", "9", "A", "B", "C"),
            listOf("-", "3", "4", "1", "6", "-", "8", "5", "A", "B", "C", "9", "E", "F", "G", "D"),
            listOf("6", "7", "8", "-", "A", "B", "C", "9", "E", "F", "G", "D", "2", "3", "4", "1"),
            listOf("A", "B", "C", "9", "E", "F", "G", "D", "-", "3", "4", "1", "-", "7", "8", "5"),
            listOf("E", "F", "G", "D", "2", "3", "4", "1", "6", "-", "8", "5", "A", "-", "C", "9"),
            listOf("3", "4", "1", "2", "7", "8", "5", "6", "B", "C", "9", "A", "F", "G", "D", "E"),
            listOf("7", "8", "5", "6", "B", "C", "9", "-", "F", "G", "D", "E", "3", "4", "1", "2"),
            listOf("B", "C", "9", "A", "F", "G", "-", "E", "3", "4", "1", "2", "7", "8", "5", "6"),
            listOf("F", "G", "D", "E", "3", "4", "1", "2", "7", "8", "5", "6", "B", "C", "9", "A"),
            listOf("4", "1", "2", "3", "8", "5", "6", "7", "C", "9", "A", "B", "G", "D", "E", "F"),
            listOf("8", "5", "6", "7", "C", "9", "A", "B", "G", "D", "E", "F", "4", "1", "-", "3"),
            listOf("C", "9", "A", "B", "G", "D", "E", "F", "4", "1", "2", "3", "8", "5", "6", "7"),
            listOf("G", "D", "E", "-", "4", "1", "2", "3", "8", "5", "6", "7", "C", "9", "A", "B")

        )),
        correctResult = false
    )

    testSudokuCheckFunction(
        test = "Test 16 : should fail when 16-board with repeated in subgrid ",
        result = sudokuCheck(listOf(
            listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "-", "D", "E", "F", "G"), // F letter
            listOf("5", "6", "7", "8", "-", "A", "B", "C", "D", "E", "-", "G", "1", "2", "F", "4"), // F letter
            listOf("9", "A", "B", "C", "D", "E", "F", "G", "1", "-", "3", "4", "5", "6", "7", "8"),
            listOf("D", "E", "F", "G", "1", "2", "-", "4", "-", "6", "7", "8", "9", "A", "B", "C"),
            listOf("-", "3", "4", "1", "6", "-", "8", "5", "A", "B", "C", "9", "E", "F", "G", "D"),
            listOf("6", "7", "8", "-", "A", "B", "C", "9", "E", "F", "G", "D", "2", "3", "4", "1"),
            listOf("A", "B", "C", "9", "E", "F", "G", "D", "-", "3", "4", "1", "-", "7", "8", "5"),
            listOf("E", "F", "G", "D", "2", "3", "4", "1", "6", "-", "8", "5", "A", "-", "C", "9"),
            listOf("3", "4", "1", "2", "7", "8", "5", "6", "B", "C", "9", "A", "F", "G", "D", "E"),
            listOf("7", "8", "5", "6", "B", "C", "9", "-", "F", "G", "D", "E", "3", "4", "1", "2"),
            listOf("B", "C", "9", "A", "F", "G", "-", "E", "3", "4", "1", "2", "7", "8", "5", "6"),
            listOf("F", "G", "D", "E", "3", "4", "1", "2", "7", "8", "5", "6", "B", "C", "9", "A"),
            listOf("4", "1", "2", "3", "8", "5", "6", "7", "C", "9", "A", "B", "G", "D", "E", "F"),
            listOf("8", "5", "6", "7", "C", "9", "A", "B", "G", "D", "E", "F", "4", "1", "-", "3"),
            listOf("C", "9", "A", "B", "G", "D", "E", "F", "4", "1", "2", "3", "8", "5", "6", "7"),
            listOf("G", "D", "E", "-", "4", "1", "2", "3", "8", "5", "6", "7", "C", "9", "A", "B")

        )),
        correctResult = false
    )
    testSudokuCheckFunction(
        test = "Test 17 : should fail when 4-board with bigger than 4 ",
        result = sudokuCheck(listOf(
            listOf("-", "-", "-", "-"),
            listOf("-", "-", "-", "3"),
            listOf("-", "-", "-", "9"), // number 9
            listOf("-", "-", "-", "-")
        )),
        correctResult = false
    )
    testSudokuCheckFunction(
        test = "Test 2 : should pass when 4-board with repeated in row ",
        result = sudokuCheck(listOf(
            listOf("2", "-", "-", "-"),
            listOf("3", "1", "-", "3"), // 3 number
            listOf("4", "-", "-", "-"),
            listOf("-", "-", "2", "-")
        )),
        correctResult = false
    )
    testSudokuCheckFunction(
        test = "Test 2 : should pass when 4-board with repeated in column ",
        result = sudokuCheck(listOf(
            listOf("2", "-", "-", "-"),
            listOf("-", "1", "-", "3"),// 1 number
            listOf("4", "1", "-", "-"), // 1 number
            listOf("-", "-", "2", "-")
        )),
        correctResult = false
    )
    testSudokuCheckFunction(
        test = "Test 2 : should pass when 4-board with repeated in subgrid ",
        result = sudokuCheck(listOf(
            listOf("2", "-", "3", "-"), // 3 number
            listOf("-", "1", "-", "3"), // 3 number
            listOf("4", "-", "-", "-"),
            listOf("-", "-", "2", "-")
        )),
        correctResult = false
    )
    testSudokuCheckFunction(
        test = "Test 18 : should fail when size not NxN",
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