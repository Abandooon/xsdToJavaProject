package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class CouplingPortShaperWrapper {

    
    private CouplingPortShaper couplingPortShaper;

    public CouplingPortShaperWrapper(CouplingPortShaper couplingPortShaper) {
        this.couplingPortShaper = couplingPortShaper;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(couplingPortShaper.getS())) {
            
            return couplingPortShaper.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(couplingPortShaper.getT())) {
            
            return couplingPortShaper.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(couplingPortShaper.getUuid())) {
            
            return couplingPortShaper.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(couplingPortShaper.getShortName())) {
            
            return new IdentifierWrapper(couplingPortShaper.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(couplingPortShaper.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = couplingPortShaper.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(couplingPortShaper.getLongName())) {
            
            return new MultilanguageLongNameWrapper(couplingPortShaper.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(couplingPortShaper.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(couplingPortShaper.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(couplingPortShaper.getCategory())) {
            
            return new CategoryStringWrapper(couplingPortShaper.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(couplingPortShaper.getAdminData())) {
            
            return new AdminDataWrapper(couplingPortShaper.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(couplingPortShaper.getIntroduction())) {
            
            return new DocumentationBlockWrapper(couplingPortShaper.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(couplingPortShaper.getAnnotations())) {
            ArrayList<Annotation> originalList = couplingPortShaper.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getIdleSlope() {
        
        if (CollUtil.isNotEmpty(couplingPortShaper.getIdleSlope())) {
            
            return new PositiveIntegerWrapper(couplingPortShaper.getIdleSlope());
            
        } else {
            return null;
        }
        
    }

    public PredecessorFifoRefWrapper getPredecessorFifoRef() {
        
        if (CollUtil.isNotEmpty(couplingPortShaper.getPredecessorFifoRef())) {
            
            return new PredecessorFifoRefWrapper(couplingPortShaper.getPredecessorFifoRef());
            
        } else {
            return null;
        }
        
    }




    


    
}