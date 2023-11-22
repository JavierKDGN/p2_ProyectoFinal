package Logica;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public enum EnumHorarios {
    //Horarios de salida de los buses
    HORA_1("09:00"),
    HORA_2("09:30"),
    HORA_3("10:00"),
    HORA_4("10:30"),
    HORA_5("11:00"),
    HORA_6("11:30"),
    HORA_7("12:00"),
    HORA_8("12:30"),
    HORA_9("13:00"),
    HORA_10("13:30"),
    HORA_11("14:00"),
    HORA_12("14:30"),
    HORA_14("15:30"),
    HORA_13("15:00"),
    HORA_15("16:00"),
    HORA_16("16:30"),
    HORA_17("17:00"),
    HORA_18("17:30"),
    HORA_19("18:30"),
    HORA_20("19:00"),
    HORA_21("19:30"),
    HORA_22("20:00"),
    HORA_23("20:30"),
    HORA_24("21:00"),
    HORA_25("21:30"),
    HORA_26("22:00"),
    HORA_27("22:30"),
    HORA_28("23:00");

    private final LocalTime hora;
    EnumHorarios(String hora) {
        this.hora = LocalTime.parse(hora, DateTimeFormatter.ofPattern("HH:mm"));
    }
    public LocalTime getHora() {
        return hora;
    }

}
