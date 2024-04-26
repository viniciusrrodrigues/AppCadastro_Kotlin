package com.example.appcadastro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appcadastro.ui.theme.AppCadastroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppCadastroTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

 @Composable
fun Cadastro(){


    Column (
        Modifier
            .background(Color.Blue)
            .fillMaxSize()){

        Row (
            Modifier.
            fillMaxWidth(),
            Arrangement.Center
        ) {

            Text("APP CADASTRO")



        }

        Row (Modifier.padding(10.dp)){

        }

     Row(Modifier.
     fillMaxWidth(),
         Arrangement.Center){
         var text by remember { mutableStateOf("") }

         TextField(
             value = text,
             onValueChange = {
                 text = it },
             label = { Text("Nome") }
         )
     }
        Row (Modifier.padding(5.dp)){

        }
        Row(Modifier.
        fillMaxWidth(),
            Arrangement.Center){
            var text by remember { mutableStateOf("") }
            TextField(
                value = text,
                onValueChange = {
                    text = it },
                label = { Text("Endereço") }
            )
        }
        Row (Modifier.padding(5.dp)){

        }
        Row(Modifier.
        fillMaxWidth(),
            Arrangement.Center){
            var text by remember { mutableStateOf("") }
            TextField(
                value = text,
                onValueChange = {
                    text = it },
                label = { Text("Bairro") }
            )
        }
        Row (Modifier.padding(5.dp)){

        }
        Row(Modifier.
        fillMaxWidth(),
            Arrangement.Center){
            var text by remember { mutableStateOf("") }
            TextField(
                value = text,
                onValueChange = {
                    text = it },
                label = { Text("CEP") }
            )
        }
        Row (Modifier.padding(5.dp)){

        }
        Row(Modifier.
        fillMaxWidth(),
            Arrangement.Center){
            var text by remember { mutableStateOf("") }
            TextField(
                value = text,
                onValueChange = {
                    text = it },
                label = { Text("Cidade") }
            )
        }
        Row (Modifier.padding(5.dp)){

        }
        Row(Modifier.
        fillMaxWidth(),
            Arrangement.Center){
            var text by remember { mutableStateOf("") }
            TextField(
                value = text,
                onValueChange = {
                    text = it },
                label = { Text("Estado") }
            )
        }
        Row (Modifier.padding(5.dp)){

        }
        Row(Modifier.
        fillMaxWidth(),
            Arrangement.Center){
           androidx.compose.material3.Button(onClick = { /*TODO*/ }) {
               Text("Cadastrar-se")
           }

        }

        }
    }


@Composable
@Preview
fun PreviewCadastro(){
    Cadastro()
}