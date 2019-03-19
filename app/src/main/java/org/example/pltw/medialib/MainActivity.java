package org.example.pltw.medialib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView welcomeText = (TextView) findViewById(R.id.welcomeTextView);
        Greeter greeter = new Greeter();
        welcomeText.setText(greeter.message);

    }

    /**
     * This method is called when the Show Contents button is clicked
     **/
    public void showMedia(View v) {

        TextView outputText = (TextView) findViewById(R.id.mediaLibText);
        outputText.append("\n");

        Song song1 = new Song();
        song1.setTitle("Johnny B. Goode");
        outputText.append(song1.getTitle());
        outputText.append("\n");

        Book book1 = new Book();
        book1.setTitle("Blank Slate");
        outputText.append(book1.getTitle());
        outputText.append("\n");

        Book movie1 = new Book();
        movie1.setTitle("Big Labowski");
        outputText.append(movie1.getTitle());
        outputText.append("\n");
    }
    public class Greeter {
        public String message = "Welcome to your Media Library";
    }
}
