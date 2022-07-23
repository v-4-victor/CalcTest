package com.example.calctest.common
import com.kaspersky.kaspresso.testcases.core.testcontext.BaseTestContext


object UpdateManager {

    private const val MAIN_APP_PACKAGE_ID = "com.google.android.calculator"

    private const val TIMEOUT = 5_000L

    fun BaseTestContext.installAndLaunchMainApp() {

        with(device.targetContext) {
            val intent = packageManager.getLaunchIntentForPackage(MAIN_APP_PACKAGE_ID)
            startActivity(intent)
        }

        Thread.sleep(TIMEOUT)
    }

//    fun BaseTestContext.uninstallMainApp() {
//        device.apps.uninstallIfExists(MAIN_APP_PACKAGE_ID)
//    }
}
