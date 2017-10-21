package com.jf.sms.eucp;

public interface SDKClient extends java.rmi.Remote {
    String getVersion() throws java.rmi.RemoteException;
    StatusReport[] getReport(String arg0, String arg1) throws java.rmi.RemoteException;
    int cancelMOForward(String arg0, String arg1) throws java.rmi.RemoteException;
    int chargeUp(String arg0, String arg1, String arg2, String arg3) throws java.rmi.RemoteException;
    double getBalance(String arg0, String arg1) throws java.rmi.RemoteException;
    double getEachFee(String arg0, String arg1) throws java.rmi.RemoteException;
    Mo[] getMO(String arg0, String arg1) throws java.rmi.RemoteException;
    int logout(String arg0, String arg1) throws java.rmi.RemoteException;
    int registDetailInfo(String arg0, String arg1, String arg2, String arg3,
                         String arg4, String arg5, String arg6, String arg7,
                         String arg8, String arg9) throws java.rmi.RemoteException;
    int registEx(String arg0, String arg1, String arg2) throws java.rmi.RemoteException;
    int sendSMS(String arg0, String arg1, String arg2, String[] arg3, String arg4, String arg5, String arg6, int
            arg7, long arg8) throws java.rmi.RemoteException;
    String sendVoice(String arg0, String arg1, String arg2, String[] arg3, String arg4, String arg5, String arg6, int arg7, long arg8) throws java.rmi.RemoteException;
    int serialPwdUpd(String arg0, String arg1, String arg2, String arg3) throws java.rmi.RemoteException;
    int setMOForward(String arg0, String arg1, String arg2) throws java.rmi.RemoteException;
    int setMOForwardEx(String arg0, String arg1, String[] arg2) throws java.rmi.RemoteException;
}
