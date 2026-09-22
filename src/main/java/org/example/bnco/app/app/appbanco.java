package POO.bnco.app;

public class appbanco {
    banco Bancocarive = new banco("Banco Carive", "Juan Perez");
    banco Nequi = new banco("Nequi", "Maria Gomez");
    banco Bancolombia = new banco("Bancolombia", "Carlos Rodriguez");
    banco Davivienda = new banco("Davivienda", "Ana Martinez");
    banco BancoAgrario = new banco("Banco Agrario", "Luis Fernandez");

    persona persona1 = new persona("Juan", "Perez", 30, Bancocarive);
    persona persona2 = new persona("Maria", "Gomez", 25, Nequi);
    persona persona3 = new persona("Carlos", "Rodriguez", 40, Bancolombia);
    persona persona4 = new persona("Ana", "Martinez", 35, Davivienda);
    persona persona5 = new persona("Luis", "Fernandez", 28, BancoAgrario);
    persona persona6 = new persona("Laura", "Gonzalez", 32, Bancocarive);
    persona persona7 = new persona("Pedro", "Ramirez", 27, Nequi);
    persona  persona8 = new persona("Sofia", "Lopez", 22, Bancolombia);
    persona persona9 = new persona("Diego", "Torres", 38, Davivienda);
    persona persona10 = new persona("Valentina", "Rojas", 29, BancoAgrario);

    cuentabancaria cuenta1 = new cuentabancaria("123456789", 1000.0, persona1);
    cuentabancaria cuenta2 = new cuentabancaria("987654321", 500.0, persona2);
    cuentabancaria cuenta3 = new cuentabancaria("456789123", 2000.0, persona3);
    cuentabancaria cuenta4 = new cuentabancaria("789123456", 1500.0, persona4);
    cuentabancaria cuenta5 = new cuentabancaria("321654987", 800.0, persona5);
    cuentabancaria cuenta6 = new cuentabancaria("654987321", 1200.0, persona6);
    cuentabancaria cuenta7 = new cuentabancaria("147258369", 600.0, persona7);
    cuentabancaria cuenta8 = new cuentabancaria("963852741", 2500.0, persona8);
    cuentabancaria cuenta9 = new cuentabancaria("852741963", 1800.0, persona9);
    cuentabancaria cuenta10 = new cuentabancaria("741963852", 900.0, persona10);

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
