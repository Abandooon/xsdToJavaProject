package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ContainerIPduHeaderTypeEnumWrapper {

    
    private ContainerIPduHeaderTypeEnum containerIPduHeaderTypeEnum;

    public ContainerIPduHeaderTypeEnumWrapper(ContainerIPduHeaderTypeEnum containerIPduHeaderTypeEnum) {
        this.containerIPduHeaderTypeEnum = containerIPduHeaderTypeEnum;
    }

   
    public ContainerIPduHeaderTypeEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(containerIPduHeaderTypeEnum.getValue())) {
            
            return containerIPduHeaderTypeEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(containerIPduHeaderTypeEnum.getS())) {
            
            return containerIPduHeaderTypeEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(containerIPduHeaderTypeEnum.getT())) {
            
            return containerIPduHeaderTypeEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}