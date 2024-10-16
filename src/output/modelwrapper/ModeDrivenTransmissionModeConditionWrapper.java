package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ModeDrivenTransmissionModeConditionWrapper {

    
    private ModeDrivenTransmissionModeCondition modeDrivenTransmissionModeCondition;

    public ModeDrivenTransmissionModeConditionWrapper(ModeDrivenTransmissionModeCondition modeDrivenTransmissionModeCondition) {
        this.modeDrivenTransmissionModeCondition = modeDrivenTransmissionModeCondition;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modeDrivenTransmissionModeCondition.getS())) {
            
            return modeDrivenTransmissionModeCondition.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modeDrivenTransmissionModeCondition.getT())) {
            
            return modeDrivenTransmissionModeCondition.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeDeclarationRefWrapper> getModeDeclarationRefs() {
        
        if (CollUtil.isNotEmpty(modeDrivenTransmissionModeCondition.getModeDeclarationRefs())) {
            ArrayList<ModeDeclarationRef> originalList = modeDrivenTransmissionModeCondition.getModeDeclarationRefs();
            ArrayList<ModeDeclarationRefWrapper> wrapperList = (ArrayList<ModeDeclarationRefWrapper>)originalList.stream()
                .map(item -> new ModeDeclarationRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}