package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class SoAdRoutingGroupWrapper {

    
    private SoAdRoutingGroup soAdRoutingGroup;

    public SoAdRoutingGroupWrapper(SoAdRoutingGroup soAdRoutingGroup) {
        this.soAdRoutingGroup = soAdRoutingGroup;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(soAdRoutingGroup.getS())) {
            
            return soAdRoutingGroup.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(soAdRoutingGroup.getT())) {
            
            return soAdRoutingGroup.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(soAdRoutingGroup.getUuid())) {
            
            return soAdRoutingGroup.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(soAdRoutingGroup.getShortName())) {
            
            return new IdentifierWrapper(soAdRoutingGroup.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(soAdRoutingGroup.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = soAdRoutingGroup.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(soAdRoutingGroup.getLongName())) {
            
            return new MultilanguageLongNameWrapper(soAdRoutingGroup.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(soAdRoutingGroup.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(soAdRoutingGroup.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(soAdRoutingGroup.getCategory())) {
            
            return new CategoryStringWrapper(soAdRoutingGroup.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(soAdRoutingGroup.getAdminData())) {
            
            return new AdminDataWrapper(soAdRoutingGroup.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(soAdRoutingGroup.getIntroduction())) {
            
            return new DocumentationBlockWrapper(soAdRoutingGroup.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(soAdRoutingGroup.getAnnotations())) {
            ArrayList<Annotation> originalList = soAdRoutingGroup.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(soAdRoutingGroup.getVariationPoint())) {
            
            return new VariationPointWrapper(soAdRoutingGroup.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public EventGroupControlTypeEnumWrapper getEventGroupControlType() {
        
        if (CollUtil.isNotEmpty(soAdRoutingGroup.getEventGroupControlType())) {
            
            return new EventGroupControlTypeEnumWrapper(soAdRoutingGroup.getEventGroupControlType());
            
        } else {
            return null;
        }
        
    }




    


    
}