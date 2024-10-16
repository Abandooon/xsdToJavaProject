package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SwValuesWrapper {

    
    private SwValues swValues;

    public SwValuesWrapper(SwValues swValues) {
        this.swValues = swValues;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swValues.getS())) {
            
            return swValues.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swValues.getT())) {
            
            return swValues.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<NumericalOrTextWrapper> getVtf() {
        
        if (CollUtil.isNotEmpty(swValues.getVtf())) {
            ArrayList<NumericalOrText> originalList = swValues.getVtf();
            ArrayList<NumericalOrTextWrapper> wrapperList = (ArrayList<NumericalOrTextWrapper>)originalList.stream()
                .map(item -> new NumericalOrTextWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NumericalValueVariationPointWrapper> getVf() {
        
        if (CollUtil.isNotEmpty(swValues.getVf())) {
            ArrayList<NumericalValueVariationPoint> originalList = swValues.getVf();
            ArrayList<NumericalValueVariationPointWrapper> wrapperList = (ArrayList<NumericalValueVariationPointWrapper>)originalList.stream()
                .map(item -> new NumericalValueVariationPointWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<VerbatimStringWrapper> getVt() {
        
        if (CollUtil.isNotEmpty(swValues.getVt())) {
            ArrayList<VerbatimString> originalList = swValues.getVt();
            ArrayList<VerbatimStringWrapper> wrapperList = (ArrayList<VerbatimStringWrapper>)originalList.stream()
                .map(item -> new VerbatimStringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NumericalValueWrapper> getV() {
        
        if (CollUtil.isNotEmpty(swValues.getV())) {
            ArrayList<NumericalValue> originalList = swValues.getV();
            ArrayList<NumericalValueWrapper> wrapperList = (ArrayList<NumericalValueWrapper>)originalList.stream()
                .map(item -> new NumericalValueWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ValueGroupWrapper> getVg() {
        
        if (CollUtil.isNotEmpty(swValues.getVg())) {
            ArrayList<ValueGroup> originalList = swValues.getVg();
            ArrayList<ValueGroupWrapper> wrapperList = (ArrayList<ValueGroupWrapper>)originalList.stream()
                .map(item -> new ValueGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}