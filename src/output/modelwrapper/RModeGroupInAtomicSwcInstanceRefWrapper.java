package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class RModeGroupInAtomicSwcInstanceRefWrapper {

    
    private RModeGroupInAtomicSwcInstanceRef rModeGroupInAtomicSwcInstanceRef;

    public RModeGroupInAtomicSwcInstanceRefWrapper(RModeGroupInAtomicSwcInstanceRef rModeGroupInAtomicSwcInstanceRef) {
        this.rModeGroupInAtomicSwcInstanceRef = rModeGroupInAtomicSwcInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(rModeGroupInAtomicSwcInstanceRef.getS())) {
            
            return rModeGroupInAtomicSwcInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(rModeGroupInAtomicSwcInstanceRef.getT())) {
            
            return rModeGroupInAtomicSwcInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ContextRPortRefWrapper getContextRPortRef() {
        
        if (CollUtil.isNotEmpty(rModeGroupInAtomicSwcInstanceRef.getContextRPortRef())) {
            
            return new ContextRPortRefWrapper(rModeGroupInAtomicSwcInstanceRef.getContextRPortRef());
            
        } else {
            return null;
        }
        
    }

    public TargetModeGroupRefWrapper getTargetModeGroupRef() {
        
        if (CollUtil.isNotEmpty(rModeGroupInAtomicSwcInstanceRef.getTargetModeGroupRef())) {
            
            return new TargetModeGroupRefWrapper(rModeGroupInAtomicSwcInstanceRef.getTargetModeGroupRef());
            
        } else {
            return null;
        }
        
    }




    


    
}