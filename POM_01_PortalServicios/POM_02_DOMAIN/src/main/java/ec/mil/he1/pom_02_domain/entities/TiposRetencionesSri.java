/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "TIPOS_RETENCIONES_SRI")
@NamedQueries({
    @NamedQuery(name = "TiposRetencionesSri.findAll", query = "SELECT t FROM TiposRetencionesSri t")})
public class TiposRetencionesSri implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TiposRetencionesSriPK tiposRetencionesSriPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ANIO_VALIDEZ_HASTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date anioValidezHasta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PORCENTAJE")
    private BigDecimal porcentaje;

    public TiposRetencionesSri() {
    }

    public TiposRetencionesSri(TiposRetencionesSriPK tiposRetencionesSriPK) {
        this.tiposRetencionesSriPK = tiposRetencionesSriPK;
    }

    public TiposRetencionesSri(String codigo, Date anioValidezDesde) {
        this.tiposRetencionesSriPK = new TiposRetencionesSriPK(codigo, anioValidezDesde);
    }

    public TiposRetencionesSriPK getTiposRetencionesSriPK() {
        return tiposRetencionesSriPK;
    }

    public void setTiposRetencionesSriPK(TiposRetencionesSriPK tiposRetencionesSriPK) {
        this.tiposRetencionesSriPK = tiposRetencionesSriPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getAnioValidezHasta() {
        return anioValidezHasta;
    }

    public void setAnioValidezHasta(Date anioValidezHasta) {
        this.anioValidezHasta = anioValidezHasta;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tiposRetencionesSriPK != null ? tiposRetencionesSriPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposRetencionesSri)) {
            return false;
        }
        TiposRetencionesSri other = (TiposRetencionesSri) object;
        if ((this.tiposRetencionesSriPK == null && other.tiposRetencionesSriPK != null) || (this.tiposRetencionesSriPK != null && !this.tiposRetencionesSriPK.equals(other.tiposRetencionesSriPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.TiposRetencionesSri[ tiposRetencionesSriPK=" + tiposRetencionesSriPK + " ]";
    }
    
}
