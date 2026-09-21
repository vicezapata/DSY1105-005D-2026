package com.example.dsy1105_005d_2026.ui.theme

import com.example.dsy1105_005d_2026.R
import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun HomeScreen(){
    //Scaffold va a generar una pantalla basica
    Scaffold(
        topBar={
            TopAppBar(title={Text("Mi primer App") })
        }
//InnerPadding ses refiere al espacio que entrega Scaffold para el contenido

    ){innerPadding ->
        Column(
            modifier= Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ){
            Text("!!!!  Bienvenido !!!!")

            Button(onClick = {/* accion futura */}){
                Text("Presioname")

            }// fin button

            Image(
            painter= painterResource(id= R.drawable.logoduoc),
            contentDescription = "Logo App",
                modifier= Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Fit
            )



        }//fin columna


    }//fin inner

}// Fin Home


@Preview(showBackground = true)
@Composable

fun HomeScreenPreview(){
    HomeScreen()
}


