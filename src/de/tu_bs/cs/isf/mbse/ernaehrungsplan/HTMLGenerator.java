package de.tu_bs.cs.isf.mbse.ernaehrungsplan;

import java.io.IOException;

import de.tu_bs.cs.isf.ecore.util.XMIUtil;

public class HTMLGenerator {

	public static void main(String[] args) throws IOException {
		/*
		 * Es gibt die Möglichkeit mit Java sich die Ausgabe generieren zu lassen.
		 * Oder z.B. mit Xpand.
		 * 
		 * Hier ist nur die erste Zeile für die Generierung mit Java
		 */
		Ernaehrungsplan ernaehrungsplan = XMIUtil.load("model/Ernaehrungsplan.xmi", ErnaehrungsplanPackage.eINSTANCE, Ernaehrungsplan.class);
	}

}
