package Controlador;

public class Control_Login {
    private static Ventanas.Ventana_Login vista_login = new Ventanas.Ventana_Login(); 
    private static Ventanas.Inicio vista_inicio = new Ventanas.Inicio();
    
    public static void Mostrar(){
        vista_login.setVisible(true);
        vista_login.setTitle("VENTANA DE ACCESO");
    }
    public static void Ocultar(){
        vista_login.setVisible(false);
    }
    public static void MostrarInicio(){
        vista_inicio.setVisible(true);
        vista_inicio.setTitle("Classic Models");
    }
    public static void OcultarInicio(){
        vista_inicio.setVisible(false);
    }
    public static void BotonAceptar(){
        if(DB.Sql.AdmitirUsuario(vista_login.getUsuario().getText(),vista_login.getContraseña().getText())==1) {
            Controlador.Controlador_MenuPrincipal.Mostrar();
        }else{
            javax.swing.JOptionPane.showMessageDialog(null,"Acceso denegado");
        }
        Limpiar();
    }
    public static void Limpiar(){
        vista_login.getUsuario().setText("");
        vista_login.getContraseña().setText("");
        vista_login.getVer().setText("");
    }
    public static boolean Verificar(){
        return !(vista_login.getUsuario().getText().isEmpty() && vista_login.getContraseña().getText().isEmpty());
    }
}