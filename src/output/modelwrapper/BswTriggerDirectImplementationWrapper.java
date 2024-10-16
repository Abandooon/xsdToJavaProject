package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class BswTriggerDirectImplementationWrapper {

    
    private BswTriggerDirectImplementation bswTriggerDirectImplementation;

    public BswTriggerDirectImplementationWrapper(BswTriggerDirectImplementation bswTriggerDirectImplementation) {
        this.bswTriggerDirectImplementation = bswTriggerDirectImplementation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswTriggerDirectImplementation.getS())) {
            
            return bswTriggerDirectImplementation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswTriggerDirectImplementation.getT())) {
            
            return bswTriggerDirectImplementation.getT();
            
        } else {
            return null;
        }
        
    }

    public MasteredTriggerRefWrapper getMasteredTriggerRef() {
        
        if (CollUtil.isNotEmpty(bswTriggerDirectImplementation.getMasteredTriggerRef())) {
            
            return new MasteredTriggerRefWrapper(bswTriggerDirectImplementation.getMasteredTriggerRef());
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getTask() {
        
        if (CollUtil.isNotEmpty(bswTriggerDirectImplementation.getTask())) {
            
            return new IdentifierWrapper(bswTriggerDirectImplementation.getTask());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswTriggerDirectImplementation.getVariationPoint())) {
            
            return new VariationPointWrapper(bswTriggerDirectImplementation.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}