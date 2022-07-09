import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void notiVisitantes (String contagiado, ListaVisitantes listaVisitantes) {
		
		ArrayList<String> notificarVisitante = new ArrayList<String>();
		ArrayList<String> lista = listaVisitantes.getLista();
		for(int persona = 0; persona < lista.size(); persona++) {
			if((contagiado).equals(lista.get(persona))){
				for(int i = 0; i < lista.size(); i++) {
					if((contagiado).equals(lista.get(i)) != true) {
						notificarVisitante.add(lista.get(i));
					}
				}
			}
		}
		for(int notificacion = 0; notificacion < notificarVisitante.size(); notificacion++) {
			System.out.println("Hola "+ notificarVisitante.get(notificacion) + ", se le informa que " + 
								"alguien se ha contagiado de la enfermedad Covid19 y que ambos han " +
								"han compartido espacio en un establecimiento el dia " + listaVisitantes.getFecha() + " por lo " +
								"que se recomienda extremar medidas preventivas, prestar especial atención " +
								"a la aparición de posibles síntomas y realizarse la prueba en caso de " +
								"considerarse pertinente.");
			}
	}
	
public static void notiColaboradores(String contagiado, ListaEstablecimientos listaEstablecimientos) {
		
		ArrayList<String> colaboradores = new ArrayList<String> ();
		ArrayList<String> listasColaboradores = new ArrayList<String> ();
		
		for(int i = 0; i < listaEstablecimientos.size(); i ++) {
			listasColaboradores = (listaEstablecimientos.get(i)).getListaColaboradores();
			for(int k = 0; k < listasColaboradores.size(); k ++) {
				String persona = listasColaboradores.get(k);
				if(contagiado.equals(persona)) {
					for(int j = 0; j < listasColaboradores.size(); j++) {
						if(contagiado.equals(listasColaboradores.get(j)) != true){
							colaboradores.add(listasColaboradores.get(j));
						}
					}
				}
			}	
		}
		for(int h = 0; h < colaboradores.size(); h++) {
				System.out.println("Hola "+ colaboradores.get(h) + ", se le notifica que " + contagiado 
						+ " se ha contagiado de COVID-19, se le recomienda extremar medidas " 
						+ "preventivas, prestar especial atencion a la aparicion de posibles "
						+ "sintomas y realizarse la prueba en caso de considerarse pertinente.");
				}
		}
	
public static void reporteCovid19(ListaVisitantes CLR, ListaVisitantes BM, ListaVisitantes GM, ListaVisitantes F5M, ListaVisitantes PPC, ListaPersonas listaPersonas, ListaEstablecimientos listaEstablecimientos) {
	try (Scanner scan = new Scanner(System.in)){
		System.out.print("Porfavor ingrese la fecha del reporte:" + "\n");
		String fechaReporte = scan.nextLine();
		System.out.print("Porfavor ingrese el nombre completo del contagiado: " + "\n");
		String contagiado = scan.nextLine();
		ReporteCovid19 reporte = new ReporteCovid19(contagiado, fechaReporte);
		
		//notificaciones burbuja
		for(int i=0; i < listaPersonas.size(); i++) {
			if(listaPersonas.get(i).getNombre().equals(contagiado))
				notiBurbuja(listaPersonas.get(i), listaPersonas);
		}	
		//notificaciones colaboradores
		notiColaboradores(reporte.getPersona(),listaEstablecimientos);
			
		//notificaciones visitantes
		notiVisitantes(contagiado, CLR);
		notiVisitantes(contagiado, BM);
		notiVisitantes(contagiado, GM);
		notiVisitantes(contagiado, F5M);
		notiVisitantes(contagiado, PPC);
		}
	}

public static void notiBurbuja(Persona contagiado, ListaPersonas listapersonas){
	
	ArrayList<String> Burbuja = new ArrayList<String>();
	
	for (int i=0; i < listapersonas.size(); i++) {
		if(listapersonas.get(i).getBurbuja().equals(contagiado.getBurbuja())) {
			if(listapersonas.get(i).getNombre().equals(contagiado.getNombre()) != true)
			Burbuja.add(listapersonas.get(i).getNombre());
		}
	}
	

	for (int j=0; j < Burbuja.size(); j++) {
		System.out.println("Hola, " + Burbuja.get(j) + " se le notifica que " +
							contagiado.getNombre() + " se ha contagiado de COVID-19, " + 
							"por orden sanitaria se le solicita que se someta a 14 dias" +
							"de aislamiento social obligatorio. Buen dia.");
	}
}

	public static void main(String[] args) {
		
		PersonasParser personasParser = new PersonasParser();
		ListaPersonas listaPersonas = personasParser.updatePersonas();
		
		EstablecimientosParser establecimientosParser = new EstablecimientosParser();
		ListaEstablecimientos listaEstablecimientos = establecimientosParser.updateEstablecimientos();
		
		ArrayList<String> visitantesCLR = new ArrayList<String>();
		visitantesCLR.add("Rocio Rodiguez Salazar");
		visitantesCLR.add("Kenneth Rojas Suarez");
		visitantesCLR.add("Elba Zurita Carvajal");
		visitantesCLR.add("Aquiles Bailo Alvarez");
		
		ArrayList<String> visitantesBM = new ArrayList<String>();
		visitantesBM.add("Patricia Altodadono Solorzano");
		visitantesBM.add("Carlos Mendez Sequeira");
		visitantesBM.add("Marian Calsas Alvarado");
		visitantesBM.add("Jose Marco Alvarado Hernandez");
		
		ArrayList<String> visitantesGM = new ArrayList<String>();
		visitantesGM.add("Elton Tito Alvarez");
		visitantesGM.add("Carlos Perez Gil");
		visitantesGM.add("Elvis Nieto Herrera");
		visitantesGM.add("Leo Diario Fernandez");
		
		ArrayList<String> visitantesF5M = new ArrayList<String>();
		visitantesF5M.add("Jose Marco Alvarado Hernandez");
		visitantesF5M.add("Caronte Casas Venegas");
		visitantesF5M.add("Mery Londres Castro");
		visitantesF5M.add("Amanda Mendez Sequeira");
		visitantesF5M.add("Kenneth Rojas Suarez");
		
		ArrayList<String> visitantesPPC = new ArrayList<String>();
		visitantesPPC.add("Jose Andres Alvarado Alfaro");
		visitantesPPC.add("Kenneth Rojas Suarez");
		visitantesPPC.add("Rosa Melano Viena");
		visitantesPPC.add("Marcia Ana Delagdo Porras");
		visitantesPPC.add("Soila Cerda Marin"); 
		
		
		String fechaDeHoy = "20/11/2020";
		
		ListaVisitantes CLR = new ListaVisitantes(fechaDeHoy, visitantesCLR);
		ListaVisitantes BM = new ListaVisitantes(fechaDeHoy, visitantesBM);
		ListaVisitantes GM = new ListaVisitantes(fechaDeHoy, visitantesGM);
		ListaVisitantes F5M = new ListaVisitantes(fechaDeHoy, visitantesF5M);
		ListaVisitantes PPC = new ListaVisitantes(fechaDeHoy, visitantesPPC);
		
		
		reporteCovid19(CLR, BM, GM, F5M, PPC, listaPersonas, listaEstablecimientos);
		}
	}

