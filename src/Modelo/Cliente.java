package Modelo;
public class Cliente extends Oficinas{
    private int NroCliente,NroRepresentDeVent;
    private String NomCliente,ContApellid,NomDeContact;
    private double CreditoLim;

    public Cliente(){}
    public Cliente(int NroCliente, String NomCliente,String ContApellid,String Tefefono, String Dir1, String Dir2,String Cuidad, String Estado, String CodPost,String Pais,int NroRepresentDeVent,double CreditoLim) {
        super(Cuidad, Tefefono, Dir1, Dir2, Estado, Pais, CodPost);
        this.NroCliente = NroCliente;
        this.NroRepresentDeVent = NroRepresentDeVent;
        this.NomCliente = NomCliente;
        this.ContApellid = ContApellid;
        this.CreditoLim = CreditoLim;
    }
    public void setNroCliente(int NroCliente) {
        this.NroCliente = NroCliente;
    }
    public int getNroCliente() {
        return NroCliente;
    }
    public void setNroRepresentDeVent(int NroRepresentDeVent) {
        this.NroRepresentDeVent = NroRepresentDeVent;
    }
    public int getNroRepresentDeVent() {
        return NroRepresentDeVent;
    }
    public void setNomCliente(String NomCliente) {
        this.NomCliente = NomCliente;
    }
    public String getNomCliente() {
        return NomCliente;
    }   
    public void setContApellid(String ContApellid) {
        this.ContApellid = ContApellid;
    }
    public String getContApellid() {
        return ContApellid;
    }
    public void setNomDeContact(String NomDeContact) {
        this.NomDeContact = NomDeContact;
    }
    public String getNomDeContact() {
        return NomDeContact;
    }
    public void setCreditoLim(double CreditoLim) {
        this.CreditoLim = CreditoLim;
    }
    public double getCreditoLim() {
        return CreditoLim;
    }
}