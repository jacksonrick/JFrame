package com.jf.sms.eucp;

public interface SDKService extends javax.xml.rpc.Service {
    String getSDKServiceAddress();

    SDKClient getSDKService() throws javax.xml.rpc.ServiceException;

    SDKClient getSDKService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
