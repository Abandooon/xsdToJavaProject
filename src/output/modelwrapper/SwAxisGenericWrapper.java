package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class SwAxisGenericWrapper {

    
    private SwAxisGeneric swAxisGeneric;

    public SwAxisGenericWrapper(SwAxisGeneric swAxisGeneric) {
        this.swAxisGeneric = swAxisGeneric;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swAxisGeneric.getS())) {
            
            return swAxisGeneric.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swAxisGeneric.getT())) {
            
            return swAxisGeneric.getT();
            
        } else {
            return null;
        }
        
    }

    public SwAxisTypeRefWrapper getSwAxisTypeRef() {
        
        if (CollUtil.isNotEmpty(swAxisGeneric.getSwAxisTypeRef())) {
            
            return new SwAxisTypeRefWrapper(swAxisGeneric.getSwAxisTypeRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerValueVariationPointWrapper getSwNumberOfAxisPoints() {
        
        if (CollUtil.isNotEmpty(swAxisGeneric.getSwNumberOfAxisPoints())) {
            
            return new IntegerValueVariationPointWrapper(swAxisGeneric.getSwNumberOfAxisPoints());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwGenericAxisParamWrapper> getSwGenericAxisParams() {
        
        if (CollUtil.isNotEmpty(swAxisGeneric.getSwGenericAxisParams())) {
            ArrayList<SwGenericAxisParam> originalList = swAxisGeneric.getSwGenericAxisParams();
            ArrayList<SwGenericAxisParamWrapper> wrapperList = (ArrayList<SwGenericAxisParamWrapper>)originalList.stream()
                .map(item -> new SwGenericAxisParamWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}