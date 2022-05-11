public class Lakewood {
    private int classificacao;
    private String nomeHotel;
    private String tipoCliente;
    private Double diaDaSemana;
    private Double fimDESemana;


    public int getClassificacao() {
        classificacao = 3;
        return classificacao;
    }

    public String getNomeHotel() {
        nomeHotel = "Lakewood";
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
            this.diaDaSemana=110.0;
        }
        else if(getTipoCliente().equals("rewards")){
            this.diaDaSemana=90.0;
        }

        return diaDaSemana;
    }

    public Double getFimDESemana() {
        if (getTipoCliente().equals("regular")) {
            this.fimDESemana=80.0;
        }
        else if (getTipoCliente().equals("rewards")){
            this.fimDESemana=80.0;
        }
        return fimDESemana;
    }

}
