package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class PerInstanceMemorySizeWrapper {

    
    private PerInstanceMemorySize perInstanceMemorySize;

    public PerInstanceMemorySizeWrapper(PerInstanceMemorySize perInstanceMemorySize) {
        this.perInstanceMemorySize = perInstanceMemorySize;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(perInstanceMemorySize.getS())) {
            
            return perInstanceMemorySize.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(perInstanceMemorySize.getT())) {
            
            return perInstanceMemorySize.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getAlignment() {
        
        if (CollUtil.isNotEmpty(perInstanceMemorySize.getAlignment())) {
            
            return new PositiveIntegerWrapper(perInstanceMemorySize.getAlignment());
            
        } else {
            return null;
        }
        
    }

    public PerInstanceMemoryRefWrapper getPerInstanceMemoryRef() {
        
        if (CollUtil.isNotEmpty(perInstanceMemorySize.getPerInstanceMemoryRef())) {
            
            return new PerInstanceMemoryRefWrapper(perInstanceMemorySize.getPerInstanceMemoryRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getSize() {
        
        if (CollUtil.isNotEmpty(perInstanceMemorySize.getSize())) {
            
            return new PositiveIntegerValueVariationPointWrapper(perInstanceMemorySize.getSize());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(perInstanceMemorySize.getVariationPoint())) {
            
            return new VariationPointWrapper(perInstanceMemorySize.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}