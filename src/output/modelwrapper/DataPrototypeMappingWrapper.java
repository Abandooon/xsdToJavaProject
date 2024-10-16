package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class DataPrototypeMappingWrapper {

    
    private DataPrototypeMapping dataPrototypeMapping;

    public DataPrototypeMappingWrapper(DataPrototypeMapping dataPrototypeMapping) {
        this.dataPrototypeMapping = dataPrototypeMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dataPrototypeMapping.getS())) {
            
            return dataPrototypeMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dataPrototypeMapping.getT())) {
            
            return dataPrototypeMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public FirstDataPrototypeRefWrapper getFirstDataPrototypeRef() {
        
        if (CollUtil.isNotEmpty(dataPrototypeMapping.getFirstDataPrototypeRef())) {
            
            return new FirstDataPrototypeRefWrapper(dataPrototypeMapping.getFirstDataPrototypeRef());
            
        } else {
            return null;
        }
        
    }

    public FirstToSecondDataTransformationRefWrapper getFirstToSecondDataTransformationRef() {
        
        if (CollUtil.isNotEmpty(dataPrototypeMapping.getFirstToSecondDataTransformationRef())) {
            
            return new FirstToSecondDataTransformationRefWrapper(dataPrototypeMapping.getFirstToSecondDataTransformationRef());
            
        } else {
            return null;
        }
        
    }

    public SecondDataPrototypeRefWrapper getSecondDataPrototypeRef() {
        
        if (CollUtil.isNotEmpty(dataPrototypeMapping.getSecondDataPrototypeRef())) {
            
            return new SecondDataPrototypeRefWrapper(dataPrototypeMapping.getSecondDataPrototypeRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SubElementMappingWrapper> getSubElementMappings() {
        
        if (CollUtil.isNotEmpty(dataPrototypeMapping.getSubElementMappings())) {
            ArrayList<SubElementMapping> originalList = dataPrototypeMapping.getSubElementMappings();
            ArrayList<SubElementMappingWrapper> wrapperList = (ArrayList<SubElementMappingWrapper>)originalList.stream()
                .map(item -> new SubElementMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TextTableMappingWrapper> getTextTableMappings() {
        
        if (CollUtil.isNotEmpty(dataPrototypeMapping.getTextTableMappings())) {
            ArrayList<TextTableMapping> originalList = dataPrototypeMapping.getTextTableMappings();
            ArrayList<TextTableMappingWrapper> wrapperList = (ArrayList<TextTableMappingWrapper>)originalList.stream()
                .map(item -> new TextTableMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}