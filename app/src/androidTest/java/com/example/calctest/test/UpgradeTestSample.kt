package com.example.calctest.test

import android.Manifest
import androidx.test.rule.GrantPermissionRule
import com.example.calctest.common.UpdateManager.installAndLaunchMainApp
import com.example.calctest.screen.MainScreen
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test

class UpgradeTestSample : TestCase() {

    @get:Rule
    val runtimePermissionRule: GrantPermissionRule = GrantPermissionRule.grant(
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.READ_EXTERNAL_STORAGE
    )

    @Test
    fun simpleTest() {
        before { }.after {
        }.run {

            step("Install and launch old version of the app") {
                installAndLaunchMainApp()
            }

            step("Click 1 + 2 = 3") {
                MainScreen {
                    oneButton{click()}
                    plusButton{click()}
                    twoButton{click()}
                    previewText{
                        hasText("3")
                    }
                    eqButton{click()}
                    Thread.sleep(100)
                    formulaText{
                        hasText("3")
                    }

                }
            }


        }
    }
}
