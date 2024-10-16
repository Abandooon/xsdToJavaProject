package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class TdEventModeDeclarationWrapper {

    
    private TdEventModeDeclaration tdEventModeDeclaration;

    public TdEventModeDeclarationWrapper(TdEventModeDeclaration tdEventModeDeclaration) {
        this.tdEventModeDeclaration = tdEventModeDeclaration;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclaration.getS())) {
            
            return tdEventModeDeclaration.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclaration.getT())) {
            
            return tdEventModeDeclaration.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclaration.getUuid())) {
            
            return tdEventModeDeclaration.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclaration.getShortName())) {
            
            return new IdentifierWrapper(tdEventModeDeclaration.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclaration.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = tdEventModeDeclaration.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclaration.getLongName())) {
            
            return new MultilanguageLongNameWrapper(tdEventModeDeclaration.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclaration.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(tdEventModeDeclaration.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclaration.getCategory())) {
            
            return new CategoryStringWrapper(tdEventModeDeclaration.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclaration.getAdminData())) {
            
            return new AdminDataWrapper(tdEventModeDeclaration.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclaration.getIntroduction())) {
            
            return new DocumentationBlockWrapper(tdEventModeDeclaration.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclaration.getAnnotations())) {
            ArrayList<Annotation> originalList = tdEventModeDeclaration.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclaration.getVariationPoint())) {
            
            return new VariationPointWrapper(tdEventModeDeclaration.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TdEventOccurrenceExpressionWrapper getOccurrenceExpression() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclaration.getOccurrenceExpression())) {
            
            return new TdEventOccurrenceExpressionWrapper(tdEventModeDeclaration.getOccurrenceExpression());
            
        } else {
            return null;
        }
        
    }

    public ComponentInCompositionInstanceRefWrapper getComponentIref() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclaration.getComponentIref())) {
            
            return new ComponentInCompositionInstanceRefWrapper(tdEventModeDeclaration.getComponentIref());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsExternal() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclaration.getIsExternal())) {
            
            return new BooleanWrapper(tdEventModeDeclaration.getIsExternal());
            
        } else {
            return null;
        }
        
    }

    public PortPrototypeBlueprintRefWrapper getPortPrototypeBlueprintRef() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclaration.getPortPrototypeBlueprintRef())) {
            
            return new PortPrototypeBlueprintRefWrapper(tdEventModeDeclaration.getPortPrototypeBlueprintRef());
            
        } else {
            return null;
        }
        
    }

    public PortRefWrapper getPortRef() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclaration.getPortRef())) {
            
            return new PortRefWrapper(tdEventModeDeclaration.getPortRef());
            
        } else {
            return null;
        }
        
    }

    public EntryModeDeclarationRefWrapper getEntryModeDeclarationRef() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclaration.getEntryModeDeclarationRef())) {
            
            return new EntryModeDeclarationRefWrapper(tdEventModeDeclaration.getEntryModeDeclarationRef());
            
        } else {
            return null;
        }
        
    }

    public ExitModeDeclarationRefWrapper getExitModeDeclarationRef() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclaration.getExitModeDeclarationRef())) {
            
            return new ExitModeDeclarationRefWrapper(tdEventModeDeclaration.getExitModeDeclarationRef());
            
        } else {
            return null;
        }
        
    }

    public ModeDeclarationRef_TdEventBswModeDeclarationWrapper getModeDeclarationRef() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclaration.getModeDeclarationRef())) {
            
            return new ModeDeclarationRef_TdEventBswModeDeclarationWrapper(tdEventModeDeclaration.getModeDeclarationRef());
            
        } else {
            return null;
        }
        
    }

    public TdEventModeDeclarationTypeEnumWrapper getTdEventModeDeclarationType() {
        
        if (CollUtil.isNotEmpty(tdEventModeDeclaration.getTdEventModeDeclarationType())) {
            
            return new TdEventModeDeclarationTypeEnumWrapper(tdEventModeDeclaration.getTdEventModeDeclarationType());
            
        } else {
            return null;
        }
        
    }




    


    
}