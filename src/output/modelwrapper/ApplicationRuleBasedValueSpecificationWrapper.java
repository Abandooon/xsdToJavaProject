package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ApplicationRuleBasedValueSpecificationWrapper {

    
    private ApplicationRuleBasedValueSpecification applicationRuleBasedValueSpecification;

    public ApplicationRuleBasedValueSpecificationWrapper(ApplicationRuleBasedValueSpecification applicationRuleBasedValueSpecification) {
        this.applicationRuleBasedValueSpecification = applicationRuleBasedValueSpecification;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(applicationRuleBasedValueSpecification.getS())) {
            
            return applicationRuleBasedValueSpecification.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(applicationRuleBasedValueSpecification.getT())) {
            
            return applicationRuleBasedValueSpecification.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(applicationRuleBasedValueSpecification.getShortLabel())) {
            
            return new IdentifierWrapper(applicationRuleBasedValueSpecification.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(applicationRuleBasedValueSpecification.getVariationPoint())) {
            
            return new VariationPointWrapper(applicationRuleBasedValueSpecification.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(applicationRuleBasedValueSpecification.getCategory())) {
            
            return new IdentifierWrapper(applicationRuleBasedValueSpecification.getCategory());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RuleBasedAxisContWrapper> getSwAxisConts() {
        
        if (CollUtil.isNotEmpty(applicationRuleBasedValueSpecification.getSwAxisConts())) {
            ArrayList<RuleBasedAxisCont> originalList = applicationRuleBasedValueSpecification.getSwAxisConts();
            ArrayList<RuleBasedAxisContWrapper> wrapperList = (ArrayList<RuleBasedAxisContWrapper>)originalList.stream()
                .map(item -> new RuleBasedAxisContWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public RuleBasedValueContWrapper getSwValueCont() {
        
        if (CollUtil.isNotEmpty(applicationRuleBasedValueSpecification.getSwValueCont())) {
            
            return new RuleBasedValueContWrapper(applicationRuleBasedValueSpecification.getSwValueCont());
            
        } else {
            return null;
        }
        
    }




    


    
}