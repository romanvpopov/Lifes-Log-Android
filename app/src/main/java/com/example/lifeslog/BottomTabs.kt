package com.example.lifeslog

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.core.lldp.LLDP

enum class BottomTabs(
    @StringRes
    val title: Int,
    @DrawableRes
    val icon: Int,
    val route: String,
) {
    Events(
       R.string.events,
        R.drawable.notes_svgrepo_com,
        LLDP.eventsFeature().eventsRoute()
    ),
    Sport(
        R.string.sport,
        R.drawable.runner_svgrepo_com,
        LLDP.sportFeature().sportRoute()
    ),
    Health(
        R.string.health,
        R.drawable.heart_health_medical_healthcare_2_svgrepo_com,
        LLDP.healthFeature().healthRoute()
    ),
    Money(
        R.string.money,
        R.drawable.wallet_svgrepo_com2,
        LLDP.moneyFeature().moneyRoute()
    ),
    Settings(
        R.string.settings,
        R.drawable.slider_settings_svgrepo_com,
        LLDP.settingsFeature().settingsRoute()
    )
}
