package com.example.whatsappclone.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.whatsappclone.ui.components.AppBarComponent
import com.example.whatsappclone.ui.components.TabsComponent

@Composable
fun HomeScreen (){
    Column {
        AppBarComponent()
        TabsComponent()
    }
}
@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}
