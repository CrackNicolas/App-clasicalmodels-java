package Modelo;
public class Fecha {
    private int dia=0,mes=0,año=0;
    
    public Fecha(){
        dia = java.util.Calendar.getInstance().get(java.util.Calendar.DAY_OF_MONTH);
        mes = java.util.Calendar.getInstance().get(java.util.Calendar.MONTH)+1;
        año = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
    }
    public Fecha(int d,int m,int a){
        this.dia=d;
        this.mes=m;
        this.año=a;
    }
    @Override
    public String toString(){
        return año+"-"+mes+"-"+dia;
    }
}
