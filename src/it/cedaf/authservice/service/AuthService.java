/**
 * AuthService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.cedaf.authservice.service;

public interface AuthService extends java.rmi.Remote {
    public java.lang.String getAuthId() throws java.rmi.RemoteException, it.cedaf.authservice.service.AuthException;
    public it.cedaf.authservice.service.AuthData retrieveUserData(java.lang.String authId) throws java.rmi.RemoteException, it.cedaf.authservice.service.AuthException;
    public it.cedaf.authservice.service.AuthDataV2 retrieveUserDataV2(java.lang.String authId) throws java.rmi.RemoteException, it.cedaf.authservice.service.AuthException;
    public boolean revalidateUserData(it.cedaf.authservice.service.AuthData authData) throws java.rmi.RemoteException, it.cedaf.authservice.service.AuthException;
    public java.lang.String singleSignOut(java.lang.String authId) throws java.rmi.RemoteException, it.cedaf.authservice.service.AuthException;
}
