package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class EventControlledTimingWrapper {

    
    private EventControlledTiming eventControlledTiming;

    public EventControlledTimingWrapper(EventControlledTiming eventControlledTiming) {
        this.eventControlledTiming = eventControlledTiming;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(eventControlledTiming.getS())) {
            
            return eventControlledTiming.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(eventControlledTiming.getT())) {
            
            return eventControlledTiming.getT();
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(eventControlledTiming.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(eventControlledTiming.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(eventControlledTiming.getCategory())) {
            
            return new CategoryStringWrapper(eventControlledTiming.getCategory());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(eventControlledTiming.getIntroduction())) {
            
            return new DocumentationBlockWrapper(eventControlledTiming.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(eventControlledTiming.getAdminData())) {
            
            return new AdminDataWrapper(eventControlledTiming.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getNumberOfRepetitions() {
        
        if (CollUtil.isNotEmpty(eventControlledTiming.getNumberOfRepetitions())) {
            
            return new IntegerWrapper(eventControlledTiming.getNumberOfRepetitions());
            
        } else {
            return null;
        }
        
    }

    public TimeRangeTypeWrapper getRepetitionPeriod() {
        
        if (CollUtil.isNotEmpty(eventControlledTiming.getRepetitionPeriod())) {
            
            return new TimeRangeTypeWrapper(eventControlledTiming.getRepetitionPeriod());
            
        } else {
            return null;
        }
        
    }




    


    
}