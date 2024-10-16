package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class BuildActionInvocatorWrapper {

    
    private BuildActionInvocator buildActionInvocator;

    public BuildActionInvocatorWrapper(BuildActionInvocator buildActionInvocator) {
        this.buildActionInvocator = buildActionInvocator;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(buildActionInvocator.getS())) {
            
            return buildActionInvocator.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(buildActionInvocator.getT())) {
            
            return buildActionInvocator.getT();
            
        } else {
            return null;
        }
        
    }

    public VerbatimStringWrapper getCommand() {
        
        if (CollUtil.isNotEmpty(buildActionInvocator.getCommand())) {
            
            return new VerbatimStringWrapper(buildActionInvocator.getCommand());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SdgWrapper> getSdgs() {
        
        if (CollUtil.isNotEmpty(buildActionInvocator.getSdgs())) {
            ArrayList<Sdg> originalList = buildActionInvocator.getSdgs();
            ArrayList<SdgWrapper> wrapperList = (ArrayList<SdgWrapper>)originalList.stream()
                .map(item -> new SdgWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}