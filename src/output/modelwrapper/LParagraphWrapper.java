package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class LParagraphWrapper {

    
    private LParagraph lParagraph;

    public LParagraphWrapper(LParagraph lParagraph) {
        this.lParagraph = lParagraph;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(lParagraph.getS())) {
            
            return lParagraph.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(lParagraph.getT())) {
            
            return lParagraph.getT();
            
        } else {
            return null;
        }
        
    }

    public LEnumSimple getL() {
        
        if (CollUtil.isNotEmpty(lParagraph.getL())) {
            
            return lParagraph.getL();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Serializable> getContent() {
        
        if (CollUtil.isNotEmpty(lParagraph.getContent())) {
            
            return lParagraph.getContent();
            
        } else {
            return null;
        }
        
    }




    


    
    public String getValue() {
        ArrayList<Serializable> serializables = lParagraph.getContent();
        StringBuilder textContent = new StringBuilder();
        for (Serializable item : serializables) {
            if (item instanceof String) {
                textContent.append((String) item);
            }
        }
        return textContent.toString().trim();
    }

    
    
}