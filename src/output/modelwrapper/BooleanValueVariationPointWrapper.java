package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BooleanValueVariationPointWrapper {

    
    private BooleanValueVariationPoint booleanValueVariationPoint;

    public BooleanValueVariationPointWrapper(BooleanValueVariationPoint booleanValueVariationPoint) {
        this.booleanValueVariationPoint = booleanValueVariationPoint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(booleanValueVariationPoint.getS())) {
            
            return booleanValueVariationPoint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(booleanValueVariationPoint.getT())) {
            
            return booleanValueVariationPoint.getT();
            
        } else {
            return null;
        }
        
    }

    public BindingTimeEnumSimple getBindingTime() {
        
        if (CollUtil.isNotEmpty(booleanValueVariationPoint.getBindingTime())) {
            
            return booleanValueVariationPoint.getBindingTime();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getBlueprintValue() {
        
        if (CollUtil.isNotEmpty(booleanValueVariationPoint.getBlueprintValue())) {
            
            return booleanValueVariationPoint.getBlueprintValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSd() {
        
        if (CollUtil.isNotEmpty(booleanValueVariationPoint.getSd())) {
            
            return booleanValueVariationPoint.getSd();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getShortLabel() {
        
        if (CollUtil.isNotEmpty(booleanValueVariationPoint.getShortLabel())) {
            
            return booleanValueVariationPoint.getShortLabel();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Serializable> getContent() {
        
        if (CollUtil.isNotEmpty(booleanValueVariationPoint.getContent())) {
            
            return booleanValueVariationPoint.getContent();
            
        } else {
            return null;
        }
        
    }




    


    
    public String getValue() {
        ArrayList<Serializable> serializables = booleanValueVariationPoint.getContent();
        StringBuilder textContent = new StringBuilder();
        for (Serializable item : serializables) {
            if (item instanceof String) {
                textContent.append((String) item);
            }
        }
        return textContent.toString().trim();
    }

    
    
}