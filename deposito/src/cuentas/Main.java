package cuentas;
/**
 *
 * @author Carlos Royuela
 * @version 1.0
 * @since 09/01/2020
 */
public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativa_cuenta(cuenta1, 0);
    }
    
    /**
     * Método que realiza operaciones sobre la cuenta indicada e indica errores si la cantidad es incorrecta.
     * @param cuenta1 Cuenta sobre la que se opera.
     * @param cantidad Cantidad con la que se opera.
     */
	private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
		double saldoActual;
		saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
