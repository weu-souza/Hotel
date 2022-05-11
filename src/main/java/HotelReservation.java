import org.jetbrains.annotations.NotNull;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class HotelReservation {
    Lakewood l = new Lakewood();
    Bridgewood b = new Bridgewood();
    Ridgewood r = new Ridgewood();

    public String getCheapestHotel(String tipoCliente, LocalDate date,DayOfWeek day, LocalDate date1, LocalDate date2) {

        return hotelBarato(tipoCliente, date,date1,date2);
    }

    public String hotelBarato(String tipoCliente, @NotNull LocalDate date, LocalDate date1, LocalDate date2) {
        l.setTipoCliente(tipoCliente);
        b.setTipoCliente(tipoCliente);
        r.setTipoCliente(tipoCliente);
switch (date.getDayOfWeek()){
    case MONDAY:
    case TUESDAY:
    case WEDNESDAY:
    case THURSDAY:
    case FRIDAY:
        if (l.getFimDESemana() > b.getFimDESemana() || l.getFimDESemana() > r.getFimDESemana()) {
        return l.getNomeHotel();
        } else if (b.getDiaDaSemana() > l.getDiaDaSemana() || b.getDiaDaSemana() > r.getDiaDaSemana()) {
        return b.getNomeHotel();
        } else if (r.getDiaDaSemana() > l.getDiaDaSemana() || r.getDiaDaSemana() > b.getDiaDaSemana()) {
        return r.getNomeHotel();
        }
        break;
    case SATURDAY:
    case SUNDAY:
        if (l.getFimDESemana() > b.getFimDESemana() && l.getFimDESemana() > r.getFimDESemana()) {
        return l.getNomeHotel();
        } else if (b.getFimDESemana() > l.getFimDESemana() && b.getFimDESemana() > r.getFimDESemana()) {
        return b.getNomeHotel();
        } else if (r.getFimDESemana() > l.getFimDESemana() && r.getFimDESemana() > b.getFimDESemana()) {
        return r.getNomeHotel();
        }
        break;

}

        switch (date1.getDayOfWeek()){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                if (l.getFimDESemana() > b.getFimDESemana() || l.getFimDESemana() > r.getFimDESemana()) {
                    return l.getNomeHotel();
                } else if (b.getDiaDaSemana() > l.getDiaDaSemana() || b.getDiaDaSemana() > r.getDiaDaSemana()) {
                    return b.getNomeHotel();
                } else if (r.getDiaDaSemana() > l.getDiaDaSemana() || r.getDiaDaSemana() > b.getDiaDaSemana()) {
                    return r.getNomeHotel();
                }
                break;
            case SATURDAY:
            case SUNDAY:
                if (l.getFimDESemana() > b.getFimDESemana() && l.getFimDESemana() > r.getFimDESemana()) {
                    return l.getNomeHotel();
                }
                else if (b.getFimDESemana() > l.getFimDESemana() && b.getFimDESemana() > r.getFimDESemana()) {
                    return b.getNomeHotel();
                }
                else if (r.getFimDESemana() > l.getFimDESemana() && r.getFimDESemana() > b.getFimDESemana()) {
                    return r.getNomeHotel();
                }
                break;

        }

        switch (date2.getDayOfWeek()){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                if (l.getFimDESemana() > b.getFimDESemana() || l.getFimDESemana() > r.getFimDESemana()) {
                    return l.getNomeHotel();
                } else if (b.getDiaDaSemana() > l.getDiaDaSemana() || b.getDiaDaSemana() > r.getDiaDaSemana()) {
                    return b.getNomeHotel();
                } else if (r.getDiaDaSemana() > l.getDiaDaSemana() || r.getDiaDaSemana() > b.getDiaDaSemana()) {
                    return r.getNomeHotel();
                }
                break;
            case SATURDAY:
            case SUNDAY:
                if (l.getFimDESemana() > b.getFimDESemana() && l.getFimDESemana() > r.getFimDESemana()) {
                    return l.getNomeHotel();
                } else if (b.getFimDESemana() > l.getFimDESemana() && b.getFimDESemana() > r.getFimDESemana()) {
                    return b.getNomeHotel();
                } else if (r.getFimDESemana() > l.getFimDESemana() && r.getFimDESemana() > b.getFimDESemana()) {
                    return r.getNomeHotel();
                }
                break;

        }
        return r.getNomeHotel();
    }

}




