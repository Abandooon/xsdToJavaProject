package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class TargetIPduRefWrapper {

    
    private TargetIPduRef targetIPduRef;

    public TargetIPduRefWrapper(TargetIPduRef targetIPduRef) {
        this.targetIPduRef = targetIPduRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(targetIPduRef.getS())) {
            
            return targetIPduRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(targetIPduRef.getT())) {
            
            return targetIPduRef.getT();
            
        } else {
            return null;
        }
        
    }

    public PduMappingDefaultValueWrapper getDefaultValue() {
        
        if (CollUtil.isNotEmpty(targetIPduRef.getDefaultValue())) {
            
            return new PduMappingDefaultValueWrapper(targetIPduRef.getDefaultValue());
            
        } else {
            return null;
        }
        
    }

    public TargetIPduRefWrapper getTargetIPduRef() {
        
        if (CollUtil.isNotEmpty(targetIPduRef.getTargetIPduRef())) {
            
            return new TargetIPduRefWrapper(targetIPduRef.getTargetIPduRef());
            
        } else {
            return null;
        }
        
    }




    


    
}