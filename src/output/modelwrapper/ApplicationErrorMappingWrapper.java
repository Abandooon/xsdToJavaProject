package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ApplicationErrorMappingWrapper {

    
    private ApplicationErrorMapping applicationErrorMapping;

    public ApplicationErrorMappingWrapper(ApplicationErrorMapping applicationErrorMapping) {
        this.applicationErrorMapping = applicationErrorMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(applicationErrorMapping.getS())) {
            
            return applicationErrorMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(applicationErrorMapping.getT())) {
            
            return applicationErrorMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public SystemSignalRefWrapper getSystemSignalRef() {
        
        if (CollUtil.isNotEmpty(applicationErrorMapping.getSystemSignalRef())) {
            
            return new SystemSignalRefWrapper(applicationErrorMapping.getSystemSignalRef());
            
        } else {
            return null;
        }
        
    }




    


    
}