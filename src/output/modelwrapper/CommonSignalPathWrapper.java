package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class CommonSignalPathWrapper {

    
    private CommonSignalPath commonSignalPath;

    public CommonSignalPathWrapper(CommonSignalPath commonSignalPath) {
        this.commonSignalPath = commonSignalPath;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(commonSignalPath.getS())) {
            
            return commonSignalPath.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(commonSignalPath.getT())) {
            
            return commonSignalPath.getT();
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(commonSignalPath.getIntroduction())) {
            
            return new DocumentationBlockWrapper(commonSignalPath.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(commonSignalPath.getVariationPoint())) {
            
            return new VariationPointWrapper(commonSignalPath.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcToSwcOperationArgumentsWrapper> getOperations() {
        
        if (CollUtil.isNotEmpty(commonSignalPath.getOperations())) {
            ArrayList<SwcToSwcOperationArguments> originalList = commonSignalPath.getOperations();
            ArrayList<SwcToSwcOperationArgumentsWrapper> wrapperList = (ArrayList<SwcToSwcOperationArgumentsWrapper>)originalList.stream()
                .map(item -> new SwcToSwcOperationArgumentsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcToSwcSignalWrapper> getSignals() {
        
        if (CollUtil.isNotEmpty(commonSignalPath.getSignals())) {
            ArrayList<SwcToSwcSignal> originalList = commonSignalPath.getSignals();
            ArrayList<SwcToSwcSignalWrapper> wrapperList = (ArrayList<SwcToSwcSignalWrapper>)originalList.stream()
                .map(item -> new SwcToSwcSignalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}