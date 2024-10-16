package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class RuleArgumentsWrapper {

    
    private RuleArguments ruleArguments;

    public RuleArgumentsWrapper(RuleArguments ruleArguments) {
        this.ruleArguments = ruleArguments;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ruleArguments.getS())) {
            
            return ruleArguments.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ruleArguments.getT())) {
            
            return ruleArguments.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<NumericalValueWrapper> getV() {
        
        if (CollUtil.isNotEmpty(ruleArguments.getV())) {
            ArrayList<NumericalValue> originalList = ruleArguments.getV();
            ArrayList<NumericalValueWrapper> wrapperList = (ArrayList<NumericalValueWrapper>)originalList.stream()
                .map(item -> new NumericalValueWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NumericalValueVariationPointWrapper> getVf() {
        
        if (CollUtil.isNotEmpty(ruleArguments.getVf())) {
            ArrayList<NumericalValueVariationPoint> originalList = ruleArguments.getVf();
            ArrayList<NumericalValueVariationPointWrapper> wrapperList = (ArrayList<NumericalValueVariationPointWrapper>)originalList.stream()
                .map(item -> new NumericalValueVariationPointWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<VerbatimStringWrapper> getVt() {
        
        if (CollUtil.isNotEmpty(ruleArguments.getVt())) {
            ArrayList<VerbatimString> originalList = ruleArguments.getVt();
            ArrayList<VerbatimStringWrapper> wrapperList = (ArrayList<VerbatimStringWrapper>)originalList.stream()
                .map(item -> new VerbatimStringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NumericalOrTextWrapper> getVtf() {
        
        if (CollUtil.isNotEmpty(ruleArguments.getVtf())) {
            ArrayList<NumericalOrText> originalList = ruleArguments.getVtf();
            ArrayList<NumericalOrTextWrapper> wrapperList = (ArrayList<NumericalOrTextWrapper>)originalList.stream()
                .map(item -> new NumericalOrTextWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<VariationPointWrapper> getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ruleArguments.getVariationPoint())) {
            ArrayList<VariationPoint> originalList = ruleArguments.getVariationPoint();
            ArrayList<VariationPointWrapper> wrapperList = (ArrayList<VariationPointWrapper>)originalList.stream()
                .map(item -> new VariationPointWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}