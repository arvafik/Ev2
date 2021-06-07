package com.arvafik.evaluacion2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//Jessica Janet Grajeda Castellanos
// 17100229

class AdapterRecycle: RecyclerView.Adapter<AdapterRecycle.ViewHolder>(){

    val nombre = arrayOf(
        "German Shepard",
        "Golden Retriever",
        "Pitbull",
        "Chihuahua")

    val descripcion = arrayOf(
        "Guardían",
        "Amistoso",
        "Bueno con los niños",
        "Pequeño pero picoso")

    val imagen = arrayOf(
        R.drawable.perro1,
        R.drawable.perro2,
        R.drawable.perro3,
        R.drawable.perro4
    )

    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle:TextView
        var itemDetails:TextView

        init{
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetails = itemView.findViewById(R.id.item_detalles)
        }

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.cardview_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = nombre[i]
        viewHolder.itemDetails.text = descripcion[i]
        viewHolder.itemImage.setImageResource(imagen[i])
    }
   override fun getItemCount():Int{
       return nombre.size
   }
}