package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class NumericalValueVariationPointWrapper {

    
    private NumericalValueVariationPoint numericalValueVariationPoint;

    public NumericalValueVariationPointWrapper(NumericalValueVariationPoint numericalValueVariationPoint) {
        this.numericalValueVariationPoint = numericalValueVariationPoint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(numericalValueVariationPoint.getS())) {
            
            return numericalValueVariationPoint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(numericalValueVariationPoint.getT())) {
            
            return numericalValueVariationPoint.getT();
            
        } else {
            return null;
        }
        
    }

    public BindingTimeEnumSimple getBindingTime() {
        
        if (CollUtil.isNotEmpty(numericalValueVariationPoint.getBindingTime())) {
            
            return numericalValueVariationPoint.getBindingTime();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getBlueprintValue() {
        
        if (CollUtil.isNotEmpty(numericalValueVariationPoint.getBlueprintValue())) {
            
            return numericalValueVariationPoint.getBlueprintValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSd() {
        
        if (CollUtil.isNotEmpty(numericalValueVariationPoint.getSd())) {
            
            return numericalValueVariationPoint.getSd();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getShortLabel() {
        
        if (CollUtil.isNotEmpty(numericalValueVariationPoint.getShortLabel())) {
            
            return numericalValueVariationPoint.getShortLabel();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Serializable> getContent() {
        
        if (CollUtil.isNotEmpty(numericalValueVariationPoint.getContent())) {
            
            return numericalValueVariationPoint.getContent();
            
        } else {
            return null;
        }
        
    }




    


    
    public String getValue() {
        ArrayList<Serializable> serializables = numericalValueVariationPoint.getContent();
        StringBuilder textContent = new StringBuilder();
        for (Serializable item : serializables) {
            if (item instanceof String) {
                textContent.append((String) item);
            }
        }
        return textContent.toString().trim();
    }

    
    
}