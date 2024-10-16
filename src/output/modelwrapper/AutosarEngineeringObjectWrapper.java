package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class AutosarEngineeringObjectWrapper {

    
    private AutosarEngineeringObject autosarEngineeringObject;

    public AutosarEngineeringObjectWrapper(AutosarEngineeringObject autosarEngineeringObject) {
        this.autosarEngineeringObject = autosarEngineeringObject;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(autosarEngineeringObject.getS())) {
            
            return autosarEngineeringObject.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(autosarEngineeringObject.getT())) {
            
            return autosarEngineeringObject.getT();
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(autosarEngineeringObject.getShortLabel())) {
            
            return new NmtokenStringWrapper(autosarEngineeringObject.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(autosarEngineeringObject.getCategory())) {
            
            return new NmtokenStringWrapper(autosarEngineeringObject.getCategory());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RevisionLabelStringWrapper> getRevisionLabels() {
        
        if (CollUtil.isNotEmpty(autosarEngineeringObject.getRevisionLabels())) {
            ArrayList<RevisionLabelString> originalList = autosarEngineeringObject.getRevisionLabels();
            ArrayList<RevisionLabelStringWrapper> wrapperList = (ArrayList<RevisionLabelStringWrapper>)originalList.stream()
                .map(item -> new RevisionLabelStringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getDomain() {
        
        if (CollUtil.isNotEmpty(autosarEngineeringObject.getDomain())) {
            
            return new NmtokenStringWrapper(autosarEngineeringObject.getDomain());
            
        } else {
            return null;
        }
        
    }




    


    
}