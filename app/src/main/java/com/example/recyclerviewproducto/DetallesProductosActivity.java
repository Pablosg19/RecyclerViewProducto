package com.example.recyclerviewproducto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.recyclerviewproducto.clases.Producto;

public class DetallesProductosActivity extends AppCompatActivity {

    private TextView txtDetallesNombre;
    private TextView txtDetallesCantidad;
    private TextView txtDetallesPrecio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_productos);
        txtDetallesNombre = (TextView) findViewById(R.id.txtDetallesNombre);
        txtDetallesCantidad = (TextView) findViewById(R.id.txtDetallesCantidad);
        txtDetallesPrecio = (TextView) findViewById(R.id.txtDetallesPrecio);
        Intent intent = getIntent();
        if(intent != null){
            Producto p = (Producto) intent.getSerializableExtra(ProductoViewHolder.EXTRA_PRODUCTO_ITEM);
            txtDetallesNombre.setText("Nombre: " + p.getNombre());
            txtDetallesCantidad.setText("Cantidad: " + p.getCantidad());
            txtDetallesPrecio.setText("Precio: " + p.getPrecio());
        }
    }
}