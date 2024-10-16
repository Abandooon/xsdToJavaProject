package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class CyclicTimingWrapper {

    
    private CyclicTiming cyclicTiming;

    public CyclicTimingWrapper(CyclicTiming cyclicTiming) {
        this.cyclicTiming = cyclicTiming;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(cyclicTiming.getS())) {
            
            return cyclicTiming.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(cyclicTiming.getT())) {
            
            return cyclicTiming.getT();
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(cyclicTiming.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(cyclicTiming.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(cyclicTiming.getCategory())) {
            
            return new CategoryStringWrapper(cyclicTiming.getCategory());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(cyclicTiming.getIntroduction())) {
            
            return new DocumentationBlockWrapper(cyclicTiming.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(cyclicTiming.getAdminData())) {
            
            return new AdminDataWrapper(cyclicTiming.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public TimeRangeTypeWrapper getTimeOffset() {
        
        if (CollUtil.isNotEmpty(cyclicTiming.getTimeOffset())) {
            
            return new TimeRangeTypeWrapper(cyclicTiming.getTimeOffset());
            
        } else {
            return null;
        }
        
    }

    public TimeRangeTypeWrapper getTimePeriod() {
        
        if (CollUtil.isNotEmpty(cyclicTiming.getTimePeriod())) {
            
            return new TimeRangeTypeWrapper(cyclicTiming.getTimePeriod());
            
        } else {
            return null;
        }
        
    }




    


    
}