/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enume;

/**
 *
 * @author Alumno Mañana
 */
public enum Categorias {
    SOBREMESA(1000,"CORSAIR"),
    PORTATIL(2000,"ASUS"),
    RATONES(3000,"RAZER"),
    TECLADOS(2500,"LOGITECH"),
    MONITORES(3500,"AOC"),
    DISCOS(4000,"KINGSTON"),
    TARJETAS(1500,"NVIDIA"),
    HEADSETS(4500,"TRITTON"),
    PLACAS(5000,"MSI"),
    CABLES(9500,"BASICS");
    private int unidadesDisponibles;
    private String marcaPredominante;
    
    private Categorias(int unidadesDisponibles,String marcaPredominante) {
      this.unidadesDisponibles = unidadesDisponibles;
      this.marcaPredominante = marcaPredominante;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public String getMarcaPredominante() {
        return marcaPredominante;
    }
    
    
    
}
