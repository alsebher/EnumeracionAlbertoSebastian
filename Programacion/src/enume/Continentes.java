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
public enum Continentes {
    AFRICA(53,1000),
    EUROPA(46,4000),
    ASIA(44,5000),
    AMERICA(34,8000),
    OCEANIA(14,1000);
    private int num;
    private int superficie;
    private Continentes(int num,int superficie) {
      this.num = num;
      this.superficie = superficie;
   }

    public int getNum() {
        return num;
    }

    public int getSuperficie() {
        return superficie;
    }
    
    
    
}
