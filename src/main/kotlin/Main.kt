import kotlin.math.sqrt

fun main() {

}

fun sudokuCheck(sudokuGrid:List<List<String>>): Boolean {
    val subgridSize = sqrt(sudokuGrid.size.toDouble()).toInt()
    if (!checkDimensionsAndItems(sudokuGrid,subgridSize)) return false

    val subgridsItems= List(sudokuGrid.size){ mutableListOf<String>()} //change from 9
    var subgridIndex: Int

     sudokuGrid.forEachIndexed { rowIndex,row ->
        row.forEachIndexed { columnIndex, item ->

            when(sudokuGrid.size) {
                4 -> { if (!checkFourOrNineRowsAndColumns(sudokuGrid,row,rowIndex,columnIndex,item,"4")) return false }
                9 ->{ if (!checkFourOrNineRowsAndColumns(sudokuGrid,row,rowIndex,columnIndex,item,"9")) return false }
                16 -> { if(!checkSixteenBoardRowsAndColumns(sudokuGrid,row,rowIndex,columnIndex,item)) return false } }

            subgridIndex = (rowIndex /subgridSize) *subgridSize  + (columnIndex / subgridSize)
            if (item != "-" && subgridsItems[subgridIndex].contains(item)) return false
            else if (item != "-") subgridsItems[subgridIndex].add(item)
        }
     }
    return true
}

fun checkDimensionsAndItems(grid:List<List<String>>,subgridSize:Int):Boolean{

    if(subgridSize * subgridSize !=grid.size || grid.any { row->row.size != grid.size}) return false

    when(grid.size) {
        4 -> {return grid.all { row -> row.all { item -> item in "1".."4" || item =="-" } }}
        9 -> {return grid.all { row -> row.all { item -> item in "1".."9" || item =="-" } }}
        16 -> {return grid.all { row -> row.all { item -> item in "1".."9" || item in "A".."G" || item =="-" } }}
        else -> return false
    }

}
fun checkFourOrNineRowsAndColumns(sudokuGrid: List<List<String>>, row:List<String>, rowIndex:Int,columnIndex:Int, item:String, maxNumber:String):Boolean{
    if(row.count {it ==item && item in "1"..maxNumber } >1 ) return false
    if(sudokuGrid.drop(rowIndex+1).any{ it[columnIndex] ==item && item in "1"..maxNumber }) return false
    return true
}
fun checkSixteenBoardRowsAndColumns(sudokuGrid: List<List<String>>, row:List<String>, rowIndex:Int,columnIndex:Int, item:String):Boolean{
    if(row.count {it ==item && (item in "1".."9" || item in "A".."G") } >1 ) return false
    if(sudokuGrid.drop(rowIndex+1).any{ it[columnIndex] ==item && (item in "1".."9" || item in "A".."G" )}) return false
    return true
}

