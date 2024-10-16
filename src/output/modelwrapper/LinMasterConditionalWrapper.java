package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    


public class LinMasterConditionalWrapper {

    
    private LinMasterConditional linMasterConditional;

    public LinMasterConditionalWrapper(LinMasterConditional linMasterConditional) {
        this.linMasterConditional = linMasterConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(linMasterConditional.getS())) {
            
            return linMasterConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(linMasterConditional.getT())) {
            
            return linMasterConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getWakeUpByControllerSupported() {
        
        if (CollUtil.isNotEmpty(linMasterConditional.getWakeUpByControllerSupported())) {
            
            return new BooleanWrapper(linMasterConditional.getWakeUpByControllerSupported());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getProtocolVersion() {
        
        if (CollUtil.isNotEmpty(linMasterConditional.getProtocolVersion())) {
            
            return new StringWrapper(linMasterConditional.getProtocolVersion());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<LinSlaveConfigWrapper> getLinSlaves() {
        
        if (CollUtil.isNotEmpty(linMasterConditional.getLinSlaves())) {
            ArrayList<LinSlaveConfig> originalList = linMasterConditional.getLinSlaves();
            ArrayList<LinSlaveConfigWrapper> wrapperList = (ArrayList<LinSlaveConfigWrapper>)originalList.stream()
                .map(item -> new LinSlaveConfigWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeBase() {
        
        if (CollUtil.isNotEmpty(linMasterConditional.getTimeBase())) {
            
            return new TimeValueWrapper(linMasterConditional.getTimeBase());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeBaseJitter() {
        
        if (CollUtil.isNotEmpty(linMasterConditional.getTimeBaseJitter())) {
            
            return new TimeValueWrapper(linMasterConditional.getTimeBaseJitter());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(linMasterConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(linMasterConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}