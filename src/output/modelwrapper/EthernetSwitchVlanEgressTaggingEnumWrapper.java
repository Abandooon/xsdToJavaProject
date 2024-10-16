package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class EthernetSwitchVlanEgressTaggingEnumWrapper {

    
    private EthernetSwitchVlanEgressTaggingEnum ethernetSwitchVlanEgressTaggingEnum;

    public EthernetSwitchVlanEgressTaggingEnumWrapper(EthernetSwitchVlanEgressTaggingEnum ethernetSwitchVlanEgressTaggingEnum) {
        this.ethernetSwitchVlanEgressTaggingEnum = ethernetSwitchVlanEgressTaggingEnum;
    }

   
    public EthernetSwitchVlanEgressTaggingEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(ethernetSwitchVlanEgressTaggingEnum.getValue())) {
            
            return ethernetSwitchVlanEgressTaggingEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ethernetSwitchVlanEgressTaggingEnum.getS())) {
            
            return ethernetSwitchVlanEgressTaggingEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ethernetSwitchVlanEgressTaggingEnum.getT())) {
            
            return ethernetSwitchVlanEgressTaggingEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}