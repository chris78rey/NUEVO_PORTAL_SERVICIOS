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
@Table(name = "COMPLEMENTOS_A_RESULTADOS")
@NamedQueries({
    @NamedQuery(name = "ComplementosAResultados.findAll", query = "SELECT c FROM ComplementosAResultados c")})
public class ComplementosAResultados implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ComplementosAResultadosPK complementosAResultadosPK;
    @Column(name = "RESULTADO")
    private String resultado;
    @Column(name = "RANGO_INFERIOR")
    private String rangoInferior;
    @Column(name = "RANGO_SUPERIOR")
    private String rangoSuperior;
    @Column(name = "RANGO_TEXTO")
    private String rangoTexto;
    @Column(name = "ID_RANGO")
    private Short idRango;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "ACTUALIZADO")
    private String actualizado;
    @Column(name = "UNIDADES")
    private String unidades;

    public ComplementosAResultados() {
    }

    public ComplementosAResultados(ComplementosAResultadosPK complementosAResultadosPK) {
        this.complementosAResultadosPK = complementosAResultadosPK;
    }

    public ComplementosAResultados(int cmplmtCodigo, int dtlexmExmNumero, int dtlexmVrbexmCodigo) {
        this.complementosAResultadosPK = new ComplementosAResultadosPK(cmplmtCodigo, dtlexmExmNumero, dtlexmVrbexmCodigo);
    }

    public ComplementosAResultadosPK getComplementosAResultadosPK() {
        return complementosAResultadosPK;
    }

    public void setComplementosAResultadosPK(ComplementosAResultadosPK complementosAResultadosPK) {
        this.complementosAResultadosPK = complementosAResultadosPK;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getRangoInferior() {
        return rangoInferior;
    }

    public void setRangoInferior(String rangoInferior) {
        this.rangoInferior = rangoInferior;
    }

    public String getRangoSuperior() {
        return rangoSuperior;
    }

    public void setRangoSuperior(String rangoSuperior) {
        this.rangoSuperior = rangoSuperior;
    }

    public String getRangoTexto() {
        return rangoTexto;
    }

    public void setRangoTexto(String rangoTexto) {
        this.rangoTexto = rangoTexto;
    }

    public Short getIdRango() {
        return idRango;
    }

    public void setIdRango(Short idRango) {
        this.idRango = idRango;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getActualizado() {
        return actualizado;
    }

    public void setActualizado(String actualizado) {
        this.actualizado = actualizado;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (complementosAResultadosPK != null ? complementosAResultadosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComplementosAResultados)) {
            return false;
        }
        ComplementosAResultados other = (ComplementosAResultados) object;
        if ((this.complementosAResultadosPK == null && other.complementosAResultadosPK != null) || (this.complementosAResultadosPK != null && !this.complementosAResultadosPK.equals(other.complementosAResultadosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ComplementosAResultados[ complementosAResultadosPK=" + complementosAResultadosPK + " ]";
    }
    
}
