package Controlador;

public class Controlador_Oficina {
    private static Ventanas.Cargar_Oficinas vista = new Ventanas.Cargar_Oficinas();
    
    public static void BotonGuardar(){
        Modelo.Oficinas oficina = new Modelo.Oficinas();
        oficina.setCodOffic(vista.getCod().getText());
        oficina.setCodPostal(vista.getCodigoPostal().getText());
        oficina.setCuidad(vista.getCiudad().getText());
        oficina.setDir1(vista.getDir1().getText());
        oficina.setDir2(vista.getDir2().getText());
        oficina.setEstado(vista.getEstado().getText());
        oficina.setPais(vista.getPais().getText());
        oficina.setTefefono(vista.getTelefono().getText());
        oficina.setTerritorio(vista.getTerritorio().getText());
        DB.Sql.AgregarOficinas(oficina);
        Limpiar();
    }
    public static void Mostrar(){
        vista.setTitle("REGISTRO OFICINAS");
        vista.setVisible(true);
        Bloquear();
        Instanciar();
    }
    public static void Limpiar(){
        vista.getCiudad().setText(""); 
        vista.getTerritorio().setText("");
        vista.getTelefono().setText("");
        vista.getCod().setText(""); 
        vista.getCodigoPostal().setText(""); 
        vista.getDir1().setText(""); 
        vista.getDir2().setText(""); 
        vista.getEstado().setText(""); 
        vista.getPais().setText(""); 
        Bloquear();
        Instanciar();
        DesbloquearText();
    }
    public static void Instanciar(){
        vista.getCiudad().setText("Ingresar ciudad de la oficina..."); 
        vista.getTerritorio().setText("Ingresar territorio de la oficina...");
        vista.getTelefono().setText("Ingresar telefono de la oficina...");
        vista.getCod().setText("Ingresar codigo de la oficina..."); 
        vista.getCodigoPostal().setText("Ingresar codigo postal de la oficina..."); 
        vista.getDir1().setText("Ingresar direccion 1 de la oficina..."); 
        vista.getDir2().setText("Ingresar direccion 2 de la oficina..."); 
        vista.getEstado().setText("Ingresar estado de la oficina..."); 
        vista.getPais().setText("Ingresar pais de la oficina..."); 
    }
    public static void Bloquear(){
        vista.getGuardar().setEnabled(false);
        vista.getLimpiar().setEnabled(false);
    }
    public static void Desbloquear(){
        vista.getGuardar().setEnabled(true);
        vista.getLimpiar().setEnabled(true);
        BloquearText();
    }
    public static boolean Verificar(){
        return !(vista.getTerritorio().getText().equals("Ingresar territorio de la oficina...")||vista.getCod().getText().equals("Ingresar codigo de la oficina...")||vista.getCiudad().getText().equals("Ingresar ciudad de la oficina...")||vista.getTelefono().getText().equals("Ingresar telefono de la oficina...")||vista.getDir1().getText().equals("Ingresar direccion 1 de la oficina...")||vista.getPais().getText().equals("Ingresar pais de la oficina...")||vista.getCodigoPostal().getText().equals("Ingresar codigo postal de la oficina..."));        
    } 
    public static void Vaciar(){
        if(vista.getDir2().getText().equals("Ingresar direccion 2 de la oficina...")){
            vista.getDir2().setText("");
        }
        if(vista.getEstado().getText().equals("Ingresar estado de la oficina...")){
            vista.getEstado().setText("");
        }
    }
    private static void BloquearText(){
        vista.getCiudad().setEnabled(false); 
        vista.getTerritorio().setEnabled(false); 
        vista.getTelefono().setEnabled(false); 
        vista.getCod().setEnabled(false); 
        vista.getCodigoPostal().setEnabled(false); 
        vista.getDir1().setEnabled(false); 
        vista.getDir2().setEnabled(false); 
        vista.getEstado().setEnabled(false); 
        vista.getPais().setEnabled(false); 
    }
    private static void DesbloquearText(){
        vista.getCiudad().setEnabled(true);
        vista.getTerritorio().setEnabled(true);
        vista.getTelefono().setEnabled(true);
        vista.getCod().setEnabled(true);
        vista.getCodigoPostal().setEnabled(true);
        vista.getDir1().setEnabled(true);
        vista.getDir2().setEnabled(true);
        vista.getEstado().setEnabled(true);
        vista.getPais().setEnabled(true);
    }
}