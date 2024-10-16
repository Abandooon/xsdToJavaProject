package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TriggerIPduSendConditionWrapper {

    
    private TriggerIPduSendCondition triggerIPduSendCondition;

    public TriggerIPduSendConditionWrapper(TriggerIPduSendCondition triggerIPduSendCondition) {
        this.triggerIPduSendCondition = triggerIPduSendCondition;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(triggerIPduSendCondition.getS())) {
            
            return triggerIPduSendCondition.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(triggerIPduSendCondition.getT())) {
            
            return triggerIPduSendCondition.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeDeclarationRefWrapper> getModeDeclarationRefs() {
        
        if (CollUtil.isNotEmpty(triggerIPduSendCondition.getModeDeclarationRefs())) {
            ArrayList<ModeDeclarationRef> originalList = triggerIPduSendCondition.getModeDeclarationRefs();
            ArrayList<ModeDeclarationRefWrapper> wrapperList = (ArrayList<ModeDeclarationRefWrapper>)originalList.stream()
                .map(item -> new ModeDeclarationRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}