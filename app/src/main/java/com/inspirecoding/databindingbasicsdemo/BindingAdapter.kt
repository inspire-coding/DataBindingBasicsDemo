package com.inspirecoding.databindingbasicsdemo

import android.content.Context
import android.content.res.ColorStateList
import android.util.Log
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter

private const val TAG = "BindingAdapter"
@BindingAdapter("app:getLikes", "app:context")
fun getLikes(textView: TextView, likes: Int, context: Context)
{
    Log.i(TAG, "$context")
    val likesText = context.getString(R.string.likes)
    textView.setText("$likes $likesText")
}

@BindingAdapter(value = ["app:progressScaled", "android:max"], requireAll = true)
fun setProgress(progressBar: ProgressBar, likes: Int, max: Int)
{
    progressBar.progress = (likes * max / 10).coerceAtMost(max)
}

@BindingAdapter(value = ["app:progress", "android:context"], requireAll = true)
fun setProgressColor(progressBar: ProgressBar, progress: Int, context: Context)
{
    when (progress)
    {
        in 0..2 -> progressBar.progressTintList = ColorStateList.valueOf(
            ContextCompat.getColor(
                context,
                R.color.red
            )
        )
        in 3..4 -> progressBar.progressTintList = ColorStateList.valueOf(
            ContextCompat.getColor(
                context,
                R.color.orange
            )
        )
        in 5..6 -> progressBar.progressTintList = ColorStateList.valueOf(
            ContextCompat.getColor(
                context,
                R.color.yellow
            )
        )
        in 7..8 -> progressBar.progressTintList = ColorStateList.valueOf(
            ContextCompat.getColor(
                context,
                R.color.light_green
            )
        )
        in 9..10 -> progressBar.progressTintList = ColorStateList.valueOf(
            ContextCompat.getColor(
                context,
                R.color.dark_green
            )
        )
    }
}