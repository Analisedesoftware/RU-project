/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru;

import Interface.*;
import BandodeDados.*;


/**
 *
 * @author Tomás Abril
 */

public class Cliente extends Pessoa {
    private String email;
    private Double credito;

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the credito
     */
    public Double getCredito() {
        return credito;
    }

    /**
     * @param credito the credito to set
     */
    public void setCredito(Double credito) {
        this.credito = credito;
    }


}
