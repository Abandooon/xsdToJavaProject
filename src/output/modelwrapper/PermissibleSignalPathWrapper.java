package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class PermissibleSignalPathWrapper {

    
    private PermissibleSignalPath permissibleSignalPath;

    public PermissibleSignalPathWrapper(PermissibleSignalPath permissibleSignalPath) {
        this.permissibleSignalPath = permissibleSignalPath;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(permissibleSignalPath.getS())) {
            
            return permissibleSignalPath.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(permissibleSignalPath.getT())) {
            
            return permissibleSignalPath.getT();
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(permissibleSignalPath.getIntroduction())) {
            
            return new DocumentationBlockWrapper(permissibleSignalPath.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(permissibleSignalPath.getVariationPoint())) {
            
            return new VariationPointWrapper(permissibleSignalPath.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcToSwcOperationArgumentsWrapper> getOperations() {
        
        if (CollUtil.isNotEmpty(permissibleSignalPath.getOperations())) {
            ArrayList<SwcToSwcOperationArguments> originalList = permissibleSignalPath.getOperations();
            ArrayList<SwcToSwcOperationArgumentsWrapper> wrapperList = (ArrayList<SwcToSwcOperationArgumentsWrapper>)originalList.stream()
                .map(item -> new SwcToSwcOperationArgumentsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PhysicalChannelRefWrapper> getPhysicalChannelRefs() {
        
        if (CollUtil.isNotEmpty(permissibleSignalPath.getPhysicalChannelRefs())) {
            ArrayList<PhysicalChannelRef> originalList = permissibleSignalPath.getPhysicalChannelRefs();
            ArrayList<PhysicalChannelRefWrapper> wrapperList = (ArrayList<PhysicalChannelRefWrapper>)originalList.stream()
                .map(item -> new PhysicalChannelRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcToSwcSignalWrapper> getSignals() {
        
        if (CollUtil.isNotEmpty(permissibleSignalPath.getSignals())) {
            ArrayList<SwcToSwcSignal> originalList = permissibleSignalPath.getSignals();
            ArrayList<SwcToSwcSignalWrapper> wrapperList = (ArrayList<SwcToSwcSignalWrapper>)originalList.stream()
                .map(item -> new SwcToSwcSignalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}