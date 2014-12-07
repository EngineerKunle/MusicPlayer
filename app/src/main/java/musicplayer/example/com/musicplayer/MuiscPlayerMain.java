package musicplayer.example.com.musicplayer;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;




import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.ContentResolver;
import android.database.Cursor;
import android.widget.ListView;
import android.net.Uri;


public class MuiscPlayerMain extends Activity {

    private ArrayList<Song> songList;
    private ListView songView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muisc_player_main);
        songView = (ListView)findViewById(R.id.song_list);
        songList = new ArrayList<Song>();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.muisc_player_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void getSongList() {
        //retrieve song info
    }
}
