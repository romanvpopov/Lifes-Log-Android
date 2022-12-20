package com.example.lifeslog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import com.example.core.lldp.LLDP
import com.example.feature.events_impl.EventsFeatureImpl
import com.example.feature.health_impl.HealthFeatureImpl
import com.example.feature.home.impl.HomeFeatureImpl
import com.example.feature.money_impl.MoneyFeatureImpl
import com.example.feature.settings.impl.SettingsFeatureImpl
import com.example.feature.sport_impl.SportFeatureImpl
import com.example.lifeslog.ui.theme.lifeslogTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, true)
        LLDP.setPrefs(getSharedPreferences("langDB", MODE_PRIVATE))
        LLDP.provideImpl(
            homeFeatureApi = HomeFeatureImpl(),
            eventsFeatureApi = EventsFeatureImpl(),
            moneyFeatureApi = MoneyFeatureImpl(),
            sportFeatureApi = SportFeatureImpl(),
            healthFeatureApi = HealthFeatureImpl(),
            settingsFeatureApi = SettingsFeatureImpl(),
        )
        setContent {
            lifeslogTheme {
                AppContent()
            }
        }
    }
}
