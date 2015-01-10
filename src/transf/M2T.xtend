package transf

class M2T {
	def M2T() {
		
	}
	
	def generate(){
		
		//Modell laden
		//Datei für Ernährungsplan erstellen (LaTeX und/oder HTML)
		generateSchedule() //generateLatexSchedule / generateHtmlSchedule
		
		//Datei für Einkaufsliste erstellen (Latex und/oder HTML)
		generateShoppingList() //generateLatexShoppingList / generateHtmlShoppingList
	
	}
	
	/*
	 * Generiert den Ernährungsplan
	 */
	def generateSchedule(){
		
	}
	
	/*
	 * Generiert die Einkaufsliste.
	 */
	def generateShoppingList(){
		
	}
	
}