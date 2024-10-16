package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class SwGenericAxisParamWrapper {

    
    private SwGenericAxisParam swGenericAxisParam;

    public SwGenericAxisParamWrapper(SwGenericAxisParam swGenericAxisParam) {
        this.swGenericAxisParam = swGenericAxisParam;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swGenericAxisParam.getS())) {
            
            return swGenericAxisParam.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swGenericAxisParam.getT())) {
            
            return swGenericAxisParam.getT();
            
        } else {
            return null;
        }
        
    }

    public SwGenericAxisParamTypeRefWrapper getSwGenericAxisParamTypeRef() {
        
        if (CollUtil.isNotEmpty(swGenericAxisParam.getSwGenericAxisParamTypeRef())) {
            
            return new SwGenericAxisParamTypeRefWrapper(swGenericAxisParam.getSwGenericAxisParamTypeRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<NumericalValueVariationPointWrapper> getVf() {
        
        if (CollUtil.isNotEmpty(swGenericAxisParam.getVf())) {
            ArrayList<NumericalValueVariationPoint> originalList = swGenericAxisParam.getVf();
            ArrayList<NumericalValueVariationPointWrapper> wrapperList = (ArrayList<NumericalValueVariationPointWrapper>)originalList.stream()
                .map(item -> new NumericalValueVariationPointWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}