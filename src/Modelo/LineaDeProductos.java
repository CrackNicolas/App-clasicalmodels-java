package Modelo;
public class LineaDeProductos extends Object{
    private String ProductLinea,Descripcion,DescripcionHtml;

    public LineaDeProductos(){}
    public LineaDeProductos(String ProductLinea, String Descripcion, String DescripcionHtml) {
        this.ProductLinea = ProductLinea;
        this.Descripcion = Descripcion;
        this.DescripcionHtml = DescripcionHtml;
    }
    public void setProductLinea(String ProductLinea) {
        this.ProductLinea = ProductLinea;
    }
    public String getProductLinea() {
        return ProductLinea;
    }
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcionHtml(String DescripcionHtml) {
        this.DescripcionHtml = DescripcionHtml;
    }
    public String getDescripcionHtml() {
        return DescripcionHtml;
    }
}