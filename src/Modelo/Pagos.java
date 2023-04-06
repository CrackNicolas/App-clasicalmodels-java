package Modelo;

public class Pagos extends Object{
    private int NroDeCliente;
    private String VerifNroCliente,fecha;
    private double Cantidad;
    
    public Pagos(){}
    public Pagos(int NroDeCliente, String VerifNroCliente, double Cantidad, String fecha) {
        this.NroDeCliente = NroDeCliente;
        this.VerifNroCliente = VerifNroCliente;
        this.Cantidad = Cantidad;
        this.fecha=fecha;
    }
    public void setNroDeCliente(int NroDeCliente){
        this.NroDeCliente = NroDeCliente;
    }
    public int getNroDeCliente(){
        return NroDeCliente;
    }
    public void setVerifNroCliente(String VerifNroCliente){
        this.VerifNroCliente = VerifNroCliente;
    }
    public String getVerifNroCliente(){
        return VerifNroCliente;
    }
    public void setCantidad(double Cantidad){
        this.Cantidad = Cantidad;
    }
    public double getCantidad(){
        return Cantidad;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getFecha() {
        return fecha;
    }
}