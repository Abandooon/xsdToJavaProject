package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class McdIdentifierWrapper {

    
    private McdIdentifier mcdIdentifier;

    public McdIdentifierWrapper(McdIdentifier mcdIdentifier) {
        this.mcdIdentifier = mcdIdentifier;
    }

   
    public java.lang.String getValue() {
        
        if (CollUtil.isNotEmpty(mcdIdentifier.getValue())) {
            
            return mcdIdentifier.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(mcdIdentifier.getS())) {
            
            return mcdIdentifier.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(mcdIdentifier.getT())) {
            
            return mcdIdentifier.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}