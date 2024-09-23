package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Tpconnectioncontrols {

    
    
    protected ArrayList<FlexrayTpConnectionControl> flexrayTpConnectionControls;
    
    

    
    
    @XmlElement(name="FLEXRAY-TP-CONNECTION-CONTROL")
    public ArrayList<FlexrayTpConnectionControl> getFlexrayTpConnectionControls() {
        return this.flexrayTpConnectionControls;
    }

    public void setFlexrayTpConnectionControls(ArrayList<FlexrayTpConnectionControl> value) {
        this.flexrayTpConnectionControls = value;
    }
    
    
}