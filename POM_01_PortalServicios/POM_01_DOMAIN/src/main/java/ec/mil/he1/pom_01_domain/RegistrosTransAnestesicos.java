/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "REGISTROS_TRANS_ANESTESICOS")
@NamedQueries({
    @NamedQuery(name = "RegistrosTransAnestesicos.findAll", query = "SELECT r FROM RegistrosTransAnestesicos r")})
public class RegistrosTransAnestesicos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RegistrosTransAnestesicosPK registrosTransAnestesicosPK;
    @Column(name = "VALOR")
    private String valor;
    @Column(name = "RGSOPR_PRS_CODIGO")
    private String rgsoprPrsCodigo;

    public RegistrosTransAnestesicos() {
    }

    public RegistrosTransAnestesicos(RegistrosTransAnestesicosPK registrosTransAnestesicosPK) {
        this.registrosTransAnestesicosPK = registrosTransAnestesicosPK;
    }

    public RegistrosTransAnestesicos(int rgsoprPrtoprslcNumero, int rgsoprPrtoprslcPcnNumeroHc, short fila, short columna, String tipo) {
        this.registrosTransAnestesicosPK = new RegistrosTransAnestesicosPK(rgsoprPrtoprslcNumero, rgsoprPrtoprslcPcnNumeroHc, fila, columna, tipo);
    }

    public RegistrosTransAnestesicosPK getRegistrosTransAnestesicosPK() {
        return registrosTransAnestesicosPK;
    }

    public void setRegistrosTransAnestesicosPK(RegistrosTransAnestesicosPK registrosTransAnestesicosPK) {
        this.registrosTransAnestesicosPK = registrosTransAnestesicosPK;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getRgsoprPrsCodigo() {
        return rgsoprPrsCodigo;
    }

    public void setRgsoprPrsCodigo(String rgsoprPrsCodigo) {
        this.rgsoprPrsCodigo = rgsoprPrsCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (registrosTransAnestesicosPK != null ? registrosTransAnestesicosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistrosTransAnestesicos)) {
            return false;
        }
        RegistrosTransAnestesicos other = (RegistrosTransAnestesicos) object;
        if ((this.registrosTransAnestesicosPK == null && other.registrosTransAnestesicosPK != null) || (this.registrosTransAnestesicosPK != null && !this.registrosTransAnestesicosPK.equals(other.registrosTransAnestesicosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.RegistrosTransAnestesicos[ registrosTransAnestesicosPK=" + registrosTransAnestesicosPK + " ]";
    }
    
}
