package com.example.demo.model.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Veiculo {
	
	@Id
	@GeneratedValue
	private Long id;
	private String modelo;
	private String marca;
	private String cor;
	private int anoFabricacao;
	private double potencia;
	private double velocidade;
	private double tech;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getanoFabricacao() {
		return anoFabricacao;
	}
	public void setanoFabricacao(int ano) {
		this.anoFabricacao = ano;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public double getTech() {
		return tech;
	}
	public void setTech(double autonomia) {
		this.tech = tech;
	}

}
