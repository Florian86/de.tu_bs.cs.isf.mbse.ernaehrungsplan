package transf

import de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Ernaehrungsplan
import java.io.File
import java.io.FileOutputStream
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Person
import java.util.List

class M2T {
	
	ModelLoader loader = new ModelLoader();
	List<Person> persons; //Für jede Person soll der Plan erstellt werden.
	Ernaehrungsplan plan;
	File targetLatexFile;
	File targetHtmlFile_EP;
	File targetHtmlFile_EL;
	FileOutputStream latexStream; //prinzipiell soll
	FileOutputStream htmlStream_EP;
	FileOutputStream htmlStream_EL;
	String latexOutput;
	String htmlOutput_EP;
	String htmlOutput_EL;
	
	def M2T() {
		
	}
	
	def static void main(String[] args) {
		val m2t = new M2T()
		m2t.generate("folder", "file")
	}
	
	def generate(String folder, String file) {
		
		//Modell laden
		//plan = loader.loadModel(folder, file);
        //persons = plan.personen;
        
        // for(p : persons) { // für alle Personen im Ernaehrungsplan folgendes ausführen
        
        //TODO: Hier müsste schon ein zufällige Auswahl der Gerichte stattfinden, da die Auswahl für HTML und Latex gleich sein muss
        
            //--------------------LaTeX--------------------
            targetLatexFile = new File("output/Test_EP+EL_Latex.tex");
            										// new File(folder + File.separator + file + "_" + p.getName().toLowerCase + ".tex"); 
            														//Datei bekommt den Namen: folder/file_person.tex
            targetLatexFile.createNewFile(); 						//Datei erstellen
            latexStream = new FileOutputStream(targetLatexFile); 	// um Zeug in die Datei zu schreiben
            
            // Erst mal ohne Übergabe von p --> genrateLatex() statt genrateLatex(p)
            latexOutput = generateLatex().replaceAll("\"", ""); 	//TODO: mir noch unklar, warum \" ersetzt wird, vorallem warum "
            latexStream.write(latexOutput.getBytes()); 				// schreibt den generierten Code in die Datei
            latexStream.close(); 									// Stream schließen und Resourcen freigeben
            
            //--------------------HTML--------------------
            targetHtmlFile_EP = new File("output/Test_EP_HTML.html");  
                       								// new File(folder + File.separator + file + "_" + p.getName().toLowerCase + ".html");
            targetHtmlFile_EP.createNewFile();
            htmlStream_EP = new FileOutputStream(targetHtmlFile_EP);
            
            // ohne Übergabe von p
            htmlOutput_EP = generateHtmlSchedule();
            htmlStream_EP.write(htmlOutput_EP.getBytes());
            htmlStream_EP.close();
            
            targetHtmlFile_EL = new File("output/Test_EL_HTML.html");  
                       								// new File(folder + File.separator + file + "_" + p.getName().toLowerCase + ".html");
            targetHtmlFile_EL.createNewFile();
            htmlStream_EL = new FileOutputStream(targetHtmlFile_EL);
            
            // ohne Übergabe von p
            htmlOutput_EL = generateHtmlShoppingList();
            htmlStream_EL.write(htmlOutput_EL.getBytes());
            htmlStream_EL.close();
	   //}
    }
     
	//--------------------LaTeX--------------------
	
	/*
	 * "Startmethode" der Latex-Generierung
	 * ohne p erstmal !!!!!!!!!!
	 */
	def String generateLatex(){
        '''
        «generateLatexHead()»
        \begin{document}
        «generateLatexSchedule()»
        \newpage
        «generateLatexShoppingList()»
        \end{document}
        '''
    }
    
    /*
     * 
     */
    def String generateLatexHead(){
        //TODO: hier kommt documentclass, usepackages etc. rein (alles was vor begin(document) kommt), einfach copy-paste aus Latex
        
        '''
		\documentclass[10pt, a4paper]{article}
		\usepackage[a4paper, bottom=2.0cm, top=2.0cm]{geometry}
		
		\usepackage[utf8]{inputenc}
		\usepackage[ngerman]{babel}
		
		\pagestyle{empty}
		
		\parindent0pt
		
		\usepackage{tabularx}
		\usepackage{multirow}
		\newcolumntype{C}{>{\centering\arraybackslash}X}
		
		\usepackage{pdflscape}
		
		\usepackage{ragged2e}
		
		\usepackage{enumitem} 
		\setitemize{leftmargin=*}
		'''
    }
    
	/*
	 * Generiert den Ernährungsplan für Latex.
	 */
	def String generateLatexSchedule() {
		//TODO: Latex-Code für den Wochenplan; zu befüllen mit den Informationen aus unserer Modellinstanz "plan" (später)
		
		'''
		\begin{landscape}
		
			{\Large \textbf{Ernährungsplan}} \medskip \\
			Max Mustermann \\
			Empfohlener Energiebedarf pro Woche: 14.000 Kalorien $\rightarrow$ 2.000 Kalorien pro Tag \medskip \\
			%Da in diesem Ernährungsplan nur Mittagessen betrachtet werden, für die jeweils 1.000 kcal veranschlagt werden, stehen 2.000-1.000 = 1.000 kcal zur freien Verfügung. \medskip \\
			\renewcommand*{\arraystretch}{1.2}
			\begin{tabularx}{\linewidth}{|X|X|X|X|X|X|X|}	
				\hline
				\Centering \multirow{2}{*}{\textbf{Montag}} & \Centering \multirow{2}{*}{\textbf{Dienstag}} & \Centering \multirow{2}{*}{\textbf{Mittwoch}} & \Centering \multirow{2}{*}{\textbf{Donnerstag}} & \Centering \multirow{2}{*}{\textbf{Freitag}} & \Centering \multirow{2}{*}{\textbf{Samstag}} & \Centering \multirow{2}{*}{\textbf{Sonntag}} \\
		%		&  &  &  &  &  &  \\
				&  &  &  &  &  &  \\
				\hline
				Spaghetti Bolognese \newline {\scriptsize 1000 kcal} 
				\begin{small}
				\begin{itemize}
				\itemsep0pt
					\item 100g Spaghetti
					\item 200g Bolognesesoße \smallskip
				\end{itemize}
				\end{small}
				\begin{scriptsize}
				Anmerkung: Gericht ist in Buch blablabla auf S.30 zu finden.
				\end{scriptsize}
				& Gericht A \newline {\scriptsize 1000 kcal} 
				\begin{small}
				\begin{itemize}
				\itemsep0pt
					\item 500g Kartoffeln
					\item 200g Rührei 
					\item 100g Spinat
				\end{itemize}
				\end{small}
				& Pfannkuchen \newline {\scriptsize 500 kcal}  
				\begin{small}
				\begin{itemize}
				\itemsep0pt
					\item 300g Pfannkuchen
				\end{itemize}
				\end{small}
				&  Gericht A \newline {\scriptsize 1000 kcal}  
				\begin{small}
				\begin{itemize}
				\itemsep0pt
					\item 500g Kartoffeln
					\item 200g Rührei 
					\item 100g Spinat
				\end{itemize}
				\end{small}
				&  Gericht A \newline {\scriptsize 1000 kcal}  
				\begin{small}
				\begin{itemize}
				\itemsep0pt
					\item 500g Kartoffelbrei
					\item 200g Rührei 
					\item 100g Spinat
				\end{itemize}
				\end{small}
				&  Gericht A \newline {\scriptsize 1000 kcal}  
				\begin{small}
				\begin{itemize}
				\itemsep0pt
					\item 500g Zungenragout
					\item 200g Rührei 
					\item 100g Spinat
				\end{itemize}
				\end{small}
				&  Gericht A \newline {\scriptsize 1000 kcal}  
				\begin{small}
				\begin{itemize}
				\itemsep0pt
					\item 500g Kartoffeln
					\item 200g Rührei 
					\item 100g Rotkohl 
				\end{itemize}
				\end{small} 
				\\
				\hline
				& & Salat \newline {\scriptsize 300 kcal} 
				\begin{small}
				\begin{itemize}
				\itemsep0pt
					\item 500g Salat
					\item 50ml Dressing
				\end{itemize}
				\end{small}
				& & & & Salat \newline {\scriptsize 300 kcal}  
				\begin{small}
				\begin{itemize}
				\itemsep0pt
					\item 500g Salat
					\item 50ml Dressing
				\end{itemize}
				\end{small}
				\\
				\hline
			\end{tabularx} \medskip \\ 
		Für diese Woche wurden xxxxx von 14.000 kcal verbraucht. 
		
		\end{landscape}
		'''
	}
	
	/*
	 * Generiert die Einkaufsliste für Latex.
	 */
	def String generateLatexShoppingList() {
		//TODO: Latex-Code für die Einkaufsliste; zu befüllen mit den Informationen aus unserer Modellinstanz "plan" (später)
		
		'''
		{\Large \textbf{Einkaufsliste}} \medskip \\
		
		\begin{itemize}
			\item 100g Spaghetti ($\rightarrow$ 100 = Mo + Di + Mi + ... + So)
			\item 500g Kartoffeln 
			\item 
		\end{itemize}
		'''
	}
	
	//--------------------HTML--------------------
	
	/*
	 * Generiert den Ernährungsplan für HTML.
	 */
	def String generateHtmlSchedule() {
		'''
		<!DOCTYPE html>
		<html lang="en">
		<head>
		  <meta charset="utf-8">
		  <meta http-equiv="X-UA-Compatible" content="IE=edge">
		  <meta name="viewport" content="width=device-width, initial-scale=1">
		  <title>Ernährungsplan</title>
		
		  <!-- Bootstrap -->
		  <link href="../html/css/bootstrap.min.css" rel="stylesheet">
		  <link href="../html/css/style_EP.css" rel="stylesheet">
		
		  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		    <!--[if lt IE 9]>
		      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
		      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		      <![endif]-->
		    </head>
		
		    <body>
		      <div class="container">
		        <div class="row">
		          <h1>Ernährungsplan</h1>
		          <p>Max Mustermann <br />Empfohlener Energiebedarf pro Woche: 14.000 Kalorien &rarr; 2.000 Kalorien pro Tag</p>
		          <table class="table table-bordered">
		            <thead>
		              <tr>
		                <th>Montag</th>
		                <th>Dienstag</th>
		                <th>Mittwoch</th>
		                <th>Donnerstag</th>
		                <th>Freitag</th>
		                <th>Samstag</th>
		                <th>Sonntag</th>
		              </tr>
		            </thead>
		            <tbody>
		              <tr>
		                <td>Spaghetti Bolognese <br /> <small>1000 kcal</small><br /> 
		                  <ul>
		                    <li>100g Spaghetti</li>
		                    <li>200g Bolognesesoße</li>
		                  </ul>
		                </td>
		                <td>Gericht A <br /> <small>1000 kcal</small><br /> 
		                  <ul>
		                    <li>500g Kartoffeln</li>
		                    <li>200g Rührei</li>
		                    <li>100g Spinat</li>
		                  </ul> 
		                </td>
		                <td>Pfannkuchen <br /> <small>500 kcal</small><br /> 
		                  <ul> 
		                    <li>300g Pfannkuchen</li>
		                  </ul>
		                </td>
		                <td>Gericht A <br /> <small>1000 kcal</small><br /> 
		                  <ul>
		                    <li>500g Kartoffeln</li>
		                    <li>200g Rührei</li>
		                    <li>100g Spinat</li>
		                  </ul> 
		                </td>
		                <td>Gericht A <br /> <small>1000 kcal</small><br /> 
		                  <ul>
		                    <li>500g Kartoffelbrei</li>
		                    <li>200g Rührei</li>
		                    <li>100g Spinat</li>
		                  </ul> 
		                </td>
		                <td>Gericht A <br /> <small>1000 kcal</small><br /> 
		                  <ul>
		                    <li>500g Zungenragout</li>
		                    <li>200g Rührei</li>
		                    <li>100g Spinat</li>
		                  </ul> 
		                </td>
		                <td>Gericht A <br /> <small>1000 kcal</small><br /> 
		                  <ul>
		                    <li>500g Kartoffeln</li>
		                    <li>200g Rührei</li>
		                    <li>100g Rotkohl</li>
		                  </ul> 
		                </td>
		              </tr>
		              <tr>
		                <td></td>
		                <td></td>
		                <td>Salat <br /> <small>300 kcal</small><br /> 
		                  <ul>
		                    <li>500g Salat</li>
		                    <li>50ml Dressing</li>
		                  </ul>
		                </td>
		                <td></td>
		                <td></td>
		                <td></td>
		                <td>Salat <br /> <small>300 kcal</small><br /> 
		                  <ul>
		                    <li>500g Salat</li>
		                    <li>50ml Dressing</li>
		                  </ul>
		                </td>
		              </tr>
		            </tbody>
		          </table>
		          <p>Für diese Woche wurden xxxxx von 14.000 kcal verbraucht.</p>
		        </div>
		      </div>
		
		      <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
		      <!-- Include all compiled plugins (below), or include individual files as needed -->
		      <script src="../html/js/bootstrap.min.js"></script>
		    </body>
		    </html>
		'''
	}
	
	/*
	 * Generiert die Einkaufsliste für HTML.
	 */
	def String generateHtmlShoppingList(){
		'''
		<!DOCTYPE html>
		<html lang="en">
		<head>
			<meta charset="utf-8">
			<meta http-equiv="X-UA-Compatible" content="IE=edge">
			<meta name="viewport" content="width=device-width, initial-scale=1">
			<title>Einkaufsliste</title>
		
			<!-- Bootstrap -->
			<link href="../html/css/bootstrap.min.css" rel="stylesheet">
			<link href="../html/css/style_EL.css" rel="stylesheet">
		
			<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
			<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		    <!--[if lt IE 9]>
		      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
		      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		      <![endif]-->
		  </head>
		
		  <body>
		  	<div class="container">
		  		<div class="row">
		  			<h1>Einkaufsliste</h1>
		        <ul>
		          <li>100g Spaghetti</li>
		          <li>500g Kartoffeln</li>
		        </ul>
		  		</div>
		  	</div>
		
		  	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
		  	<!-- Include all compiled plugins (below), or include individual files as needed -->
		  	<script src="../html/js/bootstrap.min.js"></script>
		  </body>
		  </html>
		'''
	}
	
}