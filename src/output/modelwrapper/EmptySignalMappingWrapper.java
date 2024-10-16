package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class EmptySignalMappingWrapper {

    
    private EmptySignalMapping emptySignalMapping;

    public EmptySignalMappingWrapper(EmptySignalMapping emptySignalMapping) {
        this.emptySignalMapping = emptySignalMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(emptySignalMapping.getS())) {
            
            return emptySignalMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(emptySignalMapping.getT())) {
            
            return emptySignalMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public SystemSignalRefWrapper getSystemSignalRef() {
        
        if (CollUtil.isNotEmpty(emptySignalMapping.getSystemSignalRef())) {
            
            return new SystemSignalRefWrapper(emptySignalMapping.getSystemSignalRef());
            
        } else {
            return null;
        }
        
    }




    


    
}