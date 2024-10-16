package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class EmphasisTextWrapper {

    
    private EmphasisText emphasisText;

    public EmphasisTextWrapper(EmphasisText emphasisText) {
        this.emphasisText = emphasisText;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(emphasisText.getS())) {
            
            return emphasisText.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(emphasisText.getT())) {
            
            return emphasisText.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getColor() {
        
        if (CollUtil.isNotEmpty(emphasisText.getColor())) {
            
            return emphasisText.getColor();
            
        } else {
            return null;
        }
        
    }

    public EEnumFontSimple getFont() {
        
        if (CollUtil.isNotEmpty(emphasisText.getFont())) {
            
            return emphasisText.getFont();
            
        } else {
            return null;
        }
        
    }

    public EEnumSimple getType() {
        
        if (CollUtil.isNotEmpty(emphasisText.getType())) {
            
            return emphasisText.getType();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Serializable> getContent() {
        
        if (CollUtil.isNotEmpty(emphasisText.getContent())) {
            
            return emphasisText.getContent();
            
        } else {
            return null;
        }
        
    }




    


    
    public String getValue() {
        ArrayList<Serializable> serializables = emphasisText.getContent();
        StringBuilder textContent = new StringBuilder();
        for (Serializable item : serializables) {
            if (item instanceof String) {
                textContent.append((String) item);
            }
        }
        return textContent.toString().trim();
    }

    
    
}