/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "REGISTROS_DE_CIERRE")
@NamedQueries({
    @NamedQuery(name = "RegistrosDeCierre.findAll", query = "SELECT r FROM RegistrosDeCierre r")})
public class RegistrosDeCierre implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RegistrosDeCierrePK registrosDeCierrePK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "registrosDeCierre", fetch = FetchType.LAZY)
    private List<DetallesDeCierre> detallesDeCierreList;
    @OneToMany(mappedBy = "registrosDeCierre", fetch = FetchType.LAZY)
    private List<ContabilizacionCierreMes> contabilizacionCierreMesList;

    public RegistrosDeCierre() {
    }

    public RegistrosDeCierre(RegistrosDeCierrePK registrosDeCierrePK) {
        this.registrosDeCierrePK = registrosDeCierrePK;
    }

    public RegistrosDeCierre(short anio, short mes, String local) {
        this.registrosDeCierrePK = new RegistrosDeCierrePK(anio, mes, local);
    }

    public RegistrosDeCierrePK getRegistrosDeCierrePK() {
        return registrosDeCierrePK;
    }

    public void setRegistrosDeCierrePK(RegistrosDeCierrePK registrosDeCierrePK) {
        this.registrosDeCierrePK = registrosDeCierrePK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<DetallesDeCierre> getDetallesDeCierreList() {
        return detallesDeCierreList;
    }

    public void setDetallesDeCierreList(List<DetallesDeCierre> detallesDeCierreList) {
        this.detallesDeCierreList = detallesDeCierreList;
    }

    public List<ContabilizacionCierreMes> getContabilizacionCierreMesList() {
        return contabilizacionCierreMesList;
    }

    public void setContabilizacionCierreMesList(List<ContabilizacionCierreMes> contabilizacionCierreMesList) {
        this.contabilizacionCierreMesList = contabilizacionCierreMesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (registrosDeCierrePK != null ? registrosDeCierrePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistrosDeCierre)) {
            return false;
        }
        RegistrosDeCierre other = (RegistrosDeCierre) object;
        if ((this.registrosDeCierrePK == null && other.registrosDeCierrePK != null) || (this.registrosDeCierrePK != null && !this.registrosDeCierrePK.equals(other.registrosDeCierrePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.RegistrosDeCierre[ registrosDeCierrePK=" + registrosDeCierrePK + " ]";
    }
    
}
