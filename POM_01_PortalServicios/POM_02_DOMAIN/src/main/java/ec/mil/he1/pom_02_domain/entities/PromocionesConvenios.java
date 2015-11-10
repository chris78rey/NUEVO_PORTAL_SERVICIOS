/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "PROMOCIONES_CONVENIOS")
@NamedQueries({
    @NamedQuery(name = "PromocionesConvenios.findAll", query = "SELECT p FROM PromocionesConvenios p")})
public class PromocionesConvenios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO_CONVENIO")
    private Integer numeroConvenio;
    @Column(name = "OFICIO")
    private String oficio;
    @Column(name = "FECHA_CONVENIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaConvenio;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "OBJETO")
    private String objeto;
    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Column(name = "TIPO_SEGURO")
    private String tipoSeguro;
    @Column(name = "ID_BENEFICIARIO")
    private String idBeneficiario;
    @Column(name = "TIPO_ID_BENEFICIARIO")
    private String tipoIdBeneficiario;
    @Column(name = "PARENTESCO")
    private String parentesco;
    @Column(name = "ID_AFILIADO")
    private String idAfiliado;
    @Column(name = "CONT_CUBIERTA")
    private Short contCubierta;
    @Column(name = "CODIGO_DERIVACION")
    private String codigoDerivacion;
    @Column(name = "NOMBRE_AFILIADO")
    private String nombreAfiliado;
    @Column(name = "ORDEN_SERVICIO")
    private String ordenServicio;
    @Column(name = "NUMERO_SOLICITUD")
    private BigInteger numeroSolicitud;
    @Column(name = "DEPENDIENTE_CAMPESINO")
    private String dependienteCampesino;
    @Column(name = "CODIGO_SEGURO")
    private String codigoSeguro;
    @Column(name = "DESCRIPCION_SEGURO")
    private String descripcionSeguro;
    @Column(name = "CODIGO_VALIDACION")
    private String codigoValidacion;
    @Column(name = "TIPO_BENEFICIARIO")
    private String tipoBeneficiario;
    @Column(name = "TIPO_DERIVADO")
    private String tipoDerivado;
    @Column(name = "ID_RED_COMPLEMENTARIA")
    private String idRedComplementaria;
    @Column(name = "DERIVADO_OTROS")
    private String derivadoOtros;
    @Column(name = "TIPO_ACCIDENTE")
    private String tipoAccidente;
    @Column(name = "TIPO_ESPECIALIDAD")
    private String tipoEspecialidad;
    @Column(name = "ID_ISSFA")
    private String idIssfa;
    @Column(name = "UNIDAD_TRANSFIERE")
    private String unidadTransfiere;
    @JoinColumn(name = "DX_INGRESO", referencedColumnName = "DGNPCN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private DiagnosticosPaciente diagnosticosPaciente;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRMPCN_PRMPCN_ID", referencedColumnName = "PRMPCN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private PromocionesPacientes promocionesPacientes;

    public PromocionesConvenios() {
    }

    public PromocionesConvenios(Integer numeroConvenio) {
        this.numeroConvenio = numeroConvenio;
    }

    public Integer getNumeroConvenio() {
        return numeroConvenio;
    }

    public void setNumeroConvenio(Integer numeroConvenio) {
        this.numeroConvenio = numeroConvenio;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public Date getFechaConvenio() {
        return fechaConvenio;
    }

    public void setFechaConvenio(Date fechaConvenio) {
        this.fechaConvenio = fechaConvenio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public String getIdBeneficiario() {
        return idBeneficiario;
    }

    public void setIdBeneficiario(String idBeneficiario) {
        this.idBeneficiario = idBeneficiario;
    }

    public String getTipoIdBeneficiario() {
        return tipoIdBeneficiario;
    }

    public void setTipoIdBeneficiario(String tipoIdBeneficiario) {
        this.tipoIdBeneficiario = tipoIdBeneficiario;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getIdAfiliado() {
        return idAfiliado;
    }

    public void setIdAfiliado(String idAfiliado) {
        this.idAfiliado = idAfiliado;
    }

    public Short getContCubierta() {
        return contCubierta;
    }

    public void setContCubierta(Short contCubierta) {
        this.contCubierta = contCubierta;
    }

    public String getCodigoDerivacion() {
        return codigoDerivacion;
    }

    public void setCodigoDerivacion(String codigoDerivacion) {
        this.codigoDerivacion = codigoDerivacion;
    }

    public String getNombreAfiliado() {
        return nombreAfiliado;
    }

    public void setNombreAfiliado(String nombreAfiliado) {
        this.nombreAfiliado = nombreAfiliado;
    }

    public String getOrdenServicio() {
        return ordenServicio;
    }

    public void setOrdenServicio(String ordenServicio) {
        this.ordenServicio = ordenServicio;
    }

    public BigInteger getNumeroSolicitud() {
        return numeroSolicitud;
    }

    public void setNumeroSolicitud(BigInteger numeroSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
    }

    public String getDependienteCampesino() {
        return dependienteCampesino;
    }

    public void setDependienteCampesino(String dependienteCampesino) {
        this.dependienteCampesino = dependienteCampesino;
    }

    public String getCodigoSeguro() {
        return codigoSeguro;
    }

    public void setCodigoSeguro(String codigoSeguro) {
        this.codigoSeguro = codigoSeguro;
    }

    public String getDescripcionSeguro() {
        return descripcionSeguro;
    }

    public void setDescripcionSeguro(String descripcionSeguro) {
        this.descripcionSeguro = descripcionSeguro;
    }

    public String getCodigoValidacion() {
        return codigoValidacion;
    }

    public void setCodigoValidacion(String codigoValidacion) {
        this.codigoValidacion = codigoValidacion;
    }

    public String getTipoBeneficiario() {
        return tipoBeneficiario;
    }

    public void setTipoBeneficiario(String tipoBeneficiario) {
        this.tipoBeneficiario = tipoBeneficiario;
    }

    public String getTipoDerivado() {
        return tipoDerivado;
    }

    public void setTipoDerivado(String tipoDerivado) {
        this.tipoDerivado = tipoDerivado;
    }

    public String getIdRedComplementaria() {
        return idRedComplementaria;
    }

    public void setIdRedComplementaria(String idRedComplementaria) {
        this.idRedComplementaria = idRedComplementaria;
    }

    public String getDerivadoOtros() {
        return derivadoOtros;
    }

    public void setDerivadoOtros(String derivadoOtros) {
        this.derivadoOtros = derivadoOtros;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }

    public String getTipoEspecialidad() {
        return tipoEspecialidad;
    }

    public void setTipoEspecialidad(String tipoEspecialidad) {
        this.tipoEspecialidad = tipoEspecialidad;
    }

    public String getIdIssfa() {
        return idIssfa;
    }

    public void setIdIssfa(String idIssfa) {
        this.idIssfa = idIssfa;
    }

    public String getUnidadTransfiere() {
        return unidadTransfiere;
    }

    public void setUnidadTransfiere(String unidadTransfiere) {
        this.unidadTransfiere = unidadTransfiere;
    }

    public DiagnosticosPaciente getDiagnosticosPaciente() {
        return diagnosticosPaciente;
    }

    public void setDiagnosticosPaciente(DiagnosticosPaciente diagnosticosPaciente) {
        this.diagnosticosPaciente = diagnosticosPaciente;
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

    public PromocionesPacientes getPromocionesPacientes() {
        return promocionesPacientes;
    }

    public void setPromocionesPacientes(PromocionesPacientes promocionesPacientes) {
        this.promocionesPacientes = promocionesPacientes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroConvenio != null ? numeroConvenio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PromocionesConvenios)) {
            return false;
        }
        PromocionesConvenios other = (PromocionesConvenios) object;
        if ((this.numeroConvenio == null && other.numeroConvenio != null) || (this.numeroConvenio != null && !this.numeroConvenio.equals(other.numeroConvenio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.PromocionesConvenios[ numeroConvenio=" + numeroConvenio + " ]";
    }
    
}
