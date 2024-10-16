package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class PModeGroupInAtomicSwcInstanceRefWrapper {

    
    private PModeGroupInAtomicSwcInstanceRef pModeGroupInAtomicSwcInstanceRef;

    public PModeGroupInAtomicSwcInstanceRefWrapper(PModeGroupInAtomicSwcInstanceRef pModeGroupInAtomicSwcInstanceRef) {
        this.pModeGroupInAtomicSwcInstanceRef = pModeGroupInAtomicSwcInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(pModeGroupInAtomicSwcInstanceRef.getS())) {
            
            return pModeGroupInAtomicSwcInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(pModeGroupInAtomicSwcInstanceRef.getT())) {
            
            return pModeGroupInAtomicSwcInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ContextPPortRefWrapper getContextPPortRef() {
        
        if (CollUtil.isNotEmpty(pModeGroupInAtomicSwcInstanceRef.getContextPPortRef())) {
            
            return new ContextPPortRefWrapper(pModeGroupInAtomicSwcInstanceRef.getContextPPortRef());
            
        } else {
            return null;
        }
        
    }

    public TargetModeGroupRefWrapper getTargetModeGroupRef() {
        
        if (CollUtil.isNotEmpty(pModeGroupInAtomicSwcInstanceRef.getTargetModeGroupRef())) {
            
            return new TargetModeGroupRefWrapper(pModeGroupInAtomicSwcInstanceRef.getTargetModeGroupRef());
            
        } else {
            return null;
        }
        
    }




    


    
}