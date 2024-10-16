package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class NativeDeclarationStringWrapper {

    
    private NativeDeclarationString nativeDeclarationString;

    public NativeDeclarationStringWrapper(NativeDeclarationString nativeDeclarationString) {
        this.nativeDeclarationString = nativeDeclarationString;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(nativeDeclarationString.getValue())) {
            
            return nativeDeclarationString.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(nativeDeclarationString.getS())) {
            
            return nativeDeclarationString.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(nativeDeclarationString.getT())) {
            
            return nativeDeclarationString.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}