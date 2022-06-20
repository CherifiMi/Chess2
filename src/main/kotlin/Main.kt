// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

val square_size = 60.dp

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        MaterialTheme {
            // psh test
            App()
        }
    }
}

@Composable
fun App() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
    ){
        showGrid()
    }

}

@Composable
fun showGrid() {
    for (i in 0..7){
        for(j in 0..7){
            if ((i+j)%2==1){
                Square(i, j, false)
            }else{
                Square(i, j, true)
            }
        }
    }
}


