package Personalizacion;

import java.awt.Color;
import javax.swing.table.DefaultTableCellRenderer;

public class Personalizar{
    public static void Tabla(javax.swing.JTable tabla,int filas){
        tabla.getTableHeader().setFont(new java.awt.Font("Segue UI",java.awt.Font.BOLD,17));
        tabla.getTableHeader().setOpaque(false);
        tabla.getTableHeader().setBackground(Color.BLACK);
        tabla.getTableHeader().setForeground(Color.GREEN);
        tabla.setBackground(Color.black); 
        tabla.setForeground(Color.WHITE);
        tabla.setRowHeight(23);
        DefaultTableCellRenderer centrar = new DefaultTableCellRenderer();
        centrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        for(int i=0;i<=filas;i++){
            tabla.getColumnModel().getColumn(i).setCellRenderer(centrar);
        }
    }
    public static void Lost(javax.swing.JTextField n,String msm){
        if(n.getText().trim().equals("")){
            n.setText(msm);
        }
        n.setForeground(new Color(153,153,153));
        n.setBackground(Color.BLACK);
    }
    public static void Gained(javax.swing.JTextField n,String msm){
        if(n.getText().trim().equals(msm)){
            n.setText("");
        }
        n.setForeground(Color.CYAN);
        n.setBackground(new Color(51,51,51));
    }
}