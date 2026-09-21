package com.example.dsy1105_005d_2026.ui.theme


import com.example.dsy1105_005d_2026.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun HomeScreen(){
    // darkScheme es una funcion del material 3
    
    val ColorScheme = darkColorScheme(
        primary= Color(0xFF8D1421),
        onPrimary =Color.White,
        onSurface =Color(0xFF3333333)
    ) // fin dark
    
    MaterialTheme(
        colorScheme=ColorScheme
    ){ // inicio de Material


    //Scaffold va a generar una pantalla basica
    Scaffold(
        topBar={
            TopAppBar(title={Text("Mi primer App",
            color= MaterialTheme.colorScheme.onPrimary
            ) })
        }
//InnerPadding ses refiere al espacio que entrega Scaffold para el contenido

    ){innerPadding ->
        Column(
            modifier= Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(16.dp)
                .background(Color(0xFFF0F0F0)),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            //centrar
             horizontalAlignment = Alignment.CenterHorizontally

        ){
            Text("!!!!  Bienvenido !!!!",
              //  style=MaterialTheme.typography.headlineMedium,
                //Hasta aqui 21.09.2026



            )

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
    }// Fin Material
}// Fin Home

fun darkColorScheme(
    primary: android.graphics.Color,
    onPrimary: Int,
    onSurface: android.graphics.Color
) {
}


@Preview(showBackground = true)
@Composable

fun HomeScreenPreview(){
    HomeScreen()
}


