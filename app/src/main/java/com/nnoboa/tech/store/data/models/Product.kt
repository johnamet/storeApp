package com.nnoboa.tech.store.data.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class Product (
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "product_name") val name: String,
    @ColumnInfo(name = "product_img") val photoUrl: String,
    @ColumnInfo(name = "product_price") val price: Float,
    @ColumnInfo(name = "created_time") val created: Date,
    @ColumnInfo(name = "updated_time") val updated: Date
 )