package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class ModeDeclarationGroupPrototypeMappingWrapper {

    
    private ModeDeclarationGroupPrototypeMapping modeDeclarationGroupPrototypeMapping;

    public ModeDeclarationGroupPrototypeMappingWrapper(ModeDeclarationGroupPrototypeMapping modeDeclarationGroupPrototypeMapping) {
        this.modeDeclarationGroupPrototypeMapping = modeDeclarationGroupPrototypeMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupPrototypeMapping.getS())) {
            
            return modeDeclarationGroupPrototypeMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupPrototypeMapping.getT())) {
            
            return modeDeclarationGroupPrototypeMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public FirstModeGroupRefWrapper getFirstModeGroupRef() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupPrototypeMapping.getFirstModeGroupRef())) {
            
            return new FirstModeGroupRefWrapper(modeDeclarationGroupPrototypeMapping.getFirstModeGroupRef());
            
        } else {
            return null;
        }
        
    }

    public ModeDeclarationMappingSetRefWrapper getModeDeclarationMappingSetRef() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupPrototypeMapping.getModeDeclarationMappingSetRef())) {
            
            return new ModeDeclarationMappingSetRefWrapper(modeDeclarationGroupPrototypeMapping.getModeDeclarationMappingSetRef());
            
        } else {
            return null;
        }
        
    }

    public SecondModeGroupRefWrapper getSecondModeGroupRef() {
        
        if (CollUtil.isNotEmpty(modeDeclarationGroupPrototypeMapping.getSecondModeGroupRef())) {
            
            return new SecondModeGroupRefWrapper(modeDeclarationGroupPrototypeMapping.getSecondModeGroupRef());
            
        } else {
            return null;
        }
        
    }




    


    
}