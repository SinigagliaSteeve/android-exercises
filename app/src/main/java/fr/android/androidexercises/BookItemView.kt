package fr.android.androidexercises

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.custom_view_item_book.view.*

/**
 * Created by Steeve Sinigaglia on 10/11/2017.
 */
class BookItemView : LinearLayout {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyle: Int) : super(context, attrs, defStyle)

    fun bindView(book: Book) {
        nameTextView?.text = book.name
        priceTextView?.text = book.price.toString()
    }
}