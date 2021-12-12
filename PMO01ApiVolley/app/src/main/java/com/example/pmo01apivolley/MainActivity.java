package com.example.pmo01apivolley;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import com.android.volley.*;
import com.android.volley.toolbox.*;


public class MainActivity extends AppCompatActivity {

    ListView listemple;
    List<empleados> empleadosList;

    ArrayList<String> arrayemple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listemple=(ListView) findViewById(R.id.listemple);
        empleadosList=new ArrayList<>();

        arrayemple =new ArrayList<String>();

        SendRequest();
    }

    private void SendRequest() {

    }
}