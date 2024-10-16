package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SwAxisIndividualWrapper {

    
    private SwAxisIndividual swAxisIndividual;

    public SwAxisIndividualWrapper(SwAxisIndividual swAxisIndividual) {
        this.swAxisIndividual = swAxisIndividual;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swAxisIndividual.getS())) {
            
            return swAxisIndividual.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swAxisIndividual.getT())) {
            
            return swAxisIndividual.getT();
            
        } else {
            return null;
        }
        
    }

    public InputVariableTypeRefWrapper getInputVariableTypeRef() {
        
        if (CollUtil.isNotEmpty(swAxisIndividual.getInputVariableTypeRef())) {
            
            return new InputVariableTypeRefWrapper(swAxisIndividual.getInputVariableTypeRef());
            
        } else {
            return null;
        }
        
    }

    public SwVariableRefsWrapper getSwVariableRefs() {
        
        if (CollUtil.isNotEmpty(swAxisIndividual.getSwVariableRefs())) {
            
            return new SwVariableRefsWrapper(swAxisIndividual.getSwVariableRefs());
            
        } else {
            return null;
        }
        
    }

    public CompuMethodRefWrapper getCompuMethodRef() {
        
        if (CollUtil.isNotEmpty(swAxisIndividual.getCompuMethodRef())) {
            
            return new CompuMethodRefWrapper(swAxisIndividual.getCompuMethodRef());
            
        } else {
            return null;
        }
        
    }

    public UnitRefWrapper getUnitRef() {
        
        if (CollUtil.isNotEmpty(swAxisIndividual.getUnitRef())) {
            
            return new UnitRefWrapper(swAxisIndividual.getUnitRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerValueVariationPointWrapper getSwMaxAxisPoints() {
        
        if (CollUtil.isNotEmpty(swAxisIndividual.getSwMaxAxisPoints())) {
            
            return new IntegerValueVariationPointWrapper(swAxisIndividual.getSwMaxAxisPoints());
            
        } else {
            return null;
        }
        
    }

    public IntegerValueVariationPointWrapper getSwMinAxisPoints() {
        
        if (CollUtil.isNotEmpty(swAxisIndividual.getSwMinAxisPoints())) {
            
            return new IntegerValueVariationPointWrapper(swAxisIndividual.getSwMinAxisPoints());
            
        } else {
            return null;
        }
        
    }

    public DataConstrRefWrapper getDataConstrRef() {
        
        if (CollUtil.isNotEmpty(swAxisIndividual.getDataConstrRef())) {
            
            return new DataConstrRefWrapper(swAxisIndividual.getDataConstrRef());
            
        } else {
            return null;
        }
        
    }

    public SwAxisGenericWrapper getSwAxisGeneric() {
        
        if (CollUtil.isNotEmpty(swAxisIndividual.getSwAxisGeneric())) {
            
            return new SwAxisGenericWrapper(swAxisIndividual.getSwAxisGeneric());
            
        } else {
            return null;
        }
        
    }




    


    
}