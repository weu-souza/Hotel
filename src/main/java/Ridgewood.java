public class Ridgewood {
    private int classificacao;
    private String nomeHotel;
    private String tipoCliente;
    private Double regularDiaDaSemana;
    private Double rewardDiaDaSemana;
    private Double regularFimDESemana;
    private Double rewardFimDESemana;

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
    public Double getRegularDiaDaSemana() {
        regularDiaDaSemana = 220.0;
        return regularDiaDaSemana;
    }

    public Double getRewardDiaDaSemana() {
        rewardDiaDaSemana=100.0;
        return rewardDiaDaSemana;
    }

    public Double getRegularFimDESemana() {
        regularFimDESemana = 150.0;
        return regularFimDESemana;
    }

    public Double getRewardFimDESemana() {
        rewardFimDESemana = 40.0;
        return rewardFimDESemana;
    }
}
