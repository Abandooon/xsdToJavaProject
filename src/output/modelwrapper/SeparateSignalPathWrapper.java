package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class SeparateSignalPathWrapper {

    
    private SeparateSignalPath separateSignalPath;

    public SeparateSignalPathWrapper(SeparateSignalPath separateSignalPath) {
        this.separateSignalPath = separateSignalPath;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(separateSignalPath.getS())) {
            
            return separateSignalPath.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(separateSignalPath.getT())) {
            
            return separateSignalPath.getT();
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(separateSignalPath.getIntroduction())) {
            
            return new DocumentationBlockWrapper(separateSignalPath.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(separateSignalPath.getVariationPoint())) {
            
            return new VariationPointWrapper(separateSignalPath.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcToSwcOperationArgumentsWrapper> getOperations() {
        
        if (CollUtil.isNotEmpty(separateSignalPath.getOperations())) {
            ArrayList<SwcToSwcOperationArguments> originalList = separateSignalPath.getOperations();
            ArrayList<SwcToSwcOperationArgumentsWrapper> wrapperList = (ArrayList<SwcToSwcOperationArgumentsWrapper>)originalList.stream()
                .map(item -> new SwcToSwcOperationArgumentsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcToSwcSignalWrapper> getSignals() {
        
        if (CollUtil.isNotEmpty(separateSignalPath.getSignals())) {
            ArrayList<SwcToSwcSignal> originalList = separateSignalPath.getSignals();
            ArrayList<SwcToSwcSignalWrapper> wrapperList = (ArrayList<SwcToSwcSignalWrapper>)originalList.stream()
                .map(item -> new SwcToSwcSignalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}