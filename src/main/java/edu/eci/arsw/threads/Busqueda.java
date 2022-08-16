package edu.eci.arsw.threads;

import edu.eci.arsw.blacklistvalidator.HostBlackListsValidator;
import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;

import java.util.LinkedList;

public class Busqueda extends Thread{

    private String ipaddress;
    private HostBlacklistsDataSourceFacade skds=HostBlacklistsDataSourceFacade.getInstance();
    private int lastip;
    private int firstip;
    LinkedList<Integer> blackListOcurrences=new LinkedList<>();
    private int ocurrencesCount = 0;
    private int checkedListsCount;


    public Busqueda(String ipaddress, int firstip, int lastip){
        this.ipaddress=ipaddress;
        this.lastip=lastip;
        this.firstip=firstip;
    }
    public void run(){
        for(int i = firstip;i<lastip && ocurrencesCount< HostBlackListsValidator.BLACK_LIST_ALARM_COUNT;i++){
            checkedListsCount++;

            if (skds.isInBlackListServer(i, ipaddress)){
                blackListOcurrences.add(i);
                ocurrencesCount++;

            }
        }
//        if (ocurrencesCount>=HostBlackListsValidator.BLACK_LIST_ALARM_COUNT){
//            skds.reportAsNotTrustworthy(ipaddress);
//        }
//        else{
//            skds.reportAsTrustworthy(ipaddress);
//        }
    }

    public LinkedList<Integer> getBlackListOcurrences() {
        return blackListOcurrences;
    }

    public int getOcurrencesCount() {
        return ocurrencesCount;
    }

    public int getCheckedListsCount() {
        return checkedListsCount;
    }
}
