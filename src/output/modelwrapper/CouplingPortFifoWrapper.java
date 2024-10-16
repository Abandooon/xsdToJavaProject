package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class CouplingPortFifoWrapper {

    
    private CouplingPortFifo couplingPortFifo;

    public CouplingPortFifoWrapper(CouplingPortFifo couplingPortFifo) {
        this.couplingPortFifo = couplingPortFifo;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(couplingPortFifo.getS())) {
            
            return couplingPortFifo.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(couplingPortFifo.getT())) {
            
            return couplingPortFifo.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(couplingPortFifo.getUuid())) {
            
            return couplingPortFifo.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(couplingPortFifo.getShortName())) {
            
            return new IdentifierWrapper(couplingPortFifo.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(couplingPortFifo.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = couplingPortFifo.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(couplingPortFifo.getLongName())) {
            
            return new MultilanguageLongNameWrapper(couplingPortFifo.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(couplingPortFifo.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(couplingPortFifo.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(couplingPortFifo.getCategory())) {
            
            return new CategoryStringWrapper(couplingPortFifo.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(couplingPortFifo.getAdminData())) {
            
            return new AdminDataWrapper(couplingPortFifo.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(couplingPortFifo.getIntroduction())) {
            
            return new DocumentationBlockWrapper(couplingPortFifo.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(couplingPortFifo.getAnnotations())) {
            ArrayList<Annotation> originalList = couplingPortFifo.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PositiveIntegerWrapper> getAssignedTrafficClasss() {
        
        if (CollUtil.isNotEmpty(couplingPortFifo.getAssignedTrafficClasss())) {
            ArrayList<PositiveInteger> originalList = couplingPortFifo.getAssignedTrafficClasss();
            ArrayList<PositiveIntegerWrapper> wrapperList = (ArrayList<PositiveIntegerWrapper>)originalList.stream()
                .map(item -> new PositiveIntegerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}