package stdgui.data.model.modelwrapper;

    import stdgui.data.model.orimodel.Ref;


    
    

    
    

    
    

    
    

    
    


public class RefWrapper {

    
    private Ref ref;

    public RefWrapper(Ref ref) {
        this.ref = ref;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(ref.getValue())) {
            
            return ref.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ref.getS())) {
            
            return ref.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ref.getT())) {
            
            return ref.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getBase() {
        
        if (CollUtil.isNotEmpty(ref.getBase())) {
            
            return ref.getBase();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getIndex() {
        
        if (CollUtil.isNotEmpty(ref.getIndex())) {
            
            return ref.getIndex();
            
        } else {
            return null;
        }
        
    }




    


    
}