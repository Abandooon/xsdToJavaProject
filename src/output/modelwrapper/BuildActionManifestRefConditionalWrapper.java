package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class BuildActionManifestRefConditionalWrapper {

    
    private BuildActionManifestRefConditional buildActionManifestRefConditional;

    public BuildActionManifestRefConditionalWrapper(BuildActionManifestRefConditional buildActionManifestRefConditional) {
        this.buildActionManifestRefConditional = buildActionManifestRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(buildActionManifestRefConditional.getS())) {
            
            return buildActionManifestRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(buildActionManifestRefConditional.getT())) {
            
            return buildActionManifestRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public BuildActionManifestRefWrapper getBuildActionManifestRef() {
        
        if (CollUtil.isNotEmpty(buildActionManifestRefConditional.getBuildActionManifestRef())) {
            
            return new BuildActionManifestRefWrapper(buildActionManifestRefConditional.getBuildActionManifestRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(buildActionManifestRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(buildActionManifestRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}