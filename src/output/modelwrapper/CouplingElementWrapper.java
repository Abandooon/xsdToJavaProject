package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class CouplingElementWrapper {

    
    private CouplingElement couplingElement;

    public CouplingElementWrapper(CouplingElement couplingElement) {
        this.couplingElement = couplingElement;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(couplingElement.getS())) {
            
            return couplingElement.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(couplingElement.getT())) {
            
            return couplingElement.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(couplingElement.getUuid())) {
            
            return couplingElement.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(couplingElement.getShortName())) {
            
            return new IdentifierWrapper(couplingElement.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(couplingElement.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = couplingElement.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(couplingElement.getLongName())) {
            
            return new MultilanguageLongNameWrapper(couplingElement.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(couplingElement.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(couplingElement.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(couplingElement.getCategory())) {
            
            return new CategoryStringWrapper(couplingElement.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(couplingElement.getAdminData())) {
            
            return new AdminDataWrapper(couplingElement.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(couplingElement.getIntroduction())) {
            
            return new DocumentationBlockWrapper(couplingElement.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(couplingElement.getAnnotations())) {
            ArrayList<Annotation> originalList = couplingElement.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(couplingElement.getVariationPoint())) {
            
            return new VariationPointWrapper(couplingElement.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public CommunicationClusterRef_CouplingElementWrapper getCommunicationClusterRef() {
        
        if (CollUtil.isNotEmpty(couplingElement.getCommunicationClusterRef())) {
            
            return new CommunicationClusterRef_CouplingElementWrapper(couplingElement.getCommunicationClusterRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<CouplingPortWrapper> getCouplingPorts() {
        
        if (CollUtil.isNotEmpty(couplingElement.getCouplingPorts())) {
            ArrayList<CouplingPort> originalList = couplingElement.getCouplingPorts();
            ArrayList<CouplingPortWrapper> wrapperList = (ArrayList<CouplingPortWrapper>)originalList.stream()
                .map(item -> new CouplingPortWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CouplingElementEnumWrapper getCouplingType() {
        
        if (CollUtil.isNotEmpty(couplingElement.getCouplingType())) {
            
            return new CouplingElementEnumWrapper(couplingElement.getCouplingType());
            
        } else {
            return null;
        }
        
    }

    public EcuInstanceRefWrapper getEcuInstanceRef() {
        
        if (CollUtil.isNotEmpty(couplingElement.getEcuInstanceRef())) {
            
            return new EcuInstanceRefWrapper(couplingElement.getEcuInstanceRef());
            
        } else {
            return null;
        }
        
    }




    


    
}