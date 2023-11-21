package Logica;

public enum Horarios {
    HORA_1("09:00 AM"),
    HORA_2("10:30 AM"),
    HORA_3("11:00 AM"),
    HORA_4("12:00 AM"),
    HORA_5("13:00 PM"),
    HORA_6("14:30 PM"),
    HORA_7("16:00 PM"),
    HORA_8("17:30 PM"),
    HORA_9("18:30 PM"),
    HORA_10("19:45 PM");

    private final String hora;

    Horarios(String hora) {
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
