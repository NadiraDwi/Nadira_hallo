package com.example.nadira_hallo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int hitung=0;
    private TextView tampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_toast);

//        String[] arrName = {"Samsung","Sony","Apple","LG","Motorola","HTC","Acer","Lenovo","Oppo","Nokia","BlackBerry","Hua wei","ZTE","Meizu","HP","Asus","Panasonic"};
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrName);
//        ListView anu = (ListView) findViewById(R.id.id_list);
//        anu.setAdapter(adapter);
    }

//    public void daftar(View view) {
//        Toast toast = Toast.makeText(this,"Button sign up ditekan",Toast.LENGTH_SHORT);
//        toast.show();
//    }

    public void toast(View view) {
        Toast toast=Toast.makeText(this, R.string.message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void count(View view) {
        tampil=(TextView)findViewById(R.id.show_count);
        hitung ++;
        tampil.setText(Integer.toString(hitung));
    }

    public void back(View view) {
        tampil=(TextView)findViewById(R.id.show_count);
        hitung --;
        tampil.setText(Integer.toString(hitung));
    }
}
