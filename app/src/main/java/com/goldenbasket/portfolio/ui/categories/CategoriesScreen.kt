package com.goldenbasket.portfolio.ui.categories

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun CategoriesScreen() {
    val context = LocalContext.current
    var categories by remember { mutableStateOf(listOf<String>()) }

    Box(modifier = Modifier.fillMaxSize()) {
        if (categories.isEmpty()) {
            Text(
                text = "No categories yet",
                modifier = Modifier.align(Alignment.Center),
                fontSize = 18.sp
            )
        }

        FloatingActionButton(
            onClick = { Toast.makeText(context, "Button pressed", Toast.LENGTH_SHORT).show() },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(bottom = 100.dp, end = 16.dp),
            containerColor = MaterialTheme.colorScheme.primary
        ) {
            Text(" + Create ", color = Color.White, fontSize = 24.sp)
        }
    }
}
