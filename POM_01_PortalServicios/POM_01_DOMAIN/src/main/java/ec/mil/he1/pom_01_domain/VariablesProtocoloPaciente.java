/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "VARIABLES_PROTOCOLO_PACIENTE")
@NamedQueries({
    @NamedQuery(name = "VariablesProtocoloPaciente.findAll", query = "SELECT v FROM VariablesProtocoloPaciente v")})
public class VariablesProtocoloPaciente implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VariablesProtocoloPacientePK variablesProtocoloPacientePK;
    @Column(name = "PP_EXM_NUMERO")
    private Integer ppExmNumero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "DESCRIPTIVO")
    private String descriptivo;
    @Column(name = "LSTPRT_CODIGO")
    private Short lstprtCodigo;
    @Column(name = "ORDEN")
    private Short orden;

    public VariablesProtocoloPaciente() {
    }

    public VariablesProtocoloPaciente(VariablesProtocoloPacientePK variablesProtocoloPacientePK) {
        this.variablesProtocoloPacientePK = variablesProtocoloPacientePK;
    }

    public VariablesProtocoloPaciente(int ppPcnHc, short ppPCodigo, Date ppFecha, short vpCodigo, short vpPCodigo) {
        this.variablesProtocoloPacientePK = new VariablesProtocoloPacientePK(ppPcnHc, ppPCodigo, ppFecha, vpCodigo, vpPCodigo);
    }

    public VariablesProtocoloPacientePK getVariablesProtocoloPacientePK() {
        return variablesProtocoloPacientePK;
    }

    public void setVariablesProtocoloPacientePK(VariablesProtocoloPacientePK variablesProtocoloPacientePK) {
        this.variablesProtocoloPacientePK = variablesProtocoloPacientePK;
    }

    public Integer getPpExmNumero() {
        return ppExmNumero;
    }

    public void setPpExmNumero(Integer ppExmNumero) {
        this.ppExmNumero = ppExmNumero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescriptivo() {
        return descriptivo;
    }

    public void setDescriptivo(String descriptivo) {
        this.descriptivo = descriptivo;
    }

    public Short getLstprtCodigo() {
        return lstprtCodigo;
    }

    public void setLstprtCodigo(Short lstprtCodigo) {
        this.lstprtCodigo = lstprtCodigo;
    }

    public Short getOrden() {
        return orden;
    }

    public void setOrden(Short orden) {
        this.orden = orden;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (variablesProtocoloPacientePK != null ? variablesProtocoloPacientePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VariablesProtocoloPaciente)) {
            return false;
        }
        VariablesProtocoloPaciente other = (VariablesProtocoloPaciente) object;
        if ((this.variablesProtocoloPacientePK == null && other.variablesProtocoloPacientePK != null) || (this.variablesProtocoloPacientePK != null && !this.variablesProtocoloPacientePK.equals(other.variablesProtocoloPacientePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.VariablesProtocoloPaciente[ variablesProtocoloPacientePK=" + variablesProtocoloPacientePK + " ]";
    }
    
}
