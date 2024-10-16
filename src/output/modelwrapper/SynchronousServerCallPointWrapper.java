package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class SynchronousServerCallPointWrapper {

    
    private SynchronousServerCallPoint synchronousServerCallPoint;

    public SynchronousServerCallPointWrapper(SynchronousServerCallPoint synchronousServerCallPoint) {
        this.synchronousServerCallPoint = synchronousServerCallPoint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(synchronousServerCallPoint.getS())) {
            
            return synchronousServerCallPoint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(synchronousServerCallPoint.getT())) {
            
            return synchronousServerCallPoint.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(synchronousServerCallPoint.getUuid())) {
            
            return synchronousServerCallPoint.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(synchronousServerCallPoint.getShortName())) {
            
            return new IdentifierWrapper(synchronousServerCallPoint.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(synchronousServerCallPoint.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = synchronousServerCallPoint.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(synchronousServerCallPoint.getLongName())) {
            
            return new MultilanguageLongNameWrapper(synchronousServerCallPoint.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(synchronousServerCallPoint.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(synchronousServerCallPoint.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(synchronousServerCallPoint.getCategory())) {
            
            return new CategoryStringWrapper(synchronousServerCallPoint.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(synchronousServerCallPoint.getAdminData())) {
            
            return new AdminDataWrapper(synchronousServerCallPoint.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(synchronousServerCallPoint.getIntroduction())) {
            
            return new DocumentationBlockWrapper(synchronousServerCallPoint.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(synchronousServerCallPoint.getAnnotations())) {
            ArrayList<Annotation> originalList = synchronousServerCallPoint.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ROperationInAtomicSwcInstanceRefWrapper getOperationIref() {
        
        if (CollUtil.isNotEmpty(synchronousServerCallPoint.getOperationIref())) {
            
            return new ROperationInAtomicSwcInstanceRefWrapper(synchronousServerCallPoint.getOperationIref());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeout() {
        
        if (CollUtil.isNotEmpty(synchronousServerCallPoint.getTimeout())) {
            
            return new TimeValueWrapper(synchronousServerCallPoint.getTimeout());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(synchronousServerCallPoint.getVariationPoint())) {
            
            return new VariationPointWrapper(synchronousServerCallPoint.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public CalledFromWithinExclusiveAreaRefWrapper getCalledFromWithinExclusiveAreaRef() {
        
        if (CollUtil.isNotEmpty(synchronousServerCallPoint.getCalledFromWithinExclusiveAreaRef())) {
            
            return new CalledFromWithinExclusiveAreaRefWrapper(synchronousServerCallPoint.getCalledFromWithinExclusiveAreaRef());
            
        } else {
            return null;
        }
        
    }




    


    
}