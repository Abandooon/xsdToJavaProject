package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class EndToEndDescriptionWrapper {

    
    private EndToEndDescription endToEndDescription;

    public EndToEndDescriptionWrapper(EndToEndDescription endToEndDescription) {
        this.endToEndDescription = endToEndDescription;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(endToEndDescription.getS())) {
            
            return endToEndDescription.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(endToEndDescription.getT())) {
            
            return endToEndDescription.getT();
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(endToEndDescription.getCategory())) {
            
            return new NmtokenStringWrapper(endToEndDescription.getCategory());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PositiveIntegerWrapper> getDataIds() {
        
        if (CollUtil.isNotEmpty(endToEndDescription.getDataIds())) {
            ArrayList<PositiveInteger> originalList = endToEndDescription.getDataIds();
            ArrayList<PositiveIntegerWrapper> wrapperList = (ArrayList<PositiveIntegerWrapper>)originalList.stream()
                .map(item -> new PositiveIntegerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getDataIdMode() {
        
        if (CollUtil.isNotEmpty(endToEndDescription.getDataIdMode())) {
            
            return new PositiveIntegerWrapper(endToEndDescription.getDataIdMode());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getDataLength() {
        
        if (CollUtil.isNotEmpty(endToEndDescription.getDataLength())) {
            
            return new PositiveIntegerWrapper(endToEndDescription.getDataLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxDeltaCounterInit() {
        
        if (CollUtil.isNotEmpty(endToEndDescription.getMaxDeltaCounterInit())) {
            
            return new PositiveIntegerWrapper(endToEndDescription.getMaxDeltaCounterInit());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getCrcOffset() {
        
        if (CollUtil.isNotEmpty(endToEndDescription.getCrcOffset())) {
            
            return new PositiveIntegerWrapper(endToEndDescription.getCrcOffset());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getCounterOffset() {
        
        if (CollUtil.isNotEmpty(endToEndDescription.getCounterOffset())) {
            
            return new PositiveIntegerWrapper(endToEndDescription.getCounterOffset());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxNoNewOrRepeatedData() {
        
        if (CollUtil.isNotEmpty(endToEndDescription.getMaxNoNewOrRepeatedData())) {
            
            return new PositiveIntegerWrapper(endToEndDescription.getMaxNoNewOrRepeatedData());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSyncCounterInit() {
        
        if (CollUtil.isNotEmpty(endToEndDescription.getSyncCounterInit())) {
            
            return new PositiveIntegerWrapper(endToEndDescription.getSyncCounterInit());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getDataIdNibbleOffset() {
        
        if (CollUtil.isNotEmpty(endToEndDescription.getDataIdNibbleOffset())) {
            
            return new PositiveIntegerWrapper(endToEndDescription.getDataIdNibbleOffset());
            
        } else {
            return null;
        }
        
    }




    


    
}