package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ArgumentDataPrototypeWrapper {

    
    private ArgumentDataPrototype argumentDataPrototype;

    public ArgumentDataPrototypeWrapper(ArgumentDataPrototype argumentDataPrototype) {
        this.argumentDataPrototype = argumentDataPrototype;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(argumentDataPrototype.getS())) {
            
            return argumentDataPrototype.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(argumentDataPrototype.getT())) {
            
            return argumentDataPrototype.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(argumentDataPrototype.getUuid())) {
            
            return argumentDataPrototype.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(argumentDataPrototype.getShortName())) {
            
            return new IdentifierWrapper(argumentDataPrototype.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(argumentDataPrototype.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = argumentDataPrototype.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(argumentDataPrototype.getLongName())) {
            
            return new MultilanguageLongNameWrapper(argumentDataPrototype.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(argumentDataPrototype.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(argumentDataPrototype.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(argumentDataPrototype.getCategory())) {
            
            return new CategoryStringWrapper(argumentDataPrototype.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(argumentDataPrototype.getAdminData())) {
            
            return new AdminDataWrapper(argumentDataPrototype.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(argumentDataPrototype.getIntroduction())) {
            
            return new DocumentationBlockWrapper(argumentDataPrototype.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(argumentDataPrototype.getAnnotations())) {
            ArrayList<Annotation> originalList = argumentDataPrototype.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getSwDataDefProps() {
        
        if (CollUtil.isNotEmpty(argumentDataPrototype.getSwDataDefProps())) {
            
            return new SwDataDefPropsWrapper(argumentDataPrototype.getSwDataDefProps());
            
        } else {
            return null;
        }
        
    }

    public TypeTref_ArgumentDataPrototypeWrapper getTypeTref() {
        
        if (CollUtil.isNotEmpty(argumentDataPrototype.getTypeTref())) {
            
            return new TypeTref_ArgumentDataPrototypeWrapper(argumentDataPrototype.getTypeTref());
            
        } else {
            return null;
        }
        
    }

    public ArgumentDirectionEnumWrapper getDirection() {
        
        if (CollUtil.isNotEmpty(argumentDataPrototype.getDirection())) {
            
            return new ArgumentDirectionEnumWrapper(argumentDataPrototype.getDirection());
            
        } else {
            return null;
        }
        
    }

    public ServerArgumentImplPolicyEnumWrapper getServerArgumentImplPolicy() {
        
        if (CollUtil.isNotEmpty(argumentDataPrototype.getServerArgumentImplPolicy())) {
            
            return new ServerArgumentImplPolicyEnumWrapper(argumentDataPrototype.getServerArgumentImplPolicy());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AutosarDataTypeRefConditionalWrapper> getTypeBlueprints() {
        
        if (CollUtil.isNotEmpty(argumentDataPrototype.getTypeBlueprints())) {
            ArrayList<AutosarDataTypeRefConditional> originalList = argumentDataPrototype.getTypeBlueprints();
            ArrayList<AutosarDataTypeRefConditionalWrapper> wrapperList = (ArrayList<AutosarDataTypeRefConditionalWrapper>)originalList.stream()
                .map(item -> new AutosarDataTypeRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(argumentDataPrototype.getVariationPoint())) {
            
            return new VariationPointWrapper(argumentDataPrototype.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}