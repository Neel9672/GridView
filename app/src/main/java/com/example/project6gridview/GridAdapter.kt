package com.example.project6gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class GridAdapter(context: Context, private val gridItems: List<gridData>)
    : ArrayAdapter<gridData>(context, 0, gridItems) {
        // context: required to access resources and layout
        // 0: the resource ID for the layout file, 0 because we need to inflate our custom
        //    layout , and not a predefined layout
        // gridItems: list of Shapes items that the adapter will adapt and
        // display in the gridView

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        // It is responsible for returning a view that represent an item at a
        // specific position in a "ListView", "gridView" or other similar components

        var itemView = convertView
        val holder: viewHolder

        if(convertView == null)
        {
            itemView = LayoutInflater.from(context).inflate(R.layout.grid_view_layout,
                parent, false)

            // create and set view Holder
            holder = viewHolder()
            holder.imageView = itemView.findViewById(R.id.imageView)
            holder.textView = itemView.findViewById(R.id.titleText)

            // Associating the viewHolder Objects with the created View
            // avoding the need to create a new "ViewHolder" everytime.
            itemView.tag = holder
        }else{
            // reuse the existing viewHolder
                holder = itemView?.tag as viewHolder


        }
        // binding data to view
        val currentItem = gridItems[position]
        holder.imageView.setImageResource(currentItem.image)
        holder.textView.text = currentItem.text


        // !!: NON null Assertion Operator
        //itemView should not be null
        return itemView!!
    }

        private class viewHolder{

            // a design pattern used to improve the performance of listView, GridView, Recyclerview,
            // and others by caching views for smoother scrolling
            // It serves as a container for the views of a single item in the gridView. reducing
            // the number of call to 'FindViewbyID()'

            lateinit var imageView: ImageView
            lateinit var textView: TextView
        }
}