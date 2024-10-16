package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class LifeCycleInfoWrapper {

    
    private LifeCycleInfo lifeCycleInfo;

    public LifeCycleInfoWrapper(LifeCycleInfo lifeCycleInfo) {
        this.lifeCycleInfo = lifeCycleInfo;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfo.getS())) {
            
            return lifeCycleInfo.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfo.getT())) {
            
            return lifeCycleInfo.getT();
            
        } else {
            return null;
        }
        
    }

    public LcObjectRefWrapper getLcObjectRef() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfo.getLcObjectRef())) {
            
            return new LcObjectRefWrapper(lifeCycleInfo.getLcObjectRef());
            
        } else {
            return null;
        }
        
    }

    public LcStateRefWrapper getLcStateRef() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfo.getLcStateRef())) {
            
            return new LcStateRefWrapper(lifeCycleInfo.getLcStateRef());
            
        } else {
            return null;
        }
        
    }

    public LifeCyclePeriodWrapper getPeriodBegin() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfo.getPeriodBegin())) {
            
            return new LifeCyclePeriodWrapper(lifeCycleInfo.getPeriodBegin());
            
        } else {
            return null;
        }
        
    }

    public LifeCyclePeriodWrapper getPeriodEnd() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfo.getPeriodEnd())) {
            
            return new LifeCyclePeriodWrapper(lifeCycleInfo.getPeriodEnd());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getRemark() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfo.getRemark())) {
            
            return new DocumentationBlockWrapper(lifeCycleInfo.getRemark());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<UseInsteadRefWrapper> getUseInsteadRefs() {
        
        if (CollUtil.isNotEmpty(lifeCycleInfo.getUseInsteadRefs())) {
            ArrayList<UseInsteadRef> originalList = lifeCycleInfo.getUseInsteadRefs();
            ArrayList<UseInsteadRefWrapper> wrapperList = (ArrayList<UseInsteadRefWrapper>)originalList.stream()
                .map(item -> new UseInsteadRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}