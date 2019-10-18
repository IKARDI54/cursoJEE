package ejemploMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		List<Pastel> pasteles = new ArrayList<Pastel>();
		pasteles.add(new Pastel("ensaimada", 1.45));
		
		Map<String, Pastel> pastelesMap = 
				new HashMap<String, Pastel>();
		pastelesMap.put(
				"ensaimada", new Pastel("ensaimada",1.45));
		Pastel croissant = 
				new Pastel("CROISSANT", 0.99);
		pastelesMap.put("croi", croissant);
		Pastel croissant2 = new Pastel("segundo", 2);
		pastelesMap.put("croi2", croissant);
		
		Pastel elementoCroi = pastelesMap.get("croi");
		System.out.println(elementoCroi.getNombre());
		
		Pastel elementoCroi2 = pastelesMap.get("croi2");
		System.out.println("el segundo pastel se llama: " + 
				elementoCroi2.getNombre());

	}

}
