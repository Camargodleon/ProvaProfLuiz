package com.senai.leonardo.provan1.entities;

public class Questao1 implements Runnable {

	String nome;
	long milissegundos;

	public Questao1(String nome, long milissegundos) {
		this.nome = nome;
		this.milissegundos = milissegundos;
		this.run();
		
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getMilissegundos() {
		return milissegundos;
	}

	public void setMilissegundos(long milissegundos) {
		this.milissegundos = milissegundos;
	}

	public void printThisFromTimeToTime(String thisText) {
			System.out.println(thisText);
	}


	public void run() {
	}



	public void sleep(long milissegundos) {
		try {
			Thread.sleep(milissegundos);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
