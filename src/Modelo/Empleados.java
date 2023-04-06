package Modelo;
public class Empleados extends Object{
    private int NroEmpleado,Jefe;
    private String Apellido,Extencion,Email,CodOffic,TituloProf,Nombre;

    public Empleados(){}
    protected Empleados(String Nombre){
        this.Nombre=Nombre;
    }
    public Empleados(int NroEmpleado, String Apellido, String Nombre, String Extencion, int Jefe, String CodOffic, String TituloProf, String Email) {
        this.NroEmpleado = NroEmpleado;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.Extencion = Extencion;
        this.Email = Email;
        this.CodOffic = CodOffic;
        this.Jefe = Jefe;
        this.TituloProf = TituloProf;
    }
    public void setNroEmpleado(int NroEmpleado) {
        this.NroEmpleado = NroEmpleado;
    }
    public int getNroEmpleado() {
        return NroEmpleado;
    }
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setExtencion(String Extencion) {
        this.Extencion = Extencion;
    }
    public String getExtencion() {
        return Extencion;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getEmail() {
        return Email;
    }
    public void setCodOffic(String CodOffic) {
        this.CodOffic = CodOffic;
    }
    public String getCodOffic() {
        return CodOffic;
    }
    public void setJefe(int Jefe) {
        this.Jefe = Jefe;
    }
    public int getJefe() {
        return Jefe;
    }
    public void setTituloProf(String TituloProf) {
        this.TituloProf = TituloProf;
    }
    public String getTituloProf() {
        return TituloProf;
    } 
}