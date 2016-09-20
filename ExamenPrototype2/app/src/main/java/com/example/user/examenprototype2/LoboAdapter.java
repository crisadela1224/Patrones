package com.example.user.examenprototype2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 13/09/2016.
 */
public class LoboAdapter extends ArrayAdapter<Lobo> {

    public LoboAdapter(Context context, ArrayList<Lobo> lobos) {
        super(context, 0, lobos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Lobo lobo = getItem(position);
        if(convertView==null){

            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.lobo_layout, parent, false);
        }

        TextView txvLobo = (TextView) convertView.findViewById(R.id.tvx_lobos);

        txvLobo.setText(lobo.getRaza()+ " "+lobo.getHabitat());

        return convertView;
    }
}
