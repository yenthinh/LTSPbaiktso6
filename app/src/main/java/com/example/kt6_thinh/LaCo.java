package com.example.kt6_thinh;

import java.util.ArrayList;

public class LaCo {
    int anh;
    String quocgia;
    String danso;

    public LaCo(int anh, String quocgia, String danso) {
        this.anh = anh;
        this.quocgia = quocgia;
        this.danso = danso;
    }

    public LaCo() {
        anh = Integer.parseInt("");
        quocgia = "";
        danso = "";
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public String getDanso() {
        return danso;
    }

    public void setDanso(String danso) {
        this.danso = danso;
    }
    public static ArrayList<LaCo> dulieu(){
        ArrayList<LaCo> x=new ArrayList<>();
        int anh[]={R.drawable.vn,R.drawable.belgium,R.drawable.bulgaria,R.drawable.hungary,R.drawable.mexico,R.drawable.ru,R.drawable.spain,R.drawable.us};
        String quocgia[]={"Vietnam","Belgium","Bulgaria","Hungary","Mexico","Russia","Spain","United States"};
        String danso[]={"Population:98000000","Population:11560000","Population:6927000","Population:9750000","Population:98000000","Population:98000000","Population:98000000","Population:98000000"};
        for (int i=0;i<anh.length;i++)
            x.add(new LaCo(anh[i],quocgia[i],danso[i]));
        return x;
    }
}
