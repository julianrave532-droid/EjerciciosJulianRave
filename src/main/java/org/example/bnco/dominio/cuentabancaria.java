package POO.bnco.dominio;

public class cuentabancaria {
    public String numero;
    public double saldo;
    public String contraseña;
    public String tipo;
    public persona titular;
    public banco banco;


    public cuentabancaria(String numero, double saldo, String contraseña, String tipo, persona titular, banco banco) {
        this.numero = numero;
        this.saldo = saldo;
        this.contraseña = contraseña;
        this.tipo = tipo;
        this.titular = titular;
        this.banco = banco;
    }

    public void depositar(double cantidad) {
        this.saldo = this.saldo + cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            this.saldo = this.saldo - cantidad;
            System.out.print("retiro confirmado");
        } else {
            System.out.print("retiro rechazado");
        }
    }


    public void transferir(cuentabancaria cuentadestino, double cantidad) {
        retirar(cantidad);
        cuentadestino.depositar(cantidad);
        System.out.println("transferencia realizada");
    }

    public void mostrarsaldo() {
        saldo(cuentabancaria);

}

}