package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Ref;
    


public class GenericModelReferenceWrapper {

    
    private GenericModelReference genericModelReference;

    public GenericModelReferenceWrapper(GenericModelReference genericModelReference) {
        this.genericModelReference = genericModelReference;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(genericModelReference.getS())) {
            
            return genericModelReference.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(genericModelReference.getT())) {
            
            return genericModelReference.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getBase() {
        
        if (CollUtil.isNotEmpty(genericModelReference.getBase())) {
            
            return genericModelReference.getBase();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getDest() {
        
        if (CollUtil.isNotEmpty(genericModelReference.getDest())) {
            
            return genericModelReference.getDest();
            
        } else {
            return null;
        }
        
    }

    public RefWrapper getRef() {
        
        if (CollUtil.isNotEmpty(genericModelReference.getRef())) {
            
            return new RefWrapper(genericModelReference.getRef());
            
        } else {
            return null;
        }
        
    }




    


    
}