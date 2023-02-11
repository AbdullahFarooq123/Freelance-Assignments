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
public class Insurance {
    private String company;
    private int insNumber;

    public Insurance ( ) {
    }

    public Insurance ( String company , int insNumber ) {
        this.company = company;
        this.insNumber = insNumber;
    }

    public String getCompany ( ) {
        return company;
    }

    public int getInsNumber ( ) {
        return insNumber;
    }
}

