 /*
@autor:Wilgleidys Sánchez
@Fecha:17/06/2021
*/ 

/*Se importa esta libreria para redondear los porcentajes.*/
import java.lang.Math; 	   
	   	   	   
/*importamos esta libreria para que no arroje un error
al momento de utilizar la clase Scanner, que nos sirve para
leer datos desde el teclado*/
	   	   
import java.util.Scanner;	   
	   
public class Nomina	   
	   
/*	   
	   
La UPEL desea un reporte por Decanato mostrando por cada docente ciertas características.
Teniendo como entrada Decanato, cédula, sexo, sueldo base, número de hijos. 	   
	   
Calcule: prima por hijo (1.500 bsS por cada uno) y deducciones de Seguro Social 4% sobre el sueldo base 	   
	   
e Impuesto Sobre la Renta (ISRL) 2% sobre el sueldo base. 	   
	   
	   
	   
Imprima un reporte por pantalla que muestre:	   
	   
• Por cada docente: Asignaciones, deducciones y neto a pagar por profesor	   
	   
• Por la universidad: Promedio de Sueldos. 	   
	   	   	   
Nota: Tome como referencia el sueldo base de 20.000 bsS.*/	   
	   
{	   
	   
public static void main (String [] args){	   
	   
/*Acá se declaran los atributos y se Instancia los objetos*/	   

/*Se definen las constantes para el Salario Base, Prima Por Hijos, Seguro Social e Impuesto Sobre La Renta*/	   

final float SuelB = 20000;	   
	   
final float PrimXh = 1500;	   
	   
final double SegS = 0.04;	   
	   
final double ISRL = 0.02;	   
	   	   
/*Se Definen los atributos para obtener las entradas y guardar los datos calculados*/	   
	   	   	   
String decanato,CI,sexo;	   
	   
byte nHi=0;	   
	   
byte opc=0;	   
	   
byte ctaEmpleados=0;	   
	   
double asignaciones=0;	   
	   
double deducciones=0;	   
	   
double netoC=0;	   
	   
float acumS=0;	   
	   
float promS=0;	   
	   
/*Se Instancia un objeto de tipo Scanner para obtener de los datos por medio del teclado*/	   
	   	   
Scanner entrada = new Scanner(System.in);	   
	   	   	   
	   
/*Entrada de los datos*/	   
	   
System.out.println("*********************************");	   
	   
System.out.println(" N O M I N A");	   
	   
System.out.println("*********************************");	   
	   
	   
	   
/*Como desconocemos el número de personas a encuestar, se implementa un ciclo no automático DO WHILE
 para que se repitan ls preguntas hasta que el encuestado introduzca cero "0" 
 para finalizar y luego mostrar los resultados*/	   
	   
do {	   
	   
ctaEmpleados++;/*Cuenta un empleado*/	   
	   
System.out.println("Ingrese el Codigo del Decanato: ");	   
	   
decanato = entrada.next();	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño	   
	   
	   
	   
System.out.println("Ingrese el numero de Cedula del Empleado: ");	   
	   
CI = entrada.next();	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño	   
	   
	   
	   
System.out.println("Indique el sexo M=Masculino o F=Femenino: ");	   
	   
decanato = entrada.next();	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño	   
	   
	   
	   
System.out.println("Ingrese numero de hijos (0=Ninguno): ");	   
	   
nHi = entrada.nextByte();	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño	   
	   
	      
	   
/*Se procesan los datos ingresados*/	   
	   
asignaciones=nHi*PrimXh;/*Calcula las asignaciones por prima por hijos */	   
	   
deducciones=SuelB*SegS+SuelB*ISRL;/*Calcula las deducciones del seguro social y del impuesto sobre la renta*/	   
	   
netoC=(SuelB+asignaciones)-deducciones;/*Calcula el neto a pagar por empleado*/	   
	   
acumS+=netoC; /*Acumula el sueldo por empleado para luego calcular el promedio de sueldo por universidad */	   
	   
	   
	   
System.out.println("***FIN DEL PROCESO***");	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño	   
	   
	   
	   
/*Salida de los datos del ciclo DO WHILE que contiene la informacion del cobro por empleado*/	   
	   
System.out.println("*************************************************");	   
	   
System.out.println(" ***RECIBO  DE  PAGO*** ");	   
	 	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño	   
	   
	   
	   
System.out.println("***********************************************");	   
	   
System.out.println(" ***ASIGNACIONES*** ");	   
	   
System.out.println("***********************************************");	   
	   
System.out.println("PRIMA POR HIJOS : "+nHi*PrimXh+" bsS");	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño	   
	   
System.out.println("TOTAL ASIGNACIONES : "+asignaciones+" bsS");	   
	   
System.out.println("***********************************************");	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño	   
	   	   
	   
System.out.println(" ***D E D U C C I O N E S*** ");	   
	   
System.out.println("***********************************************");	   
	   
System.out.println("SS : "+SuelB*SegS+" bsS");	   
	   
System.out.println("ISLR : "+SuelB*ISRL+" bsS");	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño	   
	   
System.out.println("TOTAL DEDUCCIONES : "+deducciones+" bsS");	   
	   
System.out.println("***********************************************");	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño	   
	   
	   
	   
System.out.println("SUELDO BASE : "+SuelB+" bsS");	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño	   
	   
System.out.println("SUELDO NETO A COBRAR =>: "+netoC+" bsS");	   
	   
	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño	   
	   
System.out.println();//Linea en blanco para mejor visualización de diseño	   
	   
System.out.println("¿Desea Procesar otro empleado?");	   
	   
System.out.println("***Ingrese \"1\" para continuar o \"0\" para salir***");	   
	   
opc = entrada.nextByte();	   
	   
}while(opc!=0); 	   
	   
	   	   
/*Salida de datos fuera del DO WHILE */	   
	   	   
	   
/*Calcula el promedio de sueldos*/	   
	   
promS=acumS/ctaEmpleados;	   
	   
	   	   
System.out.println("***I N F O R M E***");	   
	   
System.out.println("********************************************************************************");	   
	   
System.out.println("EMPLEADOS DE LA NOMINA : "+ctaEmpleados);	   
	   
System.out.println();	   
	   
System.out.println("PROMEDIO DE SUELDOS PAGADOS POR LA UNIVERSIDAD: "+Math.round(promS)+" bsS");	   
	   	   	   
}//fin de método main	   
	 
}//fin de la clase