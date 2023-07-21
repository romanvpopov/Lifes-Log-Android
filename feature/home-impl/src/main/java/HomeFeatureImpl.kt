package com.example.feature.home.impl

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import android.Manifest
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import com.example.core.lldp.LLDP
import com.example.feature.home_api.HomeFeatureApi
import java.sql.Connection
import java.sql.DriverManager

class HomeFeatureImpl : HomeFeatureApi {

    private val baseRoute = "home"
    private var stCon = "Ok"
    override fun homeRoute() = baseRoute
    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(baseRoute) {
            HomeScreen(modifier = modifier, navController = navController, stCon)
        }

 /*       InternalHomeFeatureApi.registerGraph(
            navGraphBuilder = navGraphBuilder,
            navController = navController,
            modifier = modifier
        )*/
    }
    fun CheckCon(): String {
        val prefs = LLDP.getPrefs()
        val serverName = prefs.getString("serverName", "")
        val dbName = prefs.getString("dbName", "")
        val login = prefs.getString("login", "")
        val password = prefs.getString("password", "")
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver")
            val con = DriverManager.getConnection(
                "jdbc:jtds:sqlserver://sql.mt-soft.ru:44433/LL","sa","P12455p93")
            return "Ok"
            LLDP.setCon(con)
        } catch (e: Exception) {
            return e.toString()
        }
    }
}