package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ContainerIPduTriggerEnumWrapper {

    
    private ContainerIPduTriggerEnum containerIPduTriggerEnum;

    public ContainerIPduTriggerEnumWrapper(ContainerIPduTriggerEnum containerIPduTriggerEnum) {
        this.containerIPduTriggerEnum = containerIPduTriggerEnum;
    }

   
    public ContainerIPduTriggerEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(containerIPduTriggerEnum.getValue())) {
            
            return containerIPduTriggerEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(containerIPduTriggerEnum.getS())) {
            
            return containerIPduTriggerEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(containerIPduTriggerEnum.getT())) {
            
            return containerIPduTriggerEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}