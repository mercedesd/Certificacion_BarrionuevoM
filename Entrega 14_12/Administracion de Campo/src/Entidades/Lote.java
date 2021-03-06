package Entidades;
// Generated 10/12/2018 8:34:37 by Hibernate Tools 4.3.1

public class Lote  implements java.io.Serializable {


     private Integer idLote;
     private Campo campo;
     private int numeroLote;
     private double superficieLote;
     private int tipoSueloLote;

    public Lote() {
    }

    public Lote(Campo campo, int numeroLote, double superficieLote, int tipoSueloLote) {
       this.campo = campo;
       this.numeroLote = numeroLote;
       this.superficieLote = superficieLote;
       this.tipoSueloLote = tipoSueloLote;
    }
   
    public Integer getIdLote() {
        return this.idLote;
    }
    
    public void setIdLote(Integer idLote) {
        this.idLote = idLote;
    }
    public Campo getCampo() {
        return this.campo;
    }
    
    public void setCampo(Campo campo) {
        this.campo = campo;
    }
    public int getNumeroLote() {
        return this.numeroLote;
    }
    
    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }
    public double getSuperficieLote() {
        return this.superficieLote;
    }
    
    public void setSuperficieLote(double superficieLote) {
        this.superficieLote = superficieLote;
    }
    public int getTipoSueloLote() {
        return this.tipoSueloLote;
    }
    
    public void setTipoSueloLote(int tipoSueloLote) {
        this.tipoSueloLote = tipoSueloLote;
    }




}


