package Controlador;

public class Control_SuperUsuario {
    private static Ventanas.Ventana_SuperUsuario vista_super_usuario = new Ventanas.Ventana_SuperUsuario(); 
    private static Ventanas.Registrar_Usuarios vista_registro_usuario = new Ventanas.Registrar_Usuarios();
    private static int pos = 1;
    
    public static void Mostrar(){
        vista_super_usuario.setVisible(true);
        vista_super_usuario.setTitle("VENTANA SUPER USUARIO");
    }
    public static void Ocultar(){
        vista_super_usuario.setVisible(false);
    }
    public static void BotonAceptar(){
        if(DB.Sql.VerificarSuperUsuario(vista_super_usuario.getUsuario_Reg().getText(),vista_super_usuario.getContraseña_Reg().getText())==1) {     
            MostrarReg();
        }else{
            javax.swing.JOptionPane.showMessageDialog(null,"Acceso denegado");
        }
        Limpiar2();
    }
    public static void MostrarReg(){
        vista_registro_usuario.setVisible(true);
        Ocultar();
    }
    public static void OcultarReg(){
        vista_registro_usuario.setVisible(false);
    }
    private static void Limpiar1(){
        vista_registro_usuario.getContraseña().setText("");
        vista_registro_usuario.getCon_Contraseña().setText("");
        vista_registro_usuario.getUsuario().setText("");
    }
    private static void Limpiar2(){
        vista_super_usuario.getUsuario_Reg().setText("");
        vista_super_usuario.getContraseña_Reg().setText("");
        vista_super_usuario.getVer().setText("");
    }
    public static boolean Verificar(){
        return (vista_super_usuario.getContraseña_Reg().getText().isEmpty() && vista_super_usuario.getUsuario_Reg().getText().isEmpty());
    }
    public static boolean ConfirmarPassword(){
        return vista_registro_usuario.getContraseña().getText().equals(vista_registro_usuario.getCon_Contraseña().getText());          
    }
    public static void RegistrarUsuarios(){
        if(Validar()){
            pos = DB.Sql.Mayor() + 1;
            if(ConfirmarPassword()){
                Modelo.Usuarios usuario = new Modelo.Usuarios(vista_registro_usuario.getUsuario().getText(),vista_registro_usuario.getContraseña().getText());
                usuario.setNro(Integer.toString(pos));
                DB.Sql.AgregarUsuarios(usuario);
                pos++;
                Limpiar1();
            }else{
                javax.swing.JOptionPane.showMessageDialog(null,"Error en la confirmacion de la contraseña");
                vista_registro_usuario.getCon_Contraseña().setText("");
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(null,"Error antes ingrese todos los datos");
        }
    }
    private static boolean Validar(){
        return !(vista_registro_usuario.getUsuario().getText().isEmpty() && vista_registro_usuario.getContraseña().getText().isEmpty() && vista_registro_usuario.getCon_Contraseña().getText().isEmpty());
    }
}