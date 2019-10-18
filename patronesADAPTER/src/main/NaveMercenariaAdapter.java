package main;

import externo.NaveMercenaria;

public class NaveMercenariaAdapter extends Nave{

	private NaveMercenaria mercenaria;

	public NaveMercenariaAdapter(NaveMercenaria mercenaria) {
		super();
		this.mercenaria = mercenaria;
	}

	@Override
	public void avanzar() {
		mercenaria.arrancar();
		mercenaria.mover();
	}
	
}
