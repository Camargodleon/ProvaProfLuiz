package com.senai.testes.leonardo.entities;

public class Triangulo {

	private Integer a, b, c;

	public Triangulo(Integer a, Integer b, Integer c) {
		this.a = a;
		this.b = b;
		this.c = c;
		doTheThing();
	}

	public boolean eTriangulo() {
		if(a <= 0 || b <= 0 || c <= 0)  return false;
		if ((a + b > c) || (a + c > b) || (b + c > c)) return true;
		return false;

	}

	public boolean eEscaleno() {
		if (eTriangulo() && (a != b && a != c && c != b)) return true;
		return false;
	}
	
	public boolean eIsosceles() {
		if(eTriangulo() && ((a == b && a != c) || (c == b && c != a))) return true;
		return false;
	}
	
	public boolean eEquilatero() {
		if(eTriangulo() && (a == b && a == c)) return true;
		return false;
	}
	
	public void doTheThing() {
		System.out.println("Triangulo:"+eTriangulo());
		if(eTriangulo()) {
			System.out.println("Escaleno:"+eEscaleno());
			System.out.println("Isosceles:"+eIsosceles());
			System.out.println("EEequilatero"+eEquilatero());
		}
	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}

	public Integer getC() {
		return c;
	}

	public void setC(Integer c) {
		this.c = c;
	}

}
