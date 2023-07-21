package com.example.feature.home.impl

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.core.lldp.LLDP

@Composable
fun HomeScreen(modifier: Modifier,
               navController: NavHostController,
               stCon: String) {
    Column(
        //modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        if (stCon=="Ok") {
            CircularProgressIndicator()
            Text("connecting")
        } else {
            Text(stCon)
            Button(onClick = { /*TODO*/ }) {
                Text("settings")
            }
        }
        /*Button(
            modifier = Modifier.padding(16.dp),
            onClick = {
                //navController.navigate(SettingsFeatureAPI.settingsRoute())
            }) {
            Text("Navigate to A-B scenario")
        }*/
    }
}