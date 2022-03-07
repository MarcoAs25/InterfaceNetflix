package com.mrcant.interfacenetflix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvFilmes1,rvFilmes2,rvFilmes3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFilmes1 = findViewById(R.id.rv1);
        rvFilmes2 = findViewById(R.id.rv2);
        rvFilmes3 = findViewById(R.id.rv3);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this);
        layoutManager2.setOrientation(LinearLayoutManager.HORIZONTAL);
        LinearLayoutManager layoutManager3 = new LinearLayoutManager(this);
        layoutManager3.setOrientation(LinearLayoutManager.HORIZONTAL);

        rvFilmes1.setLayoutManager(layoutManager);
        rvFilmes2.setLayoutManager(layoutManager2);
        rvFilmes3.setLayoutManager(layoutManager3);

        Adapter adapter = new Adapter();
        Adapter adapter2 = new Adapter();
        Adapter adapter3 = new Adapter();

        rvFilmes1.setAdapter(adapter);
        rvFilmes2.setAdapter(adapter2);
        rvFilmes3.setAdapter(adapter3);

    }
}