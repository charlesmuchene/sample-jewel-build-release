import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.window.DialogWindow
import androidx.compose.ui.window.application
import org.jetbrains.jewel.intui.standalone.theme.IntUiTheme
import org.jetbrains.jewel.ui.component.Text

fun main() {
    application {
        IntUiTheme {
            DialogWindow(onCloseRequest = ::exitApplication, title = "Sampling Jewels") {
                Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
                    Text(text = "Jeweling up! 😎", fontSize = TextUnit(value = 48f, type = TextUnitType.Sp))
                }
            }
        }
    }
}