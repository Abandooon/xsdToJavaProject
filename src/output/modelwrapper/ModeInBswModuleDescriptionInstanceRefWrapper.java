package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ModeInBswModuleDescriptionInstanceRefWrapper {

    
    private ModeInBswModuleDescriptionInstanceRef modeInBswModuleDescriptionInstanceRef;

    public ModeInBswModuleDescriptionInstanceRefWrapper(ModeInBswModuleDescriptionInstanceRef modeInBswModuleDescriptionInstanceRef) {
        this.modeInBswModuleDescriptionInstanceRef = modeInBswModuleDescriptionInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modeInBswModuleDescriptionInstanceRef.getS())) {
            
            return modeInBswModuleDescriptionInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modeInBswModuleDescriptionInstanceRef.getT())) {
            
            return modeInBswModuleDescriptionInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ContextModeDeclarationGroupRefWrapper getContextModeDeclarationGroupRef() {
        
        if (CollUtil.isNotEmpty(modeInBswModuleDescriptionInstanceRef.getContextModeDeclarationGroupRef())) {
            
            return new ContextModeDeclarationGroupRefWrapper(modeInBswModuleDescriptionInstanceRef.getContextModeDeclarationGroupRef());
            
        } else {
            return null;
        }
        
    }

    public TargetModeRefWrapper getTargetModeRef() {
        
        if (CollUtil.isNotEmpty(modeInBswModuleDescriptionInstanceRef.getTargetModeRef())) {
            
            return new TargetModeRefWrapper(modeInBswModuleDescriptionInstanceRef.getTargetModeRef());
            
        } else {
            return null;
        }
        
    }




    


    
}