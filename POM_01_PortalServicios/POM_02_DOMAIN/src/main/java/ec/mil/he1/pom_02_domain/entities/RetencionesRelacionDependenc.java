/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "RETENCIONES_RELACION_DEPENDENC")
@NamedQueries({
    @NamedQuery(name = "RetencionesRelacionDependenc.findAll", query = "SELECT r FROM RetencionesRelacionDependenc r")})
public class RetencionesRelacionDependenc implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RetencionesRelacionDependencPK retencionesRelacionDependencPK;
    @Column(name = "TIPO_IDENTIFICACION")
    private String tipoIdentificacion;
    @Column(name = "EMPLEADO")
    private String empleado;
    @Column(name = "DIRECCION_CALLE")
    private String direccionCalle;
    @Column(name = "DIRECCION_NUMERO")
    private String direccionNumero;
    @Column(name = "CIUDAD")
    private String ciudad;
    @Column(name = "PROVINCIA")
    private String provincia;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "SISTEMA_SALARIO_NETO")
    private String sistemaSalarioNeto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "INGRESOS_LIQUIDOS")
    private BigDecimal ingresosLiquidos;
    @Column(name = "APORTE_IESS")
    private BigDecimal aporteIess;
    @Column(name = "BASE_IMPONIBLE")
    private BigDecimal baseImponible;
    @Column(name = "VALOR_RETENCION")
    private BigDecimal valorRetencion;
    @Column(name = "NUMERO_RETENCIONES")
    private Short numeroRetenciones;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "SISTEMA_GENERA")
    private String sistemaGenera;
    @Column(name = "SUELDOS_SALARIOS")
    private BigDecimal sueldosSalarios;
    @Column(name = "SOBRESUELDOS_COMISIONES")
    private BigDecimal sobresueldosComisiones;
    @Column(name = "UTILIDADES")
    private BigDecimal utilidades;
    @Column(name = "XIII")
    private BigDecimal xiii;
    @Column(name = "XIV")
    private BigDecimal xiv;
    @Column(name = "REBAJA_ESPECIAL_DIS")
    private BigDecimal rebajaEspecialDis;
    @Column(name = "REBAJA_ESPECIAL_TER")
    private BigDecimal rebajaEspecialTer;
    @Column(name = "SUBTOTAL")
    private BigDecimal subtotal;
    @Column(name = "IMPUESTO_ASUMIDO")
    private BigDecimal impuestoAsumido;
    @Column(name = "FONDORESERVA")
    private BigDecimal fondoreserva;
    @Column(name = "DESAUOTRAS")
    private BigDecimal desauotras;
    @Column(name = "DEDUCVIVIENDA")
    private BigDecimal deducvivienda;
    @Column(name = "DEDUCSALUD")
    private BigDecimal deducsalud;
    @Column(name = "DEDUCEDUCA")
    private BigDecimal deduceduca;
    @Column(name = "DEDUCALIMENT")
    private BigDecimal deducaliment;
    @Column(name = "DEDUCVESTIM")
    private BigDecimal deducvestim;
    @Column(name = "INTGRABGEN")
    private BigDecimal intgrabgen;
    @Column(name = "DEDUCCGASTOSOTREMPL")
    private BigDecimal deduccgastosotrempl;
    @Column(name = "NUMMESEMPLEAD")
    private BigDecimal nummesemplead;
    @Column(name = "OTRREBJOTREMP")
    private BigDecimal otrrebjotremp;
    @Column(name = "IMPRENTCAUS")
    private BigDecimal imprentcaus;
    @Column(name = "VALORIMPEMPANTER")
    private BigDecimal valorimpempanter;

    public RetencionesRelacionDependenc() {
    }

    public RetencionesRelacionDependenc(RetencionesRelacionDependencPK retencionesRelacionDependencPK) {
        this.retencionesRelacionDependencPK = retencionesRelacionDependencPK;
    }

    public RetencionesRelacionDependenc(String rtnfntEmpCodigo, short rtnfntAnio, String rtnfntTipo, String identificacionEmp, short rtnfntMes) {
        this.retencionesRelacionDependencPK = new RetencionesRelacionDependencPK(rtnfntEmpCodigo, rtnfntAnio, rtnfntTipo, identificacionEmp, rtnfntMes);
    }

    public RetencionesRelacionDependencPK getRetencionesRelacionDependencPK() {
        return retencionesRelacionDependencPK;
    }

    public void setRetencionesRelacionDependencPK(RetencionesRelacionDependencPK retencionesRelacionDependencPK) {
        this.retencionesRelacionDependencPK = retencionesRelacionDependencPK;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getDireccionCalle() {
        return direccionCalle;
    }

    public void setDireccionCalle(String direccionCalle) {
        this.direccionCalle = direccionCalle;
    }

    public String getDireccionNumero() {
        return direccionNumero;
    }

    public void setDireccionNumero(String direccionNumero) {
        this.direccionNumero = direccionNumero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSistemaSalarioNeto() {
        return sistemaSalarioNeto;
    }

    public void setSistemaSalarioNeto(String sistemaSalarioNeto) {
        this.sistemaSalarioNeto = sistemaSalarioNeto;
    }

    public BigDecimal getIngresosLiquidos() {
        return ingresosLiquidos;
    }

    public void setIngresosLiquidos(BigDecimal ingresosLiquidos) {
        this.ingresosLiquidos = ingresosLiquidos;
    }

    public BigDecimal getAporteIess() {
        return aporteIess;
    }

    public void setAporteIess(BigDecimal aporteIess) {
        this.aporteIess = aporteIess;
    }

    public BigDecimal getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(BigDecimal baseImponible) {
        this.baseImponible = baseImponible;
    }

    public BigDecimal getValorRetencion() {
        return valorRetencion;
    }

    public void setValorRetencion(BigDecimal valorRetencion) {
        this.valorRetencion = valorRetencion;
    }

    public Short getNumeroRetenciones() {
        return numeroRetenciones;
    }

    public void setNumeroRetenciones(Short numeroRetenciones) {
        this.numeroRetenciones = numeroRetenciones;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSistemaGenera() {
        return sistemaGenera;
    }

    public void setSistemaGenera(String sistemaGenera) {
        this.sistemaGenera = sistemaGenera;
    }

    public BigDecimal getSueldosSalarios() {
        return sueldosSalarios;
    }

    public void setSueldosSalarios(BigDecimal sueldosSalarios) {
        this.sueldosSalarios = sueldosSalarios;
    }

    public BigDecimal getSobresueldosComisiones() {
        return sobresueldosComisiones;
    }

    public void setSobresueldosComisiones(BigDecimal sobresueldosComisiones) {
        this.sobresueldosComisiones = sobresueldosComisiones;
    }

    public BigDecimal getUtilidades() {
        return utilidades;
    }

    public void setUtilidades(BigDecimal utilidades) {
        this.utilidades = utilidades;
    }

    public BigDecimal getXiii() {
        return xiii;
    }

    public void setXiii(BigDecimal xiii) {
        this.xiii = xiii;
    }

    public BigDecimal getXiv() {
        return xiv;
    }

    public void setXiv(BigDecimal xiv) {
        this.xiv = xiv;
    }

    public BigDecimal getRebajaEspecialDis() {
        return rebajaEspecialDis;
    }

    public void setRebajaEspecialDis(BigDecimal rebajaEspecialDis) {
        this.rebajaEspecialDis = rebajaEspecialDis;
    }

    public BigDecimal getRebajaEspecialTer() {
        return rebajaEspecialTer;
    }

    public void setRebajaEspecialTer(BigDecimal rebajaEspecialTer) {
        this.rebajaEspecialTer = rebajaEspecialTer;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getImpuestoAsumido() {
        return impuestoAsumido;
    }

    public void setImpuestoAsumido(BigDecimal impuestoAsumido) {
        this.impuestoAsumido = impuestoAsumido;
    }

    public BigDecimal getFondoreserva() {
        return fondoreserva;
    }

    public void setFondoreserva(BigDecimal fondoreserva) {
        this.fondoreserva = fondoreserva;
    }

    public BigDecimal getDesauotras() {
        return desauotras;
    }

    public void setDesauotras(BigDecimal desauotras) {
        this.desauotras = desauotras;
    }

    public BigDecimal getDeducvivienda() {
        return deducvivienda;
    }

    public void setDeducvivienda(BigDecimal deducvivienda) {
        this.deducvivienda = deducvivienda;
    }

    public BigDecimal getDeducsalud() {
        return deducsalud;
    }

    public void setDeducsalud(BigDecimal deducsalud) {
        this.deducsalud = deducsalud;
    }

    public BigDecimal getDeduceduca() {
        return deduceduca;
    }

    public void setDeduceduca(BigDecimal deduceduca) {
        this.deduceduca = deduceduca;
    }

    public BigDecimal getDeducaliment() {
        return deducaliment;
    }

    public void setDeducaliment(BigDecimal deducaliment) {
        this.deducaliment = deducaliment;
    }

    public BigDecimal getDeducvestim() {
        return deducvestim;
    }

    public void setDeducvestim(BigDecimal deducvestim) {
        this.deducvestim = deducvestim;
    }

    public BigDecimal getIntgrabgen() {
        return intgrabgen;
    }

    public void setIntgrabgen(BigDecimal intgrabgen) {
        this.intgrabgen = intgrabgen;
    }

    public BigDecimal getDeduccgastosotrempl() {
        return deduccgastosotrempl;
    }

    public void setDeduccgastosotrempl(BigDecimal deduccgastosotrempl) {
        this.deduccgastosotrempl = deduccgastosotrempl;
    }

    public BigDecimal getNummesemplead() {
        return nummesemplead;
    }

    public void setNummesemplead(BigDecimal nummesemplead) {
        this.nummesemplead = nummesemplead;
    }

    public BigDecimal getOtrrebjotremp() {
        return otrrebjotremp;
    }

    public void setOtrrebjotremp(BigDecimal otrrebjotremp) {
        this.otrrebjotremp = otrrebjotremp;
    }

    public BigDecimal getImprentcaus() {
        return imprentcaus;
    }

    public void setImprentcaus(BigDecimal imprentcaus) {
        this.imprentcaus = imprentcaus;
    }

    public BigDecimal getValorimpempanter() {
        return valorimpempanter;
    }

    public void setValorimpempanter(BigDecimal valorimpempanter) {
        this.valorimpempanter = valorimpempanter;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (retencionesRelacionDependencPK != null ? retencionesRelacionDependencPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetencionesRelacionDependenc)) {
            return false;
        }
        RetencionesRelacionDependenc other = (RetencionesRelacionDependenc) object;
        if ((this.retencionesRelacionDependencPK == null && other.retencionesRelacionDependencPK != null) || (this.retencionesRelacionDependencPK != null && !this.retencionesRelacionDependencPK.equals(other.retencionesRelacionDependencPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.RetencionesRelacionDependenc[ retencionesRelacionDependencPK=" + retencionesRelacionDependencPK + " ]";
    }
    
}
