package Controlador;
public class Controlador_Cliente {
    private static Ventanas.Cargar_Clientes vista = new Ventanas.Cargar_Clientes();
    
    public static void BotonGuardar(){
        Modelo.Cliente cliente = new Modelo.Cliente();
        cliente.setNroCliente(Integer.parseInt(vista.getNroCliente().getText()));
        cliente.setNomCliente(vista.getNom().getText());
        cliente.setContApellid(vista.getApellido().getText());
        cliente.setTefefono(vista.getTelefono().getText());
        cliente.setDir1(vista.getDir1().getText());
        cliente.setDir2(vista.getDir2().getText());
        cliente.setCuidad(vista.getCiudad().getText());
        cliente.setEstado(vista.getEstadoCivil().getText());
        cliente.setPais(vista.getPais().getText());
        cliente.setNroRepresentDeVent(Integer.parseInt(vista.getRepVendedor()));
        cliente.setCreditoLim(Double.parseDouble(vista.getCredito().getText()));
        cliente.setCodPostal(vista.getCodigoPostal().getText());
        DB.Sql.AgregarClientes(cliente);
        Limpiar();
    }
    public static void Mostrar(){
        vista.setTitle("REGISTRO DE CLIENTES");
        vista.setVisible(true);
        CargarRepresentantes();
        Bloquear();
        Instanciar();
    }
    public static void Limpiar(){
        vista.getApellido().setText(""); 
        vista.getCiudad().setText("");
        vista.getCredito().setText("");
        vista.getTelefono().setText("");  
        vista.getPais().setText(""); 
        vista.getNroCliente().setText(""); 
        vista.getNom().setText(""); 
        vista.getDir1().setText(""); 
        vista.getDir2().setText(""); 
        vista.getEstadoCivil().setText(""); 
        vista.getCodigoPostal().setText("");
        CargarRepresentantes();
        Bloquear();
        Instanciar();
        DesbloquearText();
    }
    private static void Instanciar(){
        vista.getApellido().setText("Ingrese apellido del cliente..."); 
        vista.getCiudad().setText("Ingrese ciudad del cliente...");
        vista.getCredito().setText("Ingrese credito limite del cliente...");
        vista.getTelefono().setText("Ingrese telefono del cliente...");  
        vista.getPais().setText("Ingrese pais del cliente..."); 
        vista.getNroCliente().setText("Ingresar numero del cliente..."); 
        vista.getNom().setText("Ingresar nombre del cliente..."); 
        vista.getDir1().setText("Ingrese direccion 1 del cliente..."); 
        vista.getDir2().setText("Ingrese direccion 2 del cliente..."); 
        vista.getEstadoCivil().setText("Ingrese estado del cliente..."); 
        vista.getCodigoPostal().setText("Ingrese codigo postal del cliente...");
    }
    private static void Bloquear(){
        vista.getGuardar().setEnabled(false);
        vista.getLimpiar().setEnabled(false);
    }
    public static void Desbloquear(){
        vista.getGuardar().setEnabled(true);
        vista.getLimpiar().setEnabled(true);
        BloquearText();
    }
    private static void CargarRepresentantes(){
        vista.getRep().removeAllItems();
        vista.getRep().addItem("Seleccionar representante de ventas");
        for(Modelo.Empleados i:DB.Sql.ObtenerNroDeEmpleados()) {
            vista.getRep().addItem(Integer.toString(i.getNroEmpleado()));
        }
        ((javax.swing.JLabel)vista.getRep().getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }
    public static boolean Verificar(){
        return !(vista.getCodigoPostal().getText().equals("Ingrese codigo postal del cliente...")||vista.getRep().getSelectedItem().equals("Seleccionar representante de ventas")||vista.getApellido().getText().equals("Ingrese apellido del cliente...")||vista.getCiudad().getText().equals("Ingrese ciudad del cliente...")||vista.getCredito().getText().equals("Ingrese credito limite del cliente...")||vista.getCredito().getText().equals("Ingrese telefono del cliente...")||vista.getPais().getText().equals("Ingrese pais del cliente...")||vista.getNroCliente().getText().equals("Ingresar numero del cliente...")||vista.getNom().getText().equals("Ingresar nombre del cliente...")||vista.getDir1().getText().equals("Ingrese direccion 1 del cliente..."));        
    }  
    public static void Vaciar(){
        if(vista.getDir2().getText().equals("Ingrese direccion 2 del cliente...")){
            vista.getDir2().setText("");
        }if(vista.getEstadoCivil().getText().equals("Ingrese estado del cliente...")){
            vista.getEstadoCivil().setText("");
        }
    }
    private static void BloquearText(){
        vista.getApellido().setEnabled(false);
        vista.getCiudad().setEnabled(false);
        vista.getCredito().setEnabled(false);
        vista.getTelefono().setEnabled(false);
        vista.getPais().setEnabled(false);
        vista.getNroCliente().setEnabled(false);
        vista.getNom().setEnabled(false);
        vista.getDir1().setEnabled(false);
        vista.getDir2().setEnabled(false);
        vista.getEstadoCivil().setEnabled(false);
        vista.getCodigoPostal().setEnabled(false);
    }
    private static void DesbloquearText(){
        vista.getApellido().setEnabled(true);
        vista.getCiudad().setEnabled(true);
        vista.getCredito().setEnabled(true);
        vista.getTelefono().setEnabled(true);
        vista.getPais().setEnabled(true);
        vista.getNroCliente().setEnabled(true);
        vista.getNom().setEnabled(true);
        vista.getDir1().setEnabled(true);
        vista.getDir2().setEnabled(true);
        vista.getEstadoCivil().setEnabled(true);
        vista.getCodigoPostal().setEnabled(true);
    }
}