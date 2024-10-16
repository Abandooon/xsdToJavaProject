package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class RModeInAtomicSwcInstanceRefWrapper {

    
    private RModeInAtomicSwcInstanceRef rModeInAtomicSwcInstanceRef;

    public RModeInAtomicSwcInstanceRefWrapper(RModeInAtomicSwcInstanceRef rModeInAtomicSwcInstanceRef) {
        this.rModeInAtomicSwcInstanceRef = rModeInAtomicSwcInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(rModeInAtomicSwcInstanceRef.getS())) {
            
            return rModeInAtomicSwcInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(rModeInAtomicSwcInstanceRef.getT())) {
            
            return rModeInAtomicSwcInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ContextPortRef_RModeInAtomicSwcInstanceRefWrapper getContextPortRef() {
        
        if (CollUtil.isNotEmpty(rModeInAtomicSwcInstanceRef.getContextPortRef())) {
            
            return new ContextPortRef_RModeInAtomicSwcInstanceRefWrapper(rModeInAtomicSwcInstanceRef.getContextPortRef());
            
        } else {
            return null;
        }
        
    }

    public ContextModeDeclarationGroupPrototypeRefWrapper getContextModeDeclarationGroupPrototypeRef() {
        
        if (CollUtil.isNotEmpty(rModeInAtomicSwcInstanceRef.getContextModeDeclarationGroupPrototypeRef())) {
            
            return new ContextModeDeclarationGroupPrototypeRefWrapper(rModeInAtomicSwcInstanceRef.getContextModeDeclarationGroupPrototypeRef());
            
        } else {
            return null;
        }
        
    }

    public TargetModeDeclarationRefWrapper getTargetModeDeclarationRef() {
        
        if (CollUtil.isNotEmpty(rModeInAtomicSwcInstanceRef.getTargetModeDeclarationRef())) {
            
            return new TargetModeDeclarationRefWrapper(rModeInAtomicSwcInstanceRef.getTargetModeDeclarationRef());
            
        } else {
            return null;
        }
        
    }




    


    
}