package Logica;

public enum Horarios {
    HORA_1("09:00 AM", 0),
    HORA_2("09:30 AM", 1),
    HORA_3("10:00 AM", 2),
    HORA_4("10:30 AM", 3),
    HORA_5("11:00 AM", 4),
    HORA_6("11:30 AM", 5),
    HORA_7("12:00 PM", 6),
    HORA_8("12:30 PM", 7),
    HORA_9("13:00 PM", 8),
    HORA_10("13:30 PM", 9),
    HORA_11("14:00 PM", 10),
    HORA_12("14:30 PM", 11),
    HORA_13("15:00 PM", 12),
    HORA_14("15:30 PM", 13),
    HORA_15("16:00 PM", 14),
    HORA_16("16:30 PM", 15),
    HORA_17("17:00 PM", 16),
    HORA_18("17:30 PM", 17),
    HORA_19("18:30 PM", 18),
    HORA_20("19:00 PM", 19),
    HORA_21("19:30 PM", 20),
    HORA_22("20:00 PM", 21),
    HORA_23("20:30 PM", 22),
    HORA_24("21:00 PM", 23),
    HORA_25("21:30 PM", 24),
    HORA_26("22:00 PM", 25),
    HORA_27("22:30 PM", 26),
    HORA_28("23:00 PM", 27),
    HORA_29("23:30 PM", 28),
    HORA_30("00:00 AM", 29);

    private final String hora;
    private final int indice;

    Horarios(String hora, int indice) {
        this.hora = hora;
        this.indice = indice;
    }
    public String getHora() {
        return hora;
    }
    public int getIndice() {
        return indice;
    }

    @Override
    public String toString() {
        return hora;
    }
}
