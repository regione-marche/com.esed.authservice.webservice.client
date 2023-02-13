/**
 * AuthServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.cedaf.authservice.service;

public class AuthServiceServiceLocator extends org.apache.axis.client.Service implements it.cedaf.authservice.service.AuthServiceService {

    public AuthServiceServiceLocator() {
    }


    public AuthServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AuthServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AuthService
    private java.lang.String AuthService_address = "https://spid.comune-online.it/AuthServiceSPID/services/AuthService";

    public java.lang.String getAuthServiceAddress() {
        return AuthService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AuthServiceWSDDServiceName = "AuthService";

    public java.lang.String getAuthServiceWSDDServiceName() {
        return AuthServiceWSDDServiceName;
    }

    public void setAuthServiceWSDDServiceName(java.lang.String name) {
        AuthServiceWSDDServiceName = name;
    }

    public it.cedaf.authservice.service.AuthService getAuthService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AuthService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAuthService(endpoint);
    }

    public it.cedaf.authservice.service.AuthService getAuthService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.cedaf.authservice.service.AuthServiceSoapBindingStub _stub = new it.cedaf.authservice.service.AuthServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAuthServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAuthServiceEndpointAddress(java.lang.String address) {
        AuthService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.cedaf.authservice.service.AuthService.class.isAssignableFrom(serviceEndpointInterface)) {
                it.cedaf.authservice.service.AuthServiceSoapBindingStub _stub = new it.cedaf.authservice.service.AuthServiceSoapBindingStub(new java.net.URL(AuthService_address), this);
                _stub.setPortName(getAuthServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AuthService".equals(inputPortName)) {
            return getAuthService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "AuthServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.authservice.cedaf.it", "AuthService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AuthService".equals(portName)) {
            setAuthServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
