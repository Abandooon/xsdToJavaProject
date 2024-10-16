package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class DataFilterWrapper {

    
    private DataFilter dataFilter;

    public DataFilterWrapper(DataFilter dataFilter) {
        this.dataFilter = dataFilter;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dataFilter.getS())) {
            
            return dataFilter.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dataFilter.getT())) {
            
            return dataFilter.getT();
            
        } else {
            return null;
        }
        
    }

    public DataFilterTypeEnumWrapper getDataFilterType() {
        
        if (CollUtil.isNotEmpty(dataFilter.getDataFilterType())) {
            
            return new DataFilterTypeEnumWrapper(dataFilter.getDataFilterType());
            
        } else {
            return null;
        }
        
    }

    public UnlimitedIntegerWrapper getMask() {
        
        if (CollUtil.isNotEmpty(dataFilter.getMask())) {
            
            return new UnlimitedIntegerWrapper(dataFilter.getMask());
            
        } else {
            return null;
        }
        
    }

    public UnlimitedIntegerWrapper getMax() {
        
        if (CollUtil.isNotEmpty(dataFilter.getMax())) {
            
            return new UnlimitedIntegerWrapper(dataFilter.getMax());
            
        } else {
            return null;
        }
        
    }

    public UnlimitedIntegerWrapper getMin() {
        
        if (CollUtil.isNotEmpty(dataFilter.getMin())) {
            
            return new UnlimitedIntegerWrapper(dataFilter.getMin());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getOffset() {
        
        if (CollUtil.isNotEmpty(dataFilter.getOffset())) {
            
            return new PositiveIntegerWrapper(dataFilter.getOffset());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getPeriod() {
        
        if (CollUtil.isNotEmpty(dataFilter.getPeriod())) {
            
            return new PositiveIntegerWrapper(dataFilter.getPeriod());
            
        } else {
            return null;
        }
        
    }

    public UnlimitedIntegerWrapper getX() {
        
        if (CollUtil.isNotEmpty(dataFilter.getX())) {
            
            return new UnlimitedIntegerWrapper(dataFilter.getX());
            
        } else {
            return null;
        }
        
    }




    


    
}