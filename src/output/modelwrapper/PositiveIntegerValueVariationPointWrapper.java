package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class PositiveIntegerValueVariationPointWrapper {

    
    private PositiveIntegerValueVariationPoint positiveIntegerValueVariationPoint;

    public PositiveIntegerValueVariationPointWrapper(PositiveIntegerValueVariationPoint positiveIntegerValueVariationPoint) {
        this.positiveIntegerValueVariationPoint = positiveIntegerValueVariationPoint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(positiveIntegerValueVariationPoint.getS())) {
            
            return positiveIntegerValueVariationPoint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(positiveIntegerValueVariationPoint.getT())) {
            
            return positiveIntegerValueVariationPoint.getT();
            
        } else {
            return null;
        }
        
    }

    public BindingTimeEnumSimple getBindingTime() {
        
        if (CollUtil.isNotEmpty(positiveIntegerValueVariationPoint.getBindingTime())) {
            
            return positiveIntegerValueVariationPoint.getBindingTime();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getBlueprintValue() {
        
        if (CollUtil.isNotEmpty(positiveIntegerValueVariationPoint.getBlueprintValue())) {
            
            return positiveIntegerValueVariationPoint.getBlueprintValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSd() {
        
        if (CollUtil.isNotEmpty(positiveIntegerValueVariationPoint.getSd())) {
            
            return positiveIntegerValueVariationPoint.getSd();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getShortLabel() {
        
        if (CollUtil.isNotEmpty(positiveIntegerValueVariationPoint.getShortLabel())) {
            
            return positiveIntegerValueVariationPoint.getShortLabel();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Serializable> getContent() {
        
        if (CollUtil.isNotEmpty(positiveIntegerValueVariationPoint.getContent())) {
            
            return positiveIntegerValueVariationPoint.getContent();
            
        } else {
            return null;
        }
        
    }




    


    
    public String getValue() {
        ArrayList<Serializable> serializables = positiveIntegerValueVariationPoint.getContent();
        StringBuilder textContent = new StringBuilder();
        for (Serializable item : serializables) {
            if (item instanceof String) {
                textContent.append((String) item);
            }
        }
        return textContent.toString().trim();
    }

    
    
}