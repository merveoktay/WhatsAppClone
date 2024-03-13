package com.example.whatsappclone.data

import com.example.whatsappclone.domain.ChatListDataObject
import com.example.whatsappclone.domain.Message
import com.example.whatsappclone.domain.MessageDeliveryStatus
import com.example.whatsappclone.domain.MessageType

val chatList = listOf<ChatListDataObject>(
    ChatListDataObject(
        chatId = 1,
        message = Message(
            content = "Hi ,good morning :D",
            timeStamp = "15/03/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount=1
        ),
        userName = "Eddie Underwood"
    ),
    ChatListDataObject(
        chatId = 2,
        message = Message(
            content = "Just brewing some potions in my spare time.",
            timeStamp = "13/03/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ,
            unreadCount=null
        ),
        userName = "Amanda Jenkins"
    ),
    ChatListDataObject(
        chatId = 2,
        message = Message(
            content = "How is school going",
            timeStamp = "14/03/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ,
            unreadCount=null
        ),
        userName = "Lucille Munoz"
    ),
    ChatListDataObject(
        chatId = 2,
        message = Message(
            content = "Have you finished your work?",
            timeStamp = "15/03/2024",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount=4
        ),
        userName = "Gerry Mcgrath"
    ),
)