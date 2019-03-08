package es.maqui.vulnerabilidad.reg_exp_dos;

/**
 * Prueba de denegacion de servicio a traves de patrones
 * 
 * @author MaQuiNa1995
 *
 */
public class RegExpDOS {

	public static void main(String... args) {
		// Patron usado
		String patron = "(aa|aab?)*";
		// 103 A's
		String vulnerable = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		System.out.println(vulnerable.matches(patron));
	}
}
