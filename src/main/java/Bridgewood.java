public class Bridgewood{
    private int classificacao;
    private String nomeHotel;
    private String tipoCliente;
    private Double diaDaSemana;
    private Double fimDESemana;


    public int getClassificacao() {
    classificacao = 4;
        return classificacao;
    }



    public String getNomeHotel() {
        nomeHotel = "Bridgewood";
        return nomeHotel;
    }

    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Double getDiaDaSemana() {
        if (getTipoCliente().equals("regular")){
            this.diaDaSemana=160.0;
        }
        else if(getTipoCliente().equals("rewards")){
            this.diaDaSemana=110.0;
        }
        return diaDaSemana;
    }

    public Double getFimDESemana() {
        if (getTipoCliente().equals("regular")){this.fimDESemana=60.0;}
        else if (getTipoCliente().equals("rewards")){this.fimDESemana=50.0;}
        return fimDESemana;
    }
}
