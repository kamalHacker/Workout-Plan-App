package com.example.workoutplan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.WorkoutPlanTheme
import com.example.workoutplan.data.WorkoutPlan
import com.example.workoutplan.data.workout

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WorkoutPlanTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    WorkoutPlanApp()
                }
            }
        }
    }
}

@Composable
fun WorkoutPlanApp() {
    Scaffold(
        topBar = { TopAppBar() }
    ){ it ->
        LazyColumn(modifier = Modifier.padding(it)){
            items(workout.size){
                WorkoutCard(workout = workout[it])
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar() {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(R.string.app_name),
                style = MaterialTheme.typography.displaySmall,
                color = MaterialTheme.colorScheme.primary
            )
        }
    )
}

@Composable
fun WorkoutCard(
    modifier: Modifier = Modifier,
    workout: WorkoutPlan
){
    var expanded by remember { mutableStateOf(false) }

    Card(
            modifier = modifier.fillMaxWidth().padding(10.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ){
        Column{
            Text(
                modifier = modifier.padding(8.dp),
                text = stringResource(R.string.day , workout.day),
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.secondary
            )
            Text(
                modifier = modifier.padding(8.dp),
                text = stringResource(workout.workoutTitle),
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.primary
            )
            Image(
                modifier = modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .height(250.dp)
                    .clickable { expanded = !expanded },
                painter = painterResource(workout.imageResourceId),
                contentDescription = null
            )
            if(expanded) {
                Column(
                    modifier = modifier
                        .animateContentSize(
                            animationSpec = spring(
                                dampingRatio = Spring.DampingRatioMediumBouncy,
                                stiffness = Spring.StiffnessLow,
                            )
                        )
                ){
                    for(item in workout.workout){
                        Text(
                            modifier = modifier.padding(8.dp),
                            text = stringResource(item),
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.secondary
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WorkoutPlanAppPreview() {
    WorkoutPlanTheme(dynamicColor = false) {
        WorkoutPlanApp()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WorkoutPlanAppDarkThemePreview() {
    WorkoutPlanTheme(darkTheme = true, dynamicColor = false) {
        WorkoutPlanApp()
    }
}