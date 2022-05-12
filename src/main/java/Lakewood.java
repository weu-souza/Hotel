public class Lakewood {
    private int classificacao;
    private String nomeHotel;
    private String tipoCliente;
    private Double regularDiaDaSemana;
    private Double rewardDiaDaSemana;
    private Double regularFimDESemana;
    private Double rewardFimDESemana;


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

    public Double getRegularDiaDaSemana() {
        regularDiaDaSemana = 110.0;
        return regularDiaDaSemana;
    }

    public Double getRewardDiaDaSemana() {
        rewardDiaDaSemana=80.0;
        return rewardDiaDaSemana;
    }

    public Double getRegularFimDESemana() {
        regularFimDESemana = 90.0;
        return regularFimDESemana;
    }

    public Double getRewardFimDESemana() {
        rewardFimDESemana = 80.0;
        return rewardFimDESemana;
    }

}
