package aulacursoemvideo;

import java.util.Date;
import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;

public class AulaCursoEmVideo {

	public static void main(String[] args) {
		System.out.println("Hello world");
		Date relogio = new Date();
		System.out.println("A hora do relogio é ");
		System.out.println(relogio.toString());
		Locale loc = Locale.getDefault();
		System.out.println(loc.getDisplayLanguage());
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		System.out.println("A resolução do seu sistema é: " + d.width + " X " + d.height);

	}

}
