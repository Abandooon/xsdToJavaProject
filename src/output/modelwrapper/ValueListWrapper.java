package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ValueListWrapper {

    
    private ValueList valueList;

    public ValueListWrapper(ValueList valueList) {
        this.valueList = valueList;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(valueList.getS())) {
            
            return valueList.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(valueList.getT())) {
            
            return valueList.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<NumericalValueVariationPointWrapper> getVf() {
        
        if (CollUtil.isNotEmpty(valueList.getVf())) {
            ArrayList<NumericalValueVariationPoint> originalList = valueList.getVf();
            ArrayList<NumericalValueVariationPointWrapper> wrapperList = (ArrayList<NumericalValueVariationPointWrapper>)originalList.stream()
                .map(item -> new NumericalValueVariationPointWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NumericalValueWrapper> getV() {
        
        if (CollUtil.isNotEmpty(valueList.getV())) {
            ArrayList<NumericalValue> originalList = valueList.getV();
            ArrayList<NumericalValueWrapper> wrapperList = (ArrayList<NumericalValueWrapper>)originalList.stream()
                .map(item -> new NumericalValueWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}