package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class ISignalMappingWrapper {

    
    private ISignalMapping iSignalMapping;

    public ISignalMappingWrapper(ISignalMapping iSignalMapping) {
        this.iSignalMapping = iSignalMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(iSignalMapping.getS())) {
            
            return iSignalMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(iSignalMapping.getT())) {
            
            return iSignalMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(iSignalMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(iSignalMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public SourceSignalRefWrapper getSourceSignalRef() {
        
        if (CollUtil.isNotEmpty(iSignalMapping.getSourceSignalRef())) {
            
            return new SourceSignalRefWrapper(iSignalMapping.getSourceSignalRef());
            
        } else {
            return null;
        }
        
    }

    public TargetSignalRefWrapper getTargetSignalRef() {
        
        if (CollUtil.isNotEmpty(iSignalMapping.getTargetSignalRef())) {
            
            return new TargetSignalRefWrapper(iSignalMapping.getTargetSignalRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(iSignalMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(iSignalMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}