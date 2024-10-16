package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class AsynchronousServerCallResultPointWrapper {

    
    private AsynchronousServerCallResultPoint asynchronousServerCallResultPoint;

    public AsynchronousServerCallResultPointWrapper(AsynchronousServerCallResultPoint asynchronousServerCallResultPoint) {
        this.asynchronousServerCallResultPoint = asynchronousServerCallResultPoint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallResultPoint.getS())) {
            
            return asynchronousServerCallResultPoint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallResultPoint.getT())) {
            
            return asynchronousServerCallResultPoint.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallResultPoint.getUuid())) {
            
            return asynchronousServerCallResultPoint.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallResultPoint.getShortName())) {
            
            return new IdentifierWrapper(asynchronousServerCallResultPoint.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallResultPoint.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = asynchronousServerCallResultPoint.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallResultPoint.getLongName())) {
            
            return new MultilanguageLongNameWrapper(asynchronousServerCallResultPoint.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallResultPoint.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(asynchronousServerCallResultPoint.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallResultPoint.getCategory())) {
            
            return new CategoryStringWrapper(asynchronousServerCallResultPoint.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallResultPoint.getAdminData())) {
            
            return new AdminDataWrapper(asynchronousServerCallResultPoint.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallResultPoint.getIntroduction())) {
            
            return new DocumentationBlockWrapper(asynchronousServerCallResultPoint.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallResultPoint.getAnnotations())) {
            ArrayList<Annotation> originalList = asynchronousServerCallResultPoint.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public AsynchronousServerCallPointRefWrapper getAsynchronousServerCallPointRef() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallResultPoint.getAsynchronousServerCallPointRef())) {
            
            return new AsynchronousServerCallPointRefWrapper(asynchronousServerCallResultPoint.getAsynchronousServerCallPointRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallResultPoint.getVariationPoint())) {
            
            return new VariationPointWrapper(asynchronousServerCallResultPoint.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}