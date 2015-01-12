package transf

import de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Ernaehrungsplan
import java.io.File
import java.io.FileOutputStream

class M2T {
	def M2T() {
		
	}
	
	Ernaehrungsplan plan;
	File targetLatexFile;
	File targetHtmlFile;
	FileOutputStream latexStream;
	FileOutputStream htmlStream;
	String latexOutput;
	String htmlOutput;
	
	def generate(){
		
		//Modell laden
		//Datei für Ernährungsplan erstellen (LaTeX und/oder HTML)
		generateLatexSchedule();
		generateHtmlSchedule();
		 
		//Datei für Einkaufsliste erstellen (Latex und/oder HTML)
		generateLatexShoppingList();
		generateHtmlShoppingList();
	}
    
	//--------------------LaTeX--------------------
	/*
	 * Generiert den Ernährungsplan für Latex.
	 */
	def generateLatexSchedule(){
		
	}
	
	/*
	 * Generiert die Einkaufsliste für Latex.
	 */
	def generateLatexShoppingList(){
		
	}
	
	//--------------------HTML--------------------
	/*
	 * Generiert den Ernährungsplan für HTML.
	 */
	def generateHtmlSchedule(){
		
	}
	
	/*
	 * Generiert die Einkaufsliste für HTML.
	 */
	def generateHtmlShoppingList(){
		
	}
	
}