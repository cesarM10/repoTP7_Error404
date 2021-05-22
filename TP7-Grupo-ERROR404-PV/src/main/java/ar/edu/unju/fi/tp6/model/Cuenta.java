/**
 * 
 */
package ar.edu.unju.fi.tp6.model;

import java.time.LocalDate;

/**
 * @author Error404
 *
 */
public class Cuenta {
	
	private Long id; 
	private double saldo;
	private LocalDate fechaCreacion;// (LocalDate) Se ingresa en el formulario
	private String estado;//(String) -> ACTIVA, INACTIVA
 
	/**
	 * 
	 */
	public Cuenta() {
		//super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param saldo
	 * @param fechaCreacion
	 * @param estado
	 */
	public Cuenta(Long id, double saldo, LocalDate fechaCreacion, String estado) {
		super();
		this.id = id;
		this.saldo = saldo;
		this.fechaCreacion = fechaCreacion;
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", saldo=" + saldo + ", fechaCreacion=" + fechaCreacion + ", estado=" + estado
				+ "]";
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return the fechaCreacion
	 */
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}


}
