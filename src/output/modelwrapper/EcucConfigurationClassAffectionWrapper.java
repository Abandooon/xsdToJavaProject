package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class EcucConfigurationClassAffectionWrapper {

    
    private EcucConfigurationClassAffection ecucConfigurationClassAffection;

    public EcucConfigurationClassAffectionWrapper(EcucConfigurationClassAffection ecucConfigurationClassAffection) {
        this.ecucConfigurationClassAffection = ecucConfigurationClassAffection;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucConfigurationClassAffection.getS())) {
            
            return ecucConfigurationClassAffection.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucConfigurationClassAffection.getT())) {
            
            return ecucConfigurationClassAffection.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AffectedRefWrapper> getAffectedRefs() {
        
        if (CollUtil.isNotEmpty(ecucConfigurationClassAffection.getAffectedRefs())) {
            ArrayList<AffectedRef> originalList = ecucConfigurationClassAffection.getAffectedRefs();
            ArrayList<AffectedRefWrapper> wrapperList = (ArrayList<AffectedRefWrapper>)originalList.stream()
                .map(item -> new AffectedRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcucAffectionEnumWrapper getAffectionKind() {
        
        if (CollUtil.isNotEmpty(ecucConfigurationClassAffection.getAffectionKind())) {
            
            return new EcucAffectionEnumWrapper(ecucConfigurationClassAffection.getAffectionKind());
            
        } else {
            return null;
        }
        
    }




    


    
}