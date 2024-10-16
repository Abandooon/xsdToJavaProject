package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class SwBitRepresentationWrapper {

    
    private SwBitRepresentation swBitRepresentation;

    public SwBitRepresentationWrapper(SwBitRepresentation swBitRepresentation) {
        this.swBitRepresentation = swBitRepresentation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swBitRepresentation.getS())) {
            
            return swBitRepresentation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swBitRepresentation.getT())) {
            
            return swBitRepresentation.getT();
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getBitPosition() {
        
        if (CollUtil.isNotEmpty(swBitRepresentation.getBitPosition())) {
            
            return new IntegerWrapper(swBitRepresentation.getBitPosition());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getNumberOfBits() {
        
        if (CollUtil.isNotEmpty(swBitRepresentation.getNumberOfBits())) {
            
            return new IntegerWrapper(swBitRepresentation.getNumberOfBits());
            
        } else {
            return null;
        }
        
    }




    


    
}