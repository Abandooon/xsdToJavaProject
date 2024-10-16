package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class InstantiationDataDefPropsWrapper {

    
    private InstantiationDataDefProps instantiationDataDefProps;

    public InstantiationDataDefPropsWrapper(InstantiationDataDefProps instantiationDataDefProps) {
        this.instantiationDataDefProps = instantiationDataDefProps;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(instantiationDataDefProps.getS())) {
            
            return instantiationDataDefProps.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(instantiationDataDefProps.getT())) {
            
            return instantiationDataDefProps.getT();
            
        } else {
            return null;
        }
        
    }

    public AutosarParameterRefWrapper getParameterInstance() {
        
        if (CollUtil.isNotEmpty(instantiationDataDefProps.getParameterInstance())) {
            
            return new AutosarParameterRefWrapper(instantiationDataDefProps.getParameterInstance());
            
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getSwDataDefProps() {
        
        if (CollUtil.isNotEmpty(instantiationDataDefProps.getSwDataDefProps())) {
            
            return new SwDataDefPropsWrapper(instantiationDataDefProps.getSwDataDefProps());
            
        } else {
            return null;
        }
        
    }

    public AutosarVariableRefWrapper getVariableInstance() {
        
        if (CollUtil.isNotEmpty(instantiationDataDefProps.getVariableInstance())) {
            
            return new AutosarVariableRefWrapper(instantiationDataDefProps.getVariableInstance());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(instantiationDataDefProps.getVariationPoint())) {
            
            return new VariationPointWrapper(instantiationDataDefProps.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}