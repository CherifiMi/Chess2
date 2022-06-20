import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

@Composable
fun Square(x: Int, y: Int, color: Boolean){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(square_size)
            .offset(
                x = square_size * x,
                y = square_size * y
            )
            .background(
                if(color){
                    Color(0xFFC2C3C3)
                }else{
                    Color(0xFF6A615D)
                }
            )
    ){
        Image(painter = painterResource("wk.png"), contentDescription = "")
    }
}
