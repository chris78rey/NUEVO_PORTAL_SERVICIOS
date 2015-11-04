/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.mil.he1.pom_04_portalservicios;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import java.io.Serializable;

/**
 *
 * @author christian_ruiz
 */
@Named(value="newJSFManagedBean")
@Dependent
public class NewJSFManagedBean implements Serializable {
    private static final long serialVersionUID = -2636895732645928866L;

    /** Creates a new instance of NewJSFManagedBean */
    public NewJSFManagedBean() {
    }

}
