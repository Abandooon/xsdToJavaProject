package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ContainedIPduPropsWrapper {

    
    private ContainedIPduProps containedIPduProps;

    public ContainedIPduPropsWrapper(ContainedIPduProps containedIPduProps) {
        this.containedIPduProps = containedIPduProps;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(containedIPduProps.getS())) {
            
            return containedIPduProps.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(containedIPduProps.getT())) {
            
            return containedIPduProps.getT();
            
        } else {
            return null;
        }
        
    }

    public ContainedIPduCollectionSemanticsEnumWrapper getCollectionSemantics() {
        
        if (CollUtil.isNotEmpty(containedIPduProps.getCollectionSemantics())) {
            
            return new ContainedIPduCollectionSemanticsEnumWrapper(containedIPduProps.getCollectionSemantics());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getHeaderIdLongHeader() {
        
        if (CollUtil.isNotEmpty(containedIPduProps.getHeaderIdLongHeader())) {
            
            return new PositiveIntegerWrapper(containedIPduProps.getHeaderIdLongHeader());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getHeaderIdShortHeader() {
        
        if (CollUtil.isNotEmpty(containedIPduProps.getHeaderIdShortHeader())) {
            
            return new PositiveIntegerWrapper(containedIPduProps.getHeaderIdShortHeader());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeout() {
        
        if (CollUtil.isNotEmpty(containedIPduProps.getTimeout())) {
            
            return new TimeValueWrapper(containedIPduProps.getTimeout());
            
        } else {
            return null;
        }
        
    }

    public PduCollectionTriggerEnumWrapper getTrigger() {
        
        if (CollUtil.isNotEmpty(containedIPduProps.getTrigger())) {
            
            return new PduCollectionTriggerEnumWrapper(containedIPduProps.getTrigger());
            
        } else {
            return null;
        }
        
    }




    


    
}