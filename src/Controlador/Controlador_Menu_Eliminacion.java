package Controlador;

public class Controlador_Menu_Eliminacion {
    private static Eliminaciones.Menu_Eliminaciones vista = new Eliminaciones.Menu_Eliminaciones();
    
    public static void Mostrar(){
        vista.setVisible(true);
        Controlador.Controlador_MenuPrincipal.Ocultar();
    }
    public static void Ocultar(){
        vista.setVisible(false);
    }
}
