/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "HISTORICOS_DE_MAYORIZACION")
@NamedQueries({
    @NamedQuery(name = "HistoricosDeMayorizacion.findAll", query = "SELECT h FROM HistoricosDeMayorizacion h")})
public class HistoricosDeMayorizacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HistoricosDeMayorizacionPK historicosDeMayorizacionPK;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "NIVEL")
    private String nivel;
    @JoinColumn(name = "EMP_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empresas empresas;

    public HistoricosDeMayorizacion() {
    }

    public HistoricosDeMayorizacion(HistoricosDeMayorizacionPK historicosDeMayorizacionPK) {
        this.historicosDeMayorizacionPK = historicosDeMayorizacionPK;
    }

    public HistoricosDeMayorizacion(String empCodigo, Date fecha) {
        this.historicosDeMayorizacionPK = new HistoricosDeMayorizacionPK(empCodigo, fecha);
    }

    public HistoricosDeMayorizacionPK getHistoricosDeMayorizacionPK() {
        return historicosDeMayorizacionPK;
    }

    public void setHistoricosDeMayorizacionPK(HistoricosDeMayorizacionPK historicosDeMayorizacionPK) {
        this.historicosDeMayorizacionPK = historicosDeMayorizacionPK;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Empresas getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (historicosDeMayorizacionPK != null ? historicosDeMayorizacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoricosDeMayorizacion)) {
            return false;
        }
        HistoricosDeMayorizacion other = (HistoricosDeMayorizacion) object;
        if ((this.historicosDeMayorizacionPK == null && other.historicosDeMayorizacionPK != null) || (this.historicosDeMayorizacionPK != null && !this.historicosDeMayorizacionPK.equals(other.historicosDeMayorizacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.HistoricosDeMayorizacion[ historicosDeMayorizacionPK=" + historicosDeMayorizacionPK + " ]";
    }
    
}
