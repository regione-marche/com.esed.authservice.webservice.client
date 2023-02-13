/**
 * AuthServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.cedaf.authservice.service;

public interface AuthServiceService extends javax.xml.rpc.Service {
    public java.lang.String getAuthServiceAddress();

    public it.cedaf.authservice.service.AuthService getAuthService() throws javax.xml.rpc.ServiceException;

    public it.cedaf.authservice.service.AuthService getAuthService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
