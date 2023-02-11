/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam_202015488;

/**
 *
 * @author
 */
public class Treatment {
    private boolean filling;
    private boolean extraction;
    private boolean endo;
    private boolean xRay;
    private double total;

    public Treatment ( boolean filling , boolean extraction , boolean endo , boolean xRay ) {
        this.filling = filling;
        this.extraction = extraction;
        this.endo = endo;
        this.xRay = xRay;
    }

    public boolean isFilling ( ) {
        return filling;
    }

    public boolean isExtraction ( ) {
        return extraction;
    }

    public boolean isEndo ( ) {
        return endo;
    }

    public boolean isxRay ( ) {
        return xRay;
    }

    public double invoice ( ) {
        total = 0;
        if ( filling )
            total += 500;
        if ( extraction )
            total += 100;
        if ( endo )
            total += 300;
        if ( xRay )
            total += 100;
        return total;
    }
}

