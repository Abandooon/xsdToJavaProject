package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class FloatValueVariationPointWrapper {

    
    private FloatValueVariationPoint floatValueVariationPoint;

    public FloatValueVariationPointWrapper(FloatValueVariationPoint floatValueVariationPoint) {
        this.floatValueVariationPoint = floatValueVariationPoint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(floatValueVariationPoint.getS())) {
            
            return floatValueVariationPoint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(floatValueVariationPoint.getT())) {
            
            return floatValueVariationPoint.getT();
            
        } else {
            return null;
        }
        
    }

    public BindingTimeEnumSimple getBindingTime() {
        
        if (CollUtil.isNotEmpty(floatValueVariationPoint.getBindingTime())) {
            
            return floatValueVariationPoint.getBindingTime();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getBlueprintValue() {
        
        if (CollUtil.isNotEmpty(floatValueVariationPoint.getBlueprintValue())) {
            
            return floatValueVariationPoint.getBlueprintValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSd() {
        
        if (CollUtil.isNotEmpty(floatValueVariationPoint.getSd())) {
            
            return floatValueVariationPoint.getSd();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getShortLabel() {
        
        if (CollUtil.isNotEmpty(floatValueVariationPoint.getShortLabel())) {
            
            return floatValueVariationPoint.getShortLabel();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Serializable> getContent() {
        
        if (CollUtil.isNotEmpty(floatValueVariationPoint.getContent())) {
            
            return floatValueVariationPoint.getContent();
            
        } else {
            return null;
        }
        
    }




    


    
    public String getValue() {
        ArrayList<Serializable> serializables = floatValueVariationPoint.getContent();
        StringBuilder textContent = new StringBuilder();
        for (Serializable item : serializables) {
            if (item instanceof String) {
                textContent.append((String) item);
            }
        }
        return textContent.toString().trim();
    }

    
    
}