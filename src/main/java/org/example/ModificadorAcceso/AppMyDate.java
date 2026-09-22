package POO.ModificadorAcceso.ModificadorAcceso;

public class AppMyDate {

    public static void main(String[] args) {
    MyDate MyBirthday = new MyDate(15,4,2009);

    System.out.println(MyBirthday.getDay() + "/" + MyBirthday.getMes());

    System.out.println(MyBirthday.imprimirfecha());
    }

}
