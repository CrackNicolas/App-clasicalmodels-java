package Modelo;

import java.util.Date;

public class Pedidos extends Oficinas{
    private int NroDeOrden,NroDeCliente;
    private String Comentarios;
    private Date f1,f2,f3;
    
    public Pedidos(){}
    public Pedidos(int NroDeOrden, String Estado, int NroDeCliente, String Comentarios, Date f1, Date f2, Date f3){
        super(Estado);
        this.NroDeOrden = NroDeOrden;
        this.NroDeCliente = NroDeCliente;
        this.Comentarios = Comentarios;
        this.f1=f1;
        this.f2=f2;
        this.f3=f3;
    }
    public void setNroDeOrden(int NroDeOrden) {
        this.NroDeOrden = NroDeOrden;
    }
    public int getNroDeOrden() {
        return NroDeOrden;
    }
    public void setNroDeCliente(int NroDeCliente) {
        this.NroDeCliente = NroDeCliente;
    }
    public int getNroDeCliente() {
        return NroDeCliente;
    }
    public void setComentarios(String Comentarios) {
        this.Comentarios = Comentarios;
    }
    public String getComentarios() {
        return Comentarios;
    }
    public void setFechaOrden(Date f1) {
        this.f1 = f1;
    }
    public Date getFechaOrden() {
        return f1;
    }
    public void setFechaRequerida(Date f2) {
        this.f2 = f2;
    }
    public Date getFechaRequerida() {
        return f2;
    }
    public void setFechaEnvio(Date f3) {
        this.f3 = f3;
    }
    public Date getFechaEnvio() {
        return f3;
    }
}