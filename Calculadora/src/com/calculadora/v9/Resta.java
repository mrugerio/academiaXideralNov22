package com.calculadora.v9;

public class Resta extends OperacionAbstracta {
	
	Resta(int x, int y) {
		super(x,y);
	}

	@Override
	public int ejecuta(){
		return x - y;
	}

}