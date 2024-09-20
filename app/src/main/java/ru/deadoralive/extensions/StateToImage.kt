package ru.deadoralive.extensions

import androidx.compose.ui.graphics.Brush
import ru.deadoralive.R
import ru.deadoralive.data.CellData
import ru.deadoralive.ui.theme.AliveIconGradient
import ru.deadoralive.ui.theme.DeadIconGradient
import ru.deadoralive.ui.theme.LifeIconGradient

fun getCellImage(cellCondition: CellData): Int {
    return when {
        cellCondition.isLife -> R.drawable.ic_life
        cellCondition.isAlive -> R.drawable.ic_alive
        else -> R.drawable.ic_dead
    }
}

fun getCellImageBgColor(cellCondition: CellData): Brush {
    return when {
        cellCondition.isLife -> LifeIconGradient
        cellCondition.isAlive -> AliveIconGradient
        else -> DeadIconGradient
    }
}