package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class FmConditionByFeaturesAndAttributesWrapper {

    
    private FmConditionByFeaturesAndAttributes fmConditionByFeaturesAndAttributes;

    public FmConditionByFeaturesAndAttributesWrapper(FmConditionByFeaturesAndAttributes fmConditionByFeaturesAndAttributes) {
        this.fmConditionByFeaturesAndAttributes = fmConditionByFeaturesAndAttributes;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(fmConditionByFeaturesAndAttributes.getS())) {
            
            return fmConditionByFeaturesAndAttributes.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(fmConditionByFeaturesAndAttributes.getT())) {
            
            return fmConditionByFeaturesAndAttributes.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Serializable> getContent() {
        
        if (CollUtil.isNotEmpty(fmConditionByFeaturesAndAttributes.getContent())) {
            
            return fmConditionByFeaturesAndAttributes.getContent();
            
        } else {
            return null;
        }
        
    }




    


    
    public String getValue() {
        ArrayList<Serializable> serializables = fmConditionByFeaturesAndAttributes.getContent();
        StringBuilder textContent = new StringBuilder();
        for (Serializable item : serializables) {
            if (item instanceof String) {
                textContent.append((String) item);
            }
        }
        return textContent.toString().trim();
    }

    
    
}