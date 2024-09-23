package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Txnmpdurefs {

    
    
    protected ArrayList<TxNmPduRef> txNmPduRefs;
    
    

    
    
    @XmlElement(name="TX-NM-PDU-REF")
    public ArrayList<TxNmPduRef> getTxNmPduRefs() {
        return this.txNmPduRefs;
    }

    public void setTxNmPduRefs(ArrayList<TxNmPduRef> value) {
        this.txNmPduRefs = value;
    }
    
    
}