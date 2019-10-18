package main;

import java.util.ArrayList;
import java.util.List;

import externo.NaveMercenaria;

public class Main {
	public static void main(String[] args) {
		
		List<Nave> flota = new ArrayList<Nave>();
		
		Nave caza = new Nave();
		Nave crucero = new Nave();
		NaveMercenaria mercenaria = new NaveMercenaria();
		NaveMercenariaAdapter adapter = 
				new NaveMercenariaAdapter(mercenaria);
		
		flota.add(caza);
		flota.add(crucero);
		flota.add(adapter);
		
		for (Nave nave : flota) {
			nave.avanzar();
		}
	
	}//end main
}
