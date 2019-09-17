package com.e.fragmentmahasiswa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        Button btnSimpan = (Button)findViewById(R.id.btnSimpan);
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameMain, new DaftarFragment());
                fragmentTransaction.commit();
                View b = findViewById(R.id.btnTambah);
                b.setVisibility(View.VISIBLE);
                View c = findViewById(R.id.btnSimpan);
                c.setVisibility(View.GONE);
                View d = findViewById(R.id.button5);
                d.setVisibility(View.VISIBLE);
                View e = findViewById(R.id.button6);
                e.setVisibility(View.VISIBLE);
            }
        });
        Button btnTambah = (Button)findViewById(R.id.btnTambah);
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameMain, new TambahFragment());
                fragmentTransaction.commit();
                View b = findViewById(R.id.btnTambah);
                b.setVisibility(View.GONE);
                View c = findViewById(R.id.btnSimpan);
                c.setVisibility(View.VISIBLE);
                View d = findViewById(R.id.button5);
                d.setVisibility(View.GONE);
                View e = findViewById(R.id.button6);
                e.setVisibility(View.GONE);
            }
        });
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frameMain,new DaftarFragment());
        ft.commit();
    }
}
