package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class SwDataDefPropsWrapper {

    
    private SwDataDefProps swDataDefProps;

    public SwDataDefPropsWrapper(SwDataDefProps swDataDefProps) {
        this.swDataDefProps = swDataDefProps;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swDataDefProps.getS())) {
            
            return swDataDefProps.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swDataDefProps.getT())) {
            
            return swDataDefProps.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwDataDefPropsConditionalWrapper> getSwDataDefPropsVariants() {
        
        if (CollUtil.isNotEmpty(swDataDefProps.getSwDataDefPropsVariants())) {
            ArrayList<SwDataDefPropsConditional> originalList = swDataDefProps.getSwDataDefPropsVariants();
            ArrayList<SwDataDefPropsConditionalWrapper> wrapperList = (ArrayList<SwDataDefPropsConditionalWrapper>)originalList.stream()
                .map(item -> new SwDataDefPropsConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}