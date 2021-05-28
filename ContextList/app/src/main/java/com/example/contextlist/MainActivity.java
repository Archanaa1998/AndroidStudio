
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.contextlist.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView list_view;
    List<String> list=new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list_view=findViewById(R.id.list_view);
        list.add("Monitor");
        list.add("Keyboard");
        list.add("Mouse");
        list.add("Motherboard");
        list.add("Hard Disk");
        adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
        list_view.setAdapter(adapter);
        registerForContextMenu(list_view);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        AdapterView.AdapterContextMenuInfo info=(AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId())
        {
            case R.id.delete_id:
            list.remove(info.position);
            adapter.notifyDataSetChanged();
            return (true);
            default:
                return super.onContextItemSelected(item);
        }
    }
}