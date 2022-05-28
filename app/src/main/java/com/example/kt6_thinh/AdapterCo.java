package com.example.kt6_thinh;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.example.kt6_thinh.R;
import com.example.kt6_thinh.LaCo;

public class AdapterCo extends ArrayAdapter<LaCo> {
    Context context;
    int res;
    ArrayList<LaCo> listDanhsach;
    public AdapterCo(@NonNull Context context, int resource, @NonNull ArrayList<LaCo> objects) {
        super(context, resource, objects);
        this.context=context;
        this.res=resource;
        this.listDanhsach=objects;
    }

    public AdapterCo(@NonNull Context context, int resource, @NonNull List<LaCo> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null)
            convertView= LayoutInflater.from(context).inflate(res,parent,false);
        TextView ten=convertView.findViewById(R.id.quocgia);
        ImageView logo=convertView.findViewById(R.id.anh);
        TextView danso=convertView.findViewById(R.id.danso);

        LaCo ds=listDanhsach.get(position);
        int anh=ds.getAnh();
        logo.setImageResource(anh);
        String tenquocgia=ds.getQuocgia();
        ten.setText(tenquocgia);
        String soluong= ds.getDanso();
        danso.setText(soluong);
        return convertView;
}}