package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class ReferencesWrapper {

    
    private References references;

    public ReferencesWrapper(References references) {
        this.references = references;
    }

   
    public ArrayList<EcucChoiceReferenceDefWrapper> getEcucChoiceReferenceDef() {
        
        if (CollUtil.isNotEmpty(references.getEcucChoiceReferenceDef())) {
            ArrayList<EcucChoiceReferenceDef> originalList = references.getEcucChoiceReferenceDef();
            ArrayList<EcucChoiceReferenceDefWrapper> wrapperList = (ArrayList<EcucChoiceReferenceDefWrapper>)originalList.stream()
                .map(item -> new EcucChoiceReferenceDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucForeignReferenceDefWrapper> getEcucForeignReferenceDef() {
        
        if (CollUtil.isNotEmpty(references.getEcucForeignReferenceDef())) {
            ArrayList<EcucForeignReferenceDef> originalList = references.getEcucForeignReferenceDef();
            ArrayList<EcucForeignReferenceDefWrapper> wrapperList = (ArrayList<EcucForeignReferenceDefWrapper>)originalList.stream()
                .map(item -> new EcucForeignReferenceDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucInstanceReferenceDefWrapper> getEcucInstanceReferenceDef() {
        
        if (CollUtil.isNotEmpty(references.getEcucInstanceReferenceDef())) {
            ArrayList<EcucInstanceReferenceDef> originalList = references.getEcucInstanceReferenceDef();
            ArrayList<EcucInstanceReferenceDefWrapper> wrapperList = (ArrayList<EcucInstanceReferenceDefWrapper>)originalList.stream()
                .map(item -> new EcucInstanceReferenceDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucReferenceDefWrapper> getEcucReferenceDef() {
        
        if (CollUtil.isNotEmpty(references.getEcucReferenceDef())) {
            ArrayList<EcucReferenceDef> originalList = references.getEcucReferenceDef();
            ArrayList<EcucReferenceDefWrapper> wrapperList = (ArrayList<EcucReferenceDefWrapper>)originalList.stream()
                .map(item -> new EcucReferenceDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucSymbolicNameReferenceDefWrapper> getEcucSymbolicNameReferenceDef() {
        
        if (CollUtil.isNotEmpty(references.getEcucSymbolicNameReferenceDef())) {
            ArrayList<EcucSymbolicNameReferenceDef> originalList = references.getEcucSymbolicNameReferenceDef();
            ArrayList<EcucSymbolicNameReferenceDefWrapper> wrapperList = (ArrayList<EcucSymbolicNameReferenceDefWrapper>)originalList.stream()
                .map(item -> new EcucSymbolicNameReferenceDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucUriReferenceDefWrapper> getEcucUriReferenceDef() {
        
        if (CollUtil.isNotEmpty(references.getEcucUriReferenceDef())) {
            ArrayList<EcucUriReferenceDef> originalList = references.getEcucUriReferenceDef();
            ArrayList<EcucUriReferenceDefWrapper> wrapperList = (ArrayList<EcucUriReferenceDefWrapper>)originalList.stream()
                .map(item -> new EcucUriReferenceDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}