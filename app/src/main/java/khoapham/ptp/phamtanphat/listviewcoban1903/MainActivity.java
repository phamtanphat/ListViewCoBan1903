package khoapham.ptp.phamtanphat.listviewcoban1903;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> mangmonhoc = new ArrayList<>();
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listview);
        mangmonhoc.add("Toan");
        mangmonhoc.add("Ly");
        mangmonhoc.add("Hoa");
        mangmonhoc.add("Anh van");
        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,mangmonhoc);
        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                mangmonhoc.remove(position);
                arrayAdapter.notifyDataSetChanged();
                Log.d("BBB",mangmonhoc.size()  + "");
                return true;
            }
        });
    }
}
