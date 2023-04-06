package Controlador;

public class Controlador_Mod_Pedidos {
    private static Modificaciones.ModificarPedidos vista = new Modificaciones.ModificarPedidos(); 
    
    public static void Mostrar(){
        vista.setTitle("MODIFICAR PEDIDOS");
        vista.setVisible(true);
        Personalizacion.Personalizar.Tabla(vista.getTabla(),6);
        DB.Sql.ActualizaPedidosModificados(vista.getTabla(),vista.getBuscar().getText());
        Instanciar();
    }
    public static void Modificar(){
        DB.Sql.ModificarPedidos(vista.getBuscar().getText(),vista.getTabla(),vista.getNroCliente(),vista.getComentarios().getText(),vista.getEstado().getText(),vista.getNroOrden().getText());
        Limpiar();
    }
    public static void CargarClientes(String L){
        vista.getNroClient().removeAllItems();
        vista.getNroClient().addItem(L);
        for(Modelo.Cliente i:DB.Sql.ObtenerNroDeClientes()) {
            vista.getNroClient().addItem(Integer.toString(i.getNroCliente()));
        }
        ((javax.swing.JLabel)vista.getNroClient().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }
    public static void Limpiar(){
        vista.getNroOrden().setText("");
        vista.getNombre().setText("");
        vista.getApellido().setText("");
        vista.getTelefono().setText("");
        vista.getEstado().setText("");
        vista.getComentarios().setText("");
        vista.getBuscar().setText("");
        Instanciar();
    }
    public static boolean Verificar(){
        return !(vista.getNroOrden().getText().isEmpty());
    }
    private static void Instanciar(){
        vista.getNroClient().removeAllItems();
        vista.getNroClient().addItem("Seleccinar");
        ((javax.swing.JLabel)vista.getNroClient().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }
}