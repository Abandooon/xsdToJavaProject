package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class InternalTriggeringPointWrapper {

    
    private InternalTriggeringPoint internalTriggeringPoint;

    public InternalTriggeringPointWrapper(InternalTriggeringPoint internalTriggeringPoint) {
        this.internalTriggeringPoint = internalTriggeringPoint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(internalTriggeringPoint.getS())) {
            
            return internalTriggeringPoint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(internalTriggeringPoint.getT())) {
            
            return internalTriggeringPoint.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(internalTriggeringPoint.getUuid())) {
            
            return internalTriggeringPoint.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(internalTriggeringPoint.getShortName())) {
            
            return new IdentifierWrapper(internalTriggeringPoint.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(internalTriggeringPoint.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = internalTriggeringPoint.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(internalTriggeringPoint.getLongName())) {
            
            return new MultilanguageLongNameWrapper(internalTriggeringPoint.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(internalTriggeringPoint.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(internalTriggeringPoint.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(internalTriggeringPoint.getCategory())) {
            
            return new CategoryStringWrapper(internalTriggeringPoint.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(internalTriggeringPoint.getAdminData())) {
            
            return new AdminDataWrapper(internalTriggeringPoint.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(internalTriggeringPoint.getIntroduction())) {
            
            return new DocumentationBlockWrapper(internalTriggeringPoint.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(internalTriggeringPoint.getAnnotations())) {
            ArrayList<Annotation> originalList = internalTriggeringPoint.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SwImplPolicyEnumWrapper getSwImplPolicy() {
        
        if (CollUtil.isNotEmpty(internalTriggeringPoint.getSwImplPolicy())) {
            
            return new SwImplPolicyEnumWrapper(internalTriggeringPoint.getSwImplPolicy());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(internalTriggeringPoint.getVariationPoint())) {
            
            return new VariationPointWrapper(internalTriggeringPoint.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}