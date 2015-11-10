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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
@Table(name = "ASISTENCIAS")
@NamedQueries({
    @NamedQuery(name = "Asistencias.findAll", query = "SELECT a FROM Asistencias a")})
public class Asistencias implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AsistenciasPK asistenciasPK;
    @Column(name = "AST_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date astFecha;
    @Column(name = "AST_HORAENTRADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date astHoraentrada;
    @Column(name = "AST_HORASALIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date astHorasalida;
    @Column(name = "AST_CODRELOJ")
    private String astCodreloj;
    @Column(name = "AST_DIA")
    private String astDia;
    @Column(name = "AST_ESTADOASISTENCIA")
    private Character astEstadoasistencia;
    @Column(name = "AST_OBSERVACION")
    private String astObservacion;
    @Column(name = "AST_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date astFechacreacion;
    @Column(name = "AST_USER")
    private String astUser;
    @JoinColumns({
        @JoinColumn(name = "CTP_IDCONTROL", referencedColumnName = "CTP_IDCONTROL", insertable = false, updatable = false),
        @JoinColumn(name = "PRN_IDPERSONAL", referencedColumnName = "PRN_IDPERSONAL", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ControlPersonal controlPersonal;
    @JoinColumn(name = "JRN_IDJORNADA", referencedColumnName = "JRN_IDJORNADA")
    @ManyToOne(fetch = FetchType.LAZY)
    private Jornadas jornadas;

    public Asistencias() {
    }

    public Asistencias(AsistenciasPK asistenciasPK) {
        this.asistenciasPK = asistenciasPK;
    }

    public Asistencias(long astIdasistencia, long ctpIdcontrol, long prnIdpersonal) {
        this.asistenciasPK = new AsistenciasPK(astIdasistencia, ctpIdcontrol, prnIdpersonal);
    }

    public AsistenciasPK getAsistenciasPK() {
        return asistenciasPK;
    }

    public void setAsistenciasPK(AsistenciasPK asistenciasPK) {
        this.asistenciasPK = asistenciasPK;
    }

    public Date getAstFecha() {
        return astFecha;
    }

    public void setAstFecha(Date astFecha) {
        this.astFecha = astFecha;
    }

    public Date getAstHoraentrada() {
        return astHoraentrada;
    }

    public void setAstHoraentrada(Date astHoraentrada) {
        this.astHoraentrada = astHoraentrada;
    }

    public Date getAstHorasalida() {
        return astHorasalida;
    }

    public void setAstHorasalida(Date astHorasalida) {
        this.astHorasalida = astHorasalida;
    }

    public String getAstCodreloj() {
        return astCodreloj;
    }

    public void setAstCodreloj(String astCodreloj) {
        this.astCodreloj = astCodreloj;
    }

    public String getAstDia() {
        return astDia;
    }

    public void setAstDia(String astDia) {
        this.astDia = astDia;
    }

    public Character getAstEstadoasistencia() {
        return astEstadoasistencia;
    }

    public void setAstEstadoasistencia(Character astEstadoasistencia) {
        this.astEstadoasistencia = astEstadoasistencia;
    }

    public String getAstObservacion() {
        return astObservacion;
    }

    public void setAstObservacion(String astObservacion) {
        this.astObservacion = astObservacion;
    }

    public Date getAstFechacreacion() {
        return astFechacreacion;
    }

    public void setAstFechacreacion(Date astFechacreacion) {
        this.astFechacreacion = astFechacreacion;
    }

    public String getAstUser() {
        return astUser;
    }

    public void setAstUser(String astUser) {
        this.astUser = astUser;
    }

    public ControlPersonal getControlPersonal() {
        return controlPersonal;
    }

    public void setControlPersonal(ControlPersonal controlPersonal) {
        this.controlPersonal = controlPersonal;
    }

    public Jornadas getJornadas() {
        return jornadas;
    }

    public void setJornadas(Jornadas jornadas) {
        this.jornadas = jornadas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (asistenciasPK != null ? asistenciasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asistencias)) {
            return false;
        }
        Asistencias other = (Asistencias) object;
        if ((this.asistenciasPK == null && other.asistenciasPK != null) || (this.asistenciasPK != null && !this.asistenciasPK.equals(other.asistenciasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Asistencias[ asistenciasPK=" + asistenciasPK + " ]";
    }
    
}
