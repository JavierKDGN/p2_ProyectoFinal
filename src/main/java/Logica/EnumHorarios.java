package Logica;

public enum EnumHorarios {
    HORA_1("09:00 AM"),
    HORA_2("09:30 AM"),
    HORA_3("10:00 AM"),
    HORA_4("10:30 AM"),
    HORA_5("11:00 AM"),
    HORA_6("11:30 AM"),
    HORA_7("12:00 PM"),
    HORA_8("12:30 PM"),
    HORA_9("13:00 PM"),
    HORA_10("13:30 PM"),
    HORA_11("14:00 PM"),
    HORA_12("14:30 PM"),
    HORA_14("15:30 PM"),
    HORA_13("15:00 PM"),
    HORA_15("16:00 PM"),
    HORA_16("16:30 PM"),
    HORA_17("17:00 PM"),
    HORA_18("17:30 PM"),
    HORA_19("18:30 PM"),
    HORA_20("19:00 PM"),
    HORA_21("19:30 PM"),
    HORA_22("20:00 PM"),
    HORA_23("20:30 PM"),
    HORA_24("21:00 PM"),
    HORA_25("21:30 PM"),
    HORA_26("22:00 PM"),
    HORA_27("22:30 PM"),
    HORA_28("23:00 PM"),
    HORA_29("23:30 PM"),
    HORA_30("00:00 AM");

    private final String hora;

    EnumHorarios(String hora) {
        this.hora = hora;
    }
    public String getHora() {
        return hora;
    }
    @Override
    public String toString() {
        return hora;
    }
}
