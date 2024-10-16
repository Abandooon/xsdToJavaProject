package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class ISignalTriggeringWrapper {

    
    private ISignalTriggering iSignalTriggering;

    public ISignalTriggeringWrapper(ISignalTriggering iSignalTriggering) {
        this.iSignalTriggering = iSignalTriggering;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(iSignalTriggering.getS())) {
            
            return iSignalTriggering.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(iSignalTriggering.getT())) {
            
            return iSignalTriggering.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(iSignalTriggering.getUuid())) {
            
            return iSignalTriggering.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(iSignalTriggering.getShortName())) {
            
            return new IdentifierWrapper(iSignalTriggering.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(iSignalTriggering.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = iSignalTriggering.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(iSignalTriggering.getLongName())) {
            
            return new MultilanguageLongNameWrapper(iSignalTriggering.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(iSignalTriggering.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(iSignalTriggering.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(iSignalTriggering.getCategory())) {
            
            return new CategoryStringWrapper(iSignalTriggering.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(iSignalTriggering.getAdminData())) {
            
            return new AdminDataWrapper(iSignalTriggering.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(iSignalTriggering.getIntroduction())) {
            
            return new DocumentationBlockWrapper(iSignalTriggering.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(iSignalTriggering.getAnnotations())) {
            ArrayList<Annotation> originalList = iSignalTriggering.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ISignalGroupRefWrapper getISignalGroupRef() {
        
        if (CollUtil.isNotEmpty(iSignalTriggering.getISignalGroupRef())) {
            
            return new ISignalGroupRefWrapper(iSignalTriggering.getISignalGroupRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ISignalPortRefWrapper> getISignalPortRefs() {
        
        if (CollUtil.isNotEmpty(iSignalTriggering.getISignalPortRefs())) {
            ArrayList<ISignalPortRef> originalList = iSignalTriggering.getISignalPortRefs();
            ArrayList<ISignalPortRefWrapper> wrapperList = (ArrayList<ISignalPortRefWrapper>)originalList.stream()
                .map(item -> new ISignalPortRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ISignalRefWrapper getISignalRef() {
        
        if (CollUtil.isNotEmpty(iSignalTriggering.getISignalRef())) {
            
            return new ISignalRefWrapper(iSignalTriggering.getISignalRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(iSignalTriggering.getVariationPoint())) {
            
            return new VariationPointWrapper(iSignalTriggering.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}