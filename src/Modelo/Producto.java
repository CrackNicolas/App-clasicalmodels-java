package Modelo;
public class Producto extends Empleados{
    private String EscalaProduct,Vendedor,Descripcion,CantStock;
    protected String CodProduct,LineaProducto;
    private double Precio,MSRP;

    public Producto() {}
    protected Producto(String Nombre, String CodProduct, String LineaProducto, double Precio){
        super(Nombre);
        this.CodProduct=CodProduct;
        this.LineaProducto=LineaProducto;
        this.Precio=Precio;
    }
    protected Producto(String Nombre, String CodProduct, String LineaProducto){
        super(Nombre);
        this.CodProduct=CodProduct;
        this.LineaProducto=LineaProducto;
    }
    public Producto(String CodProduct, String Nombre, String EscalaProduct, String Vendedor, String Descripcion, String CantStock, double Precio, double MSRP,String LineaProductos) {
        super(Nombre);
        this.CodProduct = CodProduct;
        this.EscalaProduct = EscalaProduct;
        this.Vendedor = Vendedor;
        this.Descripcion = Descripcion;
        this.CantStock = CantStock;
        this.Precio = Precio;
        this.MSRP = MSRP;
        this.LineaProducto = LineaProductos;
    }
    public void setCodProduct(String CodProduct) {
        this.CodProduct = CodProduct;
    }
    public String getCodProduct() {
        return CodProduct;
    }
    public void setEscalaProduct(String EscalaProduct) {
        this.EscalaProduct = EscalaProduct;
    }
    public String getEscalaProduct() {
        return EscalaProduct;
    }
    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }
    public String getVendedor() {
        return Vendedor;
    }
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setCantStock(String CantStock) {
        this.CantStock = CantStock;
    }
    public String getCantStock() {
        return CantStock;
    }
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setMSRP(double MSRP) {
        this.MSRP = MSRP;
    }
    public double getMSRP() {
        return MSRP;
    }
    public void setLineaProducto(String LineaProducto) {
        this.LineaProducto = LineaProducto;
    }
    public String getLineaProducto() {
        return LineaProducto;
    }
}