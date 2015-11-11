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
@Table(name = "DETALLES_GRUPOS_PAQUETES")
@NamedQueries({
    @NamedQuery(name = "DetallesGruposPaquetes.findAll", query = "SELECT d FROM DetallesGruposPaquetes d")})
public class DetallesGruposPaquetes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesGruposPaquetesPK detallesGruposPaquetesPK;
    @Column(name = "CONVENIO")
    private String convenio;
    @Column(name = "ANEXO")
    private String anexo;
    @Column(name = "ESTADO_DISPONIBILIDAD")
    private Character estadoDisponibilidad;

    public DetallesGruposPaquetes() {
    }

    public DetallesGruposPaquetes(DetallesGruposPaquetesPK detallesGruposPaquetesPK) {
        this.detallesGruposPaquetesPK = detallesGruposPaquetesPK;
    }

    public DetallesGruposPaquetes(String gpqCodigo, String tipoItem, String tipo, String codigo) {
        this.detallesGruposPaquetesPK = new DetallesGruposPaquetesPK(gpqCodigo, tipoItem, tipo, codigo);
    }

    public DetallesGruposPaquetesPK getDetallesGruposPaquetesPK() {
        return detallesGruposPaquetesPK;
    }

    public void setDetallesGruposPaquetesPK(DetallesGruposPaquetesPK detallesGruposPaquetesPK) {
        this.detallesGruposPaquetesPK = detallesGruposPaquetesPK;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    public Character getEstadoDisponibilidad() {
        return estadoDisponibilidad;
    }

    public void setEstadoDisponibilidad(Character estadoDisponibilidad) {
        this.estadoDisponibilidad = estadoDisponibilidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesGruposPaquetesPK != null ? detallesGruposPaquetesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesGruposPaquetes)) {
            return false;
        }
        DetallesGruposPaquetes other = (DetallesGruposPaquetes) object;
        if ((this.detallesGruposPaquetesPK == null && other.detallesGruposPaquetesPK != null) || (this.detallesGruposPaquetesPK != null && !this.detallesGruposPaquetesPK.equals(other.detallesGruposPaquetesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesGruposPaquetes[ detallesGruposPaquetesPK=" + detallesGruposPaquetesPK + " ]";
    }
    
}
