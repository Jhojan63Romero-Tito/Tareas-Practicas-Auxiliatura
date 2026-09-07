package SEGUNDO_SEMESTRE.PROGRAMACION_2.PRACTICA_GENERAL;

import java.util.Scanner;

// Define la clase CuentaBancaria con los atributos: titular, nroCuenta, saldo.
// a) Implememtar metodos depositar y retirar
// b) Mostrar mensaje de error si se intenta retirar mas dinero de la cuenta
// c) Mostrar mensaje de error si se intenta depositar un numero negativo o 0
// d) Mostrar los datos de la cuenta
class CuentaBancaria{
    private String titular;
    private int nroCuenta;
    private double saldo;
    public CuentaBancaria(String titular, int nroCuenta, double saldo){
        this.titular = titular;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }
    public void depositar(double monto){
        if (monto <= 0) {
            System.out.println("ERROR");
        } else {
            this.saldo = this.saldo + monto;
            System.out.println("Deposito realizado correctamente");
        }
    } 
    public void retirar(double monto){
        if (monto > this.saldo) {
            System.out.println("ERROR");
        } else {
            this.saldo = this.saldo - monto;
            System.out.println("El titular es: "+ this.titular);
            System.out.println("Numero de Cuenta: "+ this.nroCuenta);
            System.out.println("El retiro del dinero es: " + monto + " Bs");
            System.out.println("Dinero retirado: " + this.saldo + " Bs");
        }
    }
}
public class CuentaBancariaPOO {
    public static void main(String[] args) {
        Scanner cb = new Scanner(System.in);
        cb.useLocale(java.util.Locale.US);
        System.out.println("Ingrese titular: ");
        String titular = cb.nextLine();
        System.out.println("Ingrese su numero de cuenta: ");
        int nroCuenta = cb.nextInt();
        System.out.println("Ingrese el saldo: ");
        double saldo = cb.nextDouble();
        CuentaBancaria cuenta = new CuentaBancaria(titular, nroCuenta, saldo);
        System.out.println("Ingrese el monto a depositar: ");
        double deposito = cb.nextDouble();
        cuenta.depositar(deposito);
        System.out.println("Ingreso el monto a retirar: ");
        double retiro = cb.nextDouble();
        cuenta.retirar(retiro);
        System.out.println("----- DATOS FINALES DE LA CUENTA -----");
        System.out.println("Titular: " + titular);
        System.out.println("Numero de Cuenta: " + nroCuenta);
        System.out.println("Saldo: " + saldo);
    }
}
