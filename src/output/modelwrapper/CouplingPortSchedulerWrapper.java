package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class CouplingPortSchedulerWrapper {

    
    private CouplingPortScheduler couplingPortScheduler;

    public CouplingPortSchedulerWrapper(CouplingPortScheduler couplingPortScheduler) {
        this.couplingPortScheduler = couplingPortScheduler;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(couplingPortScheduler.getS())) {
            
            return couplingPortScheduler.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(couplingPortScheduler.getT())) {
            
            return couplingPortScheduler.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(couplingPortScheduler.getUuid())) {
            
            return couplingPortScheduler.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(couplingPortScheduler.getShortName())) {
            
            return new IdentifierWrapper(couplingPortScheduler.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(couplingPortScheduler.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = couplingPortScheduler.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(couplingPortScheduler.getLongName())) {
            
            return new MultilanguageLongNameWrapper(couplingPortScheduler.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(couplingPortScheduler.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(couplingPortScheduler.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(couplingPortScheduler.getCategory())) {
            
            return new CategoryStringWrapper(couplingPortScheduler.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(couplingPortScheduler.getAdminData())) {
            
            return new AdminDataWrapper(couplingPortScheduler.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(couplingPortScheduler.getIntroduction())) {
            
            return new DocumentationBlockWrapper(couplingPortScheduler.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(couplingPortScheduler.getAnnotations())) {
            ArrayList<Annotation> originalList = couplingPortScheduler.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EthernetCouplingPortSchedulerEnumWrapper getPortScheduler() {
        
        if (CollUtil.isNotEmpty(couplingPortScheduler.getPortScheduler())) {
            
            return new EthernetCouplingPortSchedulerEnumWrapper(couplingPortScheduler.getPortScheduler());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PredecessorRefWrapper> getPredecessorRefs() {
        
        if (CollUtil.isNotEmpty(couplingPortScheduler.getPredecessorRefs())) {
            ArrayList<PredecessorRef> originalList = couplingPortScheduler.getPredecessorRefs();
            ArrayList<PredecessorRefWrapper> wrapperList = (ArrayList<PredecessorRefWrapper>)originalList.stream()
                .map(item -> new PredecessorRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}