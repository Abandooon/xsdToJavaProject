package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DataPrototypeGroupWrapper {

    
    private DataPrototypeGroup dataPrototypeGroup;

    public DataPrototypeGroupWrapper(DataPrototypeGroup dataPrototypeGroup) {
        this.dataPrototypeGroup = dataPrototypeGroup;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dataPrototypeGroup.getS())) {
            
            return dataPrototypeGroup.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dataPrototypeGroup.getT())) {
            
            return dataPrototypeGroup.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(dataPrototypeGroup.getUuid())) {
            
            return dataPrototypeGroup.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(dataPrototypeGroup.getShortName())) {
            
            return new IdentifierWrapper(dataPrototypeGroup.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(dataPrototypeGroup.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = dataPrototypeGroup.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(dataPrototypeGroup.getLongName())) {
            
            return new MultilanguageLongNameWrapper(dataPrototypeGroup.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(dataPrototypeGroup.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(dataPrototypeGroup.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(dataPrototypeGroup.getCategory())) {
            
            return new CategoryStringWrapper(dataPrototypeGroup.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(dataPrototypeGroup.getAdminData())) {
            
            return new AdminDataWrapper(dataPrototypeGroup.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(dataPrototypeGroup.getIntroduction())) {
            
            return new DocumentationBlockWrapper(dataPrototypeGroup.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(dataPrototypeGroup.getAnnotations())) {
            ArrayList<Annotation> originalList = dataPrototypeGroup.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<InnerDataPrototypeGroupInCompositionInstanceRefWrapper> getDataPrototypeGroupIrefs() {
        
        if (CollUtil.isNotEmpty(dataPrototypeGroup.getDataPrototypeGroupIrefs())) {
            ArrayList<InnerDataPrototypeGroupInCompositionInstanceRef> originalList = dataPrototypeGroup.getDataPrototypeGroupIrefs();
            ArrayList<InnerDataPrototypeGroupInCompositionInstanceRefWrapper> wrapperList = (ArrayList<InnerDataPrototypeGroupInCompositionInstanceRefWrapper>)originalList.stream()
                .map(item -> new InnerDataPrototypeGroupInCompositionInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<VariableDataPrototypeInCompositionInstanceRefWrapper> getImplicitDataAccessIrefs() {
        
        if (CollUtil.isNotEmpty(dataPrototypeGroup.getImplicitDataAccessIrefs())) {
            ArrayList<VariableDataPrototypeInCompositionInstanceRef> originalList = dataPrototypeGroup.getImplicitDataAccessIrefs();
            ArrayList<VariableDataPrototypeInCompositionInstanceRefWrapper> wrapperList = (ArrayList<VariableDataPrototypeInCompositionInstanceRefWrapper>)originalList.stream()
                .map(item -> new VariableDataPrototypeInCompositionInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(dataPrototypeGroup.getVariationPoint())) {
            
            return new VariationPointWrapper(dataPrototypeGroup.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}