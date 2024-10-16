package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class ExecutableEntityActivationReasonWrapper {

    
    private ExecutableEntityActivationReason executableEntityActivationReason;

    public ExecutableEntityActivationReasonWrapper(ExecutableEntityActivationReason executableEntityActivationReason) {
        this.executableEntityActivationReason = executableEntityActivationReason;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(executableEntityActivationReason.getS())) {
            
            return executableEntityActivationReason.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(executableEntityActivationReason.getT())) {
            
            return executableEntityActivationReason.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(executableEntityActivationReason.getShortName())) {
            
            return new IdentifierWrapper(executableEntityActivationReason.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(executableEntityActivationReason.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = executableEntityActivationReason.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CIdentifierWrapper getSymbol() {
        
        if (CollUtil.isNotEmpty(executableEntityActivationReason.getSymbol())) {
            
            return new CIdentifierWrapper(executableEntityActivationReason.getSymbol());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getBitPosition() {
        
        if (CollUtil.isNotEmpty(executableEntityActivationReason.getBitPosition())) {
            
            return new PositiveIntegerWrapper(executableEntityActivationReason.getBitPosition());
            
        } else {
            return null;
        }
        
    }




    


    
}