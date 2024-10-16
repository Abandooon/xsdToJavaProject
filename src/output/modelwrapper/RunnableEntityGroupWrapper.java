package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class RunnableEntityGroupWrapper {

    
    private RunnableEntityGroup runnableEntityGroup;

    public RunnableEntityGroupWrapper(RunnableEntityGroup runnableEntityGroup) {
        this.runnableEntityGroup = runnableEntityGroup;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(runnableEntityGroup.getS())) {
            
            return runnableEntityGroup.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(runnableEntityGroup.getT())) {
            
            return runnableEntityGroup.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(runnableEntityGroup.getUuid())) {
            
            return runnableEntityGroup.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(runnableEntityGroup.getShortName())) {
            
            return new IdentifierWrapper(runnableEntityGroup.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(runnableEntityGroup.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = runnableEntityGroup.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(runnableEntityGroup.getLongName())) {
            
            return new MultilanguageLongNameWrapper(runnableEntityGroup.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(runnableEntityGroup.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(runnableEntityGroup.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(runnableEntityGroup.getCategory())) {
            
            return new CategoryStringWrapper(runnableEntityGroup.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(runnableEntityGroup.getAdminData())) {
            
            return new AdminDataWrapper(runnableEntityGroup.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(runnableEntityGroup.getIntroduction())) {
            
            return new DocumentationBlockWrapper(runnableEntityGroup.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(runnableEntityGroup.getAnnotations())) {
            ArrayList<Annotation> originalList = runnableEntityGroup.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<InnerRunnableEntityGroupInCompositionInstanceRefWrapper> getRunnableEntityGroupIrefs() {
        
        if (CollUtil.isNotEmpty(runnableEntityGroup.getRunnableEntityGroupIrefs())) {
            ArrayList<InnerRunnableEntityGroupInCompositionInstanceRef> originalList = runnableEntityGroup.getRunnableEntityGroupIrefs();
            ArrayList<InnerRunnableEntityGroupInCompositionInstanceRefWrapper> wrapperList = (ArrayList<InnerRunnableEntityGroupInCompositionInstanceRefWrapper>)originalList.stream()
                .map(item -> new InnerRunnableEntityGroupInCompositionInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<RunnableEntityInCompositionInstanceRefWrapper> getRunnableEntityIrefs() {
        
        if (CollUtil.isNotEmpty(runnableEntityGroup.getRunnableEntityIrefs())) {
            ArrayList<RunnableEntityInCompositionInstanceRef> originalList = runnableEntityGroup.getRunnableEntityIrefs();
            ArrayList<RunnableEntityInCompositionInstanceRefWrapper> wrapperList = (ArrayList<RunnableEntityInCompositionInstanceRefWrapper>)originalList.stream()
                .map(item -> new RunnableEntityInCompositionInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(runnableEntityGroup.getVariationPoint())) {
            
            return new VariationPointWrapper(runnableEntityGroup.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}