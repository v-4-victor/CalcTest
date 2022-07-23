package com.example.calctest.screen

import com.kaspersky.components.kautomator.component.edit.UiEditText
import com.kaspersky.components.kautomator.component.text.UiButton
import com.kaspersky.components.kautomator.component.text.UiTextView
import com.kaspersky.components.kautomator.screen.UiScreen

object MainScreen : UiScreen<MainScreen>() {

    override val packageName: String = "com.google.android.calculator"

    val zeroButton = UiButton { withId(this@MainScreen.packageName, "digit_0") }
    val oneButton = UiButton { withId(this@MainScreen.packageName, "digit_1") }
    val twoButton = UiButton { withId(this@MainScreen.packageName, "digit_2") }
    val threeButton = UiButton { withId(this@MainScreen.packageName, "digit_3") }
    val fourButton = UiButton { withId(this@MainScreen.packageName, "digit_4") }
    val fiveButton = UiButton { withId(this@MainScreen.packageName, "digit_5") }
    val sixButton = UiButton { withId(this@MainScreen.packageName, "digit_6") }
    val sevenButton = UiButton { withId(this@MainScreen.packageName, "digit_7") }
    val eightButton = UiButton { withId(this@MainScreen.packageName, "digit_8") }
    val nineButton = UiButton { withId(this@MainScreen.packageName, "digit_9") }
    val dotButton = UiButton { withId(this@MainScreen.packageName, "dec_point") }
    val sqrtButton = UiButton { withId(this@MainScreen.packageName, "op_sqrt") }
    val plusButton = UiButton { withId(this@MainScreen.packageName, "op_add") }
    val eqButton = UiButton { withId(this@MainScreen.packageName, "eq") }
    val previewText = UiTextView { withId(this@MainScreen.packageName, "result_preview") }
    val formulaText = UiTextView { withId(this@MainScreen.packageName, "result_final") }

}
