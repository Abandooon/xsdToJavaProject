package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class TdEventBswModeDeclarationWrapper {

    
    private TdEventBswModeDeclaration tdEventBswModeDeclaration;

    public TdEventBswModeDeclarationWrapper(TdEventBswModeDeclaration tdEventBswModeDeclaration) {
        this.tdEventBswModeDeclaration = tdEventBswModeDeclaration;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventBswModeDeclaration.getS())) {
            
            return tdEventBswModeDeclaration.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventBswModeDeclaration.getT())) {
            
            return tdEventBswModeDeclaration.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(tdEventBswModeDeclaration.getUuid())) {
            
            return tdEventBswModeDeclaration.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(tdEventBswModeDeclaration.getShortName())) {
            
            return new IdentifierWrapper(tdEventBswModeDeclaration.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(tdEventBswModeDeclaration.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = tdEventBswModeDeclaration.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(tdEventBswModeDeclaration.getLongName())) {
            
            return new MultilanguageLongNameWrapper(tdEventBswModeDeclaration.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(tdEventBswModeDeclaration.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(tdEventBswModeDeclaration.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(tdEventBswModeDeclaration.getCategory())) {
            
            return new CategoryStringWrapper(tdEventBswModeDeclaration.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(tdEventBswModeDeclaration.getAdminData())) {
            
            return new AdminDataWrapper(tdEventBswModeDeclaration.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(tdEventBswModeDeclaration.getIntroduction())) {
            
            return new DocumentationBlockWrapper(tdEventBswModeDeclaration.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(tdEventBswModeDeclaration.getAnnotations())) {
            ArrayList<Annotation> originalList = tdEventBswModeDeclaration.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(tdEventBswModeDeclaration.getVariationPoint())) {
            
            return new VariationPointWrapper(tdEventBswModeDeclaration.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TdEventOccurrenceExpressionWrapper getOccurrenceExpression() {
        
        if (CollUtil.isNotEmpty(tdEventBswModeDeclaration.getOccurrenceExpression())) {
            
            return new TdEventOccurrenceExpressionWrapper(tdEventBswModeDeclaration.getOccurrenceExpression());
            
        } else {
            return null;
        }
        
    }

    public BswModuleDescriptionRefWrapper getBswModuleDescriptionRef() {
        
        if (CollUtil.isNotEmpty(tdEventBswModeDeclaration.getBswModuleDescriptionRef())) {
            
            return new BswModuleDescriptionRefWrapper(tdEventBswModeDeclaration.getBswModuleDescriptionRef());
            
        } else {
            return null;
        }
        
    }

    public EntryModeDeclarationRefWrapper getEntryModeDeclarationRef() {
        
        if (CollUtil.isNotEmpty(tdEventBswModeDeclaration.getEntryModeDeclarationRef())) {
            
            return new EntryModeDeclarationRefWrapper(tdEventBswModeDeclaration.getEntryModeDeclarationRef());
            
        } else {
            return null;
        }
        
    }

    public ExitModeDeclarationRefWrapper getExitModeDeclarationRef() {
        
        if (CollUtil.isNotEmpty(tdEventBswModeDeclaration.getExitModeDeclarationRef())) {
            
            return new ExitModeDeclarationRefWrapper(tdEventBswModeDeclaration.getExitModeDeclarationRef());
            
        } else {
            return null;
        }
        
    }

    public ModeDeclarationRef_TdEventBswModeDeclarationWrapper getModeDeclarationRef() {
        
        if (CollUtil.isNotEmpty(tdEventBswModeDeclaration.getModeDeclarationRef())) {
            
            return new ModeDeclarationRef_TdEventBswModeDeclarationWrapper(tdEventBswModeDeclaration.getModeDeclarationRef());
            
        } else {
            return null;
        }
        
    }

    public TdEventBswModeDeclarationTypeEnumWrapper getTdEventBswModeDeclarationType() {
        
        if (CollUtil.isNotEmpty(tdEventBswModeDeclaration.getTdEventBswModeDeclarationType())) {
            
            return new TdEventBswModeDeclarationTypeEnumWrapper(tdEventBswModeDeclaration.getTdEventBswModeDeclarationType());
            
        } else {
            return null;
        }
        
    }




    


    
}