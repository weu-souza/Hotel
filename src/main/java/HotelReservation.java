import java.time.LocalDate;

public class HotelReservation {
    Lakewood l = new Lakewood();
    Bridgewood b = new Bridgewood();
    Ridgewood r = new Ridgewood();

    public String getCheapestHotel(String tipoCliente, LocalDate data, LocalDate data1, LocalDate data2) {

        l.setTipoCliente(tipoCliente);
        b.setTipoCliente(tipoCliente);
        r.setTipoCliente(tipoCliente);
        return hotelBarato(data, data1, data2);
    }

    public String hotelBarato(LocalDate data, LocalDate data1, LocalDate data2) {
        int[] i = new int[]{data1(data), data2(data1), data3(data2)};
        String aux = "";
        if (i[0] == 1) {
            aux = l.getNomeHotel();
        } else if (i[1] == 2) {
            aux = b.getNomeHotel();
        } else if (i[2] == 3) {
            aux = r.getNomeHotel();
        }

        return aux;


    }

    public int data1(LocalDate data) {
        int x = 0;
        switch (data.getDayOfWeek()) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                if (l.getTipoCliente().equals("regular")) {
                    if (l.getRegularDiaDaSemana() < b.getRegularDiaDaSemana() && l.getRegularDiaDaSemana() < r.getRegularDiaDaSemana()) {
                        x = 1;
                    }
                }
                break;

        }

        return x;
    }

    public int data2(LocalDate data) {
        int x = 0;
        switch (data.getDayOfWeek()) {
            case SATURDAY:
            case SUNDAY:
                if (b.getTipoCliente().equals("Regular")) {
                    if (b.getRegularFimDESemana() < l.getRegularFimDESemana() || b.getRegularFimDESemana() < r.getRegularFimDESemana()) {
                        x = 2;
                    }
                }
                break;


        }
        return x;
    }

    public int data3(LocalDate data) {
        int x = 0;
        switch (data.getDayOfWeek()) {
            case SATURDAY:
            case SUNDAY:
                if (r.getTipoCliente().equals("Rewards")){
                if (r.getRewardFimDESemana() < l.getRewardFimDESemana() || r.getRewardDiaDaSemana() < b.getRewardFimDESemana()) {
                    x = 3;
                }
                }

                break;
        }
        return x;
    }
}





