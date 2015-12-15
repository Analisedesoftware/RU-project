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

public class Clientes extends Pessoa {
    private String email;
    private Double saldo;
    private int ra;
    private boolean bolsista;

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
     * @return the saldo
     */
    public Double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the ra
     */
    public int getRa() {
        return ra;
    }

    /**
     * @param ra the ra to set
     */
    public void setRa(int ra) {
        this.ra = ra;
    }

    /**
     * @return the bolsista
     */
    public boolean isBolsista() {
        return bolsista;
    }

    /**
     * @param bolsista the bolsista to set
     */
    public void setBolsista(boolean bolsista) {
        this.bolsista = bolsista;
    }


}
