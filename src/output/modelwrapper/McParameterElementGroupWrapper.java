package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class McParameterElementGroupWrapper {

    
    private McParameterElementGroup mcParameterElementGroup;

    public McParameterElementGroupWrapper(McParameterElementGroup mcParameterElementGroup) {
        this.mcParameterElementGroup = mcParameterElementGroup;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(mcParameterElementGroup.getS())) {
            
            return mcParameterElementGroup.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(mcParameterElementGroup.getT())) {
            
            return mcParameterElementGroup.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(mcParameterElementGroup.getShortLabel())) {
            
            return new IdentifierWrapper(mcParameterElementGroup.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public RamLocationRefWrapper getRamLocationRef() {
        
        if (CollUtil.isNotEmpty(mcParameterElementGroup.getRamLocationRef())) {
            
            return new RamLocationRefWrapper(mcParameterElementGroup.getRamLocationRef());
            
        } else {
            return null;
        }
        
    }

    public RomLocationRefWrapper getRomLocationRef() {
        
        if (CollUtil.isNotEmpty(mcParameterElementGroup.getRomLocationRef())) {
            
            return new RomLocationRefWrapper(mcParameterElementGroup.getRomLocationRef());
            
        } else {
            return null;
        }
        
    }




    


    
}