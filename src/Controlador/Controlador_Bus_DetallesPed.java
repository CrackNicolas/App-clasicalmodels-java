package Controlador;

import javax.swing.table.DefaultTableModel;

public class Controlador_Bus_DetallesPed {
    private static Busquedas.BuscarDetallesPedidos vista = new Busquedas.BuscarDetallesPedidos(); 
    private static DefaultTableModel Tabla = (DefaultTableModel) vista.getTabla().getModel();
        
    public static void Mostrar(){
        vista.setTitle("BUSCAR DETALLES DEL PEDIDO");
        vista.setVisible(true);
        Personalizacion.Personalizar.Tabla(vista.getTabla(),3);
        CargarCodigos();
    }
    private static void Limpiar(){
        vista.getCantidadP().setText("");
        vista.getOrden().setText("");
        vista.getPrecio().setText("");
        CargarCodigos();
    }
    private static void CargarCodigos(){
        vista.getCodigosP().removeAllItems();
        vista.getCodigosP().addItem("Seleccionar");
        for(Modelo.Producto i:DB.Sql.ObtenerCodProductos()) {
            vista.getCodigosP().addItem(i.getCodProduct());
        }
        ((javax.swing.JLabel)vista.getCodigosP().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }
    public static boolean Validar(){
        if(vista.getCodigosP().getItemAt(vista.getCodigosP().getSelectedIndex()).equals("Seleccionar")&&vista.getPrecio().getText().isEmpty()&&vista.getOrden().getText().isEmpty()&&vista.getCantidadP().getText().isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(null," Coloque un dato para poder realizar la busqueda");
            return false;
        }
        return true;
    }
    public static void Buscar(){
        boolean band = false;
        Tabla.setNumRows(0);
        for(Modelo.DetalleDelPedido i: DB.Sql.BuscarDetallesP(vista.getOrden().getText(),vista.getCodigo(),vista.getCantidadP().getText(),vista.getPrecio().getText())){
            Tabla.addRow(new Object[]{i.getNroDeOrden(),i.getCodProducto(),i.getCantidad(),i.getPrecio()});
            band = true;
        }
        Limpiar();
        if(!band){
            javax.swing.JOptionPane.showMessageDialog(null," No se encontraron resultados");
        }
    }
    public static void Actualizar(){
        Tabla.setNumRows(0);
        for(Modelo.DetalleDelPedido i: DB.Sql.ObtenerDetallesDelPedido()){
            Tabla.addRow(new Object[]{i.getNroDeOrden(),i.getCodProducto(),i.getCantidad(),i.getPrecio()});
        }
    }
}