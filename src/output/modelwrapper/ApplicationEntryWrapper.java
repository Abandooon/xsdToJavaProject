package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class ApplicationEntryWrapper {

    
    private ApplicationEntry applicationEntry;

    public ApplicationEntryWrapper(ApplicationEntry applicationEntry) {
        this.applicationEntry = applicationEntry;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(applicationEntry.getS())) {
            
            return applicationEntry.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(applicationEntry.getT())) {
            
            return applicationEntry.getT();
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(applicationEntry.getIntroduction())) {
            
            return new DocumentationBlockWrapper(applicationEntry.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getDelay() {
        
        if (CollUtil.isNotEmpty(applicationEntry.getDelay())) {
            
            return new TimeValueWrapper(applicationEntry.getDelay());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getPositionInTable() {
        
        if (CollUtil.isNotEmpty(applicationEntry.getPositionInTable())) {
            
            return new IntegerWrapper(applicationEntry.getPositionInTable());
            
        } else {
            return null;
        }
        
    }

    public FrameTriggeringRefWrapper getFrameTriggeringRef() {
        
        if (CollUtil.isNotEmpty(applicationEntry.getFrameTriggeringRef())) {
            
            return new FrameTriggeringRefWrapper(applicationEntry.getFrameTriggeringRef());
            
        } else {
            return null;
        }
        
    }




    


    
}