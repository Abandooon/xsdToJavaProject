package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class IPduTimingWrapper {

    
    private IPduTiming iPduTiming;

    public IPduTimingWrapper(IPduTiming iPduTiming) {
        this.iPduTiming = iPduTiming;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(iPduTiming.getS())) {
            
            return iPduTiming.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(iPduTiming.getT())) {
            
            return iPduTiming.getT();
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(iPduTiming.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(iPduTiming.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(iPduTiming.getCategory())) {
            
            return new CategoryStringWrapper(iPduTiming.getCategory());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(iPduTiming.getIntroduction())) {
            
            return new DocumentationBlockWrapper(iPduTiming.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(iPduTiming.getAdminData())) {
            
            return new AdminDataWrapper(iPduTiming.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getMinimumDelay() {
        
        if (CollUtil.isNotEmpty(iPduTiming.getMinimumDelay())) {
            
            return new TimeValueWrapper(iPduTiming.getMinimumDelay());
            
        } else {
            return null;
        }
        
    }

    public TransmissionModeDeclarationWrapper getTransmissionModeDeclaration() {
        
        if (CollUtil.isNotEmpty(iPduTiming.getTransmissionModeDeclaration())) {
            
            return new TransmissionModeDeclarationWrapper(iPduTiming.getTransmissionModeDeclaration());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(iPduTiming.getVariationPoint())) {
            
            return new VariationPointWrapper(iPduTiming.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}