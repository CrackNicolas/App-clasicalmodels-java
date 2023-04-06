package Modelo;
public class Usuarios {
    private String password, users, Nro;
    
    public Usuarios(String users, String password){
        this.password = password;
        this.users = users;
    }
    public String getUsuario(){
        return users;
    }
    public String getPassword(){
        return password;
    }
    public void setNro(String Nro){
        this.Nro = Nro;
    }
    public String getNro(){
        return Nro;
    }
}
