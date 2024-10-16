package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class TdEventBswModuleWrapper {

    
    private TdEventBswModule tdEventBswModule;

    public TdEventBswModuleWrapper(TdEventBswModule tdEventBswModule) {
        this.tdEventBswModule = tdEventBswModule;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventBswModule.getS())) {
            
            return tdEventBswModule.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventBswModule.getT())) {
            
            return tdEventBswModule.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(tdEventBswModule.getUuid())) {
            
            return tdEventBswModule.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(tdEventBswModule.getShortName())) {
            
            return new IdentifierWrapper(tdEventBswModule.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(tdEventBswModule.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = tdEventBswModule.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(tdEventBswModule.getLongName())) {
            
            return new MultilanguageLongNameWrapper(tdEventBswModule.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(tdEventBswModule.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(tdEventBswModule.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(tdEventBswModule.getCategory())) {
            
            return new CategoryStringWrapper(tdEventBswModule.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(tdEventBswModule.getAdminData())) {
            
            return new AdminDataWrapper(tdEventBswModule.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(tdEventBswModule.getIntroduction())) {
            
            return new DocumentationBlockWrapper(tdEventBswModule.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(tdEventBswModule.getAnnotations())) {
            ArrayList<Annotation> originalList = tdEventBswModule.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(tdEventBswModule.getVariationPoint())) {
            
            return new VariationPointWrapper(tdEventBswModule.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TdEventOccurrenceExpressionWrapper getOccurrenceExpression() {
        
        if (CollUtil.isNotEmpty(tdEventBswModule.getOccurrenceExpression())) {
            
            return new TdEventOccurrenceExpressionWrapper(tdEventBswModule.getOccurrenceExpression());
            
        } else {
            return null;
        }
        
    }

    public BswModuleDescriptionRefWrapper getBswModuleDescriptionRef() {
        
        if (CollUtil.isNotEmpty(tdEventBswModule.getBswModuleDescriptionRef())) {
            
            return new BswModuleDescriptionRefWrapper(tdEventBswModule.getBswModuleDescriptionRef());
            
        } else {
            return null;
        }
        
    }

    public BswModuleEntryRefWrapper getBswModuleEntryRef() {
        
        if (CollUtil.isNotEmpty(tdEventBswModule.getBswModuleEntryRef())) {
            
            return new BswModuleEntryRefWrapper(tdEventBswModule.getBswModuleEntryRef());
            
        } else {
            return null;
        }
        
    }

    public TdEventBswModuleTypeEnumWrapper getTdEventBswModuleType() {
        
        if (CollUtil.isNotEmpty(tdEventBswModule.getTdEventBswModuleType())) {
            
            return new TdEventBswModuleTypeEnumWrapper(tdEventBswModule.getTdEventBswModuleType());
            
        } else {
            return null;
        }
        
    }




    


    
}