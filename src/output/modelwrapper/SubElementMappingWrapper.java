package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class SubElementMappingWrapper {

    
    private SubElementMapping subElementMapping;

    public SubElementMappingWrapper(SubElementMapping subElementMapping) {
        this.subElementMapping = subElementMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(subElementMapping.getS())) {
            
            return subElementMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(subElementMapping.getT())) {
            
            return subElementMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public FirstElementsWrapper getFirstElements() {
        
        if (CollUtil.isNotEmpty(subElementMapping.getFirstElements())) {
            
            return new FirstElementsWrapper(subElementMapping.getFirstElements());
            
        } else {
            return null;
        }
        
    }

    public SecondElementsWrapper getSecondElements() {
        
        if (CollUtil.isNotEmpty(subElementMapping.getSecondElements())) {
            
            return new SecondElementsWrapper(subElementMapping.getSecondElements());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<TextTableMappingWrapper> getTextTableMappings() {
        
        if (CollUtil.isNotEmpty(subElementMapping.getTextTableMappings())) {
            ArrayList<TextTableMapping> originalList = subElementMapping.getTextTableMappings();
            ArrayList<TextTableMappingWrapper> wrapperList = (ArrayList<TextTableMappingWrapper>)originalList.stream()
                .map(item -> new TextTableMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}