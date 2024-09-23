package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Transformerchainrefs {

    
    
    protected ArrayList<TransformerChainRef> transformerChainRefs;
    
    

    
    
    @XmlElement(name="TRANSFORMER-CHAIN-REF")
    public ArrayList<TransformerChainRef> getTransformerChainRefs() {
        return this.transformerChainRefs;
    }

    public void setTransformerChainRefs(ArrayList<TransformerChainRef> value) {
        this.transformerChainRefs = value;
    }
    
    
}