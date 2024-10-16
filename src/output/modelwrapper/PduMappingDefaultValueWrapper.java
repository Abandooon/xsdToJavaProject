package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class PduMappingDefaultValueWrapper {

    
    private PduMappingDefaultValue pduMappingDefaultValue;

    public PduMappingDefaultValueWrapper(PduMappingDefaultValue pduMappingDefaultValue) {
        this.pduMappingDefaultValue = pduMappingDefaultValue;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(pduMappingDefaultValue.getS())) {
            
            return pduMappingDefaultValue.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(pduMappingDefaultValue.getT())) {
            
            return pduMappingDefaultValue.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DefaultValueElementWrapper> getDefaultValueElements() {
        
        if (CollUtil.isNotEmpty(pduMappingDefaultValue.getDefaultValueElements())) {
            ArrayList<DefaultValueElement> originalList = pduMappingDefaultValue.getDefaultValueElements();
            ArrayList<DefaultValueElementWrapper> wrapperList = (ArrayList<DefaultValueElementWrapper>)originalList.stream()
                .map(item -> new DefaultValueElementWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}