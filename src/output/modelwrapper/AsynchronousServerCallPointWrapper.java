package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class AsynchronousServerCallPointWrapper {

    
    private AsynchronousServerCallPoint asynchronousServerCallPoint;

    public AsynchronousServerCallPointWrapper(AsynchronousServerCallPoint asynchronousServerCallPoint) {
        this.asynchronousServerCallPoint = asynchronousServerCallPoint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallPoint.getS())) {
            
            return asynchronousServerCallPoint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallPoint.getT())) {
            
            return asynchronousServerCallPoint.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallPoint.getUuid())) {
            
            return asynchronousServerCallPoint.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallPoint.getShortName())) {
            
            return new IdentifierWrapper(asynchronousServerCallPoint.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallPoint.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = asynchronousServerCallPoint.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallPoint.getLongName())) {
            
            return new MultilanguageLongNameWrapper(asynchronousServerCallPoint.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallPoint.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(asynchronousServerCallPoint.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallPoint.getCategory())) {
            
            return new CategoryStringWrapper(asynchronousServerCallPoint.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallPoint.getAdminData())) {
            
            return new AdminDataWrapper(asynchronousServerCallPoint.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallPoint.getIntroduction())) {
            
            return new DocumentationBlockWrapper(asynchronousServerCallPoint.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallPoint.getAnnotations())) {
            ArrayList<Annotation> originalList = asynchronousServerCallPoint.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ROperationInAtomicSwcInstanceRefWrapper getOperationIref() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallPoint.getOperationIref())) {
            
            return new ROperationInAtomicSwcInstanceRefWrapper(asynchronousServerCallPoint.getOperationIref());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeout() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallPoint.getTimeout())) {
            
            return new TimeValueWrapper(asynchronousServerCallPoint.getTimeout());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(asynchronousServerCallPoint.getVariationPoint())) {
            
            return new VariationPointWrapper(asynchronousServerCallPoint.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}