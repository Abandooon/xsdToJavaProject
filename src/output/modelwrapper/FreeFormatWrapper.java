package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class FreeFormatWrapper {

    
    private FreeFormat freeFormat;

    public FreeFormatWrapper(FreeFormat freeFormat) {
        this.freeFormat = freeFormat;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(freeFormat.getS())) {
            
            return freeFormat.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(freeFormat.getT())) {
            
            return freeFormat.getT();
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(freeFormat.getIntroduction())) {
            
            return new DocumentationBlockWrapper(freeFormat.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getDelay() {
        
        if (CollUtil.isNotEmpty(freeFormat.getDelay())) {
            
            return new TimeValueWrapper(freeFormat.getDelay());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getPositionInTable() {
        
        if (CollUtil.isNotEmpty(freeFormat.getPositionInTable())) {
            
            return new IntegerWrapper(freeFormat.getPositionInTable());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<IntegerWrapper> getByteValues() {
        
        if (CollUtil.isNotEmpty(freeFormat.getByteValues())) {
            ArrayList<Integer> originalList = freeFormat.getByteValues();
            ArrayList<IntegerWrapper> wrapperList = (ArrayList<IntegerWrapper>)originalList.stream()
                .map(item -> new IntegerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}