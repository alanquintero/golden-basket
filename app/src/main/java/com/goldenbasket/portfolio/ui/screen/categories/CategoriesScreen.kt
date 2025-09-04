package com.goldenbasket.portfolio.ui.screen.categories

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import com.goldenbasket.portfolio.R

@Preview
@Composable
fun CategoriesScreen() {

    val context = LocalContext.current
    var showCreateOptionMenu by remember { mutableStateOf(false) }
    var categories by remember { mutableStateOf(listOf<String>()) }

    Box(modifier = Modifier.fillMaxSize()) {
        if (categories.isEmpty()) {
            Text(
                text = context.getString(R.string.empty_categories),
                modifier = Modifier.align(Alignment.Center),
                fontSize = 18.sp
            )
        }

        FloatingActionButton(
            onClick = { showCreateOptionMenu = true },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(bottom = 100.dp, end = 16.dp),
            containerColor = MaterialTheme.colorScheme.primary
        ) {
            val createSign= context.getString(R.string.plus_create_button)
            val createText = context.getString(R.string.create_button)
            Text(" $createSign $createText ", color = Color.White, fontSize = 24.sp)
        }

        if (showCreateOptionMenu) {
            AlertDialog(
                onDismissRequest = { showCreateOptionMenu = false },
                title = {
                    Text(
                        text = context.getString(R.string.select_an_option),
                        style = MaterialTheme.typography.titleMedium
                    )
                },
                text = {
                    Column {
                        Button(
                            onClick = {

                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Text(context.getString(R.string.create_category))
                        }

                        Button(
                            onClick = {

                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFF6200EE),
                                contentColor = Color.White
                            ),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Text(context.getString(R.string.create_group))
                        }

                        Button(
                            onClick = {
                                showCreateOptionMenu = false
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Red,
                                contentColor = Color.White
                            ),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Text(context.getString(R.string.cancel))
                        }
                    }
                },
                confirmButton = {
                    // TODO
                }
            )
        }
    }
}
