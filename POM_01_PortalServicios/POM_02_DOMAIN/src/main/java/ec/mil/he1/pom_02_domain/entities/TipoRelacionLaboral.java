/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "TIPO_RELACION_LABORAL")
@NamedQueries({
    @NamedQuery(name = "TipoRelacionLaboral.findAll", query = "SELECT t FROM TipoRelacionLaboral t")})
public class TipoRelacionLaboral implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "TRL_IDTIPORELACION")
    private BigDecimal trlIdtiporelacion;
    @Column(name = "TRL_TIPORELACION")
    private String trlTiporelacion;
    @Column(name = "TRL_USER")
    private String trlUser;
    @Column(name = "TRL_ESTADO")
    private Character trlEstado;
    @OneToMany(mappedBy = "tipoRelacionLaboral", fetch = FetchType.LAZY)
    private List<RolAcumulado> rolAcumuladoList;
    @JoinColumn(name = "RGL_IDREGIMEN", referencedColumnName = "RGL_IDREGIMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private RegimenLaboral regimenLaboral;
    @OneToMany(mappedBy = "tipoRelacionLaboral", fetch = FetchType.LAZY)
    private List<SegMinisterioFinanzas> segMinisterioFinanzasList;
    @OneToMany(mappedBy = "tipoRelacionLaboral", fetch = FetchType.LAZY)
    private List<RolDetallado> rolDetalladoList;

    public TipoRelacionLaboral() {
    }

    public TipoRelacionLaboral(BigDecimal trlIdtiporelacion) {
        this.trlIdtiporelacion = trlIdtiporelacion;
    }

    public BigDecimal getTrlIdtiporelacion() {
        return trlIdtiporelacion;
    }

    public void setTrlIdtiporelacion(BigDecimal trlIdtiporelacion) {
        this.trlIdtiporelacion = trlIdtiporelacion;
    }

    public String getTrlTiporelacion() {
        return trlTiporelacion;
    }

    public void setTrlTiporelacion(String trlTiporelacion) {
        this.trlTiporelacion = trlTiporelacion;
    }

    public String getTrlUser() {
        return trlUser;
    }

    public void setTrlUser(String trlUser) {
        this.trlUser = trlUser;
    }

    public Character getTrlEstado() {
        return trlEstado;
    }

    public void setTrlEstado(Character trlEstado) {
        this.trlEstado = trlEstado;
    }

    public List<RolAcumulado> getRolAcumuladoList() {
        return rolAcumuladoList;
    }

    public void setRolAcumuladoList(List<RolAcumulado> rolAcumuladoList) {
        this.rolAcumuladoList = rolAcumuladoList;
    }

    public RegimenLaboral getRegimenLaboral() {
        return regimenLaboral;
    }

    public void setRegimenLaboral(RegimenLaboral regimenLaboral) {
        this.regimenLaboral = regimenLaboral;
    }

    public List<SegMinisterioFinanzas> getSegMinisterioFinanzasList() {
        return segMinisterioFinanzasList;
    }

    public void setSegMinisterioFinanzasList(List<SegMinisterioFinanzas> segMinisterioFinanzasList) {
        this.segMinisterioFinanzasList = segMinisterioFinanzasList;
    }

    public List<RolDetallado> getRolDetalladoList() {
        return rolDetalladoList;
    }

    public void setRolDetalladoList(List<RolDetallado> rolDetalladoList) {
        this.rolDetalladoList = rolDetalladoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trlIdtiporelacion != null ? trlIdtiporelacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoRelacionLaboral)) {
            return false;
        }
        TipoRelacionLaboral other = (TipoRelacionLaboral) object;
        if ((this.trlIdtiporelacion == null && other.trlIdtiporelacion != null) || (this.trlIdtiporelacion != null && !this.trlIdtiporelacion.equals(other.trlIdtiporelacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.TipoRelacionLaboral[ trlIdtiporelacion=" + trlIdtiporelacion + " ]";
    }
    
}
