 /*
@autor:Wilgleidys Sánchez
@Fecha:17/06/2021
*/
 
import java.util.Scanner;	
/*importamos esta libreria para que no arroje un error
al momento de utilizar la clase Scanner, que nos sirve para
leer datos desde el teclado*/

public class Encuesta	   
	   
/*	   
	   
Se desea automatizar una encuesta para estimar el grado de aceptación de los productos “Harina	   
	   
Pan” y “Harina Juana”. A cada encuestado se le pregunta si consume alguno de los productos. La 	   
	   
respuesta puede ser sí o no. 	  
Se requiere imprimir por pantalla el siguiente reporte:	   
	   
o Porcentaje de personas que consumen el producto “Harina Pan” 	   
	   
o Porcentaje de personas que consumen el producto “Harina Juana”	   
	   
o Porcentaje de personas que consumen ambos producto “Harina Pan y Harina Juana” 	   
	   
o Porcentaje de personas que NO consumen ambos producto “Harina Pan y Harina Juana”	   
	   
	   
	   
*/	   
	   
{	   
	   
public static void main (String [] args){	   
	   
/*Acá se declaran los atributos y se Instancia los objetos*/	
 
/* Los atributos deben ser booleanos para detectar las repuestas
 "Sí o No" de los encuestados.	   
*/	      
	  	   
boolean swHrnaP=false;	   
	   
boolean swHrnaJ=false;	   
/* Los atributos deben ser String para guardar las repuestas
 "SI o NO" de los encuestados*/		   
   
String hrnaP;	   
	   
String hrnaJ;	   
	   
  
/*Los atributos byte se utiliza para contar las repuestas de las personas encuestadas*/	   
	   
	   
byte ctaHrnaP=0;	   
	     
byte ctaHrnaJ=0;	   
	   
byte ctaAmbas=0;	   
	   
byte ctaNinguna=0;	   
	   
byte ctaEncuestados=0;	 
 
byte opc=0;	   
	   
/*Atributos de tipo float para guardar el porcentaje de personas que consumen Harina Pan, 	   
	   
Harina Juana, Ninguna de las 2 y Ambas Harinas*/	 
 
float pctHrnaP=0,pctHrnaJ=0,pctNing=0,pctAmb=0;	   
	   
/*Se Instancia un objeto de tipo Scanner para obtener de los datos por medio del teclado*/	   
	   
Scanner teclado = new Scanner(System.in);	   
	      
	   
/*Entrada de los datos*/	   
	   
System.out.println("BIENVENIDO. SE LE HARÁN ALGUNAS PREGUNTAS SOBRE EL CONSUMO DE HARINA DE MAIZ PRECOCIDA");	   
	   
System.out.println("EN CADA PREGUNTA INGRESE \"S\" SI SU REPSUESTA ES \"SI\" O \"N\" SI SU RESPUESTA ES \"NO\"");	   
	   
System.out.println("***************************************************************************************************");	   
	  
	   
/*Como desconocemos el número de personas a encuestar, se implementa un ciclo no automático DO WHILE
 para que se repitan ls preguntas hasta que el encuestado introduzca cero "0" 
 para finalizar y luego mostrar los resultados*/	   
	   
do {	   
	   
ctaEncuestados++;	   
	   
System.out.println("¿Usted consume Harina Pan? S/N");	   
	   
hrnaP = teclado.next();	   
	   
System.out.println("¿Usted consume Harina Juana? S/N");	   
	   
hrnaJ = teclado.next();	   
	   
System.out.println("**GRACIAS POR RESPONDER**");	   
	   
System.out.println();//Linea en blanco para mejor visualización	   
	   
	   
	   
/*Se procesan los datos ingresados*/	   
	   
if (hrnaP.equals("S")){	   
	   
swHrnaP=true;	   
	   
	   
	   
}//fin de if	   
	   
else{	   
	   
swHrnaP=false;	   
	   
}//fin de else	   
	   
	   
	   
if (hrnaJ.equals("S")){	   
	   
swHrnaJ=true;	   
	   
}//fin de if	   
	   
else{	   
	   
swHrnaJ=false;	   
	   
}//fin de else	   
	   
/* Si la persona encuestada elije HARINA PAN pero no HARINA JUANA se incrementa uno el contador de harina pan	   
	   
siempre y cuando se cumplan ambas condiciones*/	   
	   
if (swHrnaP==true && swHrnaJ==false){	   
	   	   
  
ctaHrnaP++; 	   
	   
}//fin de if	   

/* Si la persona encuestada elije HARINA JUANA pero no HARINA PAN se incrementa uno el contador de harina Juana	   
	   
siempre y cuando se cumplan ambas condiciones*/
	   
else if(swHrnaP==false && swHrnaJ==true){	   
	   	   
	   
ctaHrnaJ ++;	   
	   
}//fin de else if	  

/* Ahora si la persona encuestada elije AMBAS OPCIONES se incrementa uno el contador de ambas opciones	   
	   
siempre y cuando se cumplan ambas condiciones*/
	   
else if (swHrnaP==true && swHrnaJ==true){	   
	   	   
	   
ctaAmbas++;	   
	   
	   
	   
}//fin de else if	   
	   
else{	   
	   
/* Si la persona encuestada no elije NINGUNA se incrementa uno el contador de ninguna de las opciones	   
	   
siempre y cuando se cumplan ambas condiciones*/
	   
ctaNinguna++;	   
	   
}//fin de else	   
	   
System.out.println("¿Desea Procesar otro encuestado?");	   
	   
System.out.println("***Ingrese \"1\" para continuar o \"0\" para salir***");	   
 
opc = teclado.nextByte();	 
	   	   
}while(opc!=0); 	   
	   
	   
	   
/*Salida de los datos*/	   
	   
	   
	   
/*Se calcula los porcentajes*/	   
	   
pctHrnaP=(ctaHrnaP*100)/ctaEncuestados;	   
	   
pctHrnaJ=(ctaHrnaJ*100)/ctaEncuestados;	   
	   
pctAmb=(ctaAmbas*100)/ctaEncuestados;	   
	   
pctNing=(ctaNinguna*100)/ctaEncuestados;	   
	   
	   
	   
System.out.println("***********************************************");	   
	   
System.out.println(" INFORME  DE  LA  ENCUESTA");	   
	   
System.out.println("***********************************************");	   
	   
System.out.println("Numero de Personas Encuestadas: "+ctaEncuestados);	   
	   
System.out.println();	   
	   
System.out.println("Porcentaje de personas que consumen solamente Harina Pan : "+Math.round(pctHrnaP)+"%");	   
	   
System.out.println("Porcentaje de personas que consumen solamente Harina Juana : "+Math.round(pctHrnaJ)+"%");	   
	   
System.out.println("Porcentaje de personas consumidoras de ambas harinas de maiz (Harina Pan y Harina Juana): "+Math.round(pctAmb)+"%");	   
	   
System.out.println("Porcentaje de personas que NO consumen ninguna de las harinas de maiz precocido : "+Math.round(pctNing)+"%");	   
	   
	   
	   
}//fin de método main	   
	 
}//fin de la clase
