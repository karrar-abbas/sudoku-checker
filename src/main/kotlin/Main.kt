
fun main() {

}

fun sudokuCheck(sudokuGrid:List<List<String>>): Boolean {
    val subgrids= List(9){ mutableListOf<String>()}
    var subgridIndex: Int

    if (!checkDimensionsAndItems(sudokuGrid)) return false

     sudokuGrid.forEachIndexed { rowIndex,row ->
        row.forEachIndexed { columnIndex, item ->

            if(row.count {it ==item && item in "1".."9" } >1
                && sudokuGrid.drop(rowIndex).all{
                    it[columnIndex] ==item && item in "1".."9" }) return false

            else {
                subgridIndex = (rowIndex / 3) * 3 + (columnIndex / 3)
                if (item != "-" && subgrids[subgridIndex].contains(item)) return false
                else if (item != "-") subgrids[subgridIndex].add(item)
            }
        }
     }
    return true
}

fun checkDimensionsAndItems(grid:List<List<String>>):Boolean{
    return grid.size ==9 &&
            grid.all { row->row.size ==9} &&
            grid.all { row -> row.all {
                item -> item in "1".."9" || item =="-" } }
}
