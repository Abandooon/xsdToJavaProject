package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class SwRecordLayoutGroupContentWrapper {

    
    private SwRecordLayoutGroupContent swRecordLayoutGroupContent;

    public SwRecordLayoutGroupContentWrapper(SwRecordLayoutGroupContent swRecordLayoutGroupContent) {
        this.swRecordLayoutGroupContent = swRecordLayoutGroupContent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutGroupContent.getS())) {
            
            return swRecordLayoutGroupContent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutGroupContent.getT())) {
            
            return swRecordLayoutGroupContent.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwRecordLayoutRefWrapper> getSwRecordLayoutRef() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutGroupContent.getSwRecordLayoutRef())) {
            ArrayList<SwRecordLayoutRef> originalList = swRecordLayoutGroupContent.getSwRecordLayoutRef();
            ArrayList<SwRecordLayoutRefWrapper> wrapperList = (ArrayList<SwRecordLayoutRefWrapper>)originalList.stream()
                .map(item -> new SwRecordLayoutRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwRecordLayoutVWrapper> getSwRecordLayoutV() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutGroupContent.getSwRecordLayoutV())) {
            ArrayList<SwRecordLayoutV> originalList = swRecordLayoutGroupContent.getSwRecordLayoutV();
            ArrayList<SwRecordLayoutVWrapper> wrapperList = (ArrayList<SwRecordLayoutVWrapper>)originalList.stream()
                .map(item -> new SwRecordLayoutVWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwRecordLayoutGroupWrapper> getSwRecordLayoutGroup() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutGroupContent.getSwRecordLayoutGroup())) {
            ArrayList<SwRecordLayoutGroup> originalList = swRecordLayoutGroupContent.getSwRecordLayoutGroup();
            ArrayList<SwRecordLayoutGroupWrapper> wrapperList = (ArrayList<SwRecordLayoutGroupWrapper>)originalList.stream()
                .map(item -> new SwRecordLayoutGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}