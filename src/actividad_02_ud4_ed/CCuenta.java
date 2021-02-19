/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud4_ed;
/**
* @autor Cristóbal Gómez Piñero
* @version 1.0
* @see cliente
*/
public class CCuenta {

    /*Constructor de la Cuenta Bancaria
    *nom Nombre del cliente
    *cue Cuenta del cliente
    *sal Saldo del cliente
    *tipo Tipo de Interés aplicable
    */
    
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    /*
    *Identificador de la cuenta
    */  
    public CCuenta ()
    {
    }
    /**Constructor de la Cuenta Bancaria
    * @param nom Nombre del cliente
    * @param cue Cuenta del cliente
    * @param sal Saldo del cliente
    * @param tipo Tipo de Interés aplicable
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
    /**
    * Asignar nombre 
    * @param nom 
    */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
    /**
    * Devuelve el obtener nombre
    * @return <code>nombre</code> Nombre del cliente
    */
    public String obtenerNombre()
    {
        return nombre;
    }
    /**
    * Calcula el estado del saldo
    * @return <code>saldo</code>Estado del saldo disponible del cliente
    */
     public double estado ()
    {
        return saldo;
    }
    
    /**
     * Ingresar la cantidad en el saldo del cliente
     * @param cantidad Cantidad de dinero a ingresar en el saldo del cliente
     * @throws Exception Controlamos que la cantidad no sea menor que 0
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

    /**
     * Retirar la cantidad de saldo del cliente
     * @param cantidad Cantidad de dinero a retirar del saldo del cliente
     * @throws Exception Controlamos que el saldo no sea menor que 0 o que no haya suficiente saldo para poder hacer la cantidad a retirar indicada
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    /**
     * Return para obtener la Cuenta del cliente
     * @return <code>cuenta</code>
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
   * Modifica la cuenta del cliente
   * @param cuenta
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   * Modifica el saldo del cliente
   * @param saldo 
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  /**
   * Return para el tipo interés de la cuenta del cliente
   * @return <code>tipoInterés</code> 
   */
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
   * Modifica el tipo de interés de la cuenta del cliente
   * @param tipoInterés 
   */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
