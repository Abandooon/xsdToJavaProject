package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class FrameMappingWrapper {

    
    private FrameMapping frameMapping;

    public FrameMappingWrapper(FrameMapping frameMapping) {
        this.frameMapping = frameMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(frameMapping.getS())) {
            
            return frameMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(frameMapping.getT())) {
            
            return frameMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(frameMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(frameMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public SourceFrameRefWrapper getSourceFrameRef() {
        
        if (CollUtil.isNotEmpty(frameMapping.getSourceFrameRef())) {
            
            return new SourceFrameRefWrapper(frameMapping.getSourceFrameRef());
            
        } else {
            return null;
        }
        
    }

    public TargetFrameRefWrapper getTargetFrameRef() {
        
        if (CollUtil.isNotEmpty(frameMapping.getTargetFrameRef())) {
            
            return new TargetFrameRefWrapper(frameMapping.getTargetFrameRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(frameMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(frameMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}