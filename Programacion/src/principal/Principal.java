/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import enume.Categorias;
import enume.Continentes;
import enume.Dias;

/**
 *
 * @author Alumno Mañana
 */
public class Principal {
    public static void main(String[] args) {
        imprimirDia(Dias.MARTES);
        imprimirDia(Dias.VIERNES);
        //VISUALIZAR PAIS
        System.out.println("Continentes..."+Continentes.AMERICA);
        System.out.println("Número de países de América: "+Continentes.AMERICA.getNum());
        System.out.println("Superficie de América: "+Continentes.AMERICA.getSuperficie());
        //CATEGORIAS PCCOMPONENTES
        System.out.println("Categoria..."+Categorias.MONITORES);
        System.out.println("Unidades totales disponibles de monitores en tiendas y almacenes: "+Categorias.MONITORES.getUnidadesDisponibles());
        System.out.println("Marca más vendida de monitores: "+Categorias.MONITORES.getMarcaPredominante());
    }
    
    public static void imprimirDia(Dias d){
        switch (d) {
            case LUNES:
                System.out.println("Hoy es lunes");
                break;
            case MARTES:
                System.out.println("Hoy es martes");
                break;
            case MIERCOLES:
                System.out.println("Hoy es miércoles");
                break;
            case JUEVES:
                System.out.println("Hoy es jueves");
                break;
            case VIERNES:
                System.out.println("Hoy es viernes");
                break;
            case SABADO:
                System.out.println("Hoy es sábado");
                break;
            case DOMINGO:
                System.out.println("Hoy es domingo");
                break;
            default:
                throw new AssertionError();
        }
    }
}
