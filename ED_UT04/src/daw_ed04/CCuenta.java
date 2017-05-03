/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package daw_ed04;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class CCuenta {
    String nombre;
    String cc;
    String pass; //contraseña del acceso web
    double saldo;
    double tipoInteres;

    /**
     *
     */
    public CCuenta(){
        
    }

    /**
     *
     * @param nom nombre de la cuenta corriente
     * @param cue cuenta, o cc
     * @param sal saldo de la cuenta
     * @param tipo el interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo){
        nombre=nom;
        cc=cue;
        saldo=sal;
    }

    /**
     *
     * @return
     */
    public String getCc() {
        return cc;
    }

    /**
     *
     * @param cc
     */
    public void setCc(String cc) {
        this.cc = cc;
    }

    /**
     *
     * @return
     */
    public String getPass() {
        return pass;
    }

    /**
     *
     * @param newPass
     */
    public void setPass(String newPass) {
        /**este bloque de código se utiliza para que pida primero la contraseña, y solo si coinciden
        *la modifica, con un máximo de 3 intentos, c es el contador de intentos,
        * intento es la contraseña que se introduce para comprobar si coincide con la anterior
        */
        int c = 0;
        String intento;
        Scanner sc = new Scanner(System.in);
        while(c<3){
            intento = sc.nextLine();
            if ((intento==this.pass)) {
                this.pass = newPass;           
                break;
            }else{
                System.out.println("Introduzca de nuevo la contraseña.");
            }   
        }
    }

    /**
     *
     * @return pass
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     *
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * @return saldo
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     *
     * @param tipoInteres 
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    
    /**
     *
     * @param nom
     */
    public void setNombre(String nom){
        nombre=nom;
    }

    /**
     *
     * @return nombre 
     */
    public String getNombre(){
        return nombre;
    }

    /**
     *
     * @return
     */
    public double estado(){
        return saldo;
    }

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void ingreso(double cantidad) throws Exception{
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void retirada(double cantidad) throws Exception{
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    /**
     *
     * 
     * @return
     */
    public double porcentaje(){
        double result = saldo*tipoInteres/100;
        return result;  
    }
    
    public int Manuel(int n){
        return n*n;
    }
}
