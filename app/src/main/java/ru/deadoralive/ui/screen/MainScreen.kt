package ru.deadoralive.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.launch
import ru.deadoralive.R
import ru.deadoralive.ui.base.PrimaryButton
import ru.deadoralive.ui.element.Card
import ru.deadoralive.ui.theme.BackgroundColor
import ru.deadoralive.ui.theme.DeadOrAliveTheme
import ru.deadoralive.ui.theme.MainTextColor
import ru.deadoralive.ui.theme.paddingSmall
import ru.deadoralive.ui.theme.spacerBig
import ru.deadoralive.ui.theme.spacerSmall
import ru.deadoralive.ui.theme.textSize
import ru.deadoralive.viewmodel.CardsViewModel

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    viewModel: CardsViewModel = viewModel()
) {
    val scope = rememberCoroutineScope()
    val listState = rememberLazyListState()

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(BackgroundColor)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingSmall),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.Center)
            ) {
                Text(
                    text = stringResource(R.string.main_screen_title),
                    color = MainTextColor,
                    fontSize = textSize,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(spacerBig))
            LazyColumn(
                modifier = Modifier.weight(1f),
                state = listState
            ) {
                items(viewModel.cells.size) { index ->
                    val cell = viewModel.cells[index]
                    Card(cell)
                    Spacer(Modifier.height(spacerSmall))
                }
            }
            PrimaryButton(
                text = stringResource(R.string.button_text),
                onClick = { scope.launch { viewModel.addCell(listState) } },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = spacerBig)
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    DeadOrAliveTheme {
        MainScreen()
    }
}