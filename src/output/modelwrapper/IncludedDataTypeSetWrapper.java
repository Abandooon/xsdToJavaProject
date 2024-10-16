package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class IncludedDataTypeSetWrapper {

    
    private IncludedDataTypeSet includedDataTypeSet;

    public IncludedDataTypeSetWrapper(IncludedDataTypeSet includedDataTypeSet) {
        this.includedDataTypeSet = includedDataTypeSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(includedDataTypeSet.getS())) {
            
            return includedDataTypeSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(includedDataTypeSet.getT())) {
            
            return includedDataTypeSet.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DataTypeRefWrapper> getDataTypeRefs() {
        
        if (CollUtil.isNotEmpty(includedDataTypeSet.getDataTypeRefs())) {
            ArrayList<DataTypeRef> originalList = includedDataTypeSet.getDataTypeRefs();
            ArrayList<DataTypeRefWrapper> wrapperList = (ArrayList<DataTypeRefWrapper>)originalList.stream()
                .map(item -> new DataTypeRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getLiteralPrefix() {
        
        if (CollUtil.isNotEmpty(includedDataTypeSet.getLiteralPrefix())) {
            
            return new IdentifierWrapper(includedDataTypeSet.getLiteralPrefix());
            
        } else {
            return null;
        }
        
    }




    


    
}