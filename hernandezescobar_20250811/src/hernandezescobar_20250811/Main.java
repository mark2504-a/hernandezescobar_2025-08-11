/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hernandezescobar_20250811;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    //VARIABLES GLOBALES
    public static int horasEnUnDia = 24;
    public static int segundosEnUnaHora = 3600;
    public static int segundosEnUnMinuto = 60;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //VARIABLE LOCAL
        int segundosTotales = 91111;
        //Se asigna el valor de dias a la variable 
        int dias = calcularDias(segundosTotales);
        //SE ASIGNA EL VALOR DE LOS SEGUNDOS EXCEDENTES O RESTANTES DESPUES DE HABER CALCULADO LOS DIAS
        int segundosRestantesDespuesDeExtraerDias = obtenerSegundosRestantesDespuesDeExtraerDias(segundosTotales);
        //SE ASIGNA EL VALOR DE LAS HORAS A PARTIR DE LOS SEGUNDOS EXCEDENTES DEL CALCULO DE DIAS
        int horas = calcularHoras(segundosRestantesDespuesDeExtraerDias);
        //SE ASIGNA EL VALOR DE LOS SEGUNDOS EXCEDENTES A PARTIR DEL CALCULO DE LAS HORAS
        int segundosRestantesDespuesDeExtraerHoras = obtenerSegundosRestantesDespuesDeExtraerHoras(segundosRestantesDespuesDeExtraerDias);
        //SE ASIGNA EL VALOR DE LOS MINUTOS A PARTIR DE LOS SEGUNDOS RESTANTES DEL CALCULO DE LAS HORAS
        int minutos = calcularMinutos(segundosRestantesDespuesDeExtraerHoras);
        //LOS SEGUNDOS QUE QUEDAN DESPUÉS DE HABER REALIZADO TODOS LOS CÁLCULOS ANTERIORES
        int segundosFinales = obtenerSegundosRestantesDespuesDeExtraerMinutos(segundosRestantesDespuesDeExtraerHoras);
        
        System.out.println("Usted ha solicitado calcular los dias, horas, minutos, y segundos a partir de un numero mayor a 86400");
        System.out.println("Usted ha indicado el valor actual de segundos como: "+segundosTotales);
        System.out.println("Dias: "+dias);
        System.out.println("Horas: "+horas);
        System.out.println("Minutos: "+minutos);
        System.out.println("Segundos: "+segundosFinales);
    }
    
    //MODUL0 PARA CALCULAR LA CANTIDAD DE DIAS
    public static int calcularDias(int segundosTotales) {
        return segundosTotales/(Main.horasEnUnDia*Main.segundosEnUnaHora);
    }
    //MODUL0 PARA CALCULAR LOS SEGUNDOS RESTANTES DESPUES DE EXTRAER LOS DIAS
    public static int obtenerSegundosRestantesDespuesDeExtraerDias(int segundosTotales){
        return segundosTotales % (Main.horasEnUnDia*Main.segundosEnUnaHora);
    }
    //MODUL0 PARA CALCULAR LAS HORAS
    public static int calcularHoras(int segundosRestantes){
        return segundosRestantes/Main.segundosEnUnaHora;
    }
    
    //MODULO PARA CALCULAR LOS SEGUNDOS RESTANTES DESPUÉS DE EXTRAER LAS HORAS
    public static int obtenerSegundosRestantesDespuesDeExtraerHoras(int segundosRestantes){
        return segundosRestantes % Main.segundosEnUnaHora;
    }
    
    //MODULO PARA CALCULAR LA CANTIDAD DE MINUTOS A PARTIR DE LOS SEGUNDOS RESTANTES
    public static int calcularMinutos(int segundosRestantes){
        return segundosRestantes/Main.segundosEnUnMinuto;
    }
    
    //MÓDULO PARA CALCULAR LOS SEGUNDOS RESTANTES DE TODA LA OPERACIÓN
    public static int obtenerSegundosRestantesDespuesDeExtraerMinutos(int segundosRestantes){
        return segundosRestantes % Main.segundosEnUnMinuto;
    }
}
