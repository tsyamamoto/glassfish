
package test;

import javax.ejb.*;
import java.rmi.*;

/**
 * @author mvatkina
 */

public interface A1 extends javax.ejb.EJBObject {

    public String getShortName() throws RemoteException; 

    public String getDescription() throws RemoteException; 

}

