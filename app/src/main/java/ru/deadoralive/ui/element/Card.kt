package ru.deadoralive.ui.element

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import ru.deadoralive.data.CellData
import ru.deadoralive.extensions.getFirstCellText
import ru.deadoralive.extensions.getSecondCellText
import ru.deadoralive.ui.base.CardImage
import ru.deadoralive.ui.theme.CardBackgroundColor
import ru.deadoralive.ui.theme.CardTextColor
import ru.deadoralive.ui.theme.DeadOrAliveTheme
import ru.deadoralive.ui.theme.boxCornerShape
import ru.deadoralive.ui.theme.paddingSmall
import ru.deadoralive.ui.theme.textSize

@Composable
fun Card(cell: CellData) {
    val cardTextFirst = getFirstCellText(cell)
    val cardTextSecond = getSecondCellText(cell)

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = CardBackgroundColor,
                shape = RoundedCornerShape(boxCornerShape)
            )
    ) {
        Row(
            modifier = Modifier
                .padding(start = paddingSmall)
                .padding(vertical = paddingSmall)
        ) {
            CardImage(cell)
            Column(
                modifier = Modifier
                    .padding(start = paddingSmall)
            ) {
                Text(
                    text = stringResource(cardTextFirst),
                    fontSize = textSize,
                    color = CardTextColor
                )
                Text(
                    text = stringResource(cardTextSecond),
                    fontSize = textSize,
                    color = CardTextColor
                )
            }
        }
    }
}

@Preview(showBackground = false)
@Composable
fun CardPreview() {
    DeadOrAliveTheme {
        Card(cell = CellData(isLife = true, isAlive = true))
    }
}