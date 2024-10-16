package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class FilterDebouncingEnumWrapper {

    
    private FilterDebouncingEnum filterDebouncingEnum;

    public FilterDebouncingEnumWrapper(FilterDebouncingEnum filterDebouncingEnum) {
        this.filterDebouncingEnum = filterDebouncingEnum;
    }

   
    public FilterDebouncingEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(filterDebouncingEnum.getValue())) {
            
            return filterDebouncingEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(filterDebouncingEnum.getS())) {
            
            return filterDebouncingEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(filterDebouncingEnum.getT())) {
            
            return filterDebouncingEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}