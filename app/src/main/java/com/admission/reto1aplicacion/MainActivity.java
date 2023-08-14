package com.admission.reto1aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.admission.reto1aplicacion.Adapters.SneakerAdapter;
import com.admission.reto1aplicacion.Model.Sneaker;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    private SneakerAdapter sneakerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            throw  new RuntimeException(e);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.grilla);
        sneakerAdapter = new SneakerAdapter(this);
        gridView.setAdapter(sneakerAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Sneaker item = (Sneaker) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Se seleccionó "+item.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int id = menuItem.getItemId();
        if (id == R.id.menuOptionProducts) {
            Toast.makeText(this,"Se seleccionó Productos", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.menuOptionsServices) {
            Toast.makeText(this, "Se seleccionó Servicios", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.menuOptionSucursales) {
            Toast.makeText(this, "Se seleccionó Sucursales", Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(menuItem);
    }
}