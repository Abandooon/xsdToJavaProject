package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ApplicationValueSpecificationWrapper {

    
    private ApplicationValueSpecification applicationValueSpecification;

    public ApplicationValueSpecificationWrapper(ApplicationValueSpecification applicationValueSpecification) {
        this.applicationValueSpecification = applicationValueSpecification;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(applicationValueSpecification.getS())) {
            
            return applicationValueSpecification.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(applicationValueSpecification.getT())) {
            
            return applicationValueSpecification.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(applicationValueSpecification.getShortLabel())) {
            
            return new IdentifierWrapper(applicationValueSpecification.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(applicationValueSpecification.getVariationPoint())) {
            
            return new VariationPointWrapper(applicationValueSpecification.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(applicationValueSpecification.getCategory())) {
            
            return new IdentifierWrapper(applicationValueSpecification.getCategory());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwAxisContWrapper> getSwAxisConts() {
        
        if (CollUtil.isNotEmpty(applicationValueSpecification.getSwAxisConts())) {
            ArrayList<SwAxisCont> originalList = applicationValueSpecification.getSwAxisConts();
            ArrayList<SwAxisContWrapper> wrapperList = (ArrayList<SwAxisContWrapper>)originalList.stream()
                .map(item -> new SwAxisContWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SwValueContWrapper getSwValueCont() {
        
        if (CollUtil.isNotEmpty(applicationValueSpecification.getSwValueCont())) {
            
            return new SwValueContWrapper(applicationValueSpecification.getSwValueCont());
            
        } else {
            return null;
        }
        
    }




    


    
}