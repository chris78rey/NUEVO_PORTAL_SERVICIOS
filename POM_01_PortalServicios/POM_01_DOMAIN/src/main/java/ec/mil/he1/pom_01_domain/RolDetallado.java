/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "ROL_DETALLADO")
@NamedQueries({
    @NamedQuery(name = "RolDetallado.findAll", query = "SELECT r FROM RolDetallado r")})
public class RolDetallado implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RolDetalladoPK rolDetalladoPK;
    @Column(name = "CCG_IDCATEGORIACARGO")
    private String ccgIdcategoriacargo;
    @Column(name = "CCT_IDCENTROCOSTO")
    private String cctIdcentrocosto;
    @Column(name = "RLD_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rldFecha;
    @Column(name = "RGL_IDREGIMEN")
    private BigInteger rglIdregimen;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ROLDETALLEDO1")
    private BigDecimal roldetalledo1;
    @Column(name = "ROLDETALLEDO2")
    private BigDecimal roldetalledo2;
    @Column(name = "ROLDETALLEDO3")
    private BigDecimal roldetalledo3;
    @Column(name = "ROLDETALLEDO4")
    private BigDecimal roldetalledo4;
    @Column(name = "ROLDETALLEDO5")
    private BigDecimal roldetalledo5;
    @Column(name = "ROLDETALLEDO6")
    private BigDecimal roldetalledo6;
    @Column(name = "ROLDETALLEDO7")
    private BigDecimal roldetalledo7;
    @Column(name = "ROLDETALLEDO8")
    private BigDecimal roldetalledo8;
    @Column(name = "ROLDETALLEDO9")
    private BigDecimal roldetalledo9;
    @Column(name = "ROLDETALLEDO10")
    private BigDecimal roldetalledo10;
    @Column(name = "ROLDETALLEDO11")
    private BigDecimal roldetalledo11;
    @Column(name = "ROLDETALLEDO12")
    private BigDecimal roldetalledo12;
    @Column(name = "ROLDETALLEDO13")
    private BigDecimal roldetalledo13;
    @Column(name = "ROLDETALLEDO14")
    private BigDecimal roldetalledo14;
    @Column(name = "ROLDETALLEDO15")
    private BigDecimal roldetalledo15;
    @Column(name = "ROLDETALLEDO16")
    private BigDecimal roldetalledo16;
    @Column(name = "ROLDETALLEDOE1")
    private BigDecimal roldetalledoe1;
    @Column(name = "ROLDETALLEDOE2")
    private BigDecimal roldetalledoe2;
    @Column(name = "ROLDETALLEDOE3")
    private BigDecimal roldetalledoe3;
    @Column(name = "ROLDETALLEDOE4")
    private BigDecimal roldetalledoe4;
    @Column(name = "ROLDETALLEDOE5")
    private BigDecimal roldetalledoe5;
    @Column(name = "ROLDETALLEDOE6")
    private BigDecimal roldetalledoe6;
    @Column(name = "ROLDETALLEDOE7")
    private BigDecimal roldetalledoe7;
    @Column(name = "ROLDETALLEDOE8")
    private BigDecimal roldetalledoe8;
    @Column(name = "ROLDETALLEDOE9")
    private BigDecimal roldetalledoe9;
    @Column(name = "ROLDETALLEDOE10")
    private BigDecimal roldetalledoe10;
    @Column(name = "ROLDETALLEDOE11")
    private BigDecimal roldetalledoe11;
    @Column(name = "ROLDETALLEDOE12")
    private BigDecimal roldetalledoe12;
    @Column(name = "ROLDETALLEDOE13")
    private BigDecimal roldetalledoe13;
    @Column(name = "ROLDETALLEDOE14")
    private BigDecimal roldetalledoe14;
    @Column(name = "ROLDETALLEDOE15")
    private BigDecimal roldetalledoe15;
    @Column(name = "ROLDETALLEDOE16")
    private BigDecimal roldetalledoe16;
    @Column(name = "ROLDETALLEDOE17")
    private BigDecimal roldetalledoe17;
    @Column(name = "ROLDETALLEDOE18")
    private BigDecimal roldetalledoe18;
    @Column(name = "ROLDETALLEDOE19")
    private BigDecimal roldetalledoe19;
    @Column(name = "ROLTOTALINGRESOS")
    private BigDecimal roltotalingresos;
    @Column(name = "ROLTOTALEGRESOS")
    private BigDecimal roltotalegresos;
    @Column(name = "ROLLIQUIDORECIBIR")
    private BigDecimal rolliquidorecibir;
    @Column(name = "ROLESTADOPRN")
    private Character rolestadoprn;
    @Column(name = "ROLUSER")
    private String roluser;
    @Column(name = "TRL_IDTIPORELACION")
    private BigInteger trlIdtiporelacion;
    @Column(name = "ROL_MIGRADO")
    private String rolMigrado;

    public RolDetallado() {
    }

    public RolDetallado(RolDetalladoPK rolDetalladoPK) {
        this.rolDetalladoPK = rolDetalladoPK;
    }

    public RolDetallado(long rldIdroldetallado, long prnIdpersonal, long rpgIdrolpagos) {
        this.rolDetalladoPK = new RolDetalladoPK(rldIdroldetallado, prnIdpersonal, rpgIdrolpagos);
    }

    public RolDetalladoPK getRolDetalladoPK() {
        return rolDetalladoPK;
    }

    public void setRolDetalladoPK(RolDetalladoPK rolDetalladoPK) {
        this.rolDetalladoPK = rolDetalladoPK;
    }

    public String getCcgIdcategoriacargo() {
        return ccgIdcategoriacargo;
    }

    public void setCcgIdcategoriacargo(String ccgIdcategoriacargo) {
        this.ccgIdcategoriacargo = ccgIdcategoriacargo;
    }

    public String getCctIdcentrocosto() {
        return cctIdcentrocosto;
    }

    public void setCctIdcentrocosto(String cctIdcentrocosto) {
        this.cctIdcentrocosto = cctIdcentrocosto;
    }

    public Date getRldFecha() {
        return rldFecha;
    }

    public void setRldFecha(Date rldFecha) {
        this.rldFecha = rldFecha;
    }

    public BigInteger getRglIdregimen() {
        return rglIdregimen;
    }

    public void setRglIdregimen(BigInteger rglIdregimen) {
        this.rglIdregimen = rglIdregimen;
    }

    public BigDecimal getRoldetalledo1() {
        return roldetalledo1;
    }

    public void setRoldetalledo1(BigDecimal roldetalledo1) {
        this.roldetalledo1 = roldetalledo1;
    }

    public BigDecimal getRoldetalledo2() {
        return roldetalledo2;
    }

    public void setRoldetalledo2(BigDecimal roldetalledo2) {
        this.roldetalledo2 = roldetalledo2;
    }

    public BigDecimal getRoldetalledo3() {
        return roldetalledo3;
    }

    public void setRoldetalledo3(BigDecimal roldetalledo3) {
        this.roldetalledo3 = roldetalledo3;
    }

    public BigDecimal getRoldetalledo4() {
        return roldetalledo4;
    }

    public void setRoldetalledo4(BigDecimal roldetalledo4) {
        this.roldetalledo4 = roldetalledo4;
    }

    public BigDecimal getRoldetalledo5() {
        return roldetalledo5;
    }

    public void setRoldetalledo5(BigDecimal roldetalledo5) {
        this.roldetalledo5 = roldetalledo5;
    }

    public BigDecimal getRoldetalledo6() {
        return roldetalledo6;
    }

    public void setRoldetalledo6(BigDecimal roldetalledo6) {
        this.roldetalledo6 = roldetalledo6;
    }

    public BigDecimal getRoldetalledo7() {
        return roldetalledo7;
    }

    public void setRoldetalledo7(BigDecimal roldetalledo7) {
        this.roldetalledo7 = roldetalledo7;
    }

    public BigDecimal getRoldetalledo8() {
        return roldetalledo8;
    }

    public void setRoldetalledo8(BigDecimal roldetalledo8) {
        this.roldetalledo8 = roldetalledo8;
    }

    public BigDecimal getRoldetalledo9() {
        return roldetalledo9;
    }

    public void setRoldetalledo9(BigDecimal roldetalledo9) {
        this.roldetalledo9 = roldetalledo9;
    }

    public BigDecimal getRoldetalledo10() {
        return roldetalledo10;
    }

    public void setRoldetalledo10(BigDecimal roldetalledo10) {
        this.roldetalledo10 = roldetalledo10;
    }

    public BigDecimal getRoldetalledo11() {
        return roldetalledo11;
    }

    public void setRoldetalledo11(BigDecimal roldetalledo11) {
        this.roldetalledo11 = roldetalledo11;
    }

    public BigDecimal getRoldetalledo12() {
        return roldetalledo12;
    }

    public void setRoldetalledo12(BigDecimal roldetalledo12) {
        this.roldetalledo12 = roldetalledo12;
    }

    public BigDecimal getRoldetalledo13() {
        return roldetalledo13;
    }

    public void setRoldetalledo13(BigDecimal roldetalledo13) {
        this.roldetalledo13 = roldetalledo13;
    }

    public BigDecimal getRoldetalledo14() {
        return roldetalledo14;
    }

    public void setRoldetalledo14(BigDecimal roldetalledo14) {
        this.roldetalledo14 = roldetalledo14;
    }

    public BigDecimal getRoldetalledo15() {
        return roldetalledo15;
    }

    public void setRoldetalledo15(BigDecimal roldetalledo15) {
        this.roldetalledo15 = roldetalledo15;
    }

    public BigDecimal getRoldetalledo16() {
        return roldetalledo16;
    }

    public void setRoldetalledo16(BigDecimal roldetalledo16) {
        this.roldetalledo16 = roldetalledo16;
    }

    public BigDecimal getRoldetalledoe1() {
        return roldetalledoe1;
    }

    public void setRoldetalledoe1(BigDecimal roldetalledoe1) {
        this.roldetalledoe1 = roldetalledoe1;
    }

    public BigDecimal getRoldetalledoe2() {
        return roldetalledoe2;
    }

    public void setRoldetalledoe2(BigDecimal roldetalledoe2) {
        this.roldetalledoe2 = roldetalledoe2;
    }

    public BigDecimal getRoldetalledoe3() {
        return roldetalledoe3;
    }

    public void setRoldetalledoe3(BigDecimal roldetalledoe3) {
        this.roldetalledoe3 = roldetalledoe3;
    }

    public BigDecimal getRoldetalledoe4() {
        return roldetalledoe4;
    }

    public void setRoldetalledoe4(BigDecimal roldetalledoe4) {
        this.roldetalledoe4 = roldetalledoe4;
    }

    public BigDecimal getRoldetalledoe5() {
        return roldetalledoe5;
    }

    public void setRoldetalledoe5(BigDecimal roldetalledoe5) {
        this.roldetalledoe5 = roldetalledoe5;
    }

    public BigDecimal getRoldetalledoe6() {
        return roldetalledoe6;
    }

    public void setRoldetalledoe6(BigDecimal roldetalledoe6) {
        this.roldetalledoe6 = roldetalledoe6;
    }

    public BigDecimal getRoldetalledoe7() {
        return roldetalledoe7;
    }

    public void setRoldetalledoe7(BigDecimal roldetalledoe7) {
        this.roldetalledoe7 = roldetalledoe7;
    }

    public BigDecimal getRoldetalledoe8() {
        return roldetalledoe8;
    }

    public void setRoldetalledoe8(BigDecimal roldetalledoe8) {
        this.roldetalledoe8 = roldetalledoe8;
    }

    public BigDecimal getRoldetalledoe9() {
        return roldetalledoe9;
    }

    public void setRoldetalledoe9(BigDecimal roldetalledoe9) {
        this.roldetalledoe9 = roldetalledoe9;
    }

    public BigDecimal getRoldetalledoe10() {
        return roldetalledoe10;
    }

    public void setRoldetalledoe10(BigDecimal roldetalledoe10) {
        this.roldetalledoe10 = roldetalledoe10;
    }

    public BigDecimal getRoldetalledoe11() {
        return roldetalledoe11;
    }

    public void setRoldetalledoe11(BigDecimal roldetalledoe11) {
        this.roldetalledoe11 = roldetalledoe11;
    }

    public BigDecimal getRoldetalledoe12() {
        return roldetalledoe12;
    }

    public void setRoldetalledoe12(BigDecimal roldetalledoe12) {
        this.roldetalledoe12 = roldetalledoe12;
    }

    public BigDecimal getRoldetalledoe13() {
        return roldetalledoe13;
    }

    public void setRoldetalledoe13(BigDecimal roldetalledoe13) {
        this.roldetalledoe13 = roldetalledoe13;
    }

    public BigDecimal getRoldetalledoe14() {
        return roldetalledoe14;
    }

    public void setRoldetalledoe14(BigDecimal roldetalledoe14) {
        this.roldetalledoe14 = roldetalledoe14;
    }

    public BigDecimal getRoldetalledoe15() {
        return roldetalledoe15;
    }

    public void setRoldetalledoe15(BigDecimal roldetalledoe15) {
        this.roldetalledoe15 = roldetalledoe15;
    }

    public BigDecimal getRoldetalledoe16() {
        return roldetalledoe16;
    }

    public void setRoldetalledoe16(BigDecimal roldetalledoe16) {
        this.roldetalledoe16 = roldetalledoe16;
    }

    public BigDecimal getRoldetalledoe17() {
        return roldetalledoe17;
    }

    public void setRoldetalledoe17(BigDecimal roldetalledoe17) {
        this.roldetalledoe17 = roldetalledoe17;
    }

    public BigDecimal getRoldetalledoe18() {
        return roldetalledoe18;
    }

    public void setRoldetalledoe18(BigDecimal roldetalledoe18) {
        this.roldetalledoe18 = roldetalledoe18;
    }

    public BigDecimal getRoldetalledoe19() {
        return roldetalledoe19;
    }

    public void setRoldetalledoe19(BigDecimal roldetalledoe19) {
        this.roldetalledoe19 = roldetalledoe19;
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

    public BigDecimal getRolliquidorecibir() {
        return rolliquidorecibir;
    }

    public void setRolliquidorecibir(BigDecimal rolliquidorecibir) {
        this.rolliquidorecibir = rolliquidorecibir;
    }

    public Character getRolestadoprn() {
        return rolestadoprn;
    }

    public void setRolestadoprn(Character rolestadoprn) {
        this.rolestadoprn = rolestadoprn;
    }

    public String getRoluser() {
        return roluser;
    }

    public void setRoluser(String roluser) {
        this.roluser = roluser;
    }

    public BigInteger getTrlIdtiporelacion() {
        return trlIdtiporelacion;
    }

    public void setTrlIdtiporelacion(BigInteger trlIdtiporelacion) {
        this.trlIdtiporelacion = trlIdtiporelacion;
    }

    public String getRolMigrado() {
        return rolMigrado;
    }

    public void setRolMigrado(String rolMigrado) {
        this.rolMigrado = rolMigrado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolDetalladoPK != null ? rolDetalladoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolDetallado)) {
            return false;
        }
        RolDetallado other = (RolDetallado) object;
        if ((this.rolDetalladoPK == null && other.rolDetalladoPK != null) || (this.rolDetalladoPK != null && !this.rolDetalladoPK.equals(other.rolDetalladoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.RolDetallado[ rolDetalladoPK=" + rolDetalladoPK + " ]";
    }
    
}
