package cuentas;
/**
 * Esta clase simula una cuenta de banco en la que se pueden ver los datos del titular, 
 * tipo de interés y realizar  operaciones de ingreso y reintegro.
 * 
 * @author Carlos Royuela
 * @version 1.0
 * @since 09/01/2020
 * 
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }
    
    /**
     * @param nom Titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo disponible.
     * @param tipo Tipo de interés.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    /**
     * @return Devuelve el saldo disponible.
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * @param cantidad Cantidad a ingresar en la cuenta.
     * @throws Exception Error cuando se ingresa cantidad negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * @param cantidad Cantidad a retirar de la cuenta.
     * @throws Exception Error cuando se retira cantidad negativa o no hay saldo suficuente.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
 
    /**
	 * Métodos Get y Set públicos para obtener y devolver valores de los atributos.
	 */    
	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	String getCuenta() {
		return cuenta;
	}

	void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	double getSaldo() {
		return saldo;
	}

	void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	double getTipoInterés() {
		return tipoInterés;
	}

	void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
