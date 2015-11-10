/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "DONACIONES")
@NamedQueries({
    @NamedQuery(name = "Donaciones.findAll", query = "SELECT d FROM Donaciones d")})
public class Donaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DonacionesPK donacionesPK;
    @Column(name = "TIPO_DONACION")
    private Character tipoDonacion;
    @Column(name = "FECHA_DONACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDonacion;
    @Column(name = "PRESION_ARTERIAL")
    private String presionArterial;
    @Column(name = "PULSO")
    private Short pulso;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "HEMATOCRITO")
    private BigDecimal hematocrito;
    @Column(name = "TEMPERATURA")
    private BigDecimal temperatura;
    @Column(name = "ULTIMA_DONACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimaDonacion;
    @JoinColumn(name = "DNN_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Donantes donantes;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @OneToMany(mappedBy = "donaciones", fetch = FetchType.LAZY)
    private List<Unidades> unidadesList;

    public Donaciones() {
    }

    public Donaciones(DonacionesPK donacionesPK) {
        this.donacionesPK = donacionesPK;
    }

    public Donaciones(int dnnNumero, int numeroDonacion) {
        this.donacionesPK = new DonacionesPK(dnnNumero, numeroDonacion);
    }

    public DonacionesPK getDonacionesPK() {
        return donacionesPK;
    }

    public void setDonacionesPK(DonacionesPK donacionesPK) {
        this.donacionesPK = donacionesPK;
    }

    public Character getTipoDonacion() {
        return tipoDonacion;
    }

    public void setTipoDonacion(Character tipoDonacion) {
        this.tipoDonacion = tipoDonacion;
    }

    public Date getFechaDonacion() {
        return fechaDonacion;
    }

    public void setFechaDonacion(Date fechaDonacion) {
        this.fechaDonacion = fechaDonacion;
    }

    public String getPresionArterial() {
        return presionArterial;
    }

    public void setPresionArterial(String presionArterial) {
        this.presionArterial = presionArterial;
    }

    public Short getPulso() {
        return pulso;
    }

    public void setPulso(Short pulso) {
        this.pulso = pulso;
    }

    public BigDecimal getHematocrito() {
        return hematocrito;
    }

    public void setHematocrito(BigDecimal hematocrito) {
        this.hematocrito = hematocrito;
    }

    public BigDecimal getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(BigDecimal temperatura) {
        this.temperatura = temperatura;
    }

    public Date getUltimaDonacion() {
        return ultimaDonacion;
    }

    public void setUltimaDonacion(Date ultimaDonacion) {
        this.ultimaDonacion = ultimaDonacion;
    }

    public Donantes getDonantes() {
        return donantes;
    }

    public void setDonantes(Donantes donantes) {
        this.donantes = donantes;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public List<Unidades> getUnidadesList() {
        return unidadesList;
    }

    public void setUnidadesList(List<Unidades> unidadesList) {
        this.unidadesList = unidadesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (donacionesPK != null ? donacionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Donaciones)) {
            return false;
        }
        Donaciones other = (Donaciones) object;
        if ((this.donacionesPK == null && other.donacionesPK != null) || (this.donacionesPK != null && !this.donacionesPK.equals(other.donacionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Donaciones[ donacionesPK=" + donacionesPK + " ]";
    }
    
}
