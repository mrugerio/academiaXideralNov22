package com.statico;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(Empleado.contador);

		Empleado e1 = new Empleado("Patrobas");
		System.out.println(Empleado.contador);
		
		Empleado e2 = new Empleado("Andronico");
		System.out.println(Empleado.contador);

		Empleado.contador = 100;
		
		Empleado e3 = new Empleado("Tercio");
		System.out.println(Empleado.contador);

		Empleado e4 = new Empleado("Pancrasio");
		System.out.println(Empleado.contador);

//		System.out.println(Empleado.contador); //4
//		System.out.println(Empleado.contador); //4
//		System.out.println(Empleado.contador); //4
//		System.out.println(Empleado.contador); //4

//		int x = 5;
//		
//		System.out.println("x0: "+ x++);
//		
//		int y = x++;
//		
//		System.out.println("y: "+y); //6 //5
//		System.out.println("x: "+x); //6 //6
		
	}

}
