package Controlador;

public class Controlador_Mod_Oficinas {
    private static Modificaciones.ModificarOficinas vista = new Modificaciones.ModificarOficinas(); 
    
    public static void Mostrar(){
        vista.setTitle("MODIFICAR OFICINAS");
        vista.setVisible(true);
        Personalizacion.Personalizar.Tabla(vista.getTabla(),8);
        DB.Sql.ActualizaOficinasModificados(vista.getTabla(),vista.getBuscar().getText());
    }
    public static void Modificar(){
        DB.Sql.ModificarOficinas(vista.getBuscar().getText(),vista.getTabla(),vista.getTerritorio().getText(),vista.getPais().getText(),vista.getCodigoP().getText(),vista.getEstado().getText(),vista.getDir1().getText(),vista.getDir2().getText(),vista.getCiudad().getText(),vista.getTelefono().getText(),vista.getCodigo().getText());
        Limpiar();
    }
    public static void Limpiar(){
        vista.getCodigo().setText("");
        vista.getCiudad().setText("");
        vista.getTelefono().setText("");
        vista.getDir1().setText("");
        vista.getPais().setText("");
        vista.getCodigoP().setText("");
        vista.getPais().setText("");
        vista.getDir2().setText("");
        vista.getEstado().setText("");
        vista.getTerritorio().setText("");
        vista.getBuscar().setText("");
    }
    public static boolean Verificar(){
        return !(vista.getCodigoP().getText().isEmpty()||vista.getTerritorio().getText().isEmpty()&&vista.getCiudad().getText().isEmpty()&&vista.getDir1().getText().isEmpty()&&vista.getTelefono().getText().isEmpty()&&vista.getPais().getText().isEmpty());
    }
}