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
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "ROL_PERSN_DTLL_TMP")
@NamedQueries({
    @NamedQuery(name = "RolPersnDtllTmp.findAll", query = "SELECT r FROM RolPersnDtllTmp r")})
public class RolPersnDtllTmp implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RolPersnDtllTmpPK rolPersnDtllTmpPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ROLPRNTMP1")
    private BigDecimal rolprntmp1;
    @Column(name = "ROLPRNTMP2")
    private BigDecimal rolprntmp2;
    @Column(name = "ROLPRNTMP3")
    private BigDecimal rolprntmp3;
    @Column(name = "ROLPRNTMP4")
    private BigDecimal rolprntmp4;
    @Column(name = "ROLPRNTMP5")
    private BigDecimal rolprntmp5;
    @Column(name = "ROLPRNTMP6")
    private BigDecimal rolprntmp6;
    @Column(name = "ROLPRNTMP7")
    private BigDecimal rolprntmp7;
    @Column(name = "ROLPRNTMP8")
    private BigDecimal rolprntmp8;
    @Column(name = "ROLPRNTMP9")
    private BigDecimal rolprntmp9;
    @Column(name = "ROLPRNTMP10")
    private BigDecimal rolprntmp10;
    @Column(name = "ROLPRNTMP11")
    private BigDecimal rolprntmp11;
    @Column(name = "ROLPRNTMP12")
    private BigDecimal rolprntmp12;
    @Column(name = "ROLPRNTMP13")
    private BigDecimal rolprntmp13;
    @Column(name = "ROLPRNTMP14")
    private BigDecimal rolprntmp14;
    @Column(name = "ROLPRNTMP15")
    private BigDecimal rolprntmp15;
    @Column(name = "ROLPRNTMP16")
    private BigDecimal rolprntmp16;
    @Column(name = "ROLPRNTMPE1")
    private BigDecimal rolprntmpe1;
    @Column(name = "ROLPRNTMPE2")
    private BigDecimal rolprntmpe2;
    @Column(name = "ROLPRNTMPE3")
    private BigDecimal rolprntmpe3;
    @Column(name = "ROLPRNTMPE4")
    private BigDecimal rolprntmpe4;
    @Column(name = "ROLPRNTMPE5")
    private BigDecimal rolprntmpe5;
    @Column(name = "ROLPRNTMPE6")
    private BigDecimal rolprntmpe6;
    @Column(name = "ROLPRNTMPE7")
    private BigDecimal rolprntmpe7;
    @Column(name = "ROLPRNTMPE8")
    private BigDecimal rolprntmpe8;
    @Column(name = "ROLPRNTMPE9")
    private BigDecimal rolprntmpe9;
    @Column(name = "ROLPRNTMPE10")
    private BigDecimal rolprntmpe10;
    @Column(name = "ROLPRNTMPE11")
    private BigDecimal rolprntmpe11;
    @Column(name = "ROLPRNTMPE12")
    private BigDecimal rolprntmpe12;
    @Column(name = "ROLPRNTMPE13")
    private BigDecimal rolprntmpe13;
    @Column(name = "ROLPRNTMPE14")
    private BigDecimal rolprntmpe14;
    @Column(name = "ROLPRNTMPE15")
    private BigDecimal rolprntmpe15;
    @Column(name = "ROLPRNTMPE16")
    private BigDecimal rolprntmpe16;
    @Column(name = "ROLPRNTMPE17")
    private BigDecimal rolprntmpe17;
    @Column(name = "ROLPRNTMPE18")
    private BigDecimal rolprntmpe18;
    @Column(name = "ROLPRNTMPE19")
    private BigDecimal rolprntmpe19;
    @Column(name = "ROLTOTALINGRESO")
    private BigDecimal roltotalingreso;
    @Column(name = "ROLTOTALEGRESO")
    private BigDecimal roltotalegreso;
    @JoinColumn(name = "RPG_IDROLPAGOS", referencedColumnName = "RPG_IDROLPAGOS", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Rolpagos rolpagos;

    public RolPersnDtllTmp() {
    }

    public RolPersnDtllTmp(RolPersnDtllTmpPK rolPersnDtllTmpPK) {
        this.rolPersnDtllTmpPK = rolPersnDtllTmpPK;
    }

    public RolPersnDtllTmp(long prnIdpersonal, long rpgIdrolpagos) {
        this.rolPersnDtllTmpPK = new RolPersnDtllTmpPK(prnIdpersonal, rpgIdrolpagos);
    }

    public RolPersnDtllTmpPK getRolPersnDtllTmpPK() {
        return rolPersnDtllTmpPK;
    }

    public void setRolPersnDtllTmpPK(RolPersnDtllTmpPK rolPersnDtllTmpPK) {
        this.rolPersnDtllTmpPK = rolPersnDtllTmpPK;
    }

    public BigDecimal getRolprntmp1() {
        return rolprntmp1;
    }

    public void setRolprntmp1(BigDecimal rolprntmp1) {
        this.rolprntmp1 = rolprntmp1;
    }

    public BigDecimal getRolprntmp2() {
        return rolprntmp2;
    }

    public void setRolprntmp2(BigDecimal rolprntmp2) {
        this.rolprntmp2 = rolprntmp2;
    }

    public BigDecimal getRolprntmp3() {
        return rolprntmp3;
    }

    public void setRolprntmp3(BigDecimal rolprntmp3) {
        this.rolprntmp3 = rolprntmp3;
    }

    public BigDecimal getRolprntmp4() {
        return rolprntmp4;
    }

    public void setRolprntmp4(BigDecimal rolprntmp4) {
        this.rolprntmp4 = rolprntmp4;
    }

    public BigDecimal getRolprntmp5() {
        return rolprntmp5;
    }

    public void setRolprntmp5(BigDecimal rolprntmp5) {
        this.rolprntmp5 = rolprntmp5;
    }

    public BigDecimal getRolprntmp6() {
        return rolprntmp6;
    }

    public void setRolprntmp6(BigDecimal rolprntmp6) {
        this.rolprntmp6 = rolprntmp6;
    }

    public BigDecimal getRolprntmp7() {
        return rolprntmp7;
    }

    public void setRolprntmp7(BigDecimal rolprntmp7) {
        this.rolprntmp7 = rolprntmp7;
    }

    public BigDecimal getRolprntmp8() {
        return rolprntmp8;
    }

    public void setRolprntmp8(BigDecimal rolprntmp8) {
        this.rolprntmp8 = rolprntmp8;
    }

    public BigDecimal getRolprntmp9() {
        return rolprntmp9;
    }

    public void setRolprntmp9(BigDecimal rolprntmp9) {
        this.rolprntmp9 = rolprntmp9;
    }

    public BigDecimal getRolprntmp10() {
        return rolprntmp10;
    }

    public void setRolprntmp10(BigDecimal rolprntmp10) {
        this.rolprntmp10 = rolprntmp10;
    }

    public BigDecimal getRolprntmp11() {
        return rolprntmp11;
    }

    public void setRolprntmp11(BigDecimal rolprntmp11) {
        this.rolprntmp11 = rolprntmp11;
    }

    public BigDecimal getRolprntmp12() {
        return rolprntmp12;
    }

    public void setRolprntmp12(BigDecimal rolprntmp12) {
        this.rolprntmp12 = rolprntmp12;
    }

    public BigDecimal getRolprntmp13() {
        return rolprntmp13;
    }

    public void setRolprntmp13(BigDecimal rolprntmp13) {
        this.rolprntmp13 = rolprntmp13;
    }

    public BigDecimal getRolprntmp14() {
        return rolprntmp14;
    }

    public void setRolprntmp14(BigDecimal rolprntmp14) {
        this.rolprntmp14 = rolprntmp14;
    }

    public BigDecimal getRolprntmp15() {
        return rolprntmp15;
    }

    public void setRolprntmp15(BigDecimal rolprntmp15) {
        this.rolprntmp15 = rolprntmp15;
    }

    public BigDecimal getRolprntmp16() {
        return rolprntmp16;
    }

    public void setRolprntmp16(BigDecimal rolprntmp16) {
        this.rolprntmp16 = rolprntmp16;
    }

    public BigDecimal getRolprntmpe1() {
        return rolprntmpe1;
    }

    public void setRolprntmpe1(BigDecimal rolprntmpe1) {
        this.rolprntmpe1 = rolprntmpe1;
    }

    public BigDecimal getRolprntmpe2() {
        return rolprntmpe2;
    }

    public void setRolprntmpe2(BigDecimal rolprntmpe2) {
        this.rolprntmpe2 = rolprntmpe2;
    }

    public BigDecimal getRolprntmpe3() {
        return rolprntmpe3;
    }

    public void setRolprntmpe3(BigDecimal rolprntmpe3) {
        this.rolprntmpe3 = rolprntmpe3;
    }

    public BigDecimal getRolprntmpe4() {
        return rolprntmpe4;
    }

    public void setRolprntmpe4(BigDecimal rolprntmpe4) {
        this.rolprntmpe4 = rolprntmpe4;
    }

    public BigDecimal getRolprntmpe5() {
        return rolprntmpe5;
    }

    public void setRolprntmpe5(BigDecimal rolprntmpe5) {
        this.rolprntmpe5 = rolprntmpe5;
    }

    public BigDecimal getRolprntmpe6() {
        return rolprntmpe6;
    }

    public void setRolprntmpe6(BigDecimal rolprntmpe6) {
        this.rolprntmpe6 = rolprntmpe6;
    }

    public BigDecimal getRolprntmpe7() {
        return rolprntmpe7;
    }

    public void setRolprntmpe7(BigDecimal rolprntmpe7) {
        this.rolprntmpe7 = rolprntmpe7;
    }

    public BigDecimal getRolprntmpe8() {
        return rolprntmpe8;
    }

    public void setRolprntmpe8(BigDecimal rolprntmpe8) {
        this.rolprntmpe8 = rolprntmpe8;
    }

    public BigDecimal getRolprntmpe9() {
        return rolprntmpe9;
    }

    public void setRolprntmpe9(BigDecimal rolprntmpe9) {
        this.rolprntmpe9 = rolprntmpe9;
    }

    public BigDecimal getRolprntmpe10() {
        return rolprntmpe10;
    }

    public void setRolprntmpe10(BigDecimal rolprntmpe10) {
        this.rolprntmpe10 = rolprntmpe10;
    }

    public BigDecimal getRolprntmpe11() {
        return rolprntmpe11;
    }

    public void setRolprntmpe11(BigDecimal rolprntmpe11) {
        this.rolprntmpe11 = rolprntmpe11;
    }

    public BigDecimal getRolprntmpe12() {
        return rolprntmpe12;
    }

    public void setRolprntmpe12(BigDecimal rolprntmpe12) {
        this.rolprntmpe12 = rolprntmpe12;
    }

    public BigDecimal getRolprntmpe13() {
        return rolprntmpe13;
    }

    public void setRolprntmpe13(BigDecimal rolprntmpe13) {
        this.rolprntmpe13 = rolprntmpe13;
    }

    public BigDecimal getRolprntmpe14() {
        return rolprntmpe14;
    }

    public void setRolprntmpe14(BigDecimal rolprntmpe14) {
        this.rolprntmpe14 = rolprntmpe14;
    }

    public BigDecimal getRolprntmpe15() {
        return rolprntmpe15;
    }

    public void setRolprntmpe15(BigDecimal rolprntmpe15) {
        this.rolprntmpe15 = rolprntmpe15;
    }

    public BigDecimal getRolprntmpe16() {
        return rolprntmpe16;
    }

    public void setRolprntmpe16(BigDecimal rolprntmpe16) {
        this.rolprntmpe16 = rolprntmpe16;
    }

    public BigDecimal getRolprntmpe17() {
        return rolprntmpe17;
    }

    public void setRolprntmpe17(BigDecimal rolprntmpe17) {
        this.rolprntmpe17 = rolprntmpe17;
    }

    public BigDecimal getRolprntmpe18() {
        return rolprntmpe18;
    }

    public void setRolprntmpe18(BigDecimal rolprntmpe18) {
        this.rolprntmpe18 = rolprntmpe18;
    }

    public BigDecimal getRolprntmpe19() {
        return rolprntmpe19;
    }

    public void setRolprntmpe19(BigDecimal rolprntmpe19) {
        this.rolprntmpe19 = rolprntmpe19;
    }

    public BigDecimal getRoltotalingreso() {
        return roltotalingreso;
    }

    public void setRoltotalingreso(BigDecimal roltotalingreso) {
        this.roltotalingreso = roltotalingreso;
    }

    public BigDecimal getRoltotalegreso() {
        return roltotalegreso;
    }

    public void setRoltotalegreso(BigDecimal roltotalegreso) {
        this.roltotalegreso = roltotalegreso;
    }

    public Rolpagos getRolpagos() {
        return rolpagos;
    }

    public void setRolpagos(Rolpagos rolpagos) {
        this.rolpagos = rolpagos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolPersnDtllTmpPK != null ? rolPersnDtllTmpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolPersnDtllTmp)) {
            return false;
        }
        RolPersnDtllTmp other = (RolPersnDtllTmp) object;
        if ((this.rolPersnDtllTmpPK == null && other.rolPersnDtllTmpPK != null) || (this.rolPersnDtllTmpPK != null && !this.rolPersnDtllTmpPK.equals(other.rolPersnDtllTmpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.RolPersnDtllTmp[ rolPersnDtllTmpPK=" + rolPersnDtllTmpPK + " ]";
    }
    
}
