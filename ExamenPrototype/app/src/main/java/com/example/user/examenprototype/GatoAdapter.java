package com.example.user.examenprototype;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 10/09/2016.
 */
public class GatoAdapter extends ArrayAdapter<Gato> {
    public  GatoAdapter(Context context, ArrayList<Gato>Gatos){
        super(context,0,Gatos);
    }
   @Override
    public View getView(int position,View convertView, ViewGroup parent){
        Gato gato=getItem(position);
         if (convertView==null){
             convertView= LayoutInflater.from(getContext()).inflate(R.layout.gato_layout, parent, false);
         }
        TextView tvGato=(TextView)convertView.findViewById(R.id.txv_gato);
       tvGato.setText(gato.getRaza()+" "+gato.getColor());
       return convertView;
        }

    }

