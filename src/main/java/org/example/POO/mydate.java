package POO;

public class mydate {
    private int day;
    private int month;
    private int year;

    public mydate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int day() {
        return day;
    }

    public int month() {
        return month;
    }

    public int year() {
        return year;
    }

    public String rellenarceros(int value){
        if (value < 10) {
            return "0" + value;
        }
        return String.valueOf(value);
    }

    public String imprimirfecha() {
        if(day>31 || day<=0 || month>12 || month<=0 || year<0){
            return "Fecha invalida";
        }
        return rellenarceros(day) + "/" + rellenarceros(month) + "/" + this.year;
    }

    public mydate setDay(int day) {
        this.day = day;
        return this;
    }

    public mydate setMonth(int month) {
        this.month = month;
        return this;
    }

    public mydate setYear(int year) {
        this.year = year;
        return this;
    }
}
