package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class VariableDataPrototypeInCompositionInstanceRefWrapper {

    
    private VariableDataPrototypeInCompositionInstanceRef variableDataPrototypeInCompositionInstanceRef;

    public VariableDataPrototypeInCompositionInstanceRefWrapper(VariableDataPrototypeInCompositionInstanceRef variableDataPrototypeInCompositionInstanceRef) {
        this.variableDataPrototypeInCompositionInstanceRef = variableDataPrototypeInCompositionInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(variableDataPrototypeInCompositionInstanceRef.getS())) {
            
            return variableDataPrototypeInCompositionInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(variableDataPrototypeInCompositionInstanceRef.getT())) {
            
            return variableDataPrototypeInCompositionInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContextSwComponentPrototypeRefWrapper> getContextSwComponentPrototypeRefs() {
        
        if (CollUtil.isNotEmpty(variableDataPrototypeInCompositionInstanceRef.getContextSwComponentPrototypeRefs())) {
            ArrayList<ContextSwComponentPrototypeRef> originalList = variableDataPrototypeInCompositionInstanceRef.getContextSwComponentPrototypeRefs();
            ArrayList<ContextSwComponentPrototypeRefWrapper> wrapperList = (ArrayList<ContextSwComponentPrototypeRefWrapper>)originalList.stream()
                .map(item -> new ContextSwComponentPrototypeRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ContextPortPrototypeRefWrapper getContextPortPrototypeRef() {
        
        if (CollUtil.isNotEmpty(variableDataPrototypeInCompositionInstanceRef.getContextPortPrototypeRef())) {
            
            return new ContextPortPrototypeRefWrapper(variableDataPrototypeInCompositionInstanceRef.getContextPortPrototypeRef());
            
        } else {
            return null;
        }
        
    }

    public TargetVariableDataPrototypeRefWrapper getTargetVariableDataPrototypeRef() {
        
        if (CollUtil.isNotEmpty(variableDataPrototypeInCompositionInstanceRef.getTargetVariableDataPrototypeRef())) {
            
            return new TargetVariableDataPrototypeRefWrapper(variableDataPrototypeInCompositionInstanceRef.getTargetVariableDataPrototypeRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(variableDataPrototypeInCompositionInstanceRef.getVariationPoint())) {
            
            return new VariationPointWrapper(variableDataPrototypeInCompositionInstanceRef.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}