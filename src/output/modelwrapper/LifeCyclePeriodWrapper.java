package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Date;
    

    
    

    
    


public class LifeCyclePeriodWrapper {

    
    private LifeCyclePeriod lifeCyclePeriod;

    public LifeCyclePeriodWrapper(LifeCyclePeriod lifeCyclePeriod) {
        this.lifeCyclePeriod = lifeCyclePeriod;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(lifeCyclePeriod.getS())) {
            
            return lifeCyclePeriod.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(lifeCyclePeriod.getT())) {
            
            return lifeCyclePeriod.getT();
            
        } else {
            return null;
        }
        
    }

    public DateWrapper getDate() {
        
        if (CollUtil.isNotEmpty(lifeCyclePeriod.getDate())) {
            
            return new DateWrapper(lifeCyclePeriod.getDate());
            
        } else {
            return null;
        }
        
    }

    public RevisionLabelStringWrapper getArReleaseVersion() {
        
        if (CollUtil.isNotEmpty(lifeCyclePeriod.getArReleaseVersion())) {
            
            return new RevisionLabelStringWrapper(lifeCyclePeriod.getArReleaseVersion());
            
        } else {
            return null;
        }
        
    }

    public RevisionLabelStringWrapper getProductRelease() {
        
        if (CollUtil.isNotEmpty(lifeCyclePeriod.getProductRelease())) {
            
            return new RevisionLabelStringWrapper(lifeCyclePeriod.getProductRelease());
            
        } else {
            return null;
        }
        
    }




    


    
}