package es.maqui.vulnerabilidad.reg_exp_dos;

/**
 * Prueba de denegacion de servicio a traves de patrones
 * 
 * @author MaQuiNa1995
 *
 */
public class RegExpDos {

	/**
	 * La vulnerabilidad consiste en el uso de patrones no seguros en el que con
	 * cierta cadena pueden llegar a dar un tiempo de respuesta muy alto petando en
	 * el camino
	 */
	public static void main(String... args) {
		// Patron usado
		String patron = "(aa|aab?)*";
		// 103 A's
		String vulnerable = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		System.out.println(vulnerable.matches(patron));
	}
}
