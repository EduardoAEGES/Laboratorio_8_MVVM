package com.miempresa.laboratorio_8_mvvm.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.miempresa.laboratorio_8_mvvm.viewmodels.CounterViewModel

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Counter(vista1:CounterViewModel){
    Scaffold(
        floatingActionButton = {FloatingButton(vista1)}
    ) {
        Box(modifier = Modifier.fillMaxSize()){
            Text(
                text = vista1.counter.value.toString(),
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp,
                modifier = Modifier.align(Alignment.Center))
        }
    }
}

@Composable
fun FloatingButton(vista2:CounterViewModel) {
    FloatingActionButton(
        onClick = {vista2.add()})
    {
        Icon(imageVector = Icons.Default.Add, contentDescription = "")
    }
}