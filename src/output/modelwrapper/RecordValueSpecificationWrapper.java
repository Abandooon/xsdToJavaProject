package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class RecordValueSpecificationWrapper {

    
    private RecordValueSpecification recordValueSpecification;

    public RecordValueSpecificationWrapper(RecordValueSpecification recordValueSpecification) {
        this.recordValueSpecification = recordValueSpecification;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(recordValueSpecification.getS())) {
            
            return recordValueSpecification.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(recordValueSpecification.getT())) {
            
            return recordValueSpecification.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(recordValueSpecification.getShortLabel())) {
            
            return new IdentifierWrapper(recordValueSpecification.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(recordValueSpecification.getVariationPoint())) {
            
            return new VariationPointWrapper(recordValueSpecification.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public FieldsWrapper getFields() {
        
        if (CollUtil.isNotEmpty(recordValueSpecification.getFields())) {
            
            return new FieldsWrapper(recordValueSpecification.getFields());
            
        } else {
            return null;
        }
        
    }




    


    
}