/*
@autor:Wilgleidys Sánchez
@Fecha:17/06/2021
*/
 
/*importamos esta libreria para que no arroje un error
al momento de utilizar la clase Scanner, que nos sirve para
leer datos desde el teclado*/
 
import java.util.Scanner;   
	   
public class Aerolinea	   
	   
/*	   
	   
En el aeropuerto de Barquisimeto “Jacinto Lara” operan cuatro (04) líneas aéreas: Avensa, Aereopostal, Zuliana y Aserca. 	   
	   
Las líneas ofrecen vuelos nacionales e internacionales. Diariamente, por cada vuelo que sale del aeropuerto se registran 	   
	   
los siguientes datos: Hora de salida, número de vuelo, línea aérea, tipo de vuelo (nacional o internacional) 	   
	   
y número de pasajeros. Los datos son clasificados por línea aérea.	   
	   
	   
	   
Imprima un reporte por pantalla que muestre:	   
	   
• Cantidad de pasajeros por cada vuelo.	   
	   
• Total de vuelos internacionales.	   
	   
• Tipo de vuelo con mayor número de vuelos.	   
	   
• Total de Pasajeros que salieron del aeropuerto*/	   
	   
{	   
	   
public static void main (String [] args){	   
	   
/*Acá se declaran los atributos y se Instancia los objetos*/

/*Definimos las constantes para las aerolineas*/
	   
final String AVENSA = "1";	   
	   
final String AEROPOSTAL = "2";	   
	   
final String ZULIANA = "3";	   
	   
final String ASERCA = "4";	   
	   
final String VuelN = "5";	   
	   
final String VuelI = "6";	   
	   	   	   
/*Se Definen los atributos para obtener las entradas y guardar los datos calculados*/	   
	   	   
String hraS,minSalida,lineA,numV,tipV;	   
	   
byte nPasL1=0,nPasL2=0,nPasL3=0,nPasL4=0;	   
	   
byte opc=0;	   
	   
String tipVuelM="";	   
	   
byte ctaVuelI=0;	   
	   
byte ctaVuelN=0;	   
	   
int totalPas=0;	   
	   	   
/*Se Instancia un objeto de tipo Scanner para obtener de los datos por medio del teclado*/	   
	  	   
Scanner entrada = new Scanner(System.in);	   
	   	   
	      
	   
/*Inicio*/	   
	   
	   
System.out.println(" ***REGISTRO  DE  VUELOS*** ");	   
	   
System.out.println("************************************************************************************************");	   
	   
	   
	   
/*Como desconocemos el número de personas a encuestar, se implementa un ciclo no automático DO WHILE
 para que se repitan ls preguntas hasta que el encuestado introduzca cero "0" 
 para finalizar y luego mostrar los resultados*/	   
	   
do {	   
	   
/*Entrada de los datos*/	   
	   
System.out.println("Ingrese el Codigo de la aerolinea (1=AVENSA; 2=AEROPOSTAL; 3=ZULIANA; 4=ASERCA): ");	   
	   
lineA = entrada.next();	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño	   
	   
	   
	   
System.out.println("Ingrese el numero de pasajeros: ");	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño	   
	   
	   
	   
/*Procesa los datos*/	   
	   
switch (lineA)	   
	   
{	   
	   
case "1": {	   
	   
nPasL1 = entrada.nextByte();	   
	   
totalPas+=nPasL1;	   
	   
break;	   
	   
}	   
	   
case "2":{	   
	   
nPasL2 = entrada.nextByte();	   
	   
totalPas+=nPasL2;	   
	   
break;	   
	   
}	   
	   
case "3":{	   
	   
nPasL3 = entrada.nextByte();	   
	   
totalPas+=nPasL3;	   
	   
break ;	   
	   
}	   
	   
case "4":{ 	   
	   
nPasL4 = entrada.nextByte();	   
	   
totalPas+=nPasL4;	   
	   
break ;	   
	   
}	   
	   
}//fin de switch	   
	   
	   
	   
	   
	   
/*ENTRADA DE DATOS*/	   
	   
System.out.println("Ingrese el tipo de vuelo (5=NACIONAL - 6=INTERNACIONAL): ");	   
	   
tipV = entrada.next();	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño	   
	   
	   
	   
/*Se cuenta el vuelo segun su tipo*/	   
	   
if (tipV.equals("5")){	   
	   
ctaVuelN++;	   
	   
}//fin del if	   
	   
else{	   
	   
ctaVuelI++;
	   
}//fin del else	   
	   
	   
	   
/*Solicita los datos faltantes*/	   
	   
	   
	   
System.out.println("Indique el numero del vuelo: ");	   
	   
numV = entrada.next();	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño   
	   
	   
	   
System.out.println("Ingrese la hora de salida: ");	   
	   
hraS = entrada.next();	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño	   
	   
	   
	   
System.out.println("Ingrese el minuto de salida: ");	   
	   
minSalida = entrada.next();	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño 	   
	   
System.out.println("***FIN DEL PROCESO***");	   
	   
	   
	   
/*Procesa los datos*/	   
	      
	   
System.out.println();//Linea en blanco para mejor visualización de diseño	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño	   
	   
System.out.println("¿Desea Procesar mas datos?");	   
	   
System.out.println("***Ingrese \"1\" para continuar o \"0\" para salir***");	   
	   
opc = entrada.nextByte();	   
	   
}while(opc!=0); 	   
	   
	   
	   
/*Proesa atos fuera del DO WHILE*/	   
	   
	   
	   
/*Se compara el tipo de vuelo con mayor numero de vuelos y
se se asigna a tipo de vuelo una variable tipo string*/	   
	   
if (ctaVuelI>ctaVuelN){	   
	   
tipVuelM="INTERNACIONAL";	   
	   
}//fin de if	   
	   
else if (ctaVuelI<ctaVuelN){	   
	   
tipVuelM="NACIONAL";	   
	   
}//fin de if	   
	   
else{	   
	   
tipVuelM="LOS VUELOS NACIONALES E INTERNACIONALES TUVIERON LA MISMA AFLUENCIA";	   
	   
}//fin de else 	   
	   
	   
	   
/*Salida de datos fuera del DO WHILE*/	   
	   
System.out.println("*******************************************************************");	   
	   
System.out.println(" ***REPORTE  DE  VUELOS*** ");	   
	   
System.out.println("*******************************************************************");	   
	   
	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño
	   
System.out.println("AEROLINEA : NUMERO DE PASAJEROS :");	   
	   
System.out.print("***AVENSA***");	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño
	   
System.out.print(""+nPasL1);	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño	   
	   
	   
System.out.print("***AEROPOSTAL***");	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño
	   
System.out.print(""+nPasL2);	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño
	   
	   
	   
System.out.print("***ZULIANA***");	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño
	   
System.out.print(""+nPasL3);	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño	   
	   
	   
System.out.print("***ASERCA***");	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño
	   
System.out.print(""+nPasL4);	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño
	   
System.out.println();//Linea en blanco para mejor visualización de diseño   
	   
	   
	   
System.out.println("TOTAL DE VUELOS NACIONALES : "+ctaVuelN);	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño   
	   
	   
	   
System.out.println("TOTAL DE VUELOS INTERNACIONALES : "+ctaVuelI);	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño	   
	   
	   
	   
System.out.println("TIPO DE VUELO CON MAYOR NUMERO DE VUELOS : "+tipVuelM);	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño
	   
System.out.println();//Linea en blanco para mejor visualización de diseño	   
	   	   
	   
System.out.println("TOTAL DE PASAJEROS PARTIERON POR EL AEROPUERTO : "+totalPas);	   
	   
	   
	   
}//fin de método main	   
	 
}//FIN DE LA CLASE