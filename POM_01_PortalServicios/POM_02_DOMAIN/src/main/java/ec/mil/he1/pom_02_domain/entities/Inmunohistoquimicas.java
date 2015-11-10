/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "INMUNOHISTOQUIMICAS")
@NamedQueries({
    @NamedQuery(name = "Inmunohistoquimicas.findAll", query = "SELECT i FROM Inmunohistoquimicas i")})
public class Inmunohistoquimicas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EXM_NUMERO")
    private Integer exmNumero;
    @Column(name = "CONTRIBUCION")
    private String contribucion;
    @JoinColumn(name = "DGNLBR_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private DiagnosticosDeLaboratorios diagnosticosDeLaboratorios;
    @JoinColumn(name = "DGNLBR_CODIGO_MORFOLOGICO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private DiagnosticosDeLaboratorios diagnosticosDeLaboratorios1;
    @JoinColumn(name = "EXM_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Examenes examenes;

    public Inmunohistoquimicas() {
    }

    public Inmunohistoquimicas(Integer exmNumero) {
        this.exmNumero = exmNumero;
    }

    public Integer getExmNumero() {
        return exmNumero;
    }

    public void setExmNumero(Integer exmNumero) {
        this.exmNumero = exmNumero;
    }

    public String getContribucion() {
        return contribucion;
    }

    public void setContribucion(String contribucion) {
        this.contribucion = contribucion;
    }

    public DiagnosticosDeLaboratorios getDiagnosticosDeLaboratorios() {
        return diagnosticosDeLaboratorios;
    }

    public void setDiagnosticosDeLaboratorios(DiagnosticosDeLaboratorios diagnosticosDeLaboratorios) {
        this.diagnosticosDeLaboratorios = diagnosticosDeLaboratorios;
    }

    public DiagnosticosDeLaboratorios getDiagnosticosDeLaboratorios1() {
        return diagnosticosDeLaboratorios1;
    }

    public void setDiagnosticosDeLaboratorios1(DiagnosticosDeLaboratorios diagnosticosDeLaboratorios1) {
        this.diagnosticosDeLaboratorios1 = diagnosticosDeLaboratorios1;
    }

    public Examenes getExamenes() {
        return examenes;
    }

    public void setExamenes(Examenes examenes) {
        this.examenes = examenes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exmNumero != null ? exmNumero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inmunohistoquimicas)) {
            return false;
        }
        Inmunohistoquimicas other = (Inmunohistoquimicas) object;
        if ((this.exmNumero == null && other.exmNumero != null) || (this.exmNumero != null && !this.exmNumero.equals(other.exmNumero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Inmunohistoquimicas[ exmNumero=" + exmNumero + " ]";
    }
    
}
