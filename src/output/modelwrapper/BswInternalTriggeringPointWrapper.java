package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class BswInternalTriggeringPointWrapper {

    
    private BswInternalTriggeringPoint bswInternalTriggeringPoint;

    public BswInternalTriggeringPointWrapper(BswInternalTriggeringPoint bswInternalTriggeringPoint) {
        this.bswInternalTriggeringPoint = bswInternalTriggeringPoint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggeringPoint.getS())) {
            
            return bswInternalTriggeringPoint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggeringPoint.getT())) {
            
            return bswInternalTriggeringPoint.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggeringPoint.getUuid())) {
            
            return bswInternalTriggeringPoint.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggeringPoint.getShortName())) {
            
            return new IdentifierWrapper(bswInternalTriggeringPoint.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggeringPoint.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswInternalTriggeringPoint.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggeringPoint.getLongName())) {
            
            return new MultilanguageLongNameWrapper(bswInternalTriggeringPoint.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggeringPoint.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(bswInternalTriggeringPoint.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggeringPoint.getCategory())) {
            
            return new CategoryStringWrapper(bswInternalTriggeringPoint.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggeringPoint.getAdminData())) {
            
            return new AdminDataWrapper(bswInternalTriggeringPoint.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggeringPoint.getIntroduction())) {
            
            return new DocumentationBlockWrapper(bswInternalTriggeringPoint.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggeringPoint.getAnnotations())) {
            ArrayList<Annotation> originalList = bswInternalTriggeringPoint.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SwImplPolicyEnumWrapper getSwImplPolicy() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggeringPoint.getSwImplPolicy())) {
            
            return new SwImplPolicyEnumWrapper(bswInternalTriggeringPoint.getSwImplPolicy());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswInternalTriggeringPoint.getVariationPoint())) {
            
            return new VariationPointWrapper(bswInternalTriggeringPoint.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}