/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "TARIFARIOS")
@NamedQueries({
    @NamedQuery(name = "Tarifarios.findAll", query = "SELECT t FROM Tarifarios t")})
public class Tarifarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TarifariosPK tarifariosPK;
    @Column(name = "CODIGO_SUBGRUPO")
    private String codigoSubgrupo;
    @Column(name = "CODIGO_SUBGRUPO_1")
    private String codigoSubgrupo1;
    @Column(name = "CODIGO_SUBGRUPO_2")
    private String codigoSubgrupo2;
    @Column(name = "DESCRIPCION_ESPECIFICA")
    private String descripcionEspecifica;
    @Column(name = "DESCRIPCION_ITEM")
    private String descripcionItem;
    @Column(name = "UVR_H_MED")
    private BigInteger uvrHMed;
    @Column(name = "ANES")
    private BigInteger anes;
    @Column(name = "UNIDADES")
    private BigInteger unidades;
    @Column(name = "UVR")
    private BigInteger uvr;
    @Column(name = "UVR1")
    private BigInteger uvr1;
    @Column(name = "UVR2")
    private BigInteger uvr2;
    @Column(name = "UVR3")
    private BigInteger uvr3;
    @Column(name = "PRC")
    private BigInteger prc;
    @Column(name = "PRC1")
    private BigInteger prc1;
    @Column(name = "PRC2")
    private BigInteger prc2;
    @Column(name = "PRC3")
    private BigInteger prc3;
    @Column(name = "NIVEL")
    private BigInteger nivel;
    @Column(name = "TOTAL_TARIFA_INTEGRAL")
    private BigInteger totalTarifaIntegral;
    @Column(name = "TOTAL_TARIFA_INTEGRAL_III")
    private BigInteger totalTarifaIntegralIii;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "NO_APLICA_TIEMPO")
    private Character noAplicaTiempo;
    @Column(name = "TIEMPO_DESDE")
    private BigInteger tiempoDesde;
    @Column(name = "TIEMPO_HASTA")
    private BigInteger tiempoHasta;
    @Column(name = "PRC_ANES")
    private BigInteger prcAnes;
    @Column(name = "UVR_ANES1")
    private BigInteger uvrAnes1;
    @Column(name = "UVR_ANES2")
    private BigInteger uvrAnes2;
    @Column(name = "PRC_ANES1")
    private BigInteger prcAnes1;
    @Column(name = "PRC_ANES2")
    private BigInteger prcAnes2;
    @JoinTable(name = "PROCEDIMIENTOS_TARIFARIOS", joinColumns = {
        @JoinColumn(name = "TRF_CONVENIO", referencedColumnName = "CONVENIO"),
        @JoinColumn(name = "TRF_TIPO", referencedColumnName = "TIPO"),
        @JoinColumn(name = "TRF_CODIGO_ITEM", referencedColumnName = "CODIGO_ITEM")}, inverseJoinColumns = {
        @JoinColumn(name = "PRCHSP_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<ProcedimientosHospitalarios> procedimientosHospitalariosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tarifarios", fetch = FetchType.LAZY)
    private List<ConveniosEquivalencias> conveniosEquivalenciasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tarifarios", fetch = FetchType.LAZY)
    private List<EquivalenciasClasificadores> equivalenciasClasificadoresList;
    @JoinColumn(name = "CONVENIO", referencedColumnName = "CONVENIO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Convenios convenios;
    @JoinColumns({
        @JoinColumn(name = "TIPO", referencedColumnName = "TIPO", insertable = false, updatable = false),
        @JoinColumn(name = "CONVENIO", referencedColumnName = "CONVENIO", insertable = false, updatable = false),
        @JoinColumn(name = "CODIGO_GRUPO", referencedColumnName = "CODIGO")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private GruposTarifario gruposTarifario;

    public Tarifarios() {
    }

    public Tarifarios(TarifariosPK tarifariosPK) {
        this.tarifariosPK = tarifariosPK;
    }

    public Tarifarios(String convenio, String tipo, String codigoItem) {
        this.tarifariosPK = new TarifariosPK(convenio, tipo, codigoItem);
    }

    public TarifariosPK getTarifariosPK() {
        return tarifariosPK;
    }

    public void setTarifariosPK(TarifariosPK tarifariosPK) {
        this.tarifariosPK = tarifariosPK;
    }

    public String getCodigoSubgrupo() {
        return codigoSubgrupo;
    }

    public void setCodigoSubgrupo(String codigoSubgrupo) {
        this.codigoSubgrupo = codigoSubgrupo;
    }

    public String getCodigoSubgrupo1() {
        return codigoSubgrupo1;
    }

    public void setCodigoSubgrupo1(String codigoSubgrupo1) {
        this.codigoSubgrupo1 = codigoSubgrupo1;
    }

    public String getCodigoSubgrupo2() {
        return codigoSubgrupo2;
    }

    public void setCodigoSubgrupo2(String codigoSubgrupo2) {
        this.codigoSubgrupo2 = codigoSubgrupo2;
    }

    public String getDescripcionEspecifica() {
        return descripcionEspecifica;
    }

    public void setDescripcionEspecifica(String descripcionEspecifica) {
        this.descripcionEspecifica = descripcionEspecifica;
    }

    public String getDescripcionItem() {
        return descripcionItem;
    }

    public void setDescripcionItem(String descripcionItem) {
        this.descripcionItem = descripcionItem;
    }

    public BigInteger getUvrHMed() {
        return uvrHMed;
    }

    public void setUvrHMed(BigInteger uvrHMed) {
        this.uvrHMed = uvrHMed;
    }

    public BigInteger getAnes() {
        return anes;
    }

    public void setAnes(BigInteger anes) {
        this.anes = anes;
    }

    public BigInteger getUnidades() {
        return unidades;
    }

    public void setUnidades(BigInteger unidades) {
        this.unidades = unidades;
    }

    public BigInteger getUvr() {
        return uvr;
    }

    public void setUvr(BigInteger uvr) {
        this.uvr = uvr;
    }

    public BigInteger getUvr1() {
        return uvr1;
    }

    public void setUvr1(BigInteger uvr1) {
        this.uvr1 = uvr1;
    }

    public BigInteger getUvr2() {
        return uvr2;
    }

    public void setUvr2(BigInteger uvr2) {
        this.uvr2 = uvr2;
    }

    public BigInteger getUvr3() {
        return uvr3;
    }

    public void setUvr3(BigInteger uvr3) {
        this.uvr3 = uvr3;
    }

    public BigInteger getPrc() {
        return prc;
    }

    public void setPrc(BigInteger prc) {
        this.prc = prc;
    }

    public BigInteger getPrc1() {
        return prc1;
    }

    public void setPrc1(BigInteger prc1) {
        this.prc1 = prc1;
    }

    public BigInteger getPrc2() {
        return prc2;
    }

    public void setPrc2(BigInteger prc2) {
        this.prc2 = prc2;
    }

    public BigInteger getPrc3() {
        return prc3;
    }

    public void setPrc3(BigInteger prc3) {
        this.prc3 = prc3;
    }

    public BigInteger getNivel() {
        return nivel;
    }

    public void setNivel(BigInteger nivel) {
        this.nivel = nivel;
    }

    public BigInteger getTotalTarifaIntegral() {
        return totalTarifaIntegral;
    }

    public void setTotalTarifaIntegral(BigInteger totalTarifaIntegral) {
        this.totalTarifaIntegral = totalTarifaIntegral;
    }

    public BigInteger getTotalTarifaIntegralIii() {
        return totalTarifaIntegralIii;
    }

    public void setTotalTarifaIntegralIii(BigInteger totalTarifaIntegralIii) {
        this.totalTarifaIntegralIii = totalTarifaIntegralIii;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Character getNoAplicaTiempo() {
        return noAplicaTiempo;
    }

    public void setNoAplicaTiempo(Character noAplicaTiempo) {
        this.noAplicaTiempo = noAplicaTiempo;
    }

    public BigInteger getTiempoDesde() {
        return tiempoDesde;
    }

    public void setTiempoDesde(BigInteger tiempoDesde) {
        this.tiempoDesde = tiempoDesde;
    }

    public BigInteger getTiempoHasta() {
        return tiempoHasta;
    }

    public void setTiempoHasta(BigInteger tiempoHasta) {
        this.tiempoHasta = tiempoHasta;
    }

    public BigInteger getPrcAnes() {
        return prcAnes;
    }

    public void setPrcAnes(BigInteger prcAnes) {
        this.prcAnes = prcAnes;
    }

    public BigInteger getUvrAnes1() {
        return uvrAnes1;
    }

    public void setUvrAnes1(BigInteger uvrAnes1) {
        this.uvrAnes1 = uvrAnes1;
    }

    public BigInteger getUvrAnes2() {
        return uvrAnes2;
    }

    public void setUvrAnes2(BigInteger uvrAnes2) {
        this.uvrAnes2 = uvrAnes2;
    }

    public BigInteger getPrcAnes1() {
        return prcAnes1;
    }

    public void setPrcAnes1(BigInteger prcAnes1) {
        this.prcAnes1 = prcAnes1;
    }

    public BigInteger getPrcAnes2() {
        return prcAnes2;
    }

    public void setPrcAnes2(BigInteger prcAnes2) {
        this.prcAnes2 = prcAnes2;
    }

    public List<ProcedimientosHospitalarios> getProcedimientosHospitalariosList() {
        return procedimientosHospitalariosList;
    }

    public void setProcedimientosHospitalariosList(List<ProcedimientosHospitalarios> procedimientosHospitalariosList) {
        this.procedimientosHospitalariosList = procedimientosHospitalariosList;
    }

    public List<ConveniosEquivalencias> getConveniosEquivalenciasList() {
        return conveniosEquivalenciasList;
    }

    public void setConveniosEquivalenciasList(List<ConveniosEquivalencias> conveniosEquivalenciasList) {
        this.conveniosEquivalenciasList = conveniosEquivalenciasList;
    }

    public List<EquivalenciasClasificadores> getEquivalenciasClasificadoresList() {
        return equivalenciasClasificadoresList;
    }

    public void setEquivalenciasClasificadoresList(List<EquivalenciasClasificadores> equivalenciasClasificadoresList) {
        this.equivalenciasClasificadoresList = equivalenciasClasificadoresList;
    }

    public Convenios getConvenios() {
        return convenios;
    }

    public void setConvenios(Convenios convenios) {
        this.convenios = convenios;
    }

    public GruposTarifario getGruposTarifario() {
        return gruposTarifario;
    }

    public void setGruposTarifario(GruposTarifario gruposTarifario) {
        this.gruposTarifario = gruposTarifario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tarifariosPK != null ? tarifariosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarifarios)) {
            return false;
        }
        Tarifarios other = (Tarifarios) object;
        if ((this.tarifariosPK == null && other.tarifariosPK != null) || (this.tarifariosPK != null && !this.tarifariosPK.equals(other.tarifariosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Tarifarios[ tarifariosPK=" + tarifariosPK + " ]";
    }
    
}
