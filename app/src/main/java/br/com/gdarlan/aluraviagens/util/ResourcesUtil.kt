package br.com.gdarlan.aluraviagens.util

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.res.ResourcesCompat

class ResourcesUtil {

    companion object {
        private const val DRAWABLE = "drawable"
    }

    fun devolveDrawable(context: Context, drawableEmTexto: String): Drawable? {
        val resources = context.resources
        val idDoDrawable = resources.getIdentifier(drawableEmTexto, Companion.DRAWABLE, context.packageName)
        return ResourcesCompat.getDrawable(resources, idDoDrawable, null)
    }
}