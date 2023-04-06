package Controlador;

public class Controlador_Mod_Usuarios {
    private static Modificaciones.Modificar_Usuarios vista = new Modificaciones.Modificar_Usuarios(); 
    
    public static void Mostrar(){
        vista.setTitle("MODIFICAR USUARIOS");
        vista.setVisible(true);
        Personalizacion.Personalizar.Tabla(vista.getTabla(),2);
        DB.Sql.ActualizarUsuariosModificados(vista.getTabla());
    }
    public static void Limpiar(){
        vista.getUser().setText("");
        vista.getPass().setText("");
        vista.getNro().setText("");
    }
    public static void Modificar(){
        DB.Sql.ModificarUsuarios(vista.getTabla(),vista.getUser().getText(),vista.getPass().getText(),vista.getNro().getText());
        Limpiar();
    }
    public static boolean Verificar(){
        return !(vista.getPass().getText().isEmpty()&&vista.getUser().getText().isEmpty());
    }
}