public class Bridgewood{
    private int classificacao;
    private String nomeHotel;
    private String tipoCliente;
    private Double regularDiaDaSemana;
    private Double rewardDiaDaSemana;
    private Double regularFimDESemana;
    private Double rewardFimDESemana;


    public int getClassificacao() {
    classificacao = 4;
        return classificacao;
    }



    public String getNomeHotel() {
        nomeHotel = "Bridgewood";
        return nomeHotel;
    }
    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Double getRegularDiaDaSemana() {
        regularDiaDaSemana = 160.0;
        return regularDiaDaSemana;
    }

    public Double getRewardDiaDaSemana() {
        rewardDiaDaSemana=110.0;
        return rewardDiaDaSemana;
    }

    public Double getRegularFimDESemana() {
        regularFimDESemana = 60.0;
        return regularFimDESemana;
    }

    public Double getRewardFimDESemana() {
        rewardFimDESemana = 50.0;
        return rewardFimDESemana;
    }

}
