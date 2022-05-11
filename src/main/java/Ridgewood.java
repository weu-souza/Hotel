public class Ridgewood {
    private int classificacao;
    private String nomeHotel;
    private String tipoCliente;
    private Double diaDaSemana;
    private Double fimDESemana;

    public int getClassificacao() {
        classificacao = 5;
        return classificacao;
    }

    public String getNomeHotel() {
        nomeHotel = "Ridgewood";
        return nomeHotel;
    }
    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Double getDiaDaSemana() {
        if (getTipoCliente().equals("regular")){
            this.diaDaSemana=220.0;
        }
        else if(getTipoCliente().equals("rewards")){
            this.diaDaSemana=100.0;
        }
        return diaDaSemana;
    }

    public Double getFimDESemana() {
        if (getTipoCliente().equals("regular")){this.fimDESemana=150.0;}
        else if (getTipoCliente().equals("rewards")){this.fimDESemana=40.0;}
        return fimDESemana;
    }

}
