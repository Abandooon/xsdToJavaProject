package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class IndexedArrayElementWrapper {

    
    private IndexedArrayElement indexedArrayElement;

    public IndexedArrayElementWrapper(IndexedArrayElement indexedArrayElement) {
        this.indexedArrayElement = indexedArrayElement;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(indexedArrayElement.getS())) {
            
            return indexedArrayElement.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(indexedArrayElement.getT())) {
            
            return indexedArrayElement.getT();
            
        } else {
            return null;
        }
        
    }

    public ApplicationArrayElementRefWrapper getApplicationArrayElementRef() {
        
        if (CollUtil.isNotEmpty(indexedArrayElement.getApplicationArrayElementRef())) {
            
            return new ApplicationArrayElementRefWrapper(indexedArrayElement.getApplicationArrayElementRef());
            
        } else {
            return null;
        }
        
    }

    public ImplementationArrayElementRefWrapper getImplementationArrayElementRef() {
        
        if (CollUtil.isNotEmpty(indexedArrayElement.getImplementationArrayElementRef())) {
            
            return new ImplementationArrayElementRefWrapper(indexedArrayElement.getImplementationArrayElementRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getIndex() {
        
        if (CollUtil.isNotEmpty(indexedArrayElement.getIndex())) {
            
            return new IntegerWrapper(indexedArrayElement.getIndex());
            
        } else {
            return null;
        }
        
    }




    


    
}