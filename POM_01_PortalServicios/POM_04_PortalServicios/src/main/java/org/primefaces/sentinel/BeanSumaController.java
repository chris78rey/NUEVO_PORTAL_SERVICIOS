/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.sentinel;

import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import javax.faces.event.ActionEvent;

/**
 *
 * @author christian_ruiz
 */
@Named(value = "beanSumaController")
@ViewScoped
public class BeanSumaController implements Serializable {

    private static final long serialVersionUID = 8264762139775530100L;

    private double valor1 = 0;
    private double valor2 = 0;
    private double resultado = 0;

    public void buttonAction(ActionEvent actionEvent) {
        resultado = valor1 + valor2;
        System.out.println("resultado = " + resultado);

    }

    /**
     * Creates a new instance of BeanSumaController
     */
    public BeanSumaController() {
    }

    /**
     * @return the valor1
     */
    public double getValor1() {
        return valor1;
    }

    /**
     * @param valor1 the valor1 to set
     */
    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    /**
     * @return the valor2
     */
    public double getValor2() {
        return valor2;
    }

    /**
     * @param valor2 the valor2 to set
     */
    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    /**
     * @return the resultado
     */
    public double getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}
