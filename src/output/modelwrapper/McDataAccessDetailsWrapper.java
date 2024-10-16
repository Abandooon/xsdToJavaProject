package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class McDataAccessDetailsWrapper {

    
    private McDataAccessDetails mcDataAccessDetails;

    public McDataAccessDetailsWrapper(McDataAccessDetails mcDataAccessDetails) {
        this.mcDataAccessDetails = mcDataAccessDetails;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(mcDataAccessDetails.getS())) {
            
            return mcDataAccessDetails.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(mcDataAccessDetails.getT())) {
            
            return mcDataAccessDetails.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RteEventInEcuInstanceRefWrapper> getRteEventIrefs() {
        
        if (CollUtil.isNotEmpty(mcDataAccessDetails.getRteEventIrefs())) {
            ArrayList<RteEventInEcuInstanceRef> originalList = mcDataAccessDetails.getRteEventIrefs();
            ArrayList<RteEventInEcuInstanceRefWrapper> wrapperList = (ArrayList<RteEventInEcuInstanceRefWrapper>)originalList.stream()
                .map(item -> new RteEventInEcuInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<VariableAccessInEcuInstanceRefWrapper> getVariableAccessIrefs() {
        
        if (CollUtil.isNotEmpty(mcDataAccessDetails.getVariableAccessIrefs())) {
            ArrayList<VariableAccessInEcuInstanceRef> originalList = mcDataAccessDetails.getVariableAccessIrefs();
            ArrayList<VariableAccessInEcuInstanceRefWrapper> wrapperList = (ArrayList<VariableAccessInEcuInstanceRefWrapper>)originalList.stream()
                .map(item -> new VariableAccessInEcuInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}