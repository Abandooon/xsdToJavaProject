package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class SwcBswRunnableMappingWrapper {

    
    private SwcBswRunnableMapping swcBswRunnableMapping;

    public SwcBswRunnableMappingWrapper(SwcBswRunnableMapping swcBswRunnableMapping) {
        this.swcBswRunnableMapping = swcBswRunnableMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swcBswRunnableMapping.getS())) {
            
            return swcBswRunnableMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swcBswRunnableMapping.getT())) {
            
            return swcBswRunnableMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public BswEntityRefWrapper getBswEntityRef() {
        
        if (CollUtil.isNotEmpty(swcBswRunnableMapping.getBswEntityRef())) {
            
            return new BswEntityRefWrapper(swcBswRunnableMapping.getBswEntityRef());
            
        } else {
            return null;
        }
        
    }

    public SwcRunnableRefWrapper getSwcRunnableRef() {
        
        if (CollUtil.isNotEmpty(swcBswRunnableMapping.getSwcRunnableRef())) {
            
            return new SwcRunnableRefWrapper(swcBswRunnableMapping.getSwcRunnableRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(swcBswRunnableMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(swcBswRunnableMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}