package com.example.recyclerviewproducto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewproducto.clases.Producto;

import java.util.ArrayList;

public class ListaProductosAdapter extends RecyclerView.Adapter<ProductoViewHolder> {

    Context contexto = null;
    ArrayList<Producto> productos = null;
    LayoutInflater inflate = null;

    public ListaProductosAdapter(Context contexto, ArrayList<Producto> productos) {
        this.contexto = contexto;
        this.productos = productos;
        inflate = LayoutInflater.from(this.contexto);
    }

    @NonNull
    @Override
    public ProductoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = inflate.inflate(R.layout.item_producto,parent,false);
        ProductoViewHolder evh = new ProductoViewHolder(mItemView,this);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductoViewHolder holder, int position) {
        Producto productoSeleccionado = this.productos.get(position);
        holder.getTxtNombre().setText("Nombre: " + productoSeleccionado.getNombre());
        holder.getTxtCantidad().setText("Cantidad: " + String.valueOf(productoSeleccionado.getCantidad()));
        holder.getTxtPrecio().setText("Precio: " + String.valueOf(productoSeleccionado.getPrecio()));
        holder.getImgFoto().setImageResource(R.drawable.carrito);
    }

    @Override
    public int getItemCount()
    {
        return productos.size();
    }

    public Context getContexto() {
        return contexto;
    }

    public void setContexto(Context contexto) {
        this.contexto = contexto;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}

