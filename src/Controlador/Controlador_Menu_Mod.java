package Controlador;

public class Controlador_Menu_Mod {
    private static Modificaciones.Menu_Modificaciones vista = new Modificaciones.Menu_Modificaciones();
    
    public static void Mostrar(){
        vista.setVisible(true);
        Controlador.Controlador_MenuPrincipal.Ocultar();
    }
    public static void Ocultar(){
        vista.setVisible(false);
    }
}
