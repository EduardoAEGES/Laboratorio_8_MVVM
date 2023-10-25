package com.miempresa.laboratorio_8_mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.miempresa.laboratorio_8_mvvm.viewmodels.CounterViewModel
import com.miempresa.laboratorio_8_mvvm.views.Counter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val vistita : CounterViewModel by viewModels()
        setContent {
            Counter(vista1 = vistita)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    val vistilla = CounterViewModel()
    Counter(vista1 = vistilla)
}