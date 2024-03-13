package com.example.whatsappclone.domain

import com.example.whatsappclone.R

data class ChatListDataObject(
    val chatId: Int,
    val message: Message,
    val userName: String,
    val userImage: Int = R.drawable.ic_user_image,
)

enum class MessageType {
    TEXT,
    AUDIO,
    IMAGE
}

data class Message(
    val content: String,
    val deliveryStatus: MessageDeliveryStatus,
    val type: MessageType,
    val timeStamp: String,
    val unreadCount:Int?
)

enum class MessageDeliveryStatus {
    DELIVERED,
    READ,
    PENDING,
    ERROR
}
