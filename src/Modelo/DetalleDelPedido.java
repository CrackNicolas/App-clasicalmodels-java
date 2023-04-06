package Modelo;
public class DetalleDelPedido extends Object{
    private int NroDeOrden,Cantidad;
    private String CodProducto;
    private double Precio;

    public DetalleDelPedido(){}
    public DetalleDelPedido(int NroDeOrden, String cod, int Cantidad, double Precio) {
        this.NroDeOrden = NroDeOrden;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.CodProducto= cod;
    }
    public void setNroDeOrden(int NroDeOrden) {
        this.NroDeOrden = NroDeOrden;
    }
    public int getNroDeOrden() {
        return NroDeOrden;
    }
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    public double getPrecio() {
        return Precio;
    }    
    public void setCodProducto(String CodProducto) {
        this.CodProducto = CodProducto;
    }
    public String getCodProducto() {
        return CodProducto;
    }
}