package org.example.bnco.app;
import org.example.bnco.dominio.banco;
import org.example.bnco.dominio.persona;
import org.example.bnco.dominio.cuentabancaria;

public class appbanco {
    banco Bancocarive = new banco("Banco Carive", "Juan Perez");
    banco Nequi = new banco("Nequi", "Maria Gomez");
    banco Bancolombia = new banco("Bancolombia", "Carlos Rodriguez");
    banco Davivienda = new banco("Davivienda", "Ana Martinez");
    banco BancoAgrario = new banco("Banco Agrario", "Luis Fernandez");

    persona persona1 = new persona("Juan", "Perez", "Juan@gmail.com", 30);
    persona persona2 = new persona("Maria", "Gomez", "maria@gamil.com",23);
    persona persona3 = new persona("Carlos", "Rodriguez", "carlos@gamil.com",23);
    persona persona4 = new persona("Ana", "Martinez", "ana@gamil.com",54);
    persona persona5 = new persona("Luis", "Fernandez", "luis@gamil.com",12);
    persona persona6 = new persona("Laura", "Gonzalez", "laura@gamil.com",65);
    persona persona7 = new persona("Pedro", "Ramirez", "pedro@gamil.com",43);
    persona  persona8 = new persona("Sofia", "Lopez", "sofia@gamil.com",53);
    persona persona9 = new persona("Diego", "Torres", "diego@gamil.com",92);
    persona persona10 = new persona("Valentina", "Rojas", "valentina@gamil.com",33);

    cuentabancaria cuenta1 = new cuentabancaria("123456789", 1000.0, "clave123", "ahorros", persona1, Bancocarive);
    cuentabancaria cuenta2 = new cuentabancaria("987654321", 500.0, "pass456", "corriente", persona2, Nequi);
    cuentabancaria cuenta3 = new cuentabancaria("456789123", 2000.0, "banco789", "nomina", persona3, Bancolombia);
    cuentabancaria cuenta4 = new cuentabancaria("789123456", 1500.0, "clave321", "ahorros", persona4, Davivienda);
    cuentabancaria cuenta5 = new cuentabancaria("321654987", 800.0, "pass654", "corriente", persona5, BancoAgrario);
    cuentabancaria cuenta6 = new cuentabancaria("654987321", 1200.0, "clave987", "nomina", persona6, Bancocarive);
    cuentabancaria cuenta7 = new cuentabancaria("147258369", 600.0, "pass741", "ahorros", persona7, Nequi);
    cuentabancaria cuenta8 = new cuentabancaria("963852741", 2500.0, "clave852", "corriente", persona8, Bancolombia);
    cuentabancaria cuenta9 = new cuentabancaria("852741963", 1800.0, "pass963", "nomina", persona9, Davivienda);
    cuentabancaria cuenta10 = new cuentabancaria("741963852", 900.0, "clave159", "ahorros", persona10, BancoAgrario);

    public void operaciones() {
        cuenta1.depositar(500.0);
        cuenta2.retirar(200.0);
        cuenta3.transferir(cuenta4, 300.0);
        cuenta4.mostrarsaldo();
        cuenta5.depositar(1000.0);
        cuenta6.retirar(1500.0);
        cuenta7.transferir(cuenta8, 400.0);
        cuenta8.mostrarsaldo();
        cuenta9.depositar(700.0);
        cuenta10.retirar(100.0);
    }
}
