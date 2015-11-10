/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
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
@Table(name = "ALERGIAS")
@NamedQueries({
    @NamedQuery(name = "Alergias.findAll", query = "SELECT a FROM Alergias a")})
public class Alergias implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AlergiasPK alergiasPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "TPOALR_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TiposDeAlergias tiposDeAlergias;

    public Alergias() {
    }

    public Alergias(AlergiasPK alergiasPK) {
        this.alergiasPK = alergiasPK;
    }

    public Alergias(int tpoalrId, int pcnNumeroHc) {
        this.alergiasPK = new AlergiasPK(tpoalrId, pcnNumeroHc);
    }

    public AlergiasPK getAlergiasPK() {
        return alergiasPK;
    }

    public void setAlergiasPK(AlergiasPK alergiasPK) {
        this.alergiasPK = alergiasPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public TiposDeAlergias getTiposDeAlergias() {
        return tiposDeAlergias;
    }

    public void setTiposDeAlergias(TiposDeAlergias tiposDeAlergias) {
        this.tiposDeAlergias = tiposDeAlergias;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alergiasPK != null ? alergiasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alergias)) {
            return false;
        }
        Alergias other = (Alergias) object;
        if ((this.alergiasPK == null && other.alergiasPK != null) || (this.alergiasPK != null && !this.alergiasPK.equals(other.alergiasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Alergias[ alergiasPK=" + alergiasPK + " ]";
    }
    
}
