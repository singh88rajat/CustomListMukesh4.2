package com.example.mypc.customlistmukesh42;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mypc.customlistmukesh42.Adapter.CustomAdapterView;
import com.example.mypc.customlistmukesh42.CustomHandler.CustomHandler;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
   ListView list;
    String name[]=new String[]{
            "Name 1","Name2", "Name 3", "Name 4", "Name 5", "Name 6" } ;
    String phone[] = new String []{"9988998877","9988998877","9988998877","9988998877","9988998877","9988998877"};

    ArrayList<CustomHandler> model= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_layout);
        list = (ListView) findViewById(R.id.list);
        for(int i=0; i<name.length; i++){
            CustomHandler handler= new CustomHandler();
            handler.setName(name[i]);
            handler.setPhonenumber(phone[i]);
            model.add(handler);
        }
        CustomAdapterView adapter1= new CustomAdapterView(this, model);
        list.setAdapter(adapter1);
        list.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Toast.makeText(this,name[position], Toast.LENGTH_SHORT).show();
    }
}
