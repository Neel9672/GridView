package com.example.project6gridview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gridView: GridView = findViewById(R.id.gridView)

        // the data source

        var shape1 = gridData(R.drawable.sphere, "sphere")
        var shape2 = gridData(R.drawable.sphere, "sphere")
        var shape3 = gridData(R.drawable.sphere, "sphere")
        var shape4 = gridData(R.drawable.sphere, "sphere")
        var shape5 = gridData(R.drawable.sphere, "sphere")
        var shape6 = gridData(R.drawable.sphere, "sphere")
        var shape7 = gridData(R.drawable.sphere, "sphere")
        var shape8 = gridData(R.drawable.sphere, "sphere")
        var shape9 = gridData(R.drawable.sphere, "sphere")
        var shape10 = gridData(R.drawable.sphere, "sphere")
        var shape11 = gridData(R.drawable.sphere, "sphere")
        var shape12 = gridData(R.drawable.sphere, "sphere")


        val gridItem = listOf<gridData>(
            shape1, shape2, shape3, shape4, shape10, shape11, shape12, shape5, shape6, shape7, shape8,
            shape9
        )

        // the adapter
        val adapters = GridAdapter(this, gridItem)
        gridView.adapter = adapters

        // handling click event

        gridView.setOnItemClickListener { _, _, position, _ ->
            val clickedItem = adapters.getItem(position)

            if(clickedItem?.text.equals("sphere")){
                val intent = Intent(this, sphereActivity::class.java)
                startActivity(intent)
            }

        }



    }
}