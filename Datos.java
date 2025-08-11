import java.util.Scanner;

class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, String numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("El monto debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }

    public void transferir(CuentaBancaria destino, double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            destino.saldo += monto;
            System.out.println("Transferencia realizada a " + destino.titular + ". Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }

    public void mostrarDatos() {
        System.out.println("Titular: " + titular);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
    }
}

public class Datos {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        System.out.print("Ingrese el nombre del titular de la cuenta 1: ");
        String titular1 = datos.nextLine();
        System.out.print("Ingrese el numero de cuenta 1: ");
        String numCuenta1 =datos.nextLine();
        System.out.print("Ingrese el saldo inicial de la cuenta 1: ");
        double saldo1 = datos.nextDouble();
        datos.nextLine();

        CuentaBancaria cuenta1 = new CuentaBancaria(titular1, numCuenta1, saldo1);

        System.out.print("Ingrese el nombre del titular de la cuenta 2: ");
        String titular2 = datos.nextLine();
        System.out.print("Ingrese el numero de cuenta 2: ");
        String numCuenta2 = datos.nextLine();
        System.out.print("Ingrese el saldo inicial de la cuenta 2: ");
        double saldo2 = datos.nextDouble();

        CuentaBancaria cuenta2 = new CuentaBancaria(titular2, numCuenta2, saldo2);

        int opcion;
        do {
            System.out.println("\nMenu banco");
            System.out.println("1. Mostrar datos de las cuentas");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Transferir");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = datos.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("\nCuenta 1:");
                    cuenta1.mostrarDatos();
                    System.out.println("\nCuenta 2:");
                    cuenta2.mostrarDatos();
                    break;

                case 2:
                    System.out.print("¿En que cuenta desea depositar? (1 o 2): ");
                    int depCuenta = datos.nextInt();
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDep = datos.nextDouble();
                    if (depCuenta == 1) cuenta1.depositar(montoDep);
                    else if (depCuenta == 2) cuenta2.depositar(montoDep);
                    else System.out.println("Cuenta no válida.");
                    break;

                case 3:
                    System.out.print("¿De que cuenta desea retirar? (1 o 2): ");
                    int retCuenta = datos.nextInt();
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRet = datos.nextDouble();
                    if (retCuenta == 1) cuenta1.retirar(montoRet);
                    else if (retCuenta == 2) cuenta2.retirar(montoRet);
                    else System.out.println("Cuenta no válida.");
                    break;

                case 4:
                    System.out.print("¿De que cuenta quiere transferir? (1 o 2): ");
                    int transCuenta = datos.nextInt();
                    System.out.print("Ingrese el monto a transferir: ");
                    double montoTrans = datos.nextDouble();
                    if (transCuenta == 1) cuenta1.transferir(cuenta2, montoTrans);
                    else if (transCuenta == 2) cuenta2.transferir(cuenta1, montoTrans);
                    else System.out.println("Cuenta no válida.");
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        datos.close();
    }
}