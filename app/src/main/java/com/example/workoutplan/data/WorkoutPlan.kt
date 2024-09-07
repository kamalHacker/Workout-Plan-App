package com.example.workoutplan.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.workoutplan.R

class WorkoutPlan (
    val day: Int,
    @StringRes val workoutTitle: Int,
    @StringRes val workout: List<Int>,
    @DrawableRes val imageResourceId: Int
)

val chestWorkout = listOf(
    R.string.warmup_push_ups,
    R.string.bench_press,
    R.string.incline_bench_press,
    R.string.decline_bench_press,
    R.string.incline_chest_press_machine,
    R.string.pec_dec_fly,
    R.string.cardio
)

val backWorkout = listOf(
    R.string.warmup_pull_ups,
    R.string.lat_pulldown,
    R.string.seated_rows,
    R.string.pullover,
    R.string.dumbell_rows,
    R.string.assisted_pull_ups,
    R.string.cardio
)
val bicepsWorkout = listOf(
    R.string.warmup_dumbell_curls,
    R.string.incline_curlss,
    R.string.barbell_curls,
    R.string.preacher_curls,
    R.string.hammer_curls,
    R.string.reverse_curls,
    R.string.cardio
)
val tircepsWorkout = listOf(
    R.string.warmup_diamond_pushups,
    R.string.triceps_overhead_1,
    R.string.triceps_overhead_2,
    R.string.dips,
    R.string.push_down,
    R.string.cardio
)

val shoulderWorkout = listOf(
    R.string.warmup_shoulder,
    R.string.barbell_shoulder_press,
    R.string.behind_the_neck_shoulder_press,
    R.string.lateral_raises,
    R.string.front_raises,
    R.string.reverse_fly,
    R.string.shrugs,
    R.string.cardio
)

val legsWorkout = listOf(
    R.string.warmup_squats,
    R.string.barbell_squats,
    R.string.lunges,
    R.string.leg_extension,
    R.string.leg_press,
    R.string.leg_curl,
    R.string.cardio
)

val restDay = listOf(
    R.string.rest_day_description,
)

val workout = listOf(
    WorkoutPlan(1, R.string.chest, chestWorkout, R.drawable.bench_press),
    WorkoutPlan(2, R.string.back, backWorkout, R.drawable.lat_pulldown),
    WorkoutPlan(3, R.string.biceps, bicepsWorkout, R.drawable.preacher_curl),
    WorkoutPlan(4, R.string.triceps, tircepsWorkout, R.drawable.tricep_pushdown),
    WorkoutPlan(5, R.string.shoulders, shoulderWorkout, R.drawable.shoulder_press),
    WorkoutPlan(6, R.string.legs, legsWorkout, R.drawable.squats),
    WorkoutPlan(7, R.string.rest_day, restDay, R.drawable.rest1),
    WorkoutPlan(8, R.string.chest, chestWorkout, R.drawable.chest_fly),
    WorkoutPlan(9, R.string.back, backWorkout, R.drawable.back),
    WorkoutPlan(10, R.string.biceps, bicepsWorkout, R.drawable.rope_hammer_curls),
    WorkoutPlan(11, R.string.triceps, tircepsWorkout, R.drawable.triceps_overhead),
    WorkoutPlan(12, R.string.shoulders, shoulderWorkout, R.drawable.lateral_raises),
    WorkoutPlan(13, R.string.legs, legsWorkout, R.drawable.leg_extension),
    WorkoutPlan(14, R.string.rest_day, restDay, R.drawable.rest_day),
    WorkoutPlan(15, R.string.chest, chestWorkout, R.drawable.push_ups),
    WorkoutPlan(16, R.string.back, backWorkout, R.drawable.pull_ups),
    WorkoutPlan(17, R.string.biceps, bicepsWorkout, R.drawable.barbell_curl),
    WorkoutPlan(18, R.string.triceps, tircepsWorkout, R.drawable.dips),
    WorkoutPlan(19, R.string.shoulders, shoulderWorkout, R.drawable.reverse_fly),
    WorkoutPlan(20, R.string.legs, legsWorkout, R.drawable.hack_squat),
    WorkoutPlan(21, R.string.rest_day, restDay, R.drawable.rest_day_3),
    WorkoutPlan(22, R.string.chest, chestWorkout, R.drawable.incline_dumbell_press),
    WorkoutPlan(23, R.string.back, backWorkout, R.drawable.rows),
    WorkoutPlan(24, R.string.biceps, bicepsWorkout, R.drawable.biceps),
    WorkoutPlan(25, R.string.triceps, tircepsWorkout, R.drawable.skull_crusher),
    WorkoutPlan(26, R.string.shoulders, shoulderWorkout, R.drawable.shoulders),
    WorkoutPlan(27, R.string.legs, legsWorkout, R.drawable.lunges),
    WorkoutPlan(28, R.string.rest_day, restDay, R.drawable.rest_4)
)
