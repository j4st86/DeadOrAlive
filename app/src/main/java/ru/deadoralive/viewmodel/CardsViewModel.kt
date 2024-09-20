package ru.deadoralive.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import ru.deadoralive.data.CellData

class CardsViewModel : ViewModel() {
    val cells = mutableStateListOf<CellData>()

    private var continuousAliveCellsCount = 0
    private var continuousDeadCellsCount = 0
    private var lifeCellIndex: Int? = null

    fun addCell() {

        val isAlive = (0..1).random() == 1

        val newCell = if (isAlive) {
            continuousAliveCellsCount++
            continuousDeadCellsCount = 0

            if (continuousAliveCellsCount == 3) {
                continuousAliveCellsCount = 0
                continuousDeadCellsCount = 0
                lifeCellIndex = cells.size
                CellData(isAlive = true, isLife = true)
            } else {
                CellData(isAlive = true)
            }
        } else {
            continuousDeadCellsCount++
            continuousAliveCellsCount = 0

            if (lifeCellIndex != null && continuousDeadCellsCount == 3) {
                cells.removeAt(lifeCellIndex!!)
                lifeCellIndex = null
                continuousDeadCellsCount = 0
            }
            CellData(isAlive = false)
        }
        cells.add(newCell)
    }
}