package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ValueGroupWrapper {

    
    private ValueGroup valueGroup;

    public ValueGroupWrapper(ValueGroup valueGroup) {
        this.valueGroup = valueGroup;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(valueGroup.getS())) {
            
            return valueGroup.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(valueGroup.getT())) {
            
            return valueGroup.getT();
            
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLabel() {
        
        if (CollUtil.isNotEmpty(valueGroup.getLabel())) {
            
            return new MultilanguageLongNameWrapper(valueGroup.getLabel());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<NumericalOrTextWrapper> getVtf() {
        
        if (CollUtil.isNotEmpty(valueGroup.getVtf())) {
            ArrayList<NumericalOrText> originalList = valueGroup.getVtf();
            ArrayList<NumericalOrTextWrapper> wrapperList = (ArrayList<NumericalOrTextWrapper>)originalList.stream()
                .map(item -> new NumericalOrTextWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NumericalValueVariationPointWrapper> getVf() {
        
        if (CollUtil.isNotEmpty(valueGroup.getVf())) {
            ArrayList<NumericalValueVariationPoint> originalList = valueGroup.getVf();
            ArrayList<NumericalValueVariationPointWrapper> wrapperList = (ArrayList<NumericalValueVariationPointWrapper>)originalList.stream()
                .map(item -> new NumericalValueVariationPointWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<VerbatimStringWrapper> getVt() {
        
        if (CollUtil.isNotEmpty(valueGroup.getVt())) {
            ArrayList<VerbatimString> originalList = valueGroup.getVt();
            ArrayList<VerbatimStringWrapper> wrapperList = (ArrayList<VerbatimStringWrapper>)originalList.stream()
                .map(item -> new VerbatimStringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NumericalValueWrapper> getV() {
        
        if (CollUtil.isNotEmpty(valueGroup.getV())) {
            ArrayList<NumericalValue> originalList = valueGroup.getV();
            ArrayList<NumericalValueWrapper> wrapperList = (ArrayList<NumericalValueWrapper>)originalList.stream()
                .map(item -> new NumericalValueWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ValueGroupWrapper> getVg() {
        
        if (CollUtil.isNotEmpty(valueGroup.getVg())) {
            ArrayList<ValueGroup> originalList = valueGroup.getVg();
            ArrayList<ValueGroupWrapper> wrapperList = (ArrayList<ValueGroupWrapper>)originalList.stream()
                .map(item -> new ValueGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}