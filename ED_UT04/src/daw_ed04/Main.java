/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package daw_ed04;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        CCuenta a;
        double saldoA;

        a = new CCuenta("Felipe Segundo", "2222-2222-22-1230456789", 2222, 0);
        saldoA = a.estado();
        System.out.println("El saldo actual es" + saldoA);

        exceptionsEnElIngresoYRetirada(a, 3000);

        System.out.println("Datos de la cuenta: " + a.nombre + a.cc + a.saldo + a.tipoInteres);
    }

    /**
     *
     * @param a nombre de una cuenta corriente
     * @param cantidad cantidad que se va a usar para comprobar las excepciones al retirar y al ingresar dinero.
     */
    
    public static void exceptionsEnElIngresoYRetirada(CCuenta a, int cantidad) {
        try {
            a.retirada(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            a.ingreso(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
