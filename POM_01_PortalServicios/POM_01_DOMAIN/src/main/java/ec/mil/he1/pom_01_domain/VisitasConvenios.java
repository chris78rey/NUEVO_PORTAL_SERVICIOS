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
@Table(name = "VISITAS_CONVENIOS")
@NamedQueries({
    @NamedQuery(name = "VisitasConvenios.findAll", query = "SELECT v FROM VisitasConvenios v")})
public class VisitasConvenios implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VisitasConveniosPK visitasConveniosPK;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "INICIAL")
    private String inicial;
    @Column(name = "SUBSECUENTE")
    private String subsecuente;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "DIAS_DESDE")
    private Integer diasDesde;
    @Column(name = "DIAS_HASTA")
    private Integer diasHasta;

    public VisitasConvenios() {
    }

    public VisitasConvenios(VisitasConveniosPK visitasConveniosPK) {
        this.visitasConveniosPK = visitasConveniosPK;
    }

    public VisitasConvenios(String valor, String cnvConvenio) {
        this.visitasConveniosPK = new VisitasConveniosPK(valor, cnvConvenio);
    }

    public VisitasConveniosPK getVisitasConveniosPK() {
        return visitasConveniosPK;
    }

    public void setVisitasConveniosPK(VisitasConveniosPK visitasConveniosPK) {
        this.visitasConveniosPK = visitasConveniosPK;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getInicial() {
        return inicial;
    }

    public void setInicial(String inicial) {
        this.inicial = inicial;
    }

    public String getSubsecuente() {
        return subsecuente;
    }

    public void setSubsecuente(String subsecuente) {
        this.subsecuente = subsecuente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getDiasDesde() {
        return diasDesde;
    }

    public void setDiasDesde(Integer diasDesde) {
        this.diasDesde = diasDesde;
    }

    public Integer getDiasHasta() {
        return diasHasta;
    }

    public void setDiasHasta(Integer diasHasta) {
        this.diasHasta = diasHasta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (visitasConveniosPK != null ? visitasConveniosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VisitasConvenios)) {
            return false;
        }
        VisitasConvenios other = (VisitasConvenios) object;
        if ((this.visitasConveniosPK == null && other.visitasConveniosPK != null) || (this.visitasConveniosPK != null && !this.visitasConveniosPK.equals(other.visitasConveniosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.VisitasConvenios[ visitasConveniosPK=" + visitasConveniosPK + " ]";
    }
    
}
