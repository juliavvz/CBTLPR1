public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // Getters
    public int getHora()    { return hora; }
    public int getMinuto()  { return minuto; }
    public int getSegundo() { return segundo; }

    // Setters
    public void setHora(int hora)       { this.hora = hora; }
    public void setMinuto(int minuto)   { this.minuto = minuto; }
    public void setSegundo(int segundo) { this.segundo = segundo; }

    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
