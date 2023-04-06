package Modelo;
public class Factura extends Producto{
    private int NroEmplead,NroOrdenPedido,NroCliente,CantidadP;
    private String ApeEmplead,ApeCliente,EstadPedido;
    private double precioP;

    public Factura(){}
    public Factura(String CodProduct, String Nombre, String LineaProducto, int NroEmplead, int CantidadP, String ApeEmplead, int NroCliente,String ApeCliente, String EstadPedido, double precioP, int NroOrdenPedido){
        super(CodProduct,Nombre,LineaProducto);
        this.NroEmplead = NroEmplead;
        this.CantidadP = CantidadP;
        this.ApeEmplead = ApeEmplead;
        this.ApeCliente = ApeCliente;
        this.EstadPedido = EstadPedido;
        this.precioP = precioP;
        this.NroCliente = NroCliente;
        this.NroOrdenPedido=NroOrdenPedido;
    }
    public void setNroEmplead(int NroEmplead) {
        this.NroEmplead = NroEmplead;
    }
    public int getNroEmplead() {
        return NroEmplead;
    }
    public void setCantidadP(int CantidadP) {
        this.CantidadP = CantidadP;
    }
    public int getCantidadP() {
        return CantidadP;
    }
    public void setApeEmplead(String ApeEmplead) {
        this.ApeEmplead = ApeEmplead;
    }
    public String getApeEmplead() {
        return ApeEmplead;
    }
    public void setApeCliente(String ApeCliente) {
        this.ApeCliente = ApeCliente;
    } 
    public String getApeCliente() {
        return ApeCliente;
    }
    public void setEstadPedido(String EstadPedido) {
        this.EstadPedido = EstadPedido;
    }
    public String getEstadPedido() {
        return EstadPedido;
    }
    public void setPrecioP(double precioP) {
        this.precioP = precioP;
    }
    public double getPrecioP() {
        return precioP;
    }
    public void setNroCliente(int NroCliente) {
        this.NroCliente = NroCliente;
    }
    public int getNroCliente() {
        return NroCliente;
    }
    public void setNroOrdenPedido(int NroOrdenPedido) {
        this.NroOrdenPedido = NroOrdenPedido;
    }
    public int getNroOrdenPedido() {
        return NroOrdenPedido;
    }
}