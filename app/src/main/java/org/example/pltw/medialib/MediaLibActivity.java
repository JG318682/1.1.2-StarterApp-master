package org.example.pltw.medialib;

import android.os.Bundle;
import android.app.ListActivity;
import android.widget.ListView;

public class MediaLibActivity extends ListActivity {

    private Song[] songs;
    private ListView songListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_lib);

    }
}

