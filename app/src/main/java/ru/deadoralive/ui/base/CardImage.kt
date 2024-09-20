package ru.deadoralive.ui.base

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import ru.deadoralive.data.CellData
import ru.deadoralive.extensions.getCellImage
import ru.deadoralive.extensions.getCellImageBgColor
import ru.deadoralive.ui.theme.DeadOrAliveTheme
import ru.deadoralive.ui.theme.imageBoxSize

@Composable
fun CardImage(cell: CellData) {
    val cellIcon = getCellImage(cell)
    val cellIconBgColor = getCellImageBgColor(cell)

    Box(
        modifier = Modifier
            .size(imageBoxSize)
            .clip(CircleShape)
            .background(cellIconBgColor)
    ) {
        Image(
            painter = painterResource(cellIcon),
            contentDescription = "Cell Image",
            modifier = Modifier
                .fillMaxSize()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CardImagePreview() {
    DeadOrAliveTheme {
        CardImage(cell = CellData(isAlive = true))
    }
}