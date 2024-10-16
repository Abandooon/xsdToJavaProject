package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    


public class EcucDestinationUriDefSetWrapper {

    
    private EcucDestinationUriDefSet ecucDestinationUriDefSet;

    public EcucDestinationUriDefSetWrapper(EcucDestinationUriDefSet ecucDestinationUriDefSet) {
        this.ecucDestinationUriDefSet = ecucDestinationUriDefSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDefSet.getS())) {
            
            return ecucDestinationUriDefSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDefSet.getT())) {
            
            return ecucDestinationUriDefSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDefSet.getUuid())) {
            
            return ecucDestinationUriDefSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDefSet.getShortName())) {
            
            return new IdentifierWrapper(ecucDestinationUriDefSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDefSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecucDestinationUriDefSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDefSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecucDestinationUriDefSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDefSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecucDestinationUriDefSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDefSet.getCategory())) {
            
            return new CategoryStringWrapper(ecucDestinationUriDefSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDefSet.getAdminData())) {
            
            return new AdminDataWrapper(ecucDestinationUriDefSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDefSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecucDestinationUriDefSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDefSet.getAnnotations())) {
            ArrayList<Annotation> originalList = ecucDestinationUriDefSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDefSet.getVariationPoint())) {
            
            return new VariationPointWrapper(ecucDestinationUriDefSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDefSet.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(ecucDestinationUriDefSet.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDefSet.getShortNamePattern())) {
            
            return new StringWrapper(ecucDestinationUriDefSet.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucDestinationUriDefWrapper> getDestinationUriDefs() {
        
        if (CollUtil.isNotEmpty(ecucDestinationUriDefSet.getDestinationUriDefs())) {
            ArrayList<EcucDestinationUriDef> originalList = ecucDestinationUriDefSet.getDestinationUriDefs();
            ArrayList<EcucDestinationUriDefWrapper> wrapperList = (ArrayList<EcucDestinationUriDefWrapper>)originalList.stream()
                .map(item -> new EcucDestinationUriDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}