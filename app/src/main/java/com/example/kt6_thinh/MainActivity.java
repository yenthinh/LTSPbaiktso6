package com.example.kt6_thinh;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.AbstractList;
import java.util.ArrayList;
import com.example.kt6_thinh.LaCo;
import com.example.kt6_thinh.AdapterCo;

public class MainActivity extends AppCompatActivity {
    ListView listdanhsach;
    ArrayList<LaCo> danhsach;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listdanhsach=findViewById(R.id.lvco);
        danhsach=LaCo.dulieu();
        AdapterCo adapterDanhBa= new AdapterCo(MainActivity.this,R.layout.item_co,danhsach);
        listdanhsach.setAdapter(adapterDanhBa);
        listdanhsach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String ten;
                String danso;
                ten=danhsach.get(i).getQuocgia();
                danso=danhsach.get(i).getDanso();
                Toast.makeText( MainActivity.this,ten,Toast.LENGTH_SHORT).show();
            }
        }
        );}
}