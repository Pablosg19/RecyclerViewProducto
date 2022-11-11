package com.example.recyclerviewproducto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Configuration;
import android.os.Bundle;

import com.example.recyclerviewproducto.clases.Producto;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvProducto = null;
    private ArrayList<Producto> productos = null;
    private ListaProductosAdapter adaptadorProductos = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvProducto =(RecyclerView) findViewById(R.id.rvProducto);
        productos = new ArrayList<Producto>();
        productos.add(new Producto("Lechuga", 0.79, 2));
        productos.add(new Producto("Limón", 1.28, 1));
        productos.add(new Producto("Tomate", 1.32, 2));
        productos.add(new Producto("Pepino", 1.45,1));
        productos.add(new Producto("Pizza", 2.10, 4));
        productos.add(new Producto("Jamón York", 1.07, 2));
        productos.add(new Producto("Manzana", 2.02, 3));
        productos.add(new Producto("Platano", 2.49, 2));

        adaptadorProductos = new ListaProductosAdapter(this,productos);
        rvProducto.setAdapter(adaptadorProductos);
        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // In landscape
            rvProducto.setLayoutManager(new GridLayoutManager(this,2));
        } else {
            // In portrait
            rvProducto.setLayoutManager(new LinearLayoutManager(this));
        }
    }
}