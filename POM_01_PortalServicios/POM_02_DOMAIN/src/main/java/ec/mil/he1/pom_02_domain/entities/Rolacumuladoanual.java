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
@Table(name = "ROLACUMULADOANUAL")
@NamedQueries({
    @NamedQuery(name = "Rolacumuladoanual.findAll", query = "SELECT r FROM Rolacumuladoanual r")})
public class Rolacumuladoanual implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RolacumuladoanualPK rolacumuladoanualPK;
    @Column(name = "RAA_FECHAACTUALIZACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date raaFechaactualizacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Raa_I01")
    private BigDecimal raaI01;
    @Column(name = "Raa_I02")
    private BigDecimal raaI02;
    @Column(name = "Raa_I03")
    private BigDecimal raaI03;
    @Column(name = "Raa_I04")
    private BigDecimal raaI04;
    @Column(name = "Raa_I05")
    private BigDecimal raaI05;
    @Column(name = "Raa_I06")
    private BigDecimal raaI06;
    @Column(name = "Raa_I07")
    private BigDecimal raaI07;
    @Column(name = "Raa_I08")
    private BigDecimal raaI08;
    @Column(name = "Raa_I09")
    private BigDecimal raaI09;
    @Column(name = "Raa_I10")
    private BigDecimal raaI10;
    @Column(name = "Raa_I11")
    private BigDecimal raaI11;
    @Column(name = "Raa_I12")
    private BigDecimal raaI12;
    @Column(name = "Raa_I13")
    private BigDecimal raaI13;
    @Column(name = "Raa_I14")
    private BigDecimal raaI14;
    @Column(name = "Raa_I15")
    private BigDecimal raaI15;
    @Column(name = "Raa_I16")
    private BigDecimal raaI16;
    @Column(name = "Raa_E01")
    private BigDecimal raaE01;
    @Column(name = "Raa_E02")
    private BigDecimal raaE02;
    @Column(name = "Raa_E03")
    private BigDecimal raaE03;
    @Column(name = "Raa_E04")
    private BigDecimal raaE04;
    @Column(name = "Raa_E05")
    private BigDecimal raaE05;
    @Column(name = "Raa_E06")
    private BigDecimal raaE06;
    @Column(name = "Raa_E07")
    private BigDecimal raaE07;
    @Column(name = "Raa_E08")
    private BigDecimal raaE08;
    @Column(name = "Raa_E09")
    private BigDecimal raaE09;
    @Column(name = "Raa_E10")
    private BigDecimal raaE10;
    @Column(name = "Raa_E11")
    private BigDecimal raaE11;
    @Column(name = "Raa_E12")
    private BigDecimal raaE12;
    @Column(name = "Raa_E13")
    private BigDecimal raaE13;
    @Column(name = "Raa_E14")
    private BigDecimal raaE14;
    @Column(name = "Raa_E15")
    private BigDecimal raaE15;
    @Column(name = "Raa_E16")
    private BigDecimal raaE16;
    @Column(name = "Raa_TotalEgreso")
    private BigDecimal raaTotalEgreso;
    @Column(name = "Raa_TotalIngreso")
    private BigDecimal raaTotalIngreso;
    @Column(name = "Raa_User")
    private String raaUser;
    @Column(name = "RAA_E17")
    private BigDecimal raaE17;
    @Column(name = "RAA_E18")
    private BigDecimal raaE18;
    @Column(name = "RAA_E19")
    private BigDecimal raaE19;

    public Rolacumuladoanual() {
    }

    public Rolacumuladoanual(RolacumuladoanualPK rolacumuladoanualPK) {
        this.rolacumuladoanualPK = rolacumuladoanualPK;
    }

    public Rolacumuladoanual(long raaIdrolacumuladoanual, long prnIdpersonal, String raaAnio) {
        this.rolacumuladoanualPK = new RolacumuladoanualPK(raaIdrolacumuladoanual, prnIdpersonal, raaAnio);
    }

    public RolacumuladoanualPK getRolacumuladoanualPK() {
        return rolacumuladoanualPK;
    }

    public void setRolacumuladoanualPK(RolacumuladoanualPK rolacumuladoanualPK) {
        this.rolacumuladoanualPK = rolacumuladoanualPK;
    }

    public Date getRaaFechaactualizacion() {
        return raaFechaactualizacion;
    }

    public void setRaaFechaactualizacion(Date raaFechaactualizacion) {
        this.raaFechaactualizacion = raaFechaactualizacion;
    }

    public BigDecimal getRaaI01() {
        return raaI01;
    }

    public void setRaaI01(BigDecimal raaI01) {
        this.raaI01 = raaI01;
    }

    public BigDecimal getRaaI02() {
        return raaI02;
    }

    public void setRaaI02(BigDecimal raaI02) {
        this.raaI02 = raaI02;
    }

    public BigDecimal getRaaI03() {
        return raaI03;
    }

    public void setRaaI03(BigDecimal raaI03) {
        this.raaI03 = raaI03;
    }

    public BigDecimal getRaaI04() {
        return raaI04;
    }

    public void setRaaI04(BigDecimal raaI04) {
        this.raaI04 = raaI04;
    }

    public BigDecimal getRaaI05() {
        return raaI05;
    }

    public void setRaaI05(BigDecimal raaI05) {
        this.raaI05 = raaI05;
    }

    public BigDecimal getRaaI06() {
        return raaI06;
    }

    public void setRaaI06(BigDecimal raaI06) {
        this.raaI06 = raaI06;
    }

    public BigDecimal getRaaI07() {
        return raaI07;
    }

    public void setRaaI07(BigDecimal raaI07) {
        this.raaI07 = raaI07;
    }

    public BigDecimal getRaaI08() {
        return raaI08;
    }

    public void setRaaI08(BigDecimal raaI08) {
        this.raaI08 = raaI08;
    }

    public BigDecimal getRaaI09() {
        return raaI09;
    }

    public void setRaaI09(BigDecimal raaI09) {
        this.raaI09 = raaI09;
    }

    public BigDecimal getRaaI10() {
        return raaI10;
    }

    public void setRaaI10(BigDecimal raaI10) {
        this.raaI10 = raaI10;
    }

    public BigDecimal getRaaI11() {
        return raaI11;
    }

    public void setRaaI11(BigDecimal raaI11) {
        this.raaI11 = raaI11;
    }

    public BigDecimal getRaaI12() {
        return raaI12;
    }

    public void setRaaI12(BigDecimal raaI12) {
        this.raaI12 = raaI12;
    }

    public BigDecimal getRaaI13() {
        return raaI13;
    }

    public void setRaaI13(BigDecimal raaI13) {
        this.raaI13 = raaI13;
    }

    public BigDecimal getRaaI14() {
        return raaI14;
    }

    public void setRaaI14(BigDecimal raaI14) {
        this.raaI14 = raaI14;
    }

    public BigDecimal getRaaI15() {
        return raaI15;
    }

    public void setRaaI15(BigDecimal raaI15) {
        this.raaI15 = raaI15;
    }

    public BigDecimal getRaaI16() {
        return raaI16;
    }

    public void setRaaI16(BigDecimal raaI16) {
        this.raaI16 = raaI16;
    }

    public BigDecimal getRaaE01() {
        return raaE01;
    }

    public void setRaaE01(BigDecimal raaE01) {
        this.raaE01 = raaE01;
    }

    public BigDecimal getRaaE02() {
        return raaE02;
    }

    public void setRaaE02(BigDecimal raaE02) {
        this.raaE02 = raaE02;
    }

    public BigDecimal getRaaE03() {
        return raaE03;
    }

    public void setRaaE03(BigDecimal raaE03) {
        this.raaE03 = raaE03;
    }

    public BigDecimal getRaaE04() {
        return raaE04;
    }

    public void setRaaE04(BigDecimal raaE04) {
        this.raaE04 = raaE04;
    }

    public BigDecimal getRaaE05() {
        return raaE05;
    }

    public void setRaaE05(BigDecimal raaE05) {
        this.raaE05 = raaE05;
    }

    public BigDecimal getRaaE06() {
        return raaE06;
    }

    public void setRaaE06(BigDecimal raaE06) {
        this.raaE06 = raaE06;
    }

    public BigDecimal getRaaE07() {
        return raaE07;
    }

    public void setRaaE07(BigDecimal raaE07) {
        this.raaE07 = raaE07;
    }

    public BigDecimal getRaaE08() {
        return raaE08;
    }

    public void setRaaE08(BigDecimal raaE08) {
        this.raaE08 = raaE08;
    }

    public BigDecimal getRaaE09() {
        return raaE09;
    }

    public void setRaaE09(BigDecimal raaE09) {
        this.raaE09 = raaE09;
    }

    public BigDecimal getRaaE10() {
        return raaE10;
    }

    public void setRaaE10(BigDecimal raaE10) {
        this.raaE10 = raaE10;
    }

    public BigDecimal getRaaE11() {
        return raaE11;
    }

    public void setRaaE11(BigDecimal raaE11) {
        this.raaE11 = raaE11;
    }

    public BigDecimal getRaaE12() {
        return raaE12;
    }

    public void setRaaE12(BigDecimal raaE12) {
        this.raaE12 = raaE12;
    }

    public BigDecimal getRaaE13() {
        return raaE13;
    }

    public void setRaaE13(BigDecimal raaE13) {
        this.raaE13 = raaE13;
    }

    public BigDecimal getRaaE14() {
        return raaE14;
    }

    public void setRaaE14(BigDecimal raaE14) {
        this.raaE14 = raaE14;
    }

    public BigDecimal getRaaE15() {
        return raaE15;
    }

    public void setRaaE15(BigDecimal raaE15) {
        this.raaE15 = raaE15;
    }

    public BigDecimal getRaaE16() {
        return raaE16;
    }

    public void setRaaE16(BigDecimal raaE16) {
        this.raaE16 = raaE16;
    }

    public BigDecimal getRaaTotalEgreso() {
        return raaTotalEgreso;
    }

    public void setRaaTotalEgreso(BigDecimal raaTotalEgreso) {
        this.raaTotalEgreso = raaTotalEgreso;
    }

    public BigDecimal getRaaTotalIngreso() {
        return raaTotalIngreso;
    }

    public void setRaaTotalIngreso(BigDecimal raaTotalIngreso) {
        this.raaTotalIngreso = raaTotalIngreso;
    }

    public String getRaaUser() {
        return raaUser;
    }

    public void setRaaUser(String raaUser) {
        this.raaUser = raaUser;
    }

    public BigDecimal getRaaE17() {
        return raaE17;
    }

    public void setRaaE17(BigDecimal raaE17) {
        this.raaE17 = raaE17;
    }

    public BigDecimal getRaaE18() {
        return raaE18;
    }

    public void setRaaE18(BigDecimal raaE18) {
        this.raaE18 = raaE18;
    }

    public BigDecimal getRaaE19() {
        return raaE19;
    }

    public void setRaaE19(BigDecimal raaE19) {
        this.raaE19 = raaE19;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolacumuladoanualPK != null ? rolacumuladoanualPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rolacumuladoanual)) {
            return false;
        }
        Rolacumuladoanual other = (Rolacumuladoanual) object;
        if ((this.rolacumuladoanualPK == null && other.rolacumuladoanualPK != null) || (this.rolacumuladoanualPK != null && !this.rolacumuladoanualPK.equals(other.rolacumuladoanualPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Rolacumuladoanual[ rolacumuladoanualPK=" + rolacumuladoanualPK + " ]";
    }
    
}
