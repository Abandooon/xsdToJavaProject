package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class IPduMappingWrapper {

    
    private IPduMapping iPduMapping;

    public IPduMappingWrapper(IPduMapping iPduMapping) {
        this.iPduMapping = iPduMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(iPduMapping.getS())) {
            
            return iPduMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(iPduMapping.getT())) {
            
            return iPduMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(iPduMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(iPduMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getPdurTpChunkSize() {
        
        if (CollUtil.isNotEmpty(iPduMapping.getPdurTpChunkSize())) {
            
            return new PositiveIntegerWrapper(iPduMapping.getPdurTpChunkSize());
            
        } else {
            return null;
        }
        
    }

    public SourceIPduRefWrapper getSourceIPduRef() {
        
        if (CollUtil.isNotEmpty(iPduMapping.getSourceIPduRef())) {
            
            return new SourceIPduRefWrapper(iPduMapping.getSourceIPduRef());
            
        } else {
            return null;
        }
        
    }

    public TargetIPduRefWrapper getTargetIPdu() {
        
        if (CollUtil.isNotEmpty(iPduMapping.getTargetIPdu())) {
            
            return new TargetIPduRefWrapper(iPduMapping.getTargetIPdu());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(iPduMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(iPduMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}