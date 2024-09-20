package ru.deadoralive.ui.base

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import ru.deadoralive.ui.theme.ButtonBackgroundColor
import ru.deadoralive.ui.theme.DeadOrAliveTheme
import ru.deadoralive.ui.theme.MainTextColor
import ru.deadoralive.ui.theme.paddingLarge
import ru.deadoralive.ui.theme.paddingXSmall
import ru.deadoralive.ui.theme.textSize

@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = onClick,
        colors = ButtonColors(
            containerColor = ButtonBackgroundColor,
            contentColor = MainTextColor,
            disabledContainerColor = ButtonBackgroundColor.copy(alpha = 0.5f),
            disabledContentColor = MainTextColor
        ),
        modifier = modifier
    ) {
        Text(
            text = text,
            fontSize = textSize,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(vertical = paddingXSmall, horizontal = paddingLarge)
                .align(Alignment.CenterVertically)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PrimaryButtonPreview() {
    DeadOrAliveTheme {
        //PrimaryButton()
    }
}