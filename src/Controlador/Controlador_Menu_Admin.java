package Controlador;

public class Controlador_Menu_Admin {
    private static Ventanas.Menu_Administracion vista = new Ventanas.Menu_Administracion();
    
    public static void Mostrar(){
        vista.setVisible(true);
        Controlador.Controlador_MenuPrincipal.Ocultar();
    }
    public static void Ocultar(){
        vista.setVisible(false);
    }
}