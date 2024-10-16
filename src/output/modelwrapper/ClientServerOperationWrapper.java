package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class ClientServerOperationWrapper {

    
    private ClientServerOperation clientServerOperation;

    public ClientServerOperationWrapper(ClientServerOperation clientServerOperation) {
        this.clientServerOperation = clientServerOperation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(clientServerOperation.getS())) {
            
            return clientServerOperation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(clientServerOperation.getT())) {
            
            return clientServerOperation.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(clientServerOperation.getUuid())) {
            
            return clientServerOperation.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(clientServerOperation.getShortName())) {
            
            return new IdentifierWrapper(clientServerOperation.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(clientServerOperation.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = clientServerOperation.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(clientServerOperation.getLongName())) {
            
            return new MultilanguageLongNameWrapper(clientServerOperation.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(clientServerOperation.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(clientServerOperation.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(clientServerOperation.getCategory())) {
            
            return new CategoryStringWrapper(clientServerOperation.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(clientServerOperation.getAdminData())) {
            
            return new AdminDataWrapper(clientServerOperation.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(clientServerOperation.getIntroduction())) {
            
            return new DocumentationBlockWrapper(clientServerOperation.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(clientServerOperation.getAnnotations())) {
            ArrayList<Annotation> originalList = clientServerOperation.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ArgumentDataPrototypeWrapper> getArguments() {
        
        if (CollUtil.isNotEmpty(clientServerOperation.getArguments())) {
            ArrayList<ArgumentDataPrototype> originalList = clientServerOperation.getArguments();
            ArrayList<ArgumentDataPrototypeWrapper> wrapperList = (ArrayList<ArgumentDataPrototypeWrapper>)originalList.stream()
                .map(item -> new ArgumentDataPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PossibleErrorRefWrapper> getPossibleErrorRefs() {
        
        if (CollUtil.isNotEmpty(clientServerOperation.getPossibleErrorRefs())) {
            ArrayList<PossibleErrorRef> originalList = clientServerOperation.getPossibleErrorRefs();
            ArrayList<PossibleErrorRefWrapper> wrapperList = (ArrayList<PossibleErrorRefWrapper>)originalList.stream()
                .map(item -> new PossibleErrorRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(clientServerOperation.getVariationPoint())) {
            
            return new VariationPointWrapper(clientServerOperation.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}