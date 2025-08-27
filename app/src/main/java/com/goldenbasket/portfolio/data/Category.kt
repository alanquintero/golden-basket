package com.goldenbasket.portfolio.data

import android.content.Context
import android.graphics.Color
import com.goldenbasket.portfolio.R

data class Category(
    val id: Int,
    val type: Type,
    val name: String,
    val color: Int = Color.WHITE,
    val group: String = "None"
) {
    enum class Type {
        ASSET,
        LIABILITY
    }

    companion object {
        fun defaultGroup(context: Context): String {
            return context.getString(R.string.default_group)
        }
    }
}