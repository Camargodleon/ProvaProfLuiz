package com.senai.leonardo.provan1.entities;

import java.util.ArrayList;
import java.util.List;

public class Questao2 implements Runnable {

	private List<Integer> lista;
	private Integer teste;

	public List<Integer> getLista() {
		return lista;
	}

	public void setLista(List<Integer> lista) {
		this.lista = lista;
	}

	public Questao2(Integer parOuImpar) {
		lista = new ArrayList<Integer>();
		if (parOuImpar % 2 == 0) {
			for (int i = 0; i < 100; i++) {
				if (i % 2 == 0) {
					lista.add(i);
				}
			}
		} else {
			for (int i = 0; i < 1001; i++) {
				if (i % 2 != 0) {
					lista.add(i);
				}
			}
		}
		this.run();
	}

	public void printList() {
		if (this.lista.get(0) % 2 != 0) {
			for (int i = 0; i < this.lista.size(); i+= 10) {
				System.out.println(this.lista.get(i));
				
			}
		} else {
			for (int i = 0; i < this.lista.size(); i++) {
				System.out.println(this.lista.get(i));
			}
		}
	}

	public void run() {
		printList();
	}

}
