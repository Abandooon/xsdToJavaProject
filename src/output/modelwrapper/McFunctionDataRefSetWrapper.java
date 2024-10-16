package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class McFunctionDataRefSetWrapper {

    
    private McFunctionDataRefSet mcFunctionDataRefSet;

    public McFunctionDataRefSetWrapper(McFunctionDataRefSet mcFunctionDataRefSet) {
        this.mcFunctionDataRefSet = mcFunctionDataRefSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(mcFunctionDataRefSet.getS())) {
            
            return mcFunctionDataRefSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(mcFunctionDataRefSet.getT())) {
            
            return mcFunctionDataRefSet.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<McFunctionDataRefSetConditionalWrapper> getMcFunctionDataRefSetVariants() {
        
        if (CollUtil.isNotEmpty(mcFunctionDataRefSet.getMcFunctionDataRefSetVariants())) {
            ArrayList<McFunctionDataRefSetConditional> originalList = mcFunctionDataRefSet.getMcFunctionDataRefSetVariants();
            ArrayList<McFunctionDataRefSetConditionalWrapper> wrapperList = (ArrayList<McFunctionDataRefSetConditionalWrapper>)originalList.stream()
                .map(item -> new McFunctionDataRefSetConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}