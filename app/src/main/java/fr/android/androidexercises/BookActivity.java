package fr.android.androidexercises;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BookActivity extends AppCompatActivity {

    private String bookName = "Garry Whopper";
    public static int CODE_BOOK_NAME = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        TextView messageTextView = (TextView) findViewById(R.id.messageTextView);
        messageTextView.setText(bookName);

        Button sendNameButton = (Button) findViewById(R.id.sendNameButton);
        sendNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bookName);
                intent.putExtra("bookName",bookName);
                setResult(CODE_BOOK_NAME, intent);
                finish();
                // TODO set result to book name in intent
                // TODO finish current activity
            }
        });
    }


}
