package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ForbiddenSignalPathWrapper {

    
    private ForbiddenSignalPath forbiddenSignalPath;

    public ForbiddenSignalPathWrapper(ForbiddenSignalPath forbiddenSignalPath) {
        this.forbiddenSignalPath = forbiddenSignalPath;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(forbiddenSignalPath.getS())) {
            
            return forbiddenSignalPath.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(forbiddenSignalPath.getT())) {
            
            return forbiddenSignalPath.getT();
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(forbiddenSignalPath.getIntroduction())) {
            
            return new DocumentationBlockWrapper(forbiddenSignalPath.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(forbiddenSignalPath.getVariationPoint())) {
            
            return new VariationPointWrapper(forbiddenSignalPath.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcToSwcOperationArgumentsWrapper> getOperations() {
        
        if (CollUtil.isNotEmpty(forbiddenSignalPath.getOperations())) {
            ArrayList<SwcToSwcOperationArguments> originalList = forbiddenSignalPath.getOperations();
            ArrayList<SwcToSwcOperationArgumentsWrapper> wrapperList = (ArrayList<SwcToSwcOperationArgumentsWrapper>)originalList.stream()
                .map(item -> new SwcToSwcOperationArgumentsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PhysicalChannelRefWrapper> getPhysicalChannelRefs() {
        
        if (CollUtil.isNotEmpty(forbiddenSignalPath.getPhysicalChannelRefs())) {
            ArrayList<PhysicalChannelRef> originalList = forbiddenSignalPath.getPhysicalChannelRefs();
            ArrayList<PhysicalChannelRefWrapper> wrapperList = (ArrayList<PhysicalChannelRefWrapper>)originalList.stream()
                .map(item -> new PhysicalChannelRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcToSwcSignalWrapper> getSignals() {
        
        if (CollUtil.isNotEmpty(forbiddenSignalPath.getSignals())) {
            ArrayList<SwcToSwcSignal> originalList = forbiddenSignalPath.getSignals();
            ArrayList<SwcToSwcSignalWrapper> wrapperList = (ArrayList<SwcToSwcSignalWrapper>)originalList.stream()
                .map(item -> new SwcToSwcSignalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}