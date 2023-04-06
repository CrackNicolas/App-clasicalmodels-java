package Controlador;

import javax.swing.table.DefaultTableModel;

public class Controlador_Bus_Cliente {
    private static Busquedas.BuscarClientes vista = new Busquedas.BuscarClientes(); 
    private static DefaultTableModel tabla = (DefaultTableModel) vista.getTabla().getModel();
        
    public static void Mostrar(){
        vista.setTitle("BUSCAR CLIENTES");
        vista.setVisible(true);
        CargarJefes();
        CargarNrosDeClientes();
        Personalizacion.Personalizar.Tabla(vista.getTabla(),11);
    }
    private static void Limpiar(){
        vista.getN().setText("");
        vista.getApe().setText("");
        vista.getDir1().setText("");
        vista.getCi().setText("");
        vista.getP().setText("");
        CargarJefes();
        CargarNrosDeClientes();
    }
    private static void CargarJefes(){
        vista.getRepresentantes().removeAllItems();
        vista.getRepresentantes().addItem("Seleccionar");
        for(Modelo.Empleados i:DB.Sql.ObtenerNroDeEmpleados()) {
            vista.getRepresentantes().addItem(Integer.toString(i.getNroEmpleado()));
        }
        ((javax.swing.JLabel)vista.getRepresentantes().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }
    private static void CargarNrosDeClientes(){
        vista.getCliente().removeAllItems();
        vista.getCliente().addItem("Seleccionar");
        for(Modelo.Cliente i:DB.Sql.ObtenerNroDeClientes()) {
            vista.getCliente().addItem(Integer.toString(i.getNroCliente()));
        }
        ((javax.swing.JLabel)vista.getCliente().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }
    public static boolean Validar(){
        if((vista.getCliente().getItemAt(vista.getCliente().getSelectedIndex()).equals("Seleccionar") && vista.getRepresentantes().getItemAt(vista.getRepresentantes().getSelectedIndex()).equals("Seleccionar") ) && vista.getP().getText().isEmpty() && vista.getDir1().getText().isEmpty() && vista.getCi().getText().isEmpty() && vista.getN().getText().isEmpty() && vista.getApe().getText().isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(null," Coloque un dato para poder realizar la busqueda");
            return false;
        }
        return true;
    }
    public static void Buscar(){
        boolean band = false;
        tabla.setNumRows(0);
        for(Modelo.Cliente i: DB.Sql.BuscarClientes(vista.getN().getText(),vista.getApe().getText(),vista.getDir1().getText(),vista.getCi().getText(),vista.getP().getText(),vista.getCli(),vista.getRep())){
            tabla.addRow(new Object[]{i.getNroCliente(),i.getNomCliente(),i.getContApellid(),i.getTefefono(),i.getDir1(),i.getDir2(),i.getCuidad(),i.getEstado(),i.getCodPostal(),i.getPais(),i.getNroRepresentDeVent(),i.getCreditoLim()});
            band = true;
        }
        Limpiar();
        if(!band){
            javax.swing.JOptionPane.showMessageDialog(null," No se encontraron resultados");
        }
    }
    public static void Actualizar(){
        tabla.setNumRows(0);
        for(Modelo.Cliente i: DB.Sql.ObtenerClientes()){
            tabla.addRow(new Object[]{i.getNroCliente(),i.getNomCliente(),i.getContApellid(),i.getTefefono(),i.getDir1(),i.getDir2(),i.getCuidad(),i.getEstado(),i.getCodPostal(),i.getPais(),i.getNroRepresentDeVent(),i.getCreditoLim()});
        }
    }
}