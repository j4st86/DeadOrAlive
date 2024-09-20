package ru.deadoralive.extensions

import ru.deadoralive.R
import ru.deadoralive.data.CellData

fun getFirstCellText(cellCondition: CellData): Int {
    return when {
        cellCondition.isLife -> R.string.card_life_first
        cellCondition.isAlive -> R.string.card_alive_first
        else -> R.string.card_dead_first
    }
}

fun getSecondCellText(cellCondition: CellData): Int {
    return when {
        cellCondition.isLife -> R.string.card_life_second
        cellCondition.isAlive -> R.string.card_alive_second
        else -> R.string.card_dead_second
    }
}