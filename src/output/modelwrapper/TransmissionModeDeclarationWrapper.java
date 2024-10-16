package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class TransmissionModeDeclarationWrapper {

    
    private TransmissionModeDeclaration transmissionModeDeclaration;

    public TransmissionModeDeclarationWrapper(TransmissionModeDeclaration transmissionModeDeclaration) {
        this.transmissionModeDeclaration = transmissionModeDeclaration;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(transmissionModeDeclaration.getS())) {
            
            return transmissionModeDeclaration.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(transmissionModeDeclaration.getT())) {
            
            return transmissionModeDeclaration.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeDrivenTransmissionModeConditionWrapper> getModeDrivenFalseConditions() {
        
        if (CollUtil.isNotEmpty(transmissionModeDeclaration.getModeDrivenFalseConditions())) {
            ArrayList<ModeDrivenTransmissionModeCondition> originalList = transmissionModeDeclaration.getModeDrivenFalseConditions();
            ArrayList<ModeDrivenTransmissionModeConditionWrapper> wrapperList = (ArrayList<ModeDrivenTransmissionModeConditionWrapper>)originalList.stream()
                .map(item -> new ModeDrivenTransmissionModeConditionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeDrivenTransmissionModeConditionWrapper> getModeDrivenTrueConditions() {
        
        if (CollUtil.isNotEmpty(transmissionModeDeclaration.getModeDrivenTrueConditions())) {
            ArrayList<ModeDrivenTransmissionModeCondition> originalList = transmissionModeDeclaration.getModeDrivenTrueConditions();
            ArrayList<ModeDrivenTransmissionModeConditionWrapper> wrapperList = (ArrayList<ModeDrivenTransmissionModeConditionWrapper>)originalList.stream()
                .map(item -> new ModeDrivenTransmissionModeConditionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TransmissionModeConditionWrapper> getTransmissionModeConditions() {
        
        if (CollUtil.isNotEmpty(transmissionModeDeclaration.getTransmissionModeConditions())) {
            ArrayList<TransmissionModeCondition> originalList = transmissionModeDeclaration.getTransmissionModeConditions();
            ArrayList<TransmissionModeConditionWrapper> wrapperList = (ArrayList<TransmissionModeConditionWrapper>)originalList.stream()
                .map(item -> new TransmissionModeConditionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TransmissionModeTimingWrapper getTransmissionModeFalseTiming() {
        
        if (CollUtil.isNotEmpty(transmissionModeDeclaration.getTransmissionModeFalseTiming())) {
            
            return new TransmissionModeTimingWrapper(transmissionModeDeclaration.getTransmissionModeFalseTiming());
            
        } else {
            return null;
        }
        
    }

    public TransmissionModeTimingWrapper getTransmissionModeTrueTiming() {
        
        if (CollUtil.isNotEmpty(transmissionModeDeclaration.getTransmissionModeTrueTiming())) {
            
            return new TransmissionModeTimingWrapper(transmissionModeDeclaration.getTransmissionModeTrueTiming());
            
        } else {
            return null;
        }
        
    }




    


    
}