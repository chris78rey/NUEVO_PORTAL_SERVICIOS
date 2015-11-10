/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "MOVIMIENTOS_BANCOS_CNT")
@NamedQueries({
    @NamedQuery(name = "MovimientosBancosCnt.findAll", query = "SELECT m FROM MovimientosBancosCnt m")})
public class MovimientosBancosCnt implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "CNTBNC_EMP_CODIGO")
    private String cntbncEmpCodigo;
    @Column(name = "CNTBNC_TIPO")
    private String cntbncTipo;
    @Column(name = "CNTBNC_NUMERO")
    private String cntbncNumero;
    @Id
    @Basic(optional = false)
    @Column(name = "MVMBNCCNT_ID")
    private Integer mvmbnccntId;
    @Column(name = "FECHA_DESDE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDesde;
    @Column(name = "FECHA_HASTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHasta;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "ESTADO_CREACION")
    private Character estadoCreacion;
    @Column(name = "PGO_TIPO")
    private Character pgoTipo;
    @Column(name = "PGO_NUMERO")
    private Integer pgoNumero;
    @OneToMany(mappedBy = "movimientosBancosCnt", fetch = FetchType.LAZY)
    private List<DetallesMovimientosBancos> detallesMovimientosBancosList;

    public MovimientosBancosCnt() {
    }

    public MovimientosBancosCnt(Integer mvmbnccntId) {
        this.mvmbnccntId = mvmbnccntId;
    }

    public String getCntbncEmpCodigo() {
        return cntbncEmpCodigo;
    }

    public void setCntbncEmpCodigo(String cntbncEmpCodigo) {
        this.cntbncEmpCodigo = cntbncEmpCodigo;
    }

    public String getCntbncTipo() {
        return cntbncTipo;
    }

    public void setCntbncTipo(String cntbncTipo) {
        this.cntbncTipo = cntbncTipo;
    }

    public String getCntbncNumero() {
        return cntbncNumero;
    }

    public void setCntbncNumero(String cntbncNumero) {
        this.cntbncNumero = cntbncNumero;
    }

    public Integer getMvmbnccntId() {
        return mvmbnccntId;
    }

    public void setMvmbnccntId(Integer mvmbnccntId) {
        this.mvmbnccntId = mvmbnccntId;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Character getEstadoCreacion() {
        return estadoCreacion;
    }

    public void setEstadoCreacion(Character estadoCreacion) {
        this.estadoCreacion = estadoCreacion;
    }

    public Character getPgoTipo() {
        return pgoTipo;
    }

    public void setPgoTipo(Character pgoTipo) {
        this.pgoTipo = pgoTipo;
    }

    public Integer getPgoNumero() {
        return pgoNumero;
    }

    public void setPgoNumero(Integer pgoNumero) {
        this.pgoNumero = pgoNumero;
    }

    public List<DetallesMovimientosBancos> getDetallesMovimientosBancosList() {
        return detallesMovimientosBancosList;
    }

    public void setDetallesMovimientosBancosList(List<DetallesMovimientosBancos> detallesMovimientosBancosList) {
        this.detallesMovimientosBancosList = detallesMovimientosBancosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mvmbnccntId != null ? mvmbnccntId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimientosBancosCnt)) {
            return false;
        }
        MovimientosBancosCnt other = (MovimientosBancosCnt) object;
        if ((this.mvmbnccntId == null && other.mvmbnccntId != null) || (this.mvmbnccntId != null && !this.mvmbnccntId.equals(other.mvmbnccntId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.MovimientosBancosCnt[ mvmbnccntId=" + mvmbnccntId + " ]";
    }
    
}
