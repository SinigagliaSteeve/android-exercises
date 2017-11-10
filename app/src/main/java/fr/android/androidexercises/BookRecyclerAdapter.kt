package fr.android.androidexercises

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Steeve Sinigaglia on 10/11/2017.
 */
class BookRecyclerAdapter(val layoutInflater: LayoutInflater, val books: List<Book>) : RecyclerView.Adapter<BookRecyclerAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: BookRecyclerAdapter.ViewHolder?, position: Int) {
        val itemView = holder?.itemView
        return when (itemView) {
            is BookItemView -> itemView.bindView(books[position])
            else -> {

            }
        }
    }

    override fun getItemCount(): Int {
        return books.size;
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder =
            ViewHolder(layoutInflater.inflate(R.layout.custom_view_item_book, parent, false));


    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView)

}