package fr.android.androidexercises;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class LibraryActivity extends AppCompatActivity {

    private static final Random RANDOM = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        List<Book> books = getBooks();
//        ListView listView = findViewById(R.id.bookListView);
//        listView.setAdapter(new BookAdapter(this, books));

        boolean islandscape = getResources().getBoolean(R.bool.landscape);
        RecyclerView recyclerView = findViewById(R.id.bookRecyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, islandscape ? 2 : 1));
        recyclerView.setAdapter(new BookRecyclerAdapter(LayoutInflater.from(this),books));
    }



    private List<Book> getBooks() {
        ArrayList<Book> books = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            books.add(new Book(
                    String.format(Locale.FRANCE, "Garry Potier Tome %d", i),
                    RANDOM.nextInt(30))
            );
        }
        return books;
    }

}
