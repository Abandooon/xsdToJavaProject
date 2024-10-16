package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    


public class SystemSignalWrapper {

    
    private SystemSignal systemSignal;

    public SystemSignalWrapper(SystemSignal systemSignal) {
        this.systemSignal = systemSignal;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(systemSignal.getS())) {
            
            return systemSignal.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(systemSignal.getT())) {
            
            return systemSignal.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(systemSignal.getUuid())) {
            
            return systemSignal.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(systemSignal.getShortName())) {
            
            return new IdentifierWrapper(systemSignal.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(systemSignal.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = systemSignal.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(systemSignal.getLongName())) {
            
            return new MultilanguageLongNameWrapper(systemSignal.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(systemSignal.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(systemSignal.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(systemSignal.getCategory())) {
            
            return new CategoryStringWrapper(systemSignal.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(systemSignal.getAdminData())) {
            
            return new AdminDataWrapper(systemSignal.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(systemSignal.getIntroduction())) {
            
            return new DocumentationBlockWrapper(systemSignal.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(systemSignal.getAnnotations())) {
            ArrayList<Annotation> originalList = systemSignal.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(systemSignal.getVariationPoint())) {
            
            return new VariationPointWrapper(systemSignal.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getDynamicLength() {
        
        if (CollUtil.isNotEmpty(systemSignal.getDynamicLength())) {
            
            return new BooleanWrapper(systemSignal.getDynamicLength());
            
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getPhysicalProps() {
        
        if (CollUtil.isNotEmpty(systemSignal.getPhysicalProps())) {
            
            return new SwDataDefPropsWrapper(systemSignal.getPhysicalProps());
            
        } else {
            return null;
        }
        
    }




    


    
}