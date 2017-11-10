package fr.android.androidexercises

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_library.*
import java.util.*
import kotlin.collections.ArrayList


class LibraryActivity : AppCompatActivity() {

    private val RANDOM = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        val books = getBooks()

        bookRecyclerView.layoutManager = GridLayoutManager(this, 1)
        bookRecyclerView.adapter = BookRecyclerAdapter(LayoutInflater.from(this),books);


        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_library, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId

        return if (id == R.id.action_settings) true else super.onOptionsItemSelected(item)
    }

    private fun getBooks(): List<Book> {
        val books = ArrayList<Book>()
        for (i in 0..99) {
            books.add(Book(
                    String.format(Locale.FRANCE, "Garry Potier Tome %d", i),
                    RANDOM.nextInt(30))
            )
        }
        return books
    }

}
