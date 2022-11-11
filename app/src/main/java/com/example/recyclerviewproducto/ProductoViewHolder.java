package com.example.recyclerviewproducto;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewproducto.clases.Producto;

public class ProductoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public static final String EXTRA_PRODUCTO_ITEM = "com.example.recyclerviewproducto.productoviewholder.producto";
    private TextView txtNombre;
    private TextView txtCantidad;
    private TextView txtPrecio;
    private ImageView imgFoto;

    private ListaProductosAdapter lpa;

    public ProductoViewHolder(@NonNull View itemView, ListaProductosAdapter listaProductosAdapter) {
        super(itemView);
        txtNombre = (TextView) itemView.findViewById(R.id.txtNombre);
        txtCantidad = (TextView) itemView.findViewById(R.id.txtCantidad);
        txtPrecio = (TextView) itemView.findViewById(R.id.txtPrecio);
        imgFoto = (ImageView) itemView.findViewById(R.id.imgCarrito);
        lpa = listaProductosAdapter;
        itemView.setOnClickListener(this);
    }

    public TextView getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(TextView txtNombre) {
        this.txtNombre = txtNombre;
    }

    public TextView getTxtCantidad() {
        return txtCantidad;
    }

    public void setTxtCantidad(TextView txtCantidad) {
        this.txtCantidad = txtCantidad;
    }

    public TextView getTxtPrecio() {
        return txtPrecio;
    }

    public void setTxtPrecio(TextView txtPrecio) {
        this.txtPrecio = txtPrecio;
    }

    public ImageView getImgFoto() {
        return imgFoto;
    }
    public void setImgFoto(ImageView imgFoto) {
        this.imgFoto = imgFoto;
    }

    @Override
    public void onClick(View view) {
        int posicion = getLayoutPosition();
        Producto p = lpa.getProductos().get(posicion);
        Intent intent = new Intent(lpa.getContexto(), DetallesProductosActivity.class);
        intent.putExtra(EXTRA_PRODUCTO_ITEM,p);
        lpa.getContexto().startActivity(intent);
    }
}
