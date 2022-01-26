package com.example.beninging;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import android.app.Activity;
import android.os.Bundle;
import android.app.ListActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
    TextView selection;
    private static final String[] items={"lorem", "ipsum", "dolor",
            "sit", "amet",
            "consectetuer", "adipiscing", "elit", "morbi", "vel",
            "ligula", "vitae", "arcu", "aliquet", "mollis",
            "etiam", "vel", "erat", "placerat", "ante",
            "porttitor", "sodales", "pellentesque", "augue", "purus"};

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);
        setListAdapter(new IconicAdapter());
        selection=(TextView)findViewById(R.id.selection);
    }

    public void onListItemClick(ListView parent, View v,
                                int position, long id) {
        selection.setText(items[position]);
    }

    class IconicAdapter extends ArrayAdapter<String> {
        IconicAdapter() {
            super(MainActivity.this, R.layout.row, R.id.label, items);
        }

        public View getView(int position, View convertView,
                            ViewGroup parent) {
            View row=super.getView(position, convertView, parent);
            ImageView icon=(ImageView)row.findViewById(R.id.icon);

            if (items[position].length()>4) {
                icon.setImageResource(R.drawable.no);
            }
            else {
                icon.setImageResource(R.drawable.ok);
            }

            return(row);
        }
    }
}