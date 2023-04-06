package Personalizacion;

public class Fondo extends javax.swing.JPanel{
    private final String ruta;
    public Fondo(String ruta){
        this.ruta = ruta;
    }
    @Override
    public void paint(java.awt.Graphics q){
        q.drawImage((new javax.swing.ImageIcon(getClass().getResource(this.ruta)).getImage()),0,0,getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(q);   
    }
}