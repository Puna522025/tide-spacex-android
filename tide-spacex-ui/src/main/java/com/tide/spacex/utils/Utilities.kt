package com.tide.spacex.utils

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions

class Utilities {

    companion object {
        fun loadImage(
            context: Context,
            imageView: ImageView,
            url: String?
        ) {

            val colorDrawable = ColorDrawable(Color.DKGRAY)
            val requestOptions = RequestOptions
                .placeholderOf(colorDrawable)
                .fitCenter()
                .optionalCenterCrop()
            Glide.with(context)
                .load(url)
                .apply(requestOptions)
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(imageView)
        }
    }
}