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
import javax.persistence.FetchType;
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
@Table(name = "ROL_ACUMULADO")
@NamedQueries({
    @NamedQuery(name = "RolAcumulado.findAll", query = "SELECT r FROM RolAcumulado r")})
public class RolAcumulado implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RolAcumuladoPK rolAcumuladoPK;
    @Column(name = "RAC_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date racFecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ROLACUMULADO1")
    private BigDecimal rolacumulado1;
    @Column(name = "ROLACUMULADO2")
    private BigDecimal rolacumulado2;
    @Column(name = "ROLACUMULADO3")
    private BigDecimal rolacumulado3;
    @Column(name = "ROLACUMULADO4")
    private BigDecimal rolacumulado4;
    @Column(name = "ROLACUMULADO5")
    private BigDecimal rolacumulado5;
    @Column(name = "ROLACUMULADO6")
    private BigDecimal rolacumulado6;
    @Column(name = "ROLACUMULADO7")
    private BigDecimal rolacumulado7;
    @Column(name = "ROLACUMULADO8")
    private BigDecimal rolacumulado8;
    @Column(name = "ROLACUMULADO9")
    private BigDecimal rolacumulado9;
    @Column(name = "ROLACUMULADO10")
    private BigDecimal rolacumulado10;
    @Column(name = "ROLACUMULADO11")
    private BigDecimal rolacumulado11;
    @Column(name = "ROLACUMULADO12")
    private BigDecimal rolacumulado12;
    @Column(name = "ROLACUMULADO13")
    private BigDecimal rolacumulado13;
    @Column(name = "ROLACUMULADO14")
    private BigDecimal rolacumulado14;
    @Column(name = "ROLACUMULADO15")
    private BigDecimal rolacumulado15;
    @Column(name = "ROLACUMULADO16")
    private BigDecimal rolacumulado16;
    @Column(name = "ROLACUMULADOE1")
    private BigDecimal rolacumuladoe1;
    @Column(name = "ROLACUMULADOE2")
    private BigDecimal rolacumuladoe2;
    @Column(name = "ROLACUMULADOE3")
    private BigDecimal rolacumuladoe3;
    @Column(name = "ROLACUMULADOE4")
    private BigDecimal rolacumuladoe4;
    @Column(name = "ROLACUMULADOE5")
    private BigDecimal rolacumuladoe5;
    @Column(name = "ROLACUMULADOE6")
    private BigDecimal rolacumuladoe6;
    @Column(name = "ROLACUMULADOE7")
    private BigDecimal rolacumuladoe7;
    @Column(name = "ROLACUMULADOE8")
    private BigDecimal rolacumuladoe8;
    @Column(name = "ROLACUMULADOE9")
    private BigDecimal rolacumuladoe9;
    @Column(name = "ROLACUMULADOE10")
    private BigDecimal rolacumuladoe10;
    @Column(name = "ROLACUMULADOE11")
    private BigDecimal rolacumuladoe11;
    @Column(name = "ROLACUMULADOE12")
    private BigDecimal rolacumuladoe12;
    @Column(name = "ROLACUMULADOE13")
    private BigDecimal rolacumuladoe13;
    @Column(name = "ROLACUMULADOE14")
    private BigDecimal rolacumuladoe14;
    @Column(name = "ROLACUMULADOE15")
    private BigDecimal rolacumuladoe15;
    @Column(name = "ROLACUMULADOE16")
    private BigDecimal rolacumuladoe16;
    @Column(name = "ROLACUMULADOE17")
    private BigDecimal rolacumuladoe17;
    @Column(name = "ROLACUMULADOE18")
    private BigDecimal rolacumuladoe18;
    @Column(name = "ROLACUMULADOE19")
    private BigDecimal rolacumuladoe19;
    @Column(name = "ROLTOTALINGRESOS")
    private BigDecimal roltotalingresos;
    @Column(name = "ROLTOTALEGRESOS")
    private BigDecimal roltotalegresos;
    @Column(name = "ROLACUUSER")
    private String rolacuuser;
    @JoinColumn(name = "CCG_IDCATEGORIACARGO", referencedColumnName = "CCG_IDCATEGORIACARGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private CategoriaCargo categoriaCargo;
    @JoinColumn(name = "CCT_IDCENTROCOSTO", referencedColumnName = "CCT_IDCENTROCOSTO")
    @ManyToOne(fetch = FetchType.LAZY)
    private CentroCostos centroCostos;
    @JoinColumn(name = "RGL_IDREGIMEN", referencedColumnName = "RGL_IDREGIMEN")
    @ManyToOne(fetch = FetchType.LAZY)
    private RegimenLaboral regimenLaboral;
    @JoinColumn(name = "TRL_IDTIPORELACION", referencedColumnName = "TRL_IDTIPORELACION")
    @ManyToOne(fetch = FetchType.LAZY)
    private TipoRelacionLaboral tipoRelacionLaboral;

    public RolAcumulado() {
    }

    public RolAcumulado(RolAcumuladoPK rolAcumuladoPK) {
        this.rolAcumuladoPK = rolAcumuladoPK;
    }

    public RolAcumulado(long racIdrolacumulado, long prnIdpersonal) {
        this.rolAcumuladoPK = new RolAcumuladoPK(racIdrolacumulado, prnIdpersonal);
    }

    public RolAcumuladoPK getRolAcumuladoPK() {
        return rolAcumuladoPK;
    }

    public void setRolAcumuladoPK(RolAcumuladoPK rolAcumuladoPK) {
        this.rolAcumuladoPK = rolAcumuladoPK;
    }

    public Date getRacFecha() {
        return racFecha;
    }

    public void setRacFecha(Date racFecha) {
        this.racFecha = racFecha;
    }

    public BigDecimal getRolacumulado1() {
        return rolacumulado1;
    }

    public void setRolacumulado1(BigDecimal rolacumulado1) {
        this.rolacumulado1 = rolacumulado1;
    }

    public BigDecimal getRolacumulado2() {
        return rolacumulado2;
    }

    public void setRolacumulado2(BigDecimal rolacumulado2) {
        this.rolacumulado2 = rolacumulado2;
    }

    public BigDecimal getRolacumulado3() {
        return rolacumulado3;
    }

    public void setRolacumulado3(BigDecimal rolacumulado3) {
        this.rolacumulado3 = rolacumulado3;
    }

    public BigDecimal getRolacumulado4() {
        return rolacumulado4;
    }

    public void setRolacumulado4(BigDecimal rolacumulado4) {
        this.rolacumulado4 = rolacumulado4;
    }

    public BigDecimal getRolacumulado5() {
        return rolacumulado5;
    }

    public void setRolacumulado5(BigDecimal rolacumulado5) {
        this.rolacumulado5 = rolacumulado5;
    }

    public BigDecimal getRolacumulado6() {
        return rolacumulado6;
    }

    public void setRolacumulado6(BigDecimal rolacumulado6) {
        this.rolacumulado6 = rolacumulado6;
    }

    public BigDecimal getRolacumulado7() {
        return rolacumulado7;
    }

    public void setRolacumulado7(BigDecimal rolacumulado7) {
        this.rolacumulado7 = rolacumulado7;
    }

    public BigDecimal getRolacumulado8() {
        return rolacumulado8;
    }

    public void setRolacumulado8(BigDecimal rolacumulado8) {
        this.rolacumulado8 = rolacumulado8;
    }

    public BigDecimal getRolacumulado9() {
        return rolacumulado9;
    }

    public void setRolacumulado9(BigDecimal rolacumulado9) {
        this.rolacumulado9 = rolacumulado9;
    }

    public BigDecimal getRolacumulado10() {
        return rolacumulado10;
    }

    public void setRolacumulado10(BigDecimal rolacumulado10) {
        this.rolacumulado10 = rolacumulado10;
    }

    public BigDecimal getRolacumulado11() {
        return rolacumulado11;
    }

    public void setRolacumulado11(BigDecimal rolacumulado11) {
        this.rolacumulado11 = rolacumulado11;
    }

    public BigDecimal getRolacumulado12() {
        return rolacumulado12;
    }

    public void setRolacumulado12(BigDecimal rolacumulado12) {
        this.rolacumulado12 = rolacumulado12;
    }

    public BigDecimal getRolacumulado13() {
        return rolacumulado13;
    }

    public void setRolacumulado13(BigDecimal rolacumulado13) {
        this.rolacumulado13 = rolacumulado13;
    }

    public BigDecimal getRolacumulado14() {
        return rolacumulado14;
    }

    public void setRolacumulado14(BigDecimal rolacumulado14) {
        this.rolacumulado14 = rolacumulado14;
    }

    public BigDecimal getRolacumulado15() {
        return rolacumulado15;
    }

    public void setRolacumulado15(BigDecimal rolacumulado15) {
        this.rolacumulado15 = rolacumulado15;
    }

    public BigDecimal getRolacumulado16() {
        return rolacumulado16;
    }

    public void setRolacumulado16(BigDecimal rolacumulado16) {
        this.rolacumulado16 = rolacumulado16;
    }

    public BigDecimal getRolacumuladoe1() {
        return rolacumuladoe1;
    }

    public void setRolacumuladoe1(BigDecimal rolacumuladoe1) {
        this.rolacumuladoe1 = rolacumuladoe1;
    }

    public BigDecimal getRolacumuladoe2() {
        return rolacumuladoe2;
    }

    public void setRolacumuladoe2(BigDecimal rolacumuladoe2) {
        this.rolacumuladoe2 = rolacumuladoe2;
    }

    public BigDecimal getRolacumuladoe3() {
        return rolacumuladoe3;
    }

    public void setRolacumuladoe3(BigDecimal rolacumuladoe3) {
        this.rolacumuladoe3 = rolacumuladoe3;
    }

    public BigDecimal getRolacumuladoe4() {
        return rolacumuladoe4;
    }

    public void setRolacumuladoe4(BigDecimal rolacumuladoe4) {
        this.rolacumuladoe4 = rolacumuladoe4;
    }

    public BigDecimal getRolacumuladoe5() {
        return rolacumuladoe5;
    }

    public void setRolacumuladoe5(BigDecimal rolacumuladoe5) {
        this.rolacumuladoe5 = rolacumuladoe5;
    }

    public BigDecimal getRolacumuladoe6() {
        return rolacumuladoe6;
    }

    public void setRolacumuladoe6(BigDecimal rolacumuladoe6) {
        this.rolacumuladoe6 = rolacumuladoe6;
    }

    public BigDecimal getRolacumuladoe7() {
        return rolacumuladoe7;
    }

    public void setRolacumuladoe7(BigDecimal rolacumuladoe7) {
        this.rolacumuladoe7 = rolacumuladoe7;
    }

    public BigDecimal getRolacumuladoe8() {
        return rolacumuladoe8;
    }

    public void setRolacumuladoe8(BigDecimal rolacumuladoe8) {
        this.rolacumuladoe8 = rolacumuladoe8;
    }

    public BigDecimal getRolacumuladoe9() {
        return rolacumuladoe9;
    }

    public void setRolacumuladoe9(BigDecimal rolacumuladoe9) {
        this.rolacumuladoe9 = rolacumuladoe9;
    }

    public BigDecimal getRolacumuladoe10() {
        return rolacumuladoe10;
    }

    public void setRolacumuladoe10(BigDecimal rolacumuladoe10) {
        this.rolacumuladoe10 = rolacumuladoe10;
    }

    public BigDecimal getRolacumuladoe11() {
        return rolacumuladoe11;
    }

    public void setRolacumuladoe11(BigDecimal rolacumuladoe11) {
        this.rolacumuladoe11 = rolacumuladoe11;
    }

    public BigDecimal getRolacumuladoe12() {
        return rolacumuladoe12;
    }

    public void setRolacumuladoe12(BigDecimal rolacumuladoe12) {
        this.rolacumuladoe12 = rolacumuladoe12;
    }

    public BigDecimal getRolacumuladoe13() {
        return rolacumuladoe13;
    }

    public void setRolacumuladoe13(BigDecimal rolacumuladoe13) {
        this.rolacumuladoe13 = rolacumuladoe13;
    }

    public BigDecimal getRolacumuladoe14() {
        return rolacumuladoe14;
    }

    public void setRolacumuladoe14(BigDecimal rolacumuladoe14) {
        this.rolacumuladoe14 = rolacumuladoe14;
    }

    public BigDecimal getRolacumuladoe15() {
        return rolacumuladoe15;
    }

    public void setRolacumuladoe15(BigDecimal rolacumuladoe15) {
        this.rolacumuladoe15 = rolacumuladoe15;
    }

    public BigDecimal getRolacumuladoe16() {
        return rolacumuladoe16;
    }

    public void setRolacumuladoe16(BigDecimal rolacumuladoe16) {
        this.rolacumuladoe16 = rolacumuladoe16;
    }

    public BigDecimal getRolacumuladoe17() {
        return rolacumuladoe17;
    }

    public void setRolacumuladoe17(BigDecimal rolacumuladoe17) {
        this.rolacumuladoe17 = rolacumuladoe17;
    }

    public BigDecimal getRolacumuladoe18() {
        return rolacumuladoe18;
    }

    public void setRolacumuladoe18(BigDecimal rolacumuladoe18) {
        this.rolacumuladoe18 = rolacumuladoe18;
    }

    public BigDecimal getRolacumuladoe19() {
        return rolacumuladoe19;
    }

    public void setRolacumuladoe19(BigDecimal rolacumuladoe19) {
        this.rolacumuladoe19 = rolacumuladoe19;
    }

    public BigDecimal getRoltotalingresos() {
        return roltotalingresos;
    }

    public void setRoltotalingresos(BigDecimal roltotalingresos) {
        this.roltotalingresos = roltotalingresos;
    }

    public BigDecimal getRoltotalegresos() {
        return roltotalegresos;
    }

    public void setRoltotalegresos(BigDecimal roltotalegresos) {
        this.roltotalegresos = roltotalegresos;
    }

    public String getRolacuuser() {
        return rolacuuser;
    }

    public void setRolacuuser(String rolacuuser) {
        this.rolacuuser = rolacuuser;
    }

    public CategoriaCargo getCategoriaCargo() {
        return categoriaCargo;
    }

    public void setCategoriaCargo(CategoriaCargo categoriaCargo) {
        this.categoriaCargo = categoriaCargo;
    }

    public CentroCostos getCentroCostos() {
        return centroCostos;
    }

    public void setCentroCostos(CentroCostos centroCostos) {
        this.centroCostos = centroCostos;
    }

    public RegimenLaboral getRegimenLaboral() {
        return regimenLaboral;
    }

    public void setRegimenLaboral(RegimenLaboral regimenLaboral) {
        this.regimenLaboral = regimenLaboral;
    }

    public TipoRelacionLaboral getTipoRelacionLaboral() {
        return tipoRelacionLaboral;
    }

    public void setTipoRelacionLaboral(TipoRelacionLaboral tipoRelacionLaboral) {
        this.tipoRelacionLaboral = tipoRelacionLaboral;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolAcumuladoPK != null ? rolAcumuladoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolAcumulado)) {
            return false;
        }
        RolAcumulado other = (RolAcumulado) object;
        if ((this.rolAcumuladoPK == null && other.rolAcumuladoPK != null) || (this.rolAcumuladoPK != null && !this.rolAcumuladoPK.equals(other.rolAcumuladoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.RolAcumulado[ rolAcumuladoPK=" + rolAcumuladoPK + " ]";
    }
    
}
