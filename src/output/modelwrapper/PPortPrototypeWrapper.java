package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class PPortPrototypeWrapper {

    
    private PPortPrototype pPortPrototype;

    public PPortPrototypeWrapper(PPortPrototype pPortPrototype) {
        this.pPortPrototype = pPortPrototype;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(pPortPrototype.getS())) {
            
            return pPortPrototype.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(pPortPrototype.getT())) {
            
            return pPortPrototype.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(pPortPrototype.getUuid())) {
            
            return pPortPrototype.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(pPortPrototype.getShortName())) {
            
            return new IdentifierWrapper(pPortPrototype.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(pPortPrototype.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = pPortPrototype.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(pPortPrototype.getLongName())) {
            
            return new MultilanguageLongNameWrapper(pPortPrototype.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(pPortPrototype.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(pPortPrototype.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(pPortPrototype.getCategory())) {
            
            return new CategoryStringWrapper(pPortPrototype.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(pPortPrototype.getAdminData())) {
            
            return new AdminDataWrapper(pPortPrototype.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(pPortPrototype.getIntroduction())) {
            
            return new DocumentationBlockWrapper(pPortPrototype.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(pPortPrototype.getAnnotations())) {
            ArrayList<Annotation> originalList = pPortPrototype.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ClientServerAnnotationWrapper> getClientServerAnnotations() {
        
        if (CollUtil.isNotEmpty(pPortPrototype.getClientServerAnnotations())) {
            ArrayList<ClientServerAnnotation> originalList = pPortPrototype.getClientServerAnnotations();
            ArrayList<ClientServerAnnotationWrapper> wrapperList = (ArrayList<ClientServerAnnotationWrapper>)originalList.stream()
                .map(item -> new ClientServerAnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DelegatedPortAnnotationWrapper getDelegatedPortAnnotation() {
        
        if (CollUtil.isNotEmpty(pPortPrototype.getDelegatedPortAnnotation())) {
            
            return new DelegatedPortAnnotationWrapper(pPortPrototype.getDelegatedPortAnnotation());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<IoHwAbstractionServerAnnotationWrapper> getIoHwAbstractionServerAnnotations() {
        
        if (CollUtil.isNotEmpty(pPortPrototype.getIoHwAbstractionServerAnnotations())) {
            ArrayList<IoHwAbstractionServerAnnotation> originalList = pPortPrototype.getIoHwAbstractionServerAnnotations();
            ArrayList<IoHwAbstractionServerAnnotationWrapper> wrapperList = (ArrayList<IoHwAbstractionServerAnnotationWrapper>)originalList.stream()
                .map(item -> new IoHwAbstractionServerAnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModePortAnnotationWrapper> getModePortAnnotations() {
        
        if (CollUtil.isNotEmpty(pPortPrototype.getModePortAnnotations())) {
            ArrayList<ModePortAnnotation> originalList = pPortPrototype.getModePortAnnotations();
            ArrayList<ModePortAnnotationWrapper> wrapperList = (ArrayList<ModePortAnnotationWrapper>)originalList.stream()
                .map(item -> new ModePortAnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<NvDataPortAnnotationWrapper> getNvDataPortAnnotations() {
        
        if (CollUtil.isNotEmpty(pPortPrototype.getNvDataPortAnnotations())) {
            ArrayList<NvDataPortAnnotation> originalList = pPortPrototype.getNvDataPortAnnotations();
            ArrayList<NvDataPortAnnotationWrapper> wrapperList = (ArrayList<NvDataPortAnnotationWrapper>)originalList.stream()
                .map(item -> new NvDataPortAnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ParameterPortAnnotationWrapper> getParameterPortAnnotations() {
        
        if (CollUtil.isNotEmpty(pPortPrototype.getParameterPortAnnotations())) {
            ArrayList<ParameterPortAnnotation> originalList = pPortPrototype.getParameterPortAnnotations();
            ArrayList<ParameterPortAnnotationWrapper> wrapperList = (ArrayList<ParameterPortAnnotationWrapper>)originalList.stream()
                .map(item -> new ParameterPortAnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SenderReceiverAnnotationsWrapper getSenderReceiverAnnotations() {
        
        if (CollUtil.isNotEmpty(pPortPrototype.getSenderReceiverAnnotations())) {
            
            return new SenderReceiverAnnotationsWrapper(pPortPrototype.getSenderReceiverAnnotations());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<TriggerPortAnnotationWrapper> getTriggerPortAnnotations() {
        
        if (CollUtil.isNotEmpty(pPortPrototype.getTriggerPortAnnotations())) {
            ArrayList<TriggerPortAnnotation> originalList = pPortPrototype.getTriggerPortAnnotations();
            ArrayList<TriggerPortAnnotationWrapper> wrapperList = (ArrayList<TriggerPortAnnotationWrapper>)originalList.stream()
                .map(item -> new TriggerPortAnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(pPortPrototype.getVariationPoint())) {
            
            return new VariationPointWrapper(pPortPrototype.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ProvidedComSpecsWrapper getProvidedComSpecs() {
        
        if (CollUtil.isNotEmpty(pPortPrototype.getProvidedComSpecs())) {
            
            return new ProvidedComSpecsWrapper(pPortPrototype.getProvidedComSpecs());
            
        } else {
            return null;
        }
        
    }

    public ProvidedInterfaceTrefWrapper getProvidedInterfaceTref() {
        
        if (CollUtil.isNotEmpty(pPortPrototype.getProvidedInterfaceTref())) {
            
            return new ProvidedInterfaceTrefWrapper(pPortPrototype.getProvidedInterfaceTref());
            
        } else {
            return null;
        }
        
    }




    


    
}