package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class IncludedModeDeclarationGroupSetWrapper {

    
    private IncludedModeDeclarationGroupSet includedModeDeclarationGroupSet;

    public IncludedModeDeclarationGroupSetWrapper(IncludedModeDeclarationGroupSet includedModeDeclarationGroupSet) {
        this.includedModeDeclarationGroupSet = includedModeDeclarationGroupSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(includedModeDeclarationGroupSet.getS())) {
            
            return includedModeDeclarationGroupSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(includedModeDeclarationGroupSet.getT())) {
            
            return includedModeDeclarationGroupSet.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeDeclarationGroupRefWrapper> getModeDeclarationGroupRefs() {
        
        if (CollUtil.isNotEmpty(includedModeDeclarationGroupSet.getModeDeclarationGroupRefs())) {
            ArrayList<ModeDeclarationGroupRef> originalList = includedModeDeclarationGroupSet.getModeDeclarationGroupRefs();
            ArrayList<ModeDeclarationGroupRefWrapper> wrapperList = (ArrayList<ModeDeclarationGroupRefWrapper>)originalList.stream()
                .map(item -> new ModeDeclarationGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getPrefix() {
        
        if (CollUtil.isNotEmpty(includedModeDeclarationGroupSet.getPrefix())) {
            
            return new IdentifierWrapper(includedModeDeclarationGroupSet.getPrefix());
            
        } else {
            return null;
        }
        
    }




    


    
}