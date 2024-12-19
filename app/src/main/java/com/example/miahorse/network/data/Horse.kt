package com.example.miahorse.network.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Contents(@SerialName("contents") val horseList: List<Horse>, val totalCount: Int, val offset: Int, val limit: Int)

@Serializable
data class Horse(val id: String, val createdAt: String, val updatedAt: String, val publishedAt: String, val revisedAt: String, @SerialName("img_src") val imgSrc: ImgSrc, val name: String)

@Serializable
data class ImgSrc(val url: String, val height: Int, val width: Int)