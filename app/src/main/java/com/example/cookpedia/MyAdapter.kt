package com.example.cookpedia

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cookpedia.databinding.ItemMostPopularFoodBinding


class MyAdapter() : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    private val data = ArrayList<ItemModel>()
    var onClickView: ((String) -> Unit)? = null




    fun setData(data: List<ItemModel>) {
        this.data.clear()
        data.let { this.data.addAll(it) }
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: ItemMostPopularFoodBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindData(data: ItemModel) {

            binding.image.setImageDrawable(data.image)

            itemView.setOnClickListener {
                onClickView?.invoke(data.name)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            ItemMostPopularFoodBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(data = data[position])
    }
}