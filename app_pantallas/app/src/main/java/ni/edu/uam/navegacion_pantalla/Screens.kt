package ni.edu.uam.navegacion_pantalla

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        // Título Identificador (Requisito)
        CenterAlignedTopAppBar(
            title = { Text("Inicio", fontWeight = FontWeight.Bold) },
            actions = {
                IconButton(onClick = { }) {
                    Icon(Icons.Default.FavoriteBorder, contentDescription = "Likes")
                }
                IconButton(onClick = { }) {
                    Icon(Icons.Default.Send, contentDescription = "Direct")
                }
            }
        )
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(10) { index ->
                PostItem(index)
            }
        }
    }
}

@Composable
fun PostItem(index: Int) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(Color.LightGray)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "usuario_$index", fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.weight(1f))
            Icon(Icons.Default.MoreVert, contentDescription = null)
        }
        
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .background(Color(0xFFF0F0F0)),
            contentAlignment = Alignment.Center
        ) {
            Text("Publicación #$index", color = Color.Gray)
        }
        
        Row(modifier = Modifier.padding(8.dp)) {
            // Componente interactivo (Acción)
            IconButton(onClick = { }) {
                Icon(Icons.Default.FavoriteBorder, contentDescription = null)
            }
            Text("Me gusta", modifier = Modifier.align(Alignment.CenterVertically))
        }
        
        HorizontalDivider(thickness = 0.5.dp, color = Color.LightGray)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExploreScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        // Título Identificador (Requisito)
        TopAppBar(title = { Text("Información y Explorar", fontWeight = FontWeight.Bold) })
        
        // Componente interactivo (Campo de búsqueda)
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            placeholder = { Text("Buscar contenido...") },
            shape = CircleShape,
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.LightGray,
                focusedBorderColor = Color.Gray
            )
        )
        
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(1.dp),
            horizontalArrangement = Arrangement.spacedBy(1.dp),
            verticalArrangement = Arrangement.spacedBy(1.dp)
        ) {
            items(21) { index ->
                Box(
                    modifier = Modifier
                        .aspectRatio(1f)
                        .background(Color(0xFFE0E0E0)),
                    contentAlignment = Alignment.Center
                ) {
                    Text("#$index", color = Color.DarkGray)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        // Título Identificador (Requisito)
        TopAppBar(title = { Text("Resumen de Perfil", fontWeight = FontWeight.Bold) })

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
                    .background(Color.LightGray)
            )
            
            Row(
                modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                ProfileStat("12", "Posts")
                ProfileStat("450", "Seguidores")
                ProfileStat("320", "Seguidos")
            }
        }
        
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            Text("Nombre de Usuario", fontWeight = FontWeight.Bold)
            Text("Biografía de la aplicación móvil.", fontSize = 14.sp)
        }
        
        // Componente interactivo (Botón)
        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = MaterialTheme.shapes.small,
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEFEFEF), contentColor = Color.Black)
        ) {
            Text("Editar Perfil")
        }
        
        HorizontalDivider(thickness = 0.5.dp, color = Color.LightGray)
        
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(1.dp),
            horizontalArrangement = Arrangement.spacedBy(1.dp),
            verticalArrangement = Arrangement.spacedBy(1.dp)
        ) {
            items(9) { index ->
                Box(
                    modifier = Modifier
                        .aspectRatio(1f)
                        .background(Color(0xFFF5F5F5)),
                    contentAlignment = Alignment.Center
                ) {
                    Text("Post $index", fontSize = 10.sp)
                }
            }
        }
    }
}

@Composable
fun ProfileStat(value: String, label: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = value, fontWeight = FontWeight.Bold, fontSize = 18.sp)
        Text(text = label, fontSize = 12.sp)
    }
}
