package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class ForeignModelReferenceWrapper {

    
    private ForeignModelReference foreignModelReference;

    public ForeignModelReferenceWrapper(ForeignModelReference foreignModelReference) {
        this.foreignModelReference = foreignModelReference;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(foreignModelReference.getValue())) {
            
            return foreignModelReference.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(foreignModelReference.getS())) {
            
            return foreignModelReference.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(foreignModelReference.getT())) {
            
            return foreignModelReference.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getBase() {
        
        if (CollUtil.isNotEmpty(foreignModelReference.getBase())) {
            
            return foreignModelReference.getBase();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getDest() {
        
        if (CollUtil.isNotEmpty(foreignModelReference.getDest())) {
            
            return foreignModelReference.getDest();
            
        } else {
            return null;
        }
        
    }




    


    
}