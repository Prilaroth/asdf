/*
 * Este es el javadoc de las clases Camion y caja 
 * @author Ruben
 * @return Examen EDD
 *	
 */
package camion;

/*
 * @return establece parametros de la caja (dentro)
 */
public class Caja {
	
	public String idCaja;		// id (codigo de barras) qupackage camion;e identifica a la caja	
	public String contenido;	// descripcion del contenido de la caja
	public double peso;			// peso de la caja y su contenido
	
	
	
	/*
	 * @return establece parametros de la caja
	 */
	public Caja(String idCaja, String contenido, double peso) {
		super();
		this.idCaja = idCaja;
		this.peso = peso;
		this.contenido = contenido;
	}


	@Override
	public String toString() {
		return "\n\tCaja [" + "idCaja=" + idCaja + " ,contenido=" + contenido + ", peso=" + peso + "]";
	}
	
	
	

}
