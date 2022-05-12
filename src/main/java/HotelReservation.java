import java.time.LocalDate;

public class HotelReservation {
    Lakewood l = new Lakewood();
    Bridgewood b = new Bridgewood();
    Ridgewood r = new Ridgewood();

    public String getCheapestHotel(String tipoCliente, LocalDate data, LocalDate data1, LocalDate data2) {

        l.setTipoCliente(tipoCliente);
        b.setTipoCliente(tipoCliente);
        r.setTipoCliente(tipoCliente);
        return hotelBarato(tipoCliente, data, data1, data2);
    }

    public String hotelBarato(String tipoCliente, LocalDate data, LocalDate data1, LocalDate data2) {


        int[] i = new int[]{data(tipoCliente, data), data(tipoCliente, data1), data(tipoCliente, data2)};
        String aux = "";
        if (i[0] == 1) {
            aux = l.getNomeHotel();
        }  if (i[1] == 2) {
            aux = b.getNomeHotel();
        }  if (i[2] == 3) {
            aux = r.getNomeHotel();
        }

        return aux;


    }

    public int data(String tipoCliente, LocalDate data) {
        int x = 0;
        switch (data.getDayOfWeek()) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                if (tipoCliente.equals("Regular")) {
                    if (l.getRegularDiaDaSemana() < b.getRegularDiaDaSemana() && l.getRegularDiaDaSemana() < r.getRegularDiaDaSemana()) {
                        x = 1;
                    }
                }
                break;

            case SATURDAY:
            case SUNDAY:
                if (tipoCliente.equals("Regular")) {
                    if (b.getRegularFimDESemana() < l.getRegularFimDESemana() || b.getRegularFimDESemana() < r.getRegularFimDESemana()) {
                        x = 2;
                    }
                } else if (tipoCliente.equals("Rewards")) {

                    if (r.getRewardFimDESemana() < l.getRewardFimDESemana() || r.getRewardDiaDaSemana() < b.getRewardFimDESemana()) {
                        x = 3;
                    }
                }
                break;

        }

        return x;

    }

}






