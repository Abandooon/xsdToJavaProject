package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class McFunctionDataRefSetConditionalWrapper {

    
    private McFunctionDataRefSetConditional mcFunctionDataRefSetConditional;

    public McFunctionDataRefSetConditionalWrapper(McFunctionDataRefSetConditional mcFunctionDataRefSetConditional) {
        this.mcFunctionDataRefSetConditional = mcFunctionDataRefSetConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(mcFunctionDataRefSetConditional.getS())) {
            
            return mcFunctionDataRefSetConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(mcFunctionDataRefSetConditional.getT())) {
            
            return mcFunctionDataRefSetConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<FlatMapEntryRefWrapper> getFlatMapEntryRefs() {
        
        if (CollUtil.isNotEmpty(mcFunctionDataRefSetConditional.getFlatMapEntryRefs())) {
            ArrayList<FlatMapEntryRef> originalList = mcFunctionDataRefSetConditional.getFlatMapEntryRefs();
            ArrayList<FlatMapEntryRefWrapper> wrapperList = (ArrayList<FlatMapEntryRefWrapper>)originalList.stream()
                .map(item -> new FlatMapEntryRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<McDataInstanceRefWrapper> getMcDataInstanceRefs() {
        
        if (CollUtil.isNotEmpty(mcFunctionDataRefSetConditional.getMcDataInstanceRefs())) {
            ArrayList<McDataInstanceRef> originalList = mcFunctionDataRefSetConditional.getMcDataInstanceRefs();
            ArrayList<McDataInstanceRefWrapper> wrapperList = (ArrayList<McDataInstanceRefWrapper>)originalList.stream()
                .map(item -> new McDataInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(mcFunctionDataRefSetConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(mcFunctionDataRefSetConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}