package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class RuleBasedValueSpecificationWrapper {

    
    private RuleBasedValueSpecification ruleBasedValueSpecification;

    public RuleBasedValueSpecificationWrapper(RuleBasedValueSpecification ruleBasedValueSpecification) {
        this.ruleBasedValueSpecification = ruleBasedValueSpecification;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ruleBasedValueSpecification.getS())) {
            
            return ruleBasedValueSpecification.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ruleBasedValueSpecification.getT())) {
            
            return ruleBasedValueSpecification.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getRule() {
        
        if (CollUtil.isNotEmpty(ruleBasedValueSpecification.getRule())) {
            
            return new IdentifierWrapper(ruleBasedValueSpecification.getRule());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RuleArgumentsWrapper> getArgumentss() {
        
        if (CollUtil.isNotEmpty(ruleBasedValueSpecification.getArgumentss())) {
            ArrayList<RuleArguments> originalList = ruleBasedValueSpecification.getArgumentss();
            ArrayList<RuleArgumentsWrapper> wrapperList = (ArrayList<RuleArgumentsWrapper>)originalList.stream()
                .map(item -> new RuleArgumentsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaxSizeToFill() {
        
        if (CollUtil.isNotEmpty(ruleBasedValueSpecification.getMaxSizeToFill())) {
            
            return new IntegerWrapper(ruleBasedValueSpecification.getMaxSizeToFill());
            
        } else {
            return null;
        }
        
    }




    


    
}