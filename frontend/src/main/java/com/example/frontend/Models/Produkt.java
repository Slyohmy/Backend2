package com.example.frontend.Models;

public class Produkt {

    private Long id;
    private String marke;
    private String farg;
    private String storlek;
    private int pris;
    private int antalILager;


    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getFarg() {
        return farg;
    }

    public void setFarg(String farg) {
        this.farg = farg;
    }

    public String getStorlek() {
        return storlek;
    }

    public void setStorlek(String storlek) {
        this.storlek = storlek;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public int getAntalILager() {
        return antalILager;
    }

    public void setAntalILager(int antalILager) {
        this.antalILager = antalILager;
    }
}
