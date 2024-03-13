package com.example.whatsappclone.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsappclone.data.chatList
import com.example.whatsappclone.domain.ChatListDataObject
import com.example.whatsappclone.ui.components.UserDetails
import com.example.whatsappclone.ui.components.UserImage

@Composable
fun ChatsScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        item {
            Spacer(modifier = Modifier.height(10.dp))
        }
        items(chatList) { chatData ->
            ChaListItem(chatData = chatData)

        }
    }
}

@Composable
fun ChaListItem(chatData: ChatListDataObject) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        UserImage(chatData.userImage)
        UserDetails(chatData = chatData)
    }
}

@Preview(showBackground = true)
@Composable
fun ChatsScreenPreview() {
    ChatsScreen()
}