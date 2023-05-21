package com.example.instragram.InstagramTemplate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.instragram.R;

import java.util.ArrayList;
import java.util.List;

public class InstagramListviewAdapter extends ArrayAdapter<Chat> {

    private List<Chat> ChatsIG = new ArrayList<>();

    public InstagramListviewAdapter(Context context, List<Chat> datos) {
        super(context, R.layout.listview_layout_template, datos);
        ChatsIG = datos;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.listview_layout_template, null);

        ImageView imvPerfil = (ImageView)item.findViewById(R.id.imvPerfil);
        imvPerfil.setImageResource(ChatsIG.get(position).getFoto());

        TextView lblUsername = (TextView)item.findViewById(R.id.txtUsername);
        lblUsername.setText(ChatsIG.get(position).getNombre());

        TextView lblMensaje = (TextView)item.findViewById(R.id.txtMensaje);
        lblMensaje.setText(ChatsIG.get(position).getMensaje());

        TextView lblHora = (TextView)item.findViewById(R.id.txtHora);
        lblHora.setText(ChatsIG.get(position).getHora());

        return (item);
    }

}
