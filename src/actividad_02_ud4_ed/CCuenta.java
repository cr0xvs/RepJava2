/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud4_ed;
/*
*@autor Cristóbal Gómez Piñero
*@version 1.0
*@see Cliente
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
  
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
    public String obtenerNombre()
    {
        return nombre;
    }

    
     public double estado ()
    {
        return saldo;
    }

    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

   
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 
  public double getTipoInterés() {
    return tipoInterés;
  }

  
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
