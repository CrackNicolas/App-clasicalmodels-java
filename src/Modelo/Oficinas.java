package Modelo;
public class Oficinas extends Object{
    private String Cuidad,Tefefono,Dir1,Dir2,Estado,Pais,CodPostal,CodOffic,Territorio;

    public Oficinas(){}
    protected Oficinas(String Estado){
        this.Estado=Estado;
    }
    protected Oficinas(String Cuidad, String Tefefono, String Dir1, String Dir2, String Estado, String Pais, String CodPost){
        this.Cuidad = Cuidad;
        this.Tefefono = Tefefono;
        this.Dir1 = Dir1;
        this.Dir2 = Dir2;
        this.Estado = Estado;
        this.Pais = Pais;
        this.CodPostal = CodPost;
    }
    public Oficinas(String CodOffic, String Cuidad, String Tefefono, String Dir1, String Dir2, String Estado, String Pais, String CodPostal, String Territorio) {
        this.CodOffic = CodOffic;
        this.Cuidad = Cuidad;
        this.Tefefono = Tefefono;
        this.Dir1 = Dir1;
        this.Dir2 = Dir2;
        this.Estado = Estado;
        this.Pais = Pais;
        this.CodPostal = CodPostal;
        this.Territorio = Territorio;
    }
    public void setCodOffic(String CodOffic) {
        this.CodOffic = CodOffic;
    }
    public String getCodOffic() {
        return CodOffic;
    }
    public void setCuidad(String Cuidad) {
        this.Cuidad = Cuidad;
    }
    public String getCuidad() {
        return Cuidad;
    }   
    public void setTefefono(String Tefefono) {
        this.Tefefono = Tefefono;
    }
    public String getTefefono() {
        return Tefefono;
    }
    public void setDir1(String Dir1) {
        this.Dir1 = Dir1;
    }
    public String getDir1() {
        return Dir1;
    }
    public void setDir2(String Dir2) {
        this.Dir2 = Dir2;
    }
    public String getDir2() {
        return Dir2;
    }
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    public String getEstado() {
        return Estado;
    }
    public void setPais(String Pais) {
        this.Pais = Pais;
    }
    public String getPais() {
        return Pais;
    }
    public void setCodPostal(String CodPostal) {
        this.CodPostal = CodPostal;
    }
    public String getCodPostal() {
        return CodPostal;
    }
    public void setTerritorio(String Territorio) {
        this.Territorio = Territorio;
    }
    public String getTerritorio() {
        return Territorio;
    }
}