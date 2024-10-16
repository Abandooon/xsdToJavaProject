package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class LLongNameWrapper {

    
    private LLongName lLongName;

    public LLongNameWrapper(LLongName lLongName) {
        this.lLongName = lLongName;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(lLongName.getS())) {
            
            return lLongName.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(lLongName.getT())) {
            
            return lLongName.getT();
            
        } else {
            return null;
        }
        
    }

    public LEnumSimple getL() {
        
        if (CollUtil.isNotEmpty(lLongName.getL())) {
            
            return lLongName.getL();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Serializable> getContent() {
        
        if (CollUtil.isNotEmpty(lLongName.getContent())) {
            
            return lLongName.getContent();
            
        } else {
            return null;
        }
        
    }




    


    
    public String getValue() {
        ArrayList<Serializable> serializables = lLongName.getContent();
        StringBuilder textContent = new StringBuilder();
        for (Serializable item : serializables) {
            if (item instanceof String) {
                textContent.append((String) item);
            }
        }
        return textContent.toString().trim();
    }

    
    
}