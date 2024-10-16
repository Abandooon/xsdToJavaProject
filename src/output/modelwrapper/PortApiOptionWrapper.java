package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    


public class PortApiOptionWrapper {

    
    private PortApiOption portApiOption;

    public PortApiOptionWrapper(PortApiOption portApiOption) {
        this.portApiOption = portApiOption;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(portApiOption.getS())) {
            
            return portApiOption.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(portApiOption.getT())) {
            
            return portApiOption.getT();
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getEnableTakeAddress() {
        
        if (CollUtil.isNotEmpty(portApiOption.getEnableTakeAddress())) {
            
            return new BooleanWrapper(portApiOption.getEnableTakeAddress());
            
        } else {
            return null;
        }
        
    }

    public DataTransformationErrorHandlingEnumWrapper getErrorHandling() {
        
        if (CollUtil.isNotEmpty(portApiOption.getErrorHandling())) {
            
            return new DataTransformationErrorHandlingEnumWrapper(portApiOption.getErrorHandling());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIndirectApi() {
        
        if (CollUtil.isNotEmpty(portApiOption.getIndirectApi())) {
            
            return new BooleanWrapper(portApiOption.getIndirectApi());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PortDefinedArgumentValueWrapper> getPortArgValues() {
        
        if (CollUtil.isNotEmpty(portApiOption.getPortArgValues())) {
            ArrayList<PortDefinedArgumentValue> originalList = portApiOption.getPortArgValues();
            ArrayList<PortDefinedArgumentValueWrapper> wrapperList = (ArrayList<PortDefinedArgumentValueWrapper>)originalList.stream()
                .map(item -> new PortDefinedArgumentValueWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PortRefWrapper getPortRef() {
        
        if (CollUtil.isNotEmpty(portApiOption.getPortRef())) {
            
            return new PortRefWrapper(portApiOption.getPortRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(portApiOption.getVariationPoint())) {
            
            return new VariationPointWrapper(portApiOption.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}