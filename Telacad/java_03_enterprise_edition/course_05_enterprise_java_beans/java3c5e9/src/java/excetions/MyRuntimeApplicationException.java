/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excetions;

import javax.ejb.ApplicationException;

/**
 *
 * @author robert
 */
@ApplicationException(rollback = true)
public class MyRuntimeApplicationException extends RuntimeException {
    
}
