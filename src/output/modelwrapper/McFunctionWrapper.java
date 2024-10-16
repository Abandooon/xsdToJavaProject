package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class McFunctionWrapper {

    
    private McFunction mcFunction;

    public McFunctionWrapper(McFunction mcFunction) {
        this.mcFunction = mcFunction;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(mcFunction.getS())) {
            
            return mcFunction.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(mcFunction.getT())) {
            
            return mcFunction.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(mcFunction.getUuid())) {
            
            return mcFunction.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(mcFunction.getShortName())) {
            
            return new IdentifierWrapper(mcFunction.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(mcFunction.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = mcFunction.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(mcFunction.getLongName())) {
            
            return new MultilanguageLongNameWrapper(mcFunction.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(mcFunction.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(mcFunction.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(mcFunction.getCategory())) {
            
            return new CategoryStringWrapper(mcFunction.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(mcFunction.getAdminData())) {
            
            return new AdminDataWrapper(mcFunction.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(mcFunction.getIntroduction())) {
            
            return new DocumentationBlockWrapper(mcFunction.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(mcFunction.getAnnotations())) {
            ArrayList<Annotation> originalList = mcFunction.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(mcFunction.getVariationPoint())) {
            
            return new VariationPointWrapper(mcFunction.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public McFunctionDataRefSetWrapper getDefCalprmSet() {
        
        if (CollUtil.isNotEmpty(mcFunction.getDefCalprmSet())) {
            
            return new McFunctionDataRefSetWrapper(mcFunction.getDefCalprmSet());
            
        } else {
            return null;
        }
        
    }

    public McFunctionDataRefSetWrapper getRefCalprmSet() {
        
        if (CollUtil.isNotEmpty(mcFunction.getRefCalprmSet())) {
            
            return new McFunctionDataRefSetWrapper(mcFunction.getRefCalprmSet());
            
        } else {
            return null;
        }
        
    }

    public McFunctionDataRefSetWrapper getInMeasurementSet() {
        
        if (CollUtil.isNotEmpty(mcFunction.getInMeasurementSet())) {
            
            return new McFunctionDataRefSetWrapper(mcFunction.getInMeasurementSet());
            
        } else {
            return null;
        }
        
    }

    public McFunctionDataRefSetWrapper getOutMeasurmentSet() {
        
        if (CollUtil.isNotEmpty(mcFunction.getOutMeasurmentSet())) {
            
            return new McFunctionDataRefSetWrapper(mcFunction.getOutMeasurmentSet());
            
        } else {
            return null;
        }
        
    }

    public McFunctionDataRefSetWrapper getLocMeasurementSet() {
        
        if (CollUtil.isNotEmpty(mcFunction.getLocMeasurementSet())) {
            
            return new McFunctionDataRefSetWrapper(mcFunction.getLocMeasurementSet());
            
        } else {
            return null;
        }
        
    }

    public McFunctionDataRefSetWrapper getOutMeasurementSet() {
        
        if (CollUtil.isNotEmpty(mcFunction.getOutMeasurementSet())) {
            
            return new McFunctionDataRefSetWrapper(mcFunction.getOutMeasurementSet());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SubFunctionRefWrapper> getSubFunctionRefs() {
        
        if (CollUtil.isNotEmpty(mcFunction.getSubFunctionRefs())) {
            ArrayList<SubFunctionRef> originalList = mcFunction.getSubFunctionRefs();
            ArrayList<SubFunctionRefWrapper> wrapperList = (ArrayList<SubFunctionRefWrapper>)originalList.stream()
                .map(item -> new SubFunctionRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}