package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class EthernetCouplingPortSchedulerEnumWrapper {

    
    private EthernetCouplingPortSchedulerEnum ethernetCouplingPortSchedulerEnum;

    public EthernetCouplingPortSchedulerEnumWrapper(EthernetCouplingPortSchedulerEnum ethernetCouplingPortSchedulerEnum) {
        this.ethernetCouplingPortSchedulerEnum = ethernetCouplingPortSchedulerEnum;
    }

   
    public EthernetCouplingPortSchedulerEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(ethernetCouplingPortSchedulerEnum.getValue())) {
            
            return ethernetCouplingPortSchedulerEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ethernetCouplingPortSchedulerEnum.getS())) {
            
            return ethernetCouplingPortSchedulerEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ethernetCouplingPortSchedulerEnum.getT())) {
            
            return ethernetCouplingPortSchedulerEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}