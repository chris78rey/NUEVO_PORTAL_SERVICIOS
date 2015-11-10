/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "HORARIOS_SEMANALES_MEDICOS")
@NamedQueries({
    @NamedQuery(name = "HorariosSemanalesMedicos.findAll", query = "SELECT h FROM HorariosSemanalesMedicos h")})
public class HorariosSemanalesMedicos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HRRSMNMDC_ID")
    private Long hrrsmnmdcId;
    @Column(name = "DIA")
    private String dia;
    @Column(name = "HORA_FIN")
    private Integer horaFin;
    @Column(name = "HORA_INICIO")
    private Integer horaInicio;
    @Column(name = "TURNOS_POSIBLES")
    private BigInteger turnosPosibles;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_CONSULTA")
    private BigDecimal valorConsulta;
    @Column(name = "ARA_CODIGO")
    private String araCodigo;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRS_CODIGO_RSP", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal1;

    public HorariosSemanalesMedicos() {
    }

    public HorariosSemanalesMedicos(Long hrrsmnmdcId) {
        this.hrrsmnmdcId = hrrsmnmdcId;
    }

    public Long getHrrsmnmdcId() {
        return hrrsmnmdcId;
    }

    public void setHrrsmnmdcId(Long hrrsmnmdcId) {
        this.hrrsmnmdcId = hrrsmnmdcId;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Integer getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Integer horaFin) {
        this.horaFin = horaFin;
    }

    public Integer getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Integer horaInicio) {
        this.horaInicio = horaInicio;
    }

    public BigInteger getTurnosPosibles() {
        return turnosPosibles;
    }

    public void setTurnosPosibles(BigInteger turnosPosibles) {
        this.turnosPosibles = turnosPosibles;
    }

    public BigDecimal getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(BigDecimal valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public String getAraCodigo() {
        return araCodigo;
    }

    public void setAraCodigo(String araCodigo) {
        this.araCodigo = araCodigo;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Personal getPersonal1() {
        return personal1;
    }

    public void setPersonal1(Personal personal1) {
        this.personal1 = personal1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hrrsmnmdcId != null ? hrrsmnmdcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HorariosSemanalesMedicos)) {
            return false;
        }
        HorariosSemanalesMedicos other = (HorariosSemanalesMedicos) object;
        if ((this.hrrsmnmdcId == null && other.hrrsmnmdcId != null) || (this.hrrsmnmdcId != null && !this.hrrsmnmdcId.equals(other.hrrsmnmdcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.HorariosSemanalesMedicos[ hrrsmnmdcId=" + hrrsmnmdcId + " ]";
    }
    
}
