package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class NvBlockDataMappingWrapper {

    
    private NvBlockDataMapping nvBlockDataMapping;

    public NvBlockDataMappingWrapper(NvBlockDataMapping nvBlockDataMapping) {
        this.nvBlockDataMapping = nvBlockDataMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(nvBlockDataMapping.getS())) {
            
            return nvBlockDataMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(nvBlockDataMapping.getT())) {
            
            return nvBlockDataMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public AutosarVariableRefWrapper getNvRamBlockElement() {
        
        if (CollUtil.isNotEmpty(nvBlockDataMapping.getNvRamBlockElement())) {
            
            return new AutosarVariableRefWrapper(nvBlockDataMapping.getNvRamBlockElement());
            
        } else {
            return null;
        }
        
    }

    public AutosarVariableRefWrapper getReadNvData() {
        
        if (CollUtil.isNotEmpty(nvBlockDataMapping.getReadNvData())) {
            
            return new AutosarVariableRefWrapper(nvBlockDataMapping.getReadNvData());
            
        } else {
            return null;
        }
        
    }

    public AutosarVariableRefWrapper getWrittenNvData() {
        
        if (CollUtil.isNotEmpty(nvBlockDataMapping.getWrittenNvData())) {
            
            return new AutosarVariableRefWrapper(nvBlockDataMapping.getWrittenNvData());
            
        } else {
            return null;
        }
        
    }

    public AutosarVariableRefWrapper getWrittenReadNvData() {
        
        if (CollUtil.isNotEmpty(nvBlockDataMapping.getWrittenReadNvData())) {
            
            return new AutosarVariableRefWrapper(nvBlockDataMapping.getWrittenReadNvData());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(nvBlockDataMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(nvBlockDataMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}