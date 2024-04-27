package com.example.cookpedia

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cookpedia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val adapter = MyAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        onViewCreated()
    }

    private fun onViewCreated() {

        val data = listOf(
            ItemModel(1, "hot", getDrawable(R.drawable.image)!!),
            ItemModel(1, "hot", getDrawable(R.drawable.image)!!),
            ItemModel(1, "hot", getDrawable(R.drawable.image)!!)
        )


        adapter.setData(data = data)
        binding.mostPopularFoodsRecycler.adapter = adapter
    }
}