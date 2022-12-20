package com.example.feature.settings.impl

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import com.example.core.lldp.LLDP
import com.example.feature.settings.R

@Composable
fun SettingsScreen(modifier: Modifier, ok: () -> Unit, close: () -> Unit) {
    val prefs = LLDP.getPrefs()
    val intLang = remember { mutableStateOf(prefs.getInt("intLang", 0)) }
    val serverName = remember { mutableStateOf(prefs.getString("serverName", "")) }
    val dbName = remember { mutableStateOf(prefs.getString("dbName", "")) }
    val login = remember { mutableStateOf(prefs.getString("login", "")) }
    val password = remember { mutableStateOf(prefs.getString("password", "")) }
    Column(modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(stringResource(R.string.intLang))
        val languages = listOf("Русский", "English")
        val (selectedOption, onOptionSelected) = remember { mutableStateOf(languages[intLang.value]) }
        Column(Modifier.selectableGroup()) {
            languages.forEach { text ->
                Row(Modifier.selectable(
                    selected = (text == selectedOption),
                    onClick = { onOptionSelected(text) })
                )
                {
                    RadioButton(
                        selected = (text == selectedOption), onClick = null
                    )
                    Text(text = text)
                }
            }
        }
        Text(stringResource(R.string.serverName))
        OutlinedTextField(serverName.value ?: "", onValueChange = { serverName.value = it })
        Text(stringResource(R.string.dbName))
        OutlinedTextField(dbName.value ?: "", onValueChange = { dbName.value = it })
        Text(stringResource(R.string.login))
        OutlinedTextField(login.value ?: "", onValueChange = { login.value = it })
        Text(stringResource(R.string.password))
        OutlinedTextField(password.value ?: "", onValueChange = { password.value = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Button(onClick = {
            val editor = prefs.edit()
            editor.putInt("intLang", languages.indexOf(selectedOption))
            editor.putString("serverName", serverName.value)
            editor.putString("dbName", dbName.value)
            editor.putString("login", login.value)
            editor.putString("password", password.value)
            editor.apply()
            ok()
        }) {
            Text(stringResource(R.string.Apply))
        }
        Button(onClick = {
            close()
        }) {
            Text(stringResource(R.string.Close))
        }
    }
}