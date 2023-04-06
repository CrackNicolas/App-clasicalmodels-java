package Controlador;

public class Controlador_Menu_Busqueda {
    private static Busquedas.Menu_Busquedas vista = new Busquedas.Menu_Busquedas();
    
    public static void Mostrar(){
        vista.setVisible(true);
        Controlador.Controlador_MenuPrincipal.Ocultar();
    }
    public static void Ocultar(){
        vista.setVisible(false);
    }
}