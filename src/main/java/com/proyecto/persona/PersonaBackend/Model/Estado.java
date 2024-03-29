package com.proyecto.persona.PersonaBackend.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "estado")
public class Estado {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@ManyToOne
	@JoinColumn(name = "id_pais")
	private Pais pais;
	private String nombre;

	public Estado() {
	}

	public Estado(Pais pais, String nombre) {
		this.pais = pais;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
