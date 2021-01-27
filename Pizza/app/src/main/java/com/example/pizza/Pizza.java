package com.example.pizza;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pizza implements Serializable {
    private String nev;
    private String leiras;
    private Integer ar;
    private int image;
    private String feltet1;
    private int feltet1Ar;
    private String feltet2;
    private int feltet2Ar;
    private String feltet3;
    private int feltet3Ar;
    private String kicsi;
    private int kicsiAr;
    private String kozopes;
    private int kozepesAr;
    private String nagy;
    private int nagyAr;

    public Pizza(String nev, String leiras, Integer ar, int image, String feltet1, int feltet1Ar, String feltet2, int feltet2Ar, String feltet3, int feltet3Ar, String kicsi, int kicsiAr, String kozopes, int kozepesAr, String nagy, int nagyAr) {
        this.nev = nev;
        this.leiras = leiras;
        this.ar = ar;
        this.image = image;
        this.feltet1 = feltet1;
        this.feltet1Ar = feltet1Ar;
        this.feltet2 = feltet2;
        this.feltet2Ar = feltet2Ar;
        this.feltet3 = feltet3;
        this.feltet3Ar = feltet3Ar;
        this.kicsi = kicsi;
        this.kicsiAr = kicsiAr;
        this.kozopes = kozopes;
        this.kozepesAr = kozepesAr;
        this.nagy = nagy;
        this.nagyAr = nagyAr;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getLeiras() {
        return leiras;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }

    public Integer getAr() {
        return ar;
    }

    public void setAr(Integer ar) {
        this.ar = ar;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getFeltet1() {
        return feltet1;
    }

    public void setFeltet1(String feltet1) {
        this.feltet1 = feltet1;
    }

    public int getFeltet1Ar() {
        return feltet1Ar;
    }

    public void setFeltet1Ar(int feltet1Ar) {
        this.feltet1Ar = feltet1Ar;
    }

    public String getFeltet2() {
        return feltet2;
    }

    public void setFeltet2(String feltet2) {
        this.feltet2 = feltet2;
    }

    public int getFeltet2Ar() {
        return feltet2Ar;
    }

    public void setFeltet2Ar(int feltet2Ar) {
        this.feltet2Ar = feltet2Ar;
    }

    public String getFeltet3() {
        return feltet3;
    }

    public void setFeltet3(String feltet3) {
        this.feltet3 = feltet3;
    }

    public int getFeltet3Ar() {
        return feltet3Ar;
    }

    public void setFeltet3Ar(int feltet3Ar) {
        this.feltet3Ar = feltet3Ar;
    }

    public String getKicsi() {
        return kicsi;
    }

    public void setKicsi(String kicsi) {
        this.kicsi = kicsi;
    }

    public int getKicsiAr() {
        return kicsiAr;
    }

    public void setKicsiAr(int kicsiAr) {
        this.kicsiAr = kicsiAr;
    }

    public String getKozopes() {
        return kozopes;
    }

    public void setKozopes(String kozopes) {
        this.kozopes = kozopes;
    }

    public int getKozepesAr() {
        return kozepesAr;
    }

    public void setKozepesAr(int kozepesAr) {
        this.kozepesAr = kozepesAr;
    }

    public String getNagy() {
        return nagy;
    }

    public void setNagy(String nagy) {
        this.nagy = nagy;
    }

    public int getNagyAr() {
        return nagyAr;
    }

    public void setNagyAr(int nagyAr) {
        this.nagyAr = nagyAr;
    }

    public static List<Pizza> getPizzas() {
        List<Pizza> pizza = new ArrayList<>();
        pizza.add(new Pizza("Cannibal", "finom pizza", 18, R.drawable.pizza1, "Gomba", 2, "Extra sajt", 2, "Chili", 3, "Kicsi", 14, "Közepes", 18, "Nagy", 21));
        pizza.add(new Pizza("Regina", "finom pizza", 16, R.drawable.pizza2, "Ketchup plusz", 3, "Extra macharoni", 4, "Chili", 3, "Kicsi", 14, "Közepes", 16, "Nagy", 22));
        pizza.add(new Pizza("Hawaii", "finom pizza", 17, R.drawable.pizza3, "Szósz extra", 4, "Extra sajt", 2, "Chili", 3, "Kicsi", 14, "Közepes", 17, "Nagy", 21));

        return pizza;
    }
}
