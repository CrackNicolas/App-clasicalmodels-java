package Controlador;

public class Controlador_MenuPrincipal {
    private static Ventanas.Menu_Principal vista = new Ventanas.Menu_Principal();
    
    public static void Mostrar(){
        vista.setVisible(true);
        Controlador.Control_Login.Ocultar();
    }
    public static void Ocultar(){
        vista.setVisible(false);
    }
}