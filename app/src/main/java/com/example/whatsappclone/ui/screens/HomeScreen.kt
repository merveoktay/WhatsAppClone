package com.example.whatsappclone.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.whatsappclone.data.INITIAL_SCREEN_INDEX
import com.example.whatsappclone.data.tabs
import com.example.whatsappclone.ui.components.AppBarComponent
import com.example.whatsappclone.ui.components.TabsComponent
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen() {

    val pagerState = rememberPagerState(initialPage = INITIAL_SCREEN_INDEX) { tabs.size }
    val scope = rememberCoroutineScope()
    Column {
        AppBarComponent()
        TabsComponent(
            pagerState = pagerState,
            initialIndex = INITIAL_SCREEN_INDEX,
            onTabSelected = { selectedPage ->
                scope.launch {
                    pagerState.animateScrollToPage(selectedPage)
                }

            }
        )

        HorizontalPager(modifier = Modifier.fillMaxSize(), state = pagerState) { page ->
            when (page) {
                0 -> ChatsScreen()
                1 -> StatusScreen()
                2 -> CallsScreen()
            }

        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
