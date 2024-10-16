package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class BlueprintPolicysWrapper {

    
    private BlueprintPolicys blueprintPolicys;

    public BlueprintPolicysWrapper(BlueprintPolicys blueprintPolicys) {
        this.blueprintPolicys = blueprintPolicys;
    }

   
    public ArrayList<BlueprintPolicyListWrapper> getBlueprintPolicyList() {
        
        if (CollUtil.isNotEmpty(blueprintPolicys.getBlueprintPolicyList())) {
            ArrayList<BlueprintPolicyList> originalList = blueprintPolicys.getBlueprintPolicyList();
            ArrayList<BlueprintPolicyListWrapper> wrapperList = (ArrayList<BlueprintPolicyListWrapper>)originalList.stream()
                .map(item -> new BlueprintPolicyListWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BlueprintPolicyNotModifiableWrapper> getBlueprintPolicyNotModifiable() {
        
        if (CollUtil.isNotEmpty(blueprintPolicys.getBlueprintPolicyNotModifiable())) {
            ArrayList<BlueprintPolicyNotModifiable> originalList = blueprintPolicys.getBlueprintPolicyNotModifiable();
            ArrayList<BlueprintPolicyNotModifiableWrapper> wrapperList = (ArrayList<BlueprintPolicyNotModifiableWrapper>)originalList.stream()
                .map(item -> new BlueprintPolicyNotModifiableWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BlueprintPolicySingleWrapper> getBlueprintPolicySingle() {
        
        if (CollUtil.isNotEmpty(blueprintPolicys.getBlueprintPolicySingle())) {
            ArrayList<BlueprintPolicySingle> originalList = blueprintPolicys.getBlueprintPolicySingle();
            ArrayList<BlueprintPolicySingleWrapper> wrapperList = (ArrayList<BlueprintPolicySingleWrapper>)originalList.stream()
                .map(item -> new BlueprintPolicySingleWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}