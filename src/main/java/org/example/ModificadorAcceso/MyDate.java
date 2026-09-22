package POO.ModificadorAcceso.ModificadorAcceso;

public class MyDate {
    private int day;
    private int mes;
    private int año;

    public MyDate(int day, int mes,int año) {
        this.day = day;
        this.mes = mes;
        this.año = año;
    }

    public String rellenarCeros(int valor) {
        if (valor < 10) {
            return "0" + valor;
        }
        return String.valueOf(valor);
    }

    public String imprimirfecha() {
        String day = rellenarCeros(this.day);
        String mes = rellenarCeros(this.mes);
        return day + "/" + mes + "/" + año;
    }

    public int getDay() {
        return day;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }
}
